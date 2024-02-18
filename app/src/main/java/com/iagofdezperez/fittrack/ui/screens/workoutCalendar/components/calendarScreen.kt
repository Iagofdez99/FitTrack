package com.iagofdezperez.fittrack.ui.screens.workoutCalendar.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iagofdezperez.fittrack.ui.screens.workoutCalendar.WorkoutCalendarViewModel
import java.text.SimpleDateFormat
import java.util.Calendar


@Composable
fun MyCalendarScreen(modifier: Modifier = Modifier, calendarViewModel: WorkoutCalendarViewModel) {
    DateRow(modifier, calendarViewModel)
}

@Composable
fun DateRow(modifier: Modifier = Modifier, calendarViewModel: WorkoutCalendarViewModel) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Black)
            .height(50.dp)
            .border(0.dp, Color.White),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        val currentDate: Calendar? by calendarViewModel.date.observeAsState()
        val sdf = SimpleDateFormat("dd/MM/yyyy")

        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "",
            modifier = Modifier
                .weight(1f)
                .size(32.dp)
                .clickable { calendarViewModel.decrementDate(-1) },
            tint = Color.White,
        )
        Text(
            text = sdf.format(currentDate?.time), modifier = Modifier
                .weight(5f),
            textAlign = TextAlign.Center,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            letterSpacing = 2.sp
        )
        Icon(
            imageVector = Icons.Default.ArrowForward,
            contentDescription = "",
            modifier = Modifier
                .weight(1f)
                .size(32.dp)
                .clickable { calendarViewModel.incrementDate(1) },
            tint = Color.White
        )
    }
}
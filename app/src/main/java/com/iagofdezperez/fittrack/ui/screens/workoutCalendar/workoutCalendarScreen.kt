package com.iagofdezperez.fittrack.ui.screens.workoutCalendar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.screens.mainScreen.MainViewModel
import com.iagofdezperez.fittrack.ui.screens.mainScreen.components.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.screens.mainScreen.components.WorkoutsTopAppBar
import com.iagofdezperez.fittrack.ui.screens.workoutCalendar.components.MyCalendarScreen

@Composable
fun WorkoutCalendarScreen(
    navController: NavHostController,
    mainViewModel: MainViewModel,
    calendarViewModel: WorkoutCalendarViewModel
) {
    Scaffold(
        topBar = {
            WorkoutsTopAppBar(
                onNavigate = { navController.popBackStack() },
                imageVector = Icons.Default.ArrowBack,
                title = "Calendar"
            )
        },
        bottomBar = {
            WorkoutsBottomAppBar(
                onNavigate = { navController.navigate(it) },
                mainViewModel = mainViewModel
            )
        },
        containerColor = Color.White
    ) {
        MyCalendarScreen(modifier = Modifier.padding(it),calendarViewModel)
    }}

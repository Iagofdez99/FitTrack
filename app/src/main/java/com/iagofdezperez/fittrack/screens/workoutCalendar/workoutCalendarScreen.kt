package com.iagofdezperez.fittrack.screens.workoutCalendar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.screens.mainScreen.components.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.screens.mainScreen.components.WorkoutsTopAppBar
import com.iagofdezperez.fittrack.screens.workoutCalendar.components.MyCalendarScreen

@Composable
fun WorkoutCalendarScreen(
    navController: NavHostController,
    viewModel: WorkoutCalendarViewModel = hiltViewModel(),
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
            )
        },
        containerColor = Color.White
    ) {
        MyCalendarScreen(modifier = Modifier.padding(it),viewModel)
    }}

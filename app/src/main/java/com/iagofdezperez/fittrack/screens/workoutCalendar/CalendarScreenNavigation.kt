package com.iagofdezperez.fittrack.screens.workoutCalendar

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val CALENDAR_ROUTE = "WorkoutCalendar"

fun NavHostController.navigateToCalendar() {
    this.navigate(CALENDAR_ROUTE)
}

fun NavGraphBuilder.calendarScreen(navController: NavHostController) {
    composable(route = CALENDAR_ROUTE) {
        WorkoutCalendarScreen(
            navController = navController,
        )
    }
}
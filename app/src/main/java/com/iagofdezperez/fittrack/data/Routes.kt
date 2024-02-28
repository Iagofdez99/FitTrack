package com.iagofdezperez.fittrack.data

sealed class Routes(val route: String) {
    object MainScreen : Routes("MainScreen")
    object DetailScreen : Routes("DetailScreen/{workoutId}"){
        fun createRoute(workoutId:String) = "DetailScreen/$workoutId"
    }
    object LoginScreen : Routes("LoginScreen")
    object WorkoutCalendar: Routes("WorkoutCalendar")

}
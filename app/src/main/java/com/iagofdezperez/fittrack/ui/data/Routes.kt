package com.iagofdezperez.fittrack.ui.data

sealed class Routes(val route: String) {
    object MainScreen : Routes("MainScreen")
    object DetailScreen : Routes("DetailScreen/{workoutId}"){
        fun createRoute(workoutId:String) = "DetailScreen/$workoutId"
    }

}
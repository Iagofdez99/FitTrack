package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iagofdezperez.fittrack.data.Routes
import com.iagofdezperez.fittrack.screens.details.DetailScreen
import com.iagofdezperez.fittrack.screens.login.LoginScreen
import com.iagofdezperez.fittrack.screens.mainScreen.MainScreen
import com.iagofdezperez.fittrack.screens.workoutCalendar.WorkoutCalendarScreen
import com.iagofdezperez.fittrack.theme.FitTrackTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Routes.MainScreen.route) {
                    composable(route = Routes.MainScreen.route) {
                        MainScreen(
                            navController = navController,
                        )
                    }
                    composable(route = Routes.DetailScreen.route) { backStackEntry ->
                        val workoutId = backStackEntry.arguments?.getString("workoutId")
                        DetailScreen(
                            navController = navController,
                            workoutId = workoutId.orEmpty(),
                        )
                    }
                    composable(route = Routes.LoginScreen.route) {
                        LoginScreen(navController = navController)
                    }
                    composable(route = Routes.WorkoutCalendar.route) {
                        WorkoutCalendarScreen(
                            navController = navController,
                        )
                    }
                }
            }
        }
    }
}
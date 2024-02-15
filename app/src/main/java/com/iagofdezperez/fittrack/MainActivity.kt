package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iagofdezperez.fittrack.ui.data.Routes
import com.iagofdezperez.fittrack.ui.data.exercisesWorkout
import com.iagofdezperez.fittrack.ui.data.getCategorias
import com.iagofdezperez.fittrack.ui.screens.MainScreen
import com.iagofdezperez.fittrack.ui.screens.details.DetailScreen
import com.iagofdezperez.fittrack.ui.theme.FitTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                val workoutCategories by rememberSaveable { mutableStateOf(getCategorias()) }
                val exercisesWorkout by rememberSaveable { mutableStateOf(exercisesWorkout())}
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Routes.MainScreen.route) {
                    composable(route = Routes.MainScreen.route) {
                        MainScreen(
                            workoutCategories,
                            navController
                        )
                    }
                    composable(route = Routes.DetailScreen.route) { backStackEntry ->
                        val workoutId = backStackEntry.arguments?.getString("workoutId")
                        DetailScreen(navController,exercisesWorkout, workoutId.orEmpty())
                    }
                }
            }
        }
    }
}
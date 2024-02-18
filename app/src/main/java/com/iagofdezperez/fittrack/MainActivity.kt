package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iagofdezperez.fittrack.ui.data.Routes
import com.iagofdezperez.fittrack.ui.data.exercisesWorkoutList
import com.iagofdezperez.fittrack.ui.data.getCategorias
import com.iagofdezperez.fittrack.ui.screens.details.DetailScreen
import com.iagofdezperez.fittrack.ui.screens.details.DetailViewModel
import com.iagofdezperez.fittrack.ui.screens.login.LoginScreen
import com.iagofdezperez.fittrack.ui.screens.login.LoginViewModel
import com.iagofdezperez.fittrack.ui.screens.mainScreen.MainScreen
import com.iagofdezperez.fittrack.ui.screens.mainScreen.MainViewModel
import com.iagofdezperez.fittrack.ui.screens.workoutCalendar.WorkoutCalendarScreen
import com.iagofdezperez.fittrack.ui.screens.workoutCalendar.WorkoutCalendarViewModel
import com.iagofdezperez.fittrack.ui.theme.FitTrackTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val loginViewModel: LoginViewModel by viewModels()
    private val mainViewModel: MainViewModel by viewModels()
    private val detailViewModel: DetailViewModel by viewModels()
    private val workoutCalendarViewModel: WorkoutCalendarViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                val workoutCategories by rememberSaveable { mutableStateOf(getCategorias()) }
                val exercisesWorkout by rememberSaveable { mutableStateOf(exercisesWorkoutList()) }
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = Routes.MainScreen.route) {
                    composable(route = Routes.MainScreen.route) {
                        MainScreen(
                            workoutCategories = workoutCategories,
                            navController = navController,
                            mainViewModel = mainViewModel
                        )
                    }
                    composable(route = Routes.DetailScreen.route) { backStackEntry ->
                        val workoutId = backStackEntry.arguments?.getString("workoutId")
                        DetailScreen(
                            navController = navController,
                            exercisesWorkout = exercisesWorkout,
                            workoutId = workoutId.orEmpty(),
                            mainViewModel = mainViewModel
                        )
                    }
                    composable(route = Routes.LoginScreen.route) {
                        LoginScreen(navController = navController, loginViewModel = loginViewModel)
                    }
                    composable(route = Routes.WorkoutCalendar.route) {
                        WorkoutCalendarScreen(
                            navController = navController,
                            mainViewModel = mainViewModel,
                            calendarViewModel = workoutCalendarViewModel
                        )
                    }
                }
            }
        }
    }
}
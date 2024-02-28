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
import com.iagofdezperez.fittrack.data.Routes
import com.iagofdezperez.fittrack.features.addCategory.getCategorias
import com.iagofdezperez.fittrack.features.addWorkout.exercisesWorkoutList
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

        //val workoutHelper = WorkoutsDDBBHelper(this)
        //val writableWorkoutDB = workoutHelper.readableDatabase

        //val categoriesHelper = CategoriesDDBBHelper(this)
        //val writableCategoriesDB = categoriesHelper.readableDatabase


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
                        )
                    }
                    composable(route = Routes.DetailScreen.route) { backStackEntry ->
                        val workoutId = backStackEntry.arguments?.getString("workoutId")
                        DetailScreen(
                            navController = navController,
                            workoutCategories = exercisesWorkout,
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
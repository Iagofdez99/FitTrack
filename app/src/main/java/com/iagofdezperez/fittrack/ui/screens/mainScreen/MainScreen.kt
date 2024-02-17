package com.iagofdezperez.fittrack.ui.screens.mainScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Menu
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.Routes
import com.iagofdezperez.fittrack.ui.data.WorkoutCategoriesData
import com.iagofdezperez.fittrack.ui.screens.mainScreen.components.WorkoutScreen
import com.iagofdezperez.fittrack.ui.screens.mainScreen.components.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.screens.mainScreen.components.WorkoutsTopAppBar

@Composable
public fun MainScreen(
    workoutCategories: List<WorkoutCategoriesData>,
    navController: NavHostController,
    mainViewModel: MainViewModel
) {
    Scaffold(
        topBar = {
            WorkoutsTopAppBar(
                navHost = { navController.navigate(Routes.LoginScreen.route) },
                imageVector = Icons.TwoTone.Menu
            )
        },
        bottomBar = {
            WorkoutsBottomAppBar(
                navHost = { navController.navigate(Routes.LoginScreen.route) },
                mainViewModel = mainViewModel
            )
        },
        containerColor = Color.Gray
    ) {
        WorkoutScreen(
            workoutCategories = workoutCategories,
            navController = navController,
            modifier = Modifier.padding(it)
        )
    }
}
package com.iagofdezperez.fittrack.screens.mainScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Menu
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.domain.WorkoutCategories
import com.iagofdezperez.fittrack.screens.mainScreen.components.WorkoutScreen
import com.iagofdezperez.fittrack.screens.mainScreen.components.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.screens.mainScreen.components.WorkoutsTopAppBar

@Composable
public fun MainScreen(
    workoutCategories: List<WorkoutCategories>,
    navController: NavHostController,
    viewModel: MainViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            WorkoutsTopAppBar(
                onNavigate = { navController.navigate(it) },
                imageVector = Icons.TwoTone.Menu
            )
        },
        bottomBar = {
            WorkoutsBottomAppBar(
                onNavigate = { navController.navigate(it) },
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
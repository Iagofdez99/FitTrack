package com.iagofdezperez.fittrack.screens.mainScreen

import android.annotation.SuppressLint
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

@SuppressLint("SuspiciousIndentation")
@Composable
public fun MainScreen(
    navController: NavHostController,
    viewModel: MainViewModel = hiltViewModel()
) {
    var workoutCategories = viewModel.state
    MainScreenContent(navController, workoutCategories)
}

@Composable
fun MainScreenContent(navController: NavHostController, categoriesList: List<WorkoutCategories>) {
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
            workoutCategories = categoriesList,
            navController = navController,
            modifier = Modifier.padding(it)
        )
    }
}
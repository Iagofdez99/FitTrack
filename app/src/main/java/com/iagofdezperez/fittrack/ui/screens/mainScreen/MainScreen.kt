package com.iagofdezperez.fittrack.ui.screens.mainScreen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.WorkoutCategoriesData
import com.iagofdezperez.fittrack.ui.elements.WorkoutScreen
import com.iagofdezperez.fittrack.ui.elements.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.elements.WorkoutsTopAppBar

@Composable
public fun MainScreen(
    workoutCategories: List<WorkoutCategoriesData>,
    navController: NavHostController
) {
    Scaffold(
        topBar = { WorkoutsTopAppBar() },
        bottomBar = { WorkoutsBottomAppBar() },
        containerColor = Color.Gray
    ) {
        WorkoutScreen(workoutCategories, navController, modifier = Modifier.padding(it))
    }
}
package com.iagofdezperez.fittrack.screens.mainScreen.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.data.Routes
import com.iagofdezperez.fittrack.domain.WorkoutCategories

@Composable
fun WorkoutScreen(
    workoutCategories: List<WorkoutCategories>,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(workoutCategories) { workout ->
            WorkoutCard(workoutId = workout.name, image = workout.image) {
                navController.navigate(Routes.DetailScreen.createRoute(it))
            }
        }
    }
}

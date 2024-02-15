package com.iagofdezperez.fittrack.ui.elements

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.getCategorias

@Composable
fun WorkoutScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(8.dp)
    ) {
        items(getCategorias()) { workout ->
            WorkoutCard(name = workout.name, image = workout.image, navController)
        }
    }
}

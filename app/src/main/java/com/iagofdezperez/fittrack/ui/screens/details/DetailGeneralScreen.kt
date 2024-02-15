package com.iagofdezperez.fittrack.ui.screens.details

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.exercisesWorkout
import com.iagofdezperez.fittrack.ui.elements.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.elements.WorkoutsTopAppBar

@Composable
fun DetailScreen(
    navController: NavHostController,
    exercisesWorkout: List<exercisesWorkout>,
    workoutId: String
) {
    val exercises = exercisesWorkout.groupBy { it.muscleGroup }
    //val exercisesCondition = rememberSaveable { mutableStateOf(workoutId) }
    Scaffold(
        topBar = { WorkoutsTopAppBar(title = "$workoutId workout") },
        bottomBar = { WorkoutsBottomAppBar() },
    ) { paddingValues ->
        Column(modifier = Modifier.padding(paddingValues))
        {
            Text(
                text = "$workoutId Exercises",
                color = Color.Red,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.padding(15.dp)
            )

            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(0.dp),
                columns = GridCells.Fixed(1),
            ) {
                exercises.forEach { (muscleGroup, exercises) ->
                    if (workoutId == muscleGroup) {
                        items(exercises) { exercises ->
                            workoutList(ejercicio = exercises.name)
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun workoutList(ejercicio: String) {
    Column {
        Text(
            text = ejercicio,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}
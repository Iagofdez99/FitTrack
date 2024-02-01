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
import com.iagofdezperez.fittrack.ui.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.WorkoutsTopAppBar

@Composable
fun DetailScreen(workoutId: String) {
    Scaffold(
        topBar = { WorkoutsTopAppBar() },
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
                items(listaEjerciciosAbs()) { ejerciciosAbs ->
                    ejerciciosEnLista(ejercicio = ejerciciosAbs)
                }
            }
        }
    }
}

@Composable
fun ejerciciosEnLista(ejercicio: String) {
    Column {
        Text(
            text = ejercicio,
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.fillMaxSize()
                .padding(8.dp)
        )
    }
}

fun listaEjerciciosAbs(): List<String> = listOf(
    "Ejercicio 1",
    "Ejercicio 2",
    "Ejercicio 3",
    "Ejercicio 4",
    "Ejercicio 5",
)
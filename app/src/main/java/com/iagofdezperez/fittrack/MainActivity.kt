package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.DateRange
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.iagofdezperez.fittrack.ui.theme.FitTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                Scaffold(
                    topBar = {
                        WorkoutsTopAppBar()
                    },
                    bottomBar = {
                        WorkoutsBottomAppBar()
                    },
                ) { paddingValues ->
                    WorkoutScreen(modifier = Modifier.padding(paddingValues))
                }
            }
        }
    }
}

data class CategoriasWorkout(val name: String, @DrawableRes val image: Int)

@Preview
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutsTopAppBar(
    modifier: Modifier = Modifier
) {
    MediumTopAppBar(
        title = { Text(text = "FitTrack App") },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Home, contentDescription = "Workouts")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Favorite, contentDescription = "Custom")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.DateRange, contentDescription = "Custom")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Settings, contentDescription = "Custom")
            }
        },
    )
}

@Preview
@Composable
fun WorkoutsBottomAppBar(
    modifier: Modifier = Modifier
) {
    BottomAppBar(
        modifier = modifier,
        actions = {
            Row(
                modifier = Modifier.fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Boton1",
                    modifier = Modifier
                        .background(Color.Black)
                        .border(1.dp, Color.Red)
                        .padding(6.dp)
                        .clickable {},
                    color = Color.White

                )
                Text(
                    text = "Boton2",
                    modifier = Modifier
                        .background(Color.Black)
                        .border(1.dp, Color.Red)
                        .padding(6.dp)
                        .clickable {},
                    color = Color.White
                )
                Text(
                    text = "Boton3",
                    modifier = Modifier
                        .background(Color.Black)
                        .border(1.dp, Color.Red)
                        .padding(6.dp)
                        .clickable {},
                    color = Color.White
                )
            }
        })
}

//@Preview(showBackground = true)
@Composable
private fun WorkoutScreen(
    modifier: Modifier = Modifier
) {
    val categoriasWorkouts = listOf(
        CategoriasWorkout("Abs", R.drawable.ejercicioabs),
        CategoriasWorkout("Chest", R.drawable.ejerciciochest),
        CategoriasWorkout("Back", R.drawable.ejercicioback),
        CategoriasWorkout("Front Legs", R.drawable.ejerciciolegs),
        CategoriasWorkout("Back Legs", R.drawable.ejerciciobackleg),
        CategoriasWorkout("Shoulders", R.drawable.ejercicioshoulders),
        CategoriasWorkout("Biceps", R.drawable.ejerciciobiceps),
        CategoriasWorkout("Triceps", R.drawable.ejerciciotriceps),
        CategoriasWorkout("Front Mix", R.drawable.front),
        CategoriasWorkout("Back Mix", R.drawable.back),
    )
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2)
    ) {
        items(categoriasWorkouts) { workout ->
            WorkoutCard(name = workout.name, image = workout.image)
        }
    }
}

@Composable
fun WorkoutCard(name: String, @DrawableRes image: Int) {
    Column {
        Box(
            modifier = Modifier.border(2.dp, color = Color.Black)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Workout image",
            )
        }
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            Text(
                text = name,
                color = Color.White
            )
        }
    }
}
package com.iagofdezperez.fittrack.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iagofdezperez.fittrack.getCategorias

@Composable
fun WorkoutScreen(
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2)
    ) {
        items(getCategorias()) { workout ->
            WorkoutCard(name = workout.name, image = workout.image)
        }
    }
}

@Composable
fun WorkoutCard(name: String, @DrawableRes image: Int) {
    Column {
        Box(
            modifier = Modifier.border(2.dp, color = Color.Black)
                .clickable {  }
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
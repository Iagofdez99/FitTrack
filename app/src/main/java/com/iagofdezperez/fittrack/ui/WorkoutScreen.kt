package com.iagofdezperez.fittrack.ui

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.getCategorias

@Composable
fun WorkoutScreen(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Fixed(2)
    ) {
        items(getCategorias()) { workout ->
            WorkoutCard(name = workout.name, image = workout.image, navController)
        }
    }
}

@Composable
fun WorkoutCard(name: String, @DrawableRes image: Int, navController: NavHostController) {
    Card(
        modifier = Modifier.padding(5.dp),
        shape = RoundedCornerShape(25.dp),
        border = BorderStroke(2.dp, Color.Black),
    ) {
        Column {
            Box(
                modifier = Modifier
                    .clickable { navController.navigate("detail/${name}") }
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
}

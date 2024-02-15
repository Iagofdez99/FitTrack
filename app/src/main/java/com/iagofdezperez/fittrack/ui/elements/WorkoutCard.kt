package com.iagofdezperez.fittrack.ui.elements

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.Routes

@Composable
fun WorkoutCard(workoutId: String, @DrawableRes image: Int, navController: NavHostController) {
    Card(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(2.dp, Color.Black),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column {
            Box(
                modifier = Modifier
                    .clickable { navController.navigate(Routes.DetailScreen.createRoute(workoutId)) }
            ) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = "Workout image",
                )
            }
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.Black)
                    .height(32.dp)
            ) {
                Text(
                    text = workoutId,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
package com.iagofdezperez.fittrack.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

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
                        .padding(8.dp)
                        .clickable {},
                    color = Color.White

                )
                Text(
                    text = "Boton2",
                    modifier = Modifier
                        .background(Color.Black)
                        .border(1.dp, Color.Red)
                        .padding(8.dp)
                        .clickable {},
                    color = Color.White
                )
                Text(
                    text = "Boton3",
                    modifier = Modifier
                        .background(Color.Black)
                        .border(1.dp, Color.Red)
                        .padding(8.dp)
                        .clickable {},
                    color = Color.White
                )
            }
        })
}
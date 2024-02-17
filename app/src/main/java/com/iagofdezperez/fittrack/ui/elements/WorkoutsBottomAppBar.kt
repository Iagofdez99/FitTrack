package com.iagofdezperez.fittrack.ui.elements

import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun WorkoutsBottomAppBar(modifier: Modifier = Modifier, navHost: () -> Unit) {
    var index by rememberSaveable { mutableStateOf(0) }
    NavigationBar(containerColor = Color.Black) {

        NavigationBarItem(
            selected = index == 0,
            onClick = { index = 0 },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFFF96846),
                selectedTextColor = Color.White,
                indicatorColor = Color.White,
                unselectedIconColor = Color.White,
                unselectedTextColor = Color.White,
                disabledIconColor = Color.White,
                disabledTextColor = Color.White
            ),
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "Home",
                    modifier = Modifier.size(30.dp)
                )
            },
            label = { Text(text = "Home", color = Color.White) },
        )

        NavigationBarItem(
            selected = index == 1,
            onClick = { index = 1 },
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor = Color(0xFFF96846),
                selectedTextColor = Color.White,
                indicatorColor = Color.White,
                unselectedIconColor = Color.White,
                unselectedTextColor = Color.White,
                disabledIconColor = Color.White,
                disabledTextColor = Color.White
            ),
            icon = {
                Icon(
                    imageVector = Icons.Default.List,
                    contentDescription = "Notes",
                    modifier = Modifier.size(30.dp)
                )
            },
            label = { Text(text = "Trainings", color = Color.White) },
        )
    }
}
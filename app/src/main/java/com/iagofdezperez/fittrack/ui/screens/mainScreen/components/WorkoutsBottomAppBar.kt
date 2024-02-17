package com.iagofdezperez.fittrack.ui.screens.mainScreen.components

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
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.iagofdezperez.fittrack.ui.screens.mainScreen.MainViewModel

@Composable
fun WorkoutsBottomAppBar(
    modifier: Modifier = Modifier,
    navHost: () -> Unit,
    mainViewModel: MainViewModel
) {
    val index: Int by mainViewModel.index.observeAsState(initial = 0)
    NavigationBar(containerColor = Color.Black) {
        NavigationBarItem(
            selected = index == 0,
            onClick = { mainViewModel.onIndexrChanged(0) },
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
            onClick = { mainViewModel.onIndexrChanged(1) },
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
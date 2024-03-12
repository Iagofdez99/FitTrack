package com.iagofdezperez.fittrack.screens.mainScreen.components

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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.iagofdezperez.fittrack.screens.mainScreen.MAINSCREEN_ROUTE
import com.iagofdezperez.fittrack.screens.mainScreen.MainViewModel
import com.iagofdezperez.fittrack.screens.workoutCalendar.CALENDAR_ROUTE

@Composable
fun WorkoutsBottomAppBar(
    modifier: Modifier = Modifier,
    onNavigate: (String) -> Unit,
    viewModel: MainViewModel = hiltViewModel()
) {
    //val index: Int by viewModel.index.observeAsState(initial = 0)

    NavigationBar(containerColor = Color.Black) {
        NavigationBarItem(
            //selected = index == 0
            selected = false,
            onClick = {
                viewModel.onIndexChanged(0)
                onNavigate(MAINSCREEN_ROUTE)
            },
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
            //selected = index == 1
            selected = false,
            onClick = {
                viewModel.onIndexChanged(1)
                onNavigate(CALENDAR_ROUTE)
                      },
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
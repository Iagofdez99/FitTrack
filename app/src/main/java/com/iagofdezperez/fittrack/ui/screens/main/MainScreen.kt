package com.iagofdezperez.fittrack.ui.screens.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.iagofdezperez.fittrack.ui.WorkoutScreen
import com.iagofdezperez.fittrack.ui.WorkoutsBottomAppBar
import com.iagofdezperez.fittrack.ui.WorkoutsTopAppBar

@Composable
public fun MainScreen() {
    Scaffold(
        topBar = { WorkoutsTopAppBar() },
        bottomBar = { WorkoutsBottomAppBar() },
    ) { paddingValues ->
        WorkoutScreen(modifier = Modifier.padding(paddingValues))
    }
}
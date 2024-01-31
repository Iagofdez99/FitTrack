package com.iagofdezperez.fittrack.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
public fun MainScreen() {
    Scaffold(
        topBar = { WorkoutsTopAppBar() },
        bottomBar = { WorkoutsBottomAppBar() },
    ) { paddingValues ->
        WorkoutScreen(modifier = Modifier.padding(paddingValues))
    }
}
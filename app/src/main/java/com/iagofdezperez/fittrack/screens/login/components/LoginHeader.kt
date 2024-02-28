package com.iagofdezperez.fittrack.screens.login.components

import androidx.compose.foundation.clickable
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color


@Composable
fun LoginHeader(modifier: Modifier, onCrossClick: () -> Unit) {
    Icon(
        imageVector = Icons.Default.Close,
        contentDescription = "Close app",
        modifier = modifier
            .clickable { onCrossClick() },
        tint = Color.White
    )
}
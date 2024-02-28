package com.iagofdezperez.fittrack.screens.login.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginBottom(modifier: Modifier) {
    Row(modifier = modifier) {
        Text(text = "Not registered yet?", color = Color.White)
        Text(
            text = "Sign in",
            color = Color(0xFF4EA8E9),
            modifier = Modifier
                .clickable { }
                .padding(horizontal = 16.dp),
            fontSize = 16.sp
        )
    }
}
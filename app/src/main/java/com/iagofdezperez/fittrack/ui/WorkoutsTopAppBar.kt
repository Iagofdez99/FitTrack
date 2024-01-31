package com.iagofdezperez.fittrack.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.DateRange
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Menu
import androidx.compose.material.icons.twotone.Search
import androidx.compose.material.icons.twotone.Settings
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutsTopAppBar(
    modifier: Modifier = Modifier
) {
    MediumTopAppBar(
        title = {
            Text(
                letterSpacing = 2.sp,
                text = "FitTrack App2",
                fontWeight = FontWeight.Bold
            )
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Menu, contentDescription = "Workouts")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Favorite, contentDescription = "Custom")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.DateRange, contentDescription = "Custom")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Search, contentDescription = "Custom")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Settings, contentDescription = "Custom")
            }
        },
    )
}
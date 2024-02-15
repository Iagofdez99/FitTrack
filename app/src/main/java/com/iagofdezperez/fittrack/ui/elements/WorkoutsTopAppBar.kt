package com.iagofdezperez.fittrack.ui.elements

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
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutsTopAppBar(
    modifier: Modifier = Modifier,
    title:String = "FitTrack App"
) {
    MediumTopAppBar(
        title = {
            Text(
                letterSpacing = 2.sp,
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Menu, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Favorite, contentDescription = "Favorite")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.DateRange, contentDescription = "Date")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Search, contentDescription = "Search")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Settings, contentDescription = "Settings")
            }
        },
    )
}
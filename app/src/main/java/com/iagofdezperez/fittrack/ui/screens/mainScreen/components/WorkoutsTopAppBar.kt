package com.iagofdezperez.fittrack.ui.screens.mainScreen.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.twotone.Favorite
import androidx.compose.material.icons.twotone.Person
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.iagofdezperez.fittrack.ui.data.Routes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WorkoutsTopAppBar(
    modifier: Modifier = Modifier,
    title: String = "FitTrack App",
    onNavigate: (String) -> Unit,
    imageVector: ImageVector
) {
    MediumTopAppBar(
        title = {
            Text(
                letterSpacing = 2.sp,
                text = title,
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
            )
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.Black,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White,
            actionIconContentColor = Color.White
        ),
        navigationIcon = {
            IconButton(onClick = {
                if (imageVector == Icons.Default.ArrowBack) {
                    onNavigate(Routes.MainScreen.route)
                }
            }) {
                Icon(imageVector = imageVector, contentDescription = "Menu")
            }
        },
        actions = {
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Favorite, contentDescription = "Favorite")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Search, contentDescription = "Date")
            }
            IconButton(onClick = { onNavigate(Routes.LoginScreen.route) }) {
                Icon(imageVector = Icons.TwoTone.Person, contentDescription = "Profile")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.TwoTone.Settings, contentDescription = "Settings")
            }
        },
    )
}
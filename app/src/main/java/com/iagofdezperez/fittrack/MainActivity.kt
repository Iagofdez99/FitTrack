package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.iagofdezperez.fittrack.ui.screens.details.DetailScreen
import com.iagofdezperez.fittrack.ui.screens.main.MainScreen
import com.iagofdezperez.fittrack.ui.theme.FitTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                val navController = rememberNavController()

                NavHost(navController = navController,startDestination = "main"){
                    composable("main"){
                        MainScreen()
                    }
                    composable("detail"){
                        DetailScreen()
                    }
                }
            }
        }
    }
}
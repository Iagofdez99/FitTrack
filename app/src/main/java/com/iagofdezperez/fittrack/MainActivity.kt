package com.iagofdezperez.fittrack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.iagofdezperez.fittrack.screens.details.detailScreen
import com.iagofdezperez.fittrack.screens.login.loginScreen
import com.iagofdezperez.fittrack.screens.mainScreen.MAINSCREEN_ROUTE
import com.iagofdezperez.fittrack.screens.mainScreen.mainScreen
import com.iagofdezperez.fittrack.screens.workoutCalendar.calendarScreen
import com.iagofdezperez.fittrack.theme.FitTrackTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitTrackTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = MAINSCREEN_ROUTE) {
                    mainScreen(navController)
                    detailScreen(navController)
                    loginScreen(navController)
                    calendarScreen(navController)
                }
            }
        }
    }
}
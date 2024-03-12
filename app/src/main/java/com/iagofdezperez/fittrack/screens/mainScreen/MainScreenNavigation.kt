package com.iagofdezperez.fittrack.screens.mainScreen

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val MAINSCREEN_ROUTE = "MainScreen"

fun NavHostController.navigateToMain() {
    this.navigate(MAINSCREEN_ROUTE)
}

fun NavGraphBuilder.mainScreen(navController: NavHostController) {
    composable(route = MAINSCREEN_ROUTE) {
        MainScreen(
            navController = navController,
        )
    }
}
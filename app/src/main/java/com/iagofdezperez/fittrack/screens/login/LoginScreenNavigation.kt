package com.iagofdezperez.fittrack.screens.login

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val LOGIN_ROUTE = "LoginScreen"

fun NavHostController.navigateToLogin() {
    this.navigate(LOGIN_ROUTE)
}

fun NavGraphBuilder.loginScreen(navController: NavHostController) {
    composable(route = LOGIN_ROUTE) {
        LoginScreen(navController = navController)
    }
}
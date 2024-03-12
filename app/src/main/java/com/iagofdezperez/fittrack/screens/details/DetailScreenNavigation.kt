package com.iagofdezperez.fittrack.screens.details

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable

const val DETAILS_ROUTE = "DetailScreen/{workoutId}"
fun createDetailRoute(workoutId:String) = "DetailScreen/$workoutId"

fun NavHostController.navigateToDetails(workoutId:String) {
    this.navigate(createDetailRoute(workoutId))
}

fun NavGraphBuilder.detailScreen(navController: NavHostController) {
    composable(route = DETAILS_ROUTE) { backStackEntry ->
        val workoutId = backStackEntry.arguments?.getString("workoutId")
        DetailScreen(
            navController = navController,
            workoutId = workoutId.orEmpty(),
        )
    }
}



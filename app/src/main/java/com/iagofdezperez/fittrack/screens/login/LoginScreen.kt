package com.iagofdezperez.fittrack.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.data.Routes
import com.iagofdezperez.fittrack.screens.login.components.LoginBody
import com.iagofdezperez.fittrack.screens.login.components.LoginBottom
import com.iagofdezperez.fittrack.screens.login.components.LoginHeader


@Composable
fun LoginScreen(navController: NavHostController, viewModel: LoginViewModel = hiltViewModel()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(12.dp)
    ) {
        LoginHeader(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .size(32.dp)
        ) { navController.navigate(Routes.MainScreen.route) }
        LoginBody(modifier = Modifier.align(Alignment.Center), loginViewModel = viewModel)
        LoginBottom(modifier = Modifier.align(Alignment.BottomCenter))
    }
}






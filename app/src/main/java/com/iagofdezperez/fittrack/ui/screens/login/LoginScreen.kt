package com.iagofdezperez.fittrack.ui.screens.login

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
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.ui.data.Routes
import com.iagofdezperez.fittrack.ui.screens.login.components.LoginBody
import com.iagofdezperez.fittrack.ui.screens.login.components.LoginBottom
import com.iagofdezperez.fittrack.ui.screens.login.components.LoginHeader


@Composable
fun LoginScreen(navController: NavHostController, loginViewModel: LoginViewModel) {
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
        LoginBody(modifier = Modifier.align(Alignment.Center), loginViewModel = loginViewModel)
        LoginBottom(modifier = Modifier.align(Alignment.BottomCenter))
    }
}






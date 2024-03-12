package com.iagofdezperez.fittrack.screens.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.iagofdezperez.fittrack.screens.login.components.LoginBody
import com.iagofdezperez.fittrack.screens.login.components.LoginBottom
import com.iagofdezperez.fittrack.screens.login.components.LoginHeader


@Composable
fun LoginScreen(navController: NavHostController, viewModel: LoginViewModel = hiltViewModel()) {
    val user = viewModel.user.collectAsState()
    val password by viewModel.password.collectAsState()
    LoginContent(
        user = user.value,
        password = password,
        onUserChanged = { viewModel.onUserChanged(it) },
        onPasswordChanged = { viewModel.onPasswordChanged(it) },
        onCrossClick = { navController.popBackStack() })
}

@Composable
fun LoginContent(
    user: String,
    password: String,
    onUserChanged: (String) -> Unit,
    onPasswordChanged: (String) -> Unit,
    onCrossClick: () -> Unit
) {
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
        ) { onCrossClick() }
        LoginBody(
            modifier = Modifier.align(Alignment.Center),
            user = user,
            password = password,
            onPasswordChanged = onPasswordChanged,
            onUserChanged = onUserChanged
        )
        LoginBottom(modifier = Modifier.align(Alignment.BottomCenter))
    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginContent(
        user = "primis",
        password = "dicit",
        onUserChanged = {},
        onPasswordChanged = {},
        onCrossClick = {}
    )
}






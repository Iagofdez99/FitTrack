package com.iagofdezperez.fittrack.screens.login.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginBody(
    modifier: Modifier,
    user: String,
    password: String,
    onPasswordChanged: (String) -> Unit,
    onUserChanged: (String) -> Unit
) {
    Column(modifier = modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
        AppLogo()
        Spacer(modifier = Modifier.size(64.dp))
        UserField(user) { onUserChanged(it) }
        Spacer(modifier = Modifier.size(16.dp))
        PasswordField(password) { onPasswordChanged(it) }
        Spacer(modifier = Modifier.size(32.dp))
        LoginButton()
    }
}

@Preview(showBackground = true, showSystemUi = false)
@Composable
fun AppLogo() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
        Text(
            text = "FitTrack",
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle(1),
            letterSpacing = 4.sp,
            color = Color.White,
        )
    }
}

@Composable
fun UserField(user: String, onChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = user,
        onValueChange = { onChange(it) },
        maxLines = 1,
        singleLine = true,
        label = {
            Text(
                text = "Username",
                Modifier.background(Color.White),
                color = Color.Gray
            )
        },
        colors = TextFieldDefaults.colors(
            disabledContainerColor = Color.Gray,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedLabelColor = Color.White,
        )
    )
}

@Composable
fun PasswordField(password: String, onPasswordChange: (String) -> Unit) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        value = password,
        onValueChange = { onPasswordChange(it) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        maxLines = 1,
        singleLine = true,
        colors = TextFieldDefaults.colors(
            disabledContainerColor = Color.Gray,
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedLabelColor = Color.White,
        ),
        label = {
            Text(
                text = "Password",
                Modifier.background(Color.White),
                color = Color.Gray
            )
        }
    )
}

@Composable
fun LoginButton() {
    Button(
        onClick = { },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 48.dp), shape = CutCornerShape(1.dp)
    ) {
        Text(text = "Log in")
    }
}
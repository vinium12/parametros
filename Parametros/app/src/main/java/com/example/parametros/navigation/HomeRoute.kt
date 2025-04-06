package com.example.parametros.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import com.example.parametros.data.User
import com.example.parametros.data.getUserData
import com.example.parametros.ui.screen.HomeScreen


@Composable
fun HomeRoute(userName: String) {
    val user = getUserData(userName)

    if (user != null) {
        HomeScreen(user = user)
    } else {
        Text("Usuário não encontrado", color = Color.Red, fontSize = 20.sp)
    }
}

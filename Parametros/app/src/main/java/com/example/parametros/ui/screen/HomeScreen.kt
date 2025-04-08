package com.example.parametros.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.rememberNavController
import com.example.parametros.data.User
import com.example.parametros.data.marcelo
import com.example.parametros.ui.theme.ParametrosTheme


@Composable
fun HomeScreen(user: User){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier =
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()) {



        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF0A3D62)),
                contentAlignment = Alignment.Center

        ){
        Text(text = "Home", modifier =
            Modifier
                .padding(horizontal = 24.dp),
            fontSize = 40.sp,
            fontWeight = FontWeight(700),
            color = Color.White // cor branca
        )}

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Você está na tela Home", modifier = Modifier.padding(top = 16.dp))

        Text(
            text = "Olá, ${user.name}!",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 16.dp)
        )

        Text(
            text = "\"${user.bio}\"",
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(horizontal = 24.dp),
             fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = "Email: ${user.email}",
            modifier = Modifier.padding(top = 16.dp),
            fontSize = 16.sp
        )

        Text(
            text = "Data de Nascimento: ${user.DataNasc}",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp
        )

        Text(
            text = "Série: ${user.Serie}",
            modifier = Modifier.padding(top = 4.dp),
            fontSize = 16.sp
        )

        Text(text = "Idade: ${user.age}", modifier = Modifier.padding(top = 4.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    ParametrosTheme {
        HomeScreen(user = marcelo)
    }
}
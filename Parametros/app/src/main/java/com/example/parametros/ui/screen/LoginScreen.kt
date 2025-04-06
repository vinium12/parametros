package com.example.parametros.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CheckboxDefaults.colors
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.parametros.data.getUserData

import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.parametros.ui.theme.ParametrosTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen(navController: NavController){
    var text by rememberSaveable { mutableStateOf("") }
    var showError by remember { mutableStateOf(false) }

    Column (horizontalAlignment = Alignment.CenterHorizontally, modifier =
        Modifier
            .fillMaxWidth()
            .fillMaxHeight()){


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF0A3D62)),
            contentAlignment = Alignment.Center

        ){
            Text(text = "Login", modifier =
                Modifier
                    .padding(horizontal = 24.dp),
                fontSize = 40.sp,
                fontWeight = FontWeight(700),
                color = Color.White // cor branca
            )}


        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Você está na tela de login", modifier = Modifier.padding(top = 16.dp))

        OutlinedTextField(
            value = text,
            onValueChange =
                { text = it
                  showError = false},
            label = { Text(text = "Digite seu nome de usuário") },
            isError = showError,
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(0.9f), // 90% da largura
                    textStyle = TextStyle(color = Color.Black)
        )

        if (showError) {
            Text(
                text = "Usuário não cadastrado",
                color = Color.Red,
                style = MaterialTheme.typography.bodySmall,
                modifier = Modifier
                    .padding(top = 4.dp, start = 16.dp)
                    .align(Alignment.Start)
            )
        }

        Button(
            onClick = {
                val user = getUserData(text)
                if (user != null) {
                    navController.navigate("home/${user.name}") // aqui tá tudo certo
                } else {
                    showError = true
                }
            },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth(0.9f)
        ) {
            Text("Entrar")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    ParametrosTheme {
        LoginScreen(navController = rememberNavController())
    }
}

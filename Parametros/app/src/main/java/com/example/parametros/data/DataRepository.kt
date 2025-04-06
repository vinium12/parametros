package com.example.parametros.data

val vinicius = User(
    userId = "Vinicius",
    name = "Vinicius",
    avatarUrl = null,
    age = 17,
    score = 75,
    registerDate = "04/02/2008",
    email = "vinicius@etec.sp.gov.br",
    bio = "Estou aprendendo passar parâmetros em Jetpack Compose"
)



val marcelo = User(
    userId = "Marcelo",
    name = "Marcelo",
    avatarUrl = null,
    age = 51,
    score = 90,
    registerDate = "15/06/1973",
    email = "marcelo.collado@etec.sp.gov.br",
    bio = "Passei os parametros de usuarios"
)

fun getUserData(userName: String): User? {
    return if (userName == "Marcelo") {
        marcelo
    } else if (userName == "Vinicius") {
        vinicius
    } else {
        null
    }
}

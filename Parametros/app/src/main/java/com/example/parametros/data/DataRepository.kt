package com.example.parametros.data

val vinicius = User(
    userId = "Vinicius",
    name = "Vinicius",
    avatarUrl = null,
    age = 17,
    score = 75,
    DataNasc = "04/02/2008",
    email = "vinicius.lima@etec.sp.gov.br",
    bio = " Estou criando um aplicativo com passagem de parâmetros;",
    Serie = "3º AMS"
)



val marcelo = User(
    userId = "Marcelo",
    name = "Marcelo",
    avatarUrl = null,
    age = 51,
    score = 90,
    DataNasc = "15/06/1973",
    email = "marcelo.collado@etec.sp.gov.br",
    bio = "Passei os parametros de usuarios",
    Serie = "Formado"
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

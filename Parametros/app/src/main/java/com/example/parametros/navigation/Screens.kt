package com.example.parametros.navigation

import com.example.parametros.navigation.Routes.HOME_ROUTE
import com.example.parametros.navigation.Routes.LOGIN_ROUTE

sealed class Screens(val route: String) {
    object LoginScreen : Screens(LOGIN_ROUTE)
    object HomeScreen : Screens(HOME_ROUTE)
}
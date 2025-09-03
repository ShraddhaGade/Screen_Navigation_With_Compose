package com.example.screen_navigation_with_compose

sealed class AppRoutes(val route: String) {
    data object Welcome : AppRoutes("welcome")
    data object Login : AppRoutes("login")
    data object Home : AppRoutes("home")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
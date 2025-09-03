package com.example.screen_navigation_with_compose

sealed class AppRoutes(val route: String) {
    object Welcome : AppRoutes("welcome")
    object Login : AppRoutes("login")
    object Home : AppRoutes("home")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}
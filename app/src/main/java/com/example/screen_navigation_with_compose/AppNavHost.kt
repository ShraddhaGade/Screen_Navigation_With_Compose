package com.example.screen_navigation_with_compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNavHost(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = AppRoutes.Welcome.route) {
        // Define your composable routes here, for example:
        composable(AppRoutes.Welcome.route) {
            WelcomeScreen(
                onTimeout = {
                    navController.popBackStack()
                    navController.navigate(AppRoutes.Login.route)

            })
        }
        composable(AppRoutes.Login.route) {
            LoginScreen(
                onLoginSuccess = { name ->
                    navController.navigate(AppRoutes.Home.withArgs(name))
                }
            )
        }
        composable(AppRoutes.Home.route + "/{name}") { backStackEntry ->
            val name = backStackEntry.arguments?.getString("name")
            if (name != null) {
                HomeScreen(name = name)
            }
        }
    }
}

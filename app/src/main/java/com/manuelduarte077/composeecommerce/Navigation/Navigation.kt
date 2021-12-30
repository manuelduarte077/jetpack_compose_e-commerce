package com.manuelduarte077.composeecommerce.Navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.manuelduarte077.composeecommerce.screen.DetailsScreen
import com.manuelduarte077.composeecommerce.screen.HomeScreen
import com.manuelduarte077.composeecommerce.screen.LoginScreen
import com.manuelduarte077.composeecommerce.screen.SignUpScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route,
    ) {
        composable(Screen.LoginScreen.route) {
            LoginScreen(navController)
        }
        composable(Screen.SignUpScreen.route) {
            SignUpScreen(navController)
        }

        composable(Screen.HomeScreen.route) {
            HomeScreen(navController)
        }

        composable(
            "${Screen.DetailsScreen.route}/{index}",
            arguments = listOf(navArgument("index") {
                type =
                    NavType.IntType
            })
        ) {
            DetailsScreen(navController, it.arguments?.getInt("index") ?: 0)
        }
    }
}
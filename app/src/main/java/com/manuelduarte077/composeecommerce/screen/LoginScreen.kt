package com.manuelduarte077.composeecommerce.screen

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.manuelduarte077.composeecommerce.component.*
import com.manuelduarte077.composeecommerce.navigation.Screen

@Composable
fun LoginScreen(navController: NavController) {
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxWidth()
        ) {
            item {
                TextPadding(valuePadding = 25)
                // parte del logo
                LogoApp()

                TextPadding(valuePadding = 5)
                TextFieldBase("Email", emailValue)

                TextPadding(valuePadding = 5)
                TextFieldPass("Password", passwordValue, passwordVisible)

                TextPadding(valuePadding = 20)
                ButtonBase(text = "Login", onClick = {
                    navController.navigate(Screen.HomeScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                })

                TextPadding(valuePadding = 10)
                TextClick(text = "Create Account", onClick = {
                    navController.navigate(Screen.SignUpScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                })
            }
        }
    }

}
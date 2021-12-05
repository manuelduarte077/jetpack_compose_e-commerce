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
fun SignUpScreen(navController: NavController) {
    val confirmPasswordValue = remember { mutableStateOf("") }
    val nameValue = remember { mutableStateOf("") }
    val lastNameValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }
    val emailValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val passwordValue = remember { mutableStateOf("") }
    val confirmPasswordVisible = remember { mutableStateOf(false) }

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

                // Llamamos la parte del logo
                LogoApp()

                TextPadding(valuePadding = 5)
                TextFieldBase("Name", nameValue)

                TextPadding(valuePadding = 5)
                TextFieldBase("Last Name", lastNameValue)

                TextPadding(valuePadding = 5)
                TextFieldBase("Phone", phoneValue)

                TextPadding(valuePadding = 5)
                TextFieldBase("Email", emailValue)

                TextPadding(valuePadding = 5)
                TextFieldPass("Password", passwordValue, passwordVisible)

                TextPadding(valuePadding = 5)
                TextFieldPass("Confirm Password", confirmPasswordValue, confirmPasswordVisible)

                TextPadding(valuePadding = 20)
                ButtonBase(text = "Register", onClick = { })

                TextPadding(valuePadding = 5)
                TextClick(text = "Login", onClick = {
                    navController.navigate(Screen.LoginScreen.route){
                        popUpTo(Screen.SignUpScreen.route){
                            inclusive = true
                        }
                    }
                })

            }
        }
    }

}
package com.manuelduarte077.composeecommerce.screen

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {

    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        Text(text = "Hola")
    }

}
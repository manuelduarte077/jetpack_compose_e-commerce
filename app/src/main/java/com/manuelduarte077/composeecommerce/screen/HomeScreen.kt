package com.manuelduarte077.composeecommerce.screen

import androidx.compose.animation.Crossfade
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.manuelduarte077.composeecommerce.R
import com.manuelduarte077.composeecommerce.component.BottonBarApp

@Composable
fun HomeScreen(navController: NavController) {

    val navItems = Section.values().toList()
    val section = remember { mutableStateOf(Section.Companies) }

    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        bottomBar = {
            BottonBarApp(
                items = navItems,
                currentSection = section.value,
                onSectionSelected = { section.value = it })
        }) {
        Crossfade(targetState = section.value) { section ->
            when (section) {
                Section.Companies -> Text(text = "Compañias")
                Section.Explorer -> Text(text = "Explorar")
                Section.Orders -> Text(text = "Carrito")
                Section.Profile -> Text(text = "Perfil")
            }
        }
    }
}

enum class Section(val icon: Int) {
    Companies(R.drawable.ic_baseline_home_24),
    Explorer(R.drawable.ic_baseline_search_24),
    Orders(R.drawable.ic_baseline_shopping_cart_24),
    Profile(R.drawable.ic_baseline_person_24),
}
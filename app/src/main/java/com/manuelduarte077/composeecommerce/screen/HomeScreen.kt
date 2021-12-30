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
import com.manuelduarte077.composeecommerce.components.buttons.BottonBarApp
import com.manuelduarte077.composeecommerce.components.TopBarApp
import com.manuelduarte077.composeecommerce.fragment.CompaniesFragment
import com.manuelduarte077.composeecommerce.navigation.Screen

@Composable
fun HomeScreen(navController: NavController) {

    val navItems = Section.values().toList()
    val section = remember { mutableStateOf(Section.Companies) }

    Scaffold(
        backgroundColor = MaterialTheme.colors.background,
        topBar = {
            Crossfade(targetState = section.value) { section ->
                when (section) {
                    Section.Companies -> TopBarApp(
                        "Restaurantes",
                        "Hola 2",
                        R.drawable.ic_baseline_lightbulb_24,
                        onIconClick = {}
                    )
                    Section.Explorer -> TopBarApp(
                        "Categorias",
                        "Categorias Principales",
                        R.drawable.ic_baseline_search_24,
                        onIconClick = {}
                    )
                    Section.Orders -> TopBarApp(
                        "Carrito",
                        "Productos adquiridos",
                        R.drawable.ic_baseline_filter_list_24,
                        onIconClick = {}
                    )
                    Section.Profile -> TopBarApp(
                        "Perfil",
                        "Datos Personales",
                        R.drawable.ic_baseline_logout_24,
                        onIconClick = {
                            navController.navigate(Screen.LoginScreen.route){
                                popUpTo(Screen.HomeScreen.route){
                                    inclusive = true
                                }
                            }
                        }
                    )
                }
            }

        },
        bottomBar = {

            BottonBarApp(
                items = navItems,
                currentSection = section.value,
                onSectionSelected = { section.value = it })
        }) {
        Crossfade(targetState = section.value) { section ->
            when (section) {
                Section.Companies -> CompaniesFragment(navController)
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
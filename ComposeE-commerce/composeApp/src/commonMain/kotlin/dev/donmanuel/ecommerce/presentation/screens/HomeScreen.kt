package dev.donmanuel.ecommerce.presentation.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import composee_commerce.composeapp.generated.resources.Res
import composee_commerce.composeapp.generated.resources.ic_baseline_home_24
import composee_commerce.composeapp.generated.resources.ic_baseline_person_24
import composee_commerce.composeapp.generated.resources.ic_baseline_search_24
import composee_commerce.composeapp.generated.resources.ic_baseline_shopping_cart_24
import org.jetbrains.compose.resources.DrawableResource

@Composable
fun HomeScreen(navController: NavController) {
}

enum class Section(val icon: DrawableResource) {
    Companies(Res.drawable.ic_baseline_home_24),
    Explore(Res.drawable.ic_baseline_search_24),
    Orders(Res.drawable.ic_baseline_shopping_cart_24),
    Profile(Res.drawable.ic_baseline_person_24)
}

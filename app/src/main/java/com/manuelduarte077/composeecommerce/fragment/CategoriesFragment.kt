package com.manuelduarte077.composeecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.manuelduarte077.composeecommerce.model.Category
import com.manuelduarte077.composeecommerce.component.card.CategoryCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()
   LazyVerticalGrid(cells = GridCells.Fixed(2)){
       items(categories){
           CategoryCard(it,
           onItemClick = {

           })
       }
   }
}
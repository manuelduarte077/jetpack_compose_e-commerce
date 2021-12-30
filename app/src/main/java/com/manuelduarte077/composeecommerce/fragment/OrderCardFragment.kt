package com.manuelduarte077.composeecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.manuelduarte077.composeecommerce.model.Order
import com.manuelduarte077.composeecommerce.component.card.ProductCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun OrderCardFragment(navController: NavController) {
    val orders = Order().getOrders()
    Column(  verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxHeight()) {
        LazyColumn(Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween){
            items(orders){
                ProductCard(it.title,
                    "${it.count} Articulos \n MXN ${it.total} \n ${it.direction}",
                    it.image,
                    Icons.Default.Close,
                    onItemClick = {

                    })
            }
        } 
        Button(onClick = { /*TODO*/ },
        modifier = Modifier.height(50.dp).width(150.dp)) {
            Text(text = "PAGAR", style = MaterialTheme.typography.body1)
        }
    }
  
}
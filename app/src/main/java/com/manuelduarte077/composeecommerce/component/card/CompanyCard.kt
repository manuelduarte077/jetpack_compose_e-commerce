package com.manuelduarte077.composeecommerce.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.manuelduarte077.composeecommerce.model.Company

@Composable
fun CompanyCard(company: Company, onItemClick:(company: Company)->Unit
) {
    Card(
    modifier = Modifier
        .padding(15.dp)
        .fillMaxWidth()
        .clickable { onItemClick(company) },
    elevation = 5.dp) {
      Column {
          val image:Painter = painterResource(id = company.image)
          Image(painter = image, contentDescription ="",
          modifier = Modifier.height(150.dp).fillMaxWidth(),
          contentScale = ContentScale.Crop)

          Row(modifier = Modifier
              .fillMaxWidth()
              .padding(15.dp),
          verticalAlignment = Alignment.CenterVertically,
          horizontalArrangement = Arrangement.SpaceBetween) {
           Column {
               Text(text = company.name,
               style = MaterialTheme.typography.h5)

               Text(text = "Costo de envio: ${company.deliveryPrice} . ${company.deliveryTime} ",
                   style = MaterialTheme.typography.subtitle1)
           }
              TagCard(tag = company.rating)
          }
      }
    }

}
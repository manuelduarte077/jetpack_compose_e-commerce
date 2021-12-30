package com.manuelduarte077.composeecommerce.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.manuelduarte077.composeecommerce.model.Category

@Composable
fun ProductCard(title: String,subtitle:String,idImage:Int,idIcon: ImageVector, onItemClick: (category: Category) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(20.dp),
        shape = RoundedCornerShape(10.dp),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(end = 5.dp),
        ) {

            Row(verticalAlignment = Alignment.CenterVertically){
                val image: Painter = painterResource(id = idImage)
                Image(
                    painter = image, contentDescription = "",
                    modifier = Modifier
                        .size(100.dp),
                    contentScale = ContentScale.Crop
                )

                Column(modifier = Modifier.padding(start = 3.dp).width(150.dp)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Bold,)
                    )

                    Text(
                        text = subtitle,
                        style = MaterialTheme.typography.subtitle1
                    )
                }
            }

            TagCard(icon = idIcon)

        }
    }

}
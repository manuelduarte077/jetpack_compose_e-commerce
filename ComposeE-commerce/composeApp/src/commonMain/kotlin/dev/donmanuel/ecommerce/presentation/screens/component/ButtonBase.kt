package dev.donmanuel.ecommerce.presentation.screens.component

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(
    text: String, 
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = { onClick() },
        modifier = modifier,
        shape = MaterialTheme.shapes.medium
    ) {
        Text(text = text, fontSize = 16.sp)
    }
}
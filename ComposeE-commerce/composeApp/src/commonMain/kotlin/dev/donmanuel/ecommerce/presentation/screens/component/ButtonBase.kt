package dev.donmanuel.ecommerce.presentation.screens.component

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(text: String, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(text = text, fontSize = 20.sp)
    }
}
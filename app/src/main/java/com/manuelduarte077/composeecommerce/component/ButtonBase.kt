package com.manuelduarte077.composeecommerce.component

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(text: String, onClick: () -> Unit) {
    Button(onClick = { onClick() }) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }

}
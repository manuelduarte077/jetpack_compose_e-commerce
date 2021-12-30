package com.manuelduarte077.composeecommerce.components.textfield

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextPadding(valuePadding: Int){
    Spacer(modifier = Modifier.padding(valuePadding.dp))
}
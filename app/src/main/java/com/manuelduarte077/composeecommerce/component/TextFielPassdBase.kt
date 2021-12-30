package com.manuelduarte077.composeecommerce.component

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.manuelduarte077.composeecommerce.R

@Composable
fun TextFieldPassBase(text:String,textValue:MutableState<String>,passwordVisible:MutableState<Boolean>) {
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                    tint = if (passwordVisible.value) MaterialTheme.colors.primary else Color.Gray,
                    contentDescription = ""
                )
            }
        },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )

}
package com.manuelduarte077.composeecommerce.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manuelduarte077.composeecommerce.R

@Composable
fun LoginScreen() {
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }

    Scaffold(
        backgroundColor = MaterialTheme.colors.background
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxWidth()
        ) {
            item {
                Spacer(modifier = Modifier.padding(20.dp))
                Image(
                    painter = painterResource(id = R.drawable.applogo),
                    contentDescription = "Logo de la App",
                    modifier = Modifier.size(100.dp)
                )
                Text(
                    text = "Delivery", fontSize = 30.sp,
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        letterSpacing = 5.sp,
                        color = MaterialTheme.colors.primary
                    )
                )

                Spacer(modifier = Modifier.padding(20.dp))
                OutlinedTextField(
                    value = emailValue.value,
                    onValueChange = { emailValue.value = it },
                    label = {
                        Text(
                            text = "Correo",
                            color = MaterialTheme.colors.onBackground
                        )
                    },
                    singleLine = true
                )

                Spacer(modifier = Modifier.padding(10.dp))
                OutlinedTextField(
                    value = passwordValue.value,
                    onValueChange = { passwordValue.value = it },
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.ic_baseline_remove_red_eye_24
                                ),
                                contentDescription = "Icono para ver password",
                                tint = if (passwordVisible.value) MaterialTheme.colors.primary else Color.Gray
                            )

                        }
                    },
                    label = {
                        Text(
                            text = "Password",
                            color = MaterialTheme.colors.onBackground
                        )
                    },
                    singleLine = true,
                    visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
                )
                Spacer(modifier = Modifier.padding(20.dp))
                Button(onClick = { }) {
                    Text(
                        text = "Login",
                        fontSize = 20.sp
                    )
                }

                Spacer(modifier = Modifier.padding(20.dp))
                Text(
                    text = "Account Create",
                    modifier = Modifier.clickable(
                        onClick = {

                        }
                    )
                )
            }
        }
    }

}
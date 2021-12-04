package com.manuelduarte077.composeecommerce

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.manuelduarte077.composeecommerce.screen.LoginScreen
import com.manuelduarte077.composeecommerce.screen.SingUpScreen
import com.manuelduarte077.composeecommerce.ui.theme.ComposeEcommerceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeEcommerceTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
//                    LoginScreen()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    SingUpScreen()
}

@Preview
@Composable
fun DefaultPreview() {
    ComposeEcommerceTheme {
        Greeting("Android")
    }
}
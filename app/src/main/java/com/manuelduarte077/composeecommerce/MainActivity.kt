package com.manuelduarte077.composeecommerce

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.manuelduarte077.composeecommerce.ui.theme.TallerEcommerceTheme
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.manuelduarte077.composeecommerce.Navigation.Navigation

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            rememberSystemUiController().setSystemBarsColor(
                color = Color.Transparent,
                darkIcons = !isSystemInDarkTheme()
            )
            TallerEcommerceTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Navigation()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    TallerEcommerceTheme {
        Greeting("Android")
    }
}
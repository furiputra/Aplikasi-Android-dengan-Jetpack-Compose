package com.rivaldo.listPlayer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.tooling.preview.Preview
import com.rivaldo.listPlayer.ui.screen.ListPlayerApp
import com.rivaldo.listPlayer.ui.theme.ListPlayerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListPlayerTheme {
                // A surface container using the 'background' color from the theme
                window?.statusBarColor = MaterialTheme.colors.primaryVariant.toArgb()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ListPlayerApp()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Players $name")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ListPlayerTheme {
        Greeting("Timnas")
    }
}
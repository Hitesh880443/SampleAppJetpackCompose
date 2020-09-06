package com.example.jetpackcomposesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.tooling.preview.PreviewParameter
import com.example.jetpackcomposesample.ui.JetpackComposeSampleTheme
import org.koin.android.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val mHomeViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeSampleTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
@Preview("Main Text Component", showBackground = true)
fun Greeting(name: String = "Hitesh Sutar") {

    Column {
        Text(text = "Hello $name!",
                style = TextStyle(
                        color = Color.Blue
                ))

        DefaultPreview()
    }


}

@Preview("Dummy Content", showBackground = true)
@Composable
fun DefaultPreview() {
    Text(text = "Sub Text")
}
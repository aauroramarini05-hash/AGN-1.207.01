package com.xdustatom.auryxgamenews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.xdustatom.auryxgamenews.ui.NewsScreen
import com.xdustatom.auryxgamenews.ui.theme.AuryxGameNewsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AuryxGameNewsTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    NewsScreen()
}

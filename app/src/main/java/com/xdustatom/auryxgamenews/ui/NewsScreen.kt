package com.xdustatom.auryxgamenews.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.xdustatom.auryxgamenews.data.NewsRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsScreen() {
    val news = NewsRepository.getNews()

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Auryx Game News") })
        }
    ) { padding ->
        Column(modifier = Modifier.padding(padding).padding(16.dp)) {
            news.forEach {
                Text(text = it.title)
                Text(text = it.description)
            }
        }
    }
}

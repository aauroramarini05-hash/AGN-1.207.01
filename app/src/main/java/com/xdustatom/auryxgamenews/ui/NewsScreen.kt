package com.xdustatom.auryxgamenews.ui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.xdustatom.auryxgamenews.data.NewsRepository
import com.xdustatom.auryxgamenews.data.RssItem
import kotlinx.coroutines.launch

@Composable
fun NewsScreen() {
    val repo = remember { NewsRepository() }
    val scope = rememberCoroutineScope()

    var news by remember { mutableStateOf<List<RssItem>>(emptyList()) }
    var loading by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        scope.launch {
            news = repo.fetchNews()
            loading = false
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Auryx Game News") })
        }
    ) { padding ->
        if (loading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = androidx.compose.ui.Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
            ) {
                items(news) { item ->
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(item.title ?: "", style = MaterialTheme.typography.titleMedium)
                        Spacer(modifier = Modifier.height(6.dp))
                        Text(item.description ?: "", style = MaterialTheme.typography.bodyMedium)
                    }
                    Divider()
                }
            }
        }
    }
}

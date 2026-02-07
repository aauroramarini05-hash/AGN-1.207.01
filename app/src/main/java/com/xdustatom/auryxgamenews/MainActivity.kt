package com.xdustatom.auryxgamenews

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
<<<<<<< HEAD
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.xdustatom.auryxgamenews.ui.NewsScreen
=======
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
<<<<<<< HEAD
                    NewsScreen()
=======
                    UiHome()
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45
                }
            }
        }
    }
}
<<<<<<< HEAD
=======

@Composable
fun UiHome() {
    // NEWS FINTE (solo UI per ora)
    val news = remember {
        listOf(
            "GTA VI: nuove indiscrezioni sul gameplay e mondo aperto",
            "PlayStation 6: primi rumor sull’hardware",
            "Xbox punta tutto sul cloud gaming nel 2026",
            "Nintendo Switch 2: data di uscita sempre più vicina",
            "Rockstar aggiorna GTA Online con nuovi contenuti",
            "Unreal Engine 5.4 migliora le performance su console"
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Auryx Game News",
                        style = MaterialTheme.typography.titleLarge
                    )
                }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(news) { title ->
                NewsCard(title = title)
            }
        }
    }
}

@Composable
fun NewsCard(title: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = title,
                style = MaterialTheme.typography.titleMedium,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Tap to read • Auryx Game News",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}
>>>>>>> 11ccac5e53b4d56c496e7b3fa4d0cec5d335bf45

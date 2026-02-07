package com.xdustatom.auryxgamenews.data

data class NewsItem(
    val title: String,
    val description: String
)

object NewsRepository {

    fun getNews(): List<NewsItem> {
        return listOf(
            NewsItem(
                title = "Auryx Game News online",
                description = "Build di test completata con successo."
            ),
            NewsItem(
                title = "GTA VI",
                description = "Nuove indiscrezioni sul prossimo capitolo Rockstar."
            )
        )
    }
}

package com.xdustatom.auryxgamenews.data

import com.prof18.rssparser.RssParser
import com.prof18.rssparser.model.RssItem
import com.xdustatom.auryxgamenews.model.NewsItem

class NewsRepository {
    private val parser = RssParser()

    suspend fun fetchAll(): List<NewsItem> {
        val all = mutableListOf<NewsItem>()

        for (src in RssSources.sources) {
            try {
                val channel = parser.getRssChannel(src.url)
                val items = channel.items ?: emptyList()
                all += items.mapNotNull { it.toNewsItem(src.name) }
            } catch (_: Exception) {
                // ignore a single failing source
            }
        }

        return all
            .distinctBy { it.link }
            .sortedWith(compareByDescending<NewsItem> { it.published ?: "" })
    }

    private fun RssItem.toNewsItem(sourceName: String): NewsItem? {
        val t = title?.trim().orEmpty()
        val l = link?.trim().orEmpty()
        if (t.isBlank() || l.isBlank()) return null
        return NewsItem(
            title = t,
            link = l,
            source = sourceName,
            published = pubDate?.trim()
        )
    }
}

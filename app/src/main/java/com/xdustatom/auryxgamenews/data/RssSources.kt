package com.xdustatom.auryxgamenews.data

data class RssSource(val name: String, val url: String)

object RssSources {
    val sources = listOf(
        RssSource("IGN", "https://feeds.ign.com/ign/all"),
        RssSource("Eurogamer", "https://www.eurogamer.net/feed"),
        RssSource("Multiplayer.it", "https://www.multiplayer.it/rss/news.xml"),
        RssSource("Rockstar Newswire", "https://www.rockstargames.com/newswire.rss")
    )
}

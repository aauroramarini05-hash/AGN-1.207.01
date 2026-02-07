package com.xdustatom.auryxgamenews.model

data class NewsItem(
    val title: String,
    val link: String,
    val source: String,
    val published: String? = null
)

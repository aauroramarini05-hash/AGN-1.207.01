package com.xdustatom.auryxgamenews.data

import retrofit2.Retrofit
import retrofit2.converter.simplexml.SimpleXmlConverterFactory

class NewsRepository {

    private val api: RssApi = Retrofit.Builder()
        .baseUrl("https://feeds.ign.com/ign/")
        .addConverterFactory(SimpleXmlConverterFactory.create())
        .build()
        .create(RssApi::class.java)

    suspend fun fetchNews(): List<RssItem> {
        return api.getIgnNews().channel?.items ?: emptyList()
    }
}

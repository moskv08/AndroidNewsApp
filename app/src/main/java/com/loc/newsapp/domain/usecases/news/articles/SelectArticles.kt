package com.loc.newsapp.domain.usecases.news.articles

import com.loc.newsapp.data.local.room.NewsDao
import com.loc.newsapp.domain.model.Article
import kotlinx.coroutines.flow.Flow

class SelectArticles (
    private val newsDao: NewsDao
) {
    operator fun invoke(): Flow<List<Article>> {
        return newsDao.getArticles()
    }
}
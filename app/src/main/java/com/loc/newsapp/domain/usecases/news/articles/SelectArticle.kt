package com.loc.newsapp.domain.usecases.news.articles

import com.loc.newsapp.data.local.room.NewsDao
import com.loc.newsapp.domain.model.Article

class SelectArticle (
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(url: String): Article?{
        return newsDao.getArticle(url)
    }
}
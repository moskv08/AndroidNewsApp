package com.loc.newsapp.domain.usecases.news.articles

import com.loc.newsapp.data.local.room.dao.NewsDao
import com.loc.newsapp.domain.model.Article

class UpsertArticle(
    private val newsDao: NewsDao
) {

    suspend operator fun invoke(article: Article){
        newsDao.upsert(article)
    }
}
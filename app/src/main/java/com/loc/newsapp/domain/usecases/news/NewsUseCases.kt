package com.loc.newsapp.domain.usecases.news

import com.loc.newsapp.domain.usecases.news.articles.DeleteArticle
import com.loc.newsapp.domain.usecases.news.articles.SelectArticle
import com.loc.newsapp.domain.usecases.news.articles.SelectArticles
import com.loc.newsapp.domain.usecases.news.articles.UpsertArticle

data class NewsUseCases(
    val getNews: GetNews,
    val searchNews: SearchNews,
    val upsertArticle: UpsertArticle,
    val deleteArticle: DeleteArticle,
    val selectArticles: SelectArticles,
    val selectArticle: SelectArticle
)

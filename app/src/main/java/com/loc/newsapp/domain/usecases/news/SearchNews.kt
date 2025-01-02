package com.loc.newsapp.domain.usecases.news

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.http.Query

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(sources: List<String>, searchQuery: String): Flow<PagingData<Article>>{
        return newsRepository.searchNews(sources = sources, searchQuery = searchQuery)
    }
}
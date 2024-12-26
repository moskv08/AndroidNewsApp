package com.loc.newsapp.presentation.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.LazyPagingItems
import com.loc.newsapp.domain.model.Article

@Composable
fun ArticlesList(
    modifier: Modifier = Modifier,
    articles: LazyPagingItems<Article>,
    onClick: (Article) -> Unit
) {

}
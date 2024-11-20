package com.loc.newsapp.presentation.onboarding

import android.media.Image
import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "Nonumy eirmod tempor invidunt ut",
        description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Nonumy eirmod tempor invidunt ut",
        description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Nonumy eirmod tempor invidunt ut",
        description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam.",
        image = R.drawable.onboarding3
    )
)
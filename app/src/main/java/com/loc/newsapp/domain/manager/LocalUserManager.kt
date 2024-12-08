package com.loc.newsapp.domain.manager

interface LocalUserManager {

    suspend fun saveAppEntry()

    fun readAppEntry()
}


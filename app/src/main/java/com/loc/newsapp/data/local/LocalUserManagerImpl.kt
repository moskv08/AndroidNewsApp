package com.loc.newsapp.data.local

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.loc.newsapp.util.Constants.USER_SETTINGS
import com.loc.newsapp.domain.manager.LocalUserManager
import com.loc.newsapp.util.Constants
import kotlinx.coroutines.flow.map

class LocalUserManagerImpl (
    private val context: Context
) : LocalUserManager {

    private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)

    private object PreferenceKeys {
        val APP_ENTRY = booleanPreferencesKey(name = Constants.APP_ENTRY)
    }

    override suspend fun saveAppEntry() {
        context.dataStore.edit { settings ->
            settings[PreferenceKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry() {
        return context.dataStore.data.map { preferences ->
            preferences[PreferenceKeys.APP_ENTRY] ?: false
        }
    }

}
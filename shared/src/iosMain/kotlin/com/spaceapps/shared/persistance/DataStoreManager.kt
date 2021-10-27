package com.spaceapps.shared.persistance

actual class DataStoreManager {
    actual suspend fun storeTokens(accessToken: String, refreshToken: String) {
    }

    actual suspend fun getAccessToken(): String? {
        return null
    }

    actual suspend fun getRefreshToken(): String? {
        return null
    }

    actual suspend fun storeFcmToken(token: String) {
    }

    actual suspend fun getFcmToken(): String? {
        return null
    }
}
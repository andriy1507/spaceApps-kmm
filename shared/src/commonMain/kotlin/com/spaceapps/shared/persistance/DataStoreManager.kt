package com.spaceapps.shared.persistance

expect class DataStoreManager {

    suspend fun storeTokens(accessToken: String, refreshToken: String)

    suspend fun getAccessToken(): String?

    suspend fun getRefreshToken(): String?

    suspend fun storeFcmToken(token: String)

    suspend fun getFcmToken(): String?

}
package com.spaceapps.shared.network

import com.spaceapps.shared.persistance.DataStoreManager
import io.ktor.client.*
import io.ktor.client.features.auth.*
import io.ktor.client.features.auth.providers.*
import io.ktor.client.features.json.*
import io.ktor.client.features.json.serializer.*
import io.ktor.client.features.logging.*
import io.ktor.client.statement.*
import io.ktor.http.*

object HttpClientBuilder {
    fun build(dataStoreManager: DataStoreManager) {
        HttpClient {
            install(Logging) {
                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        println("HttpClient: $message")
                    }
                }
            }
            install(JsonFeature) {
                serializer = KotlinxSerializer()
            }
            install(Auth) {
                bearer {
                    loadTokens {
                        val accessToken = dataStoreManager.getAccessToken() ?: return@loadTokens null
                        val refreshToken = dataStoreManager.getRefreshToken() ?: return@loadTokens null
                        BearerTokens(accessToken, refreshToken)
                    }
                    // TODO: 10/15/2021 Refresh token
                }
            }
        }
    }
}

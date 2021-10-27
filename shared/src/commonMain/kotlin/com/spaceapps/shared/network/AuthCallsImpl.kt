package com.spaceapps.shared.network

import com.spaceapps.shared.models.auth.AuthRequest
import com.spaceapps.shared.models.auth.AuthResponse
import io.ktor.client.*
import io.ktor.client.request.*

class AuthCallsImpl(
    private val httpClient: HttpClient
) : AuthCalls {
    override suspend fun signIn(request: AuthRequest): AuthResponse {
        return httpClient.post("/auth/sign-in", body = request)
    }

    override suspend fun signUp(request: AuthRequest): AuthResponse {
        return httpClient.post("/auth/sign-up", body = request)
    }

    override suspend fun logOut(token: String) {
        return httpClient.delete("/auth/log-out/$token")
    }
}
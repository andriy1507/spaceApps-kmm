package com.spaceapps.shared.network

import com.spaceapps.shared.models.auth.AuthRequest
import com.spaceapps.shared.models.auth.AuthResponse

interface AuthCalls {

    suspend fun signIn(request: AuthRequest): AuthResponse

    suspend fun signUp(request: AuthRequest): AuthResponse

    suspend fun logOut(token: String)
}
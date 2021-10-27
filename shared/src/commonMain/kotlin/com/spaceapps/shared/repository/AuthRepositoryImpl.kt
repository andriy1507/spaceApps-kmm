package com.spaceapps.shared.repository

import com.spaceapps.shared.network.AuthCalls
import com.spaceapps.shared.persistance.DataStoreManager

class AuthRepositoryImpl(
    private val authCalls: AuthCalls,
    private val dataStoreManager: DataStoreManager
) : AuthRepository {
    override suspend fun signIn(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun signUp(email: String, password: String) {
        TODO("Not yet implemented")
    }

    override suspend fun logOut() {
        TODO("Not yet implemented")
    }
}
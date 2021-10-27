package com.spaceapps.shared.repository

interface AuthRepository {

    suspend fun signIn(email: String, password: String)

    suspend fun signUp(email: String, password: String)

    suspend fun logOut()

}
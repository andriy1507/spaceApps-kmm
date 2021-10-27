package com.spaceapps.shared.models.auth

import kotlinx.datetime.LocalDateTime
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    @SerialName("accessToken")
    val accessToken: String,
    @SerialName("accessTokenExp")
    val accessTokenExp: LocalDateTime,
    @SerialName("refreshToken")
    val refreshToken: String,
    @SerialName("refreshTokenExp")
    val refreshTokenExp: LocalDateTime
)
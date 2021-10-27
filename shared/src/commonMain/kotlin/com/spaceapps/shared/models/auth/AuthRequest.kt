package com.spaceapps.shared.models.auth

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AuthRequest(
    @SerialName("email")
    val email: String,
    @SerialName("password")
    val password: String,
    @SerialName("device")
    val device: Device
) {

    @Serializable
    data class Device(
        @SerialName("token")
        val token: String,
        @SerialName("platform")
        val platform: Platform
    ) {
        @Serializable
        enum class Platform {
            @SerialName("and")
            Android,

            @SerialName("ios")
            Ios
        }
    }
}
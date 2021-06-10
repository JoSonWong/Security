package com.duoxida.security.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LogoutInUser(
    val token: String,
    val userId: String
)

package com.duoxida.security.data

import com.duoxida.security.data.model.LoggedInUser
import com.duoxida.security.data.model.LogoutInUser
import java.io.IOException
import java.net.SocketTimeoutException

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
class LoginDataSource {

    fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }

    fun logout(username: String, token: String): Result<LogoutInUser> {
        try {
            return Result.Success(LogoutInUser(token, username))
        } catch (e: Throwable) {
            return Result.Error(SocketTimeoutException())
        }

    }
}


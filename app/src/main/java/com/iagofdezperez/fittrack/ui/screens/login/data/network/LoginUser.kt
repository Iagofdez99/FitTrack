package com.iagofdezperez.fittrack.ui.screens.login.data.network

import com.iagofdezperez.fittrack.ui.screens.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginUser {
    @GET("/v3/f78c9d33-28b1-4f81-9cf1-6d6ff78fa014")
    suspend fun doLogin(user:String, password:String): Response<LoginResponse>
}
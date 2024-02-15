package com.iagofdezperez.fittrack.ui.screens.mainScreen.data.network

import com.iagofdezperez.fittrack.ui.core.network.RetrofitHelper
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService{
    val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user:String, password:String):Boolean{
        return withContext(Dispatchers.IO){
            val response = retrofit.create(LoginUser::class.java).doLogin(user,password)
            response.body()?.success ?: false
        }
    }
}
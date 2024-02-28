package com.iagofdezperez.fittrack.screens.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor(): ViewModel() {

    private val _user = MutableLiveData<String>()
    val user : LiveData<String> = _user

    fun onUserChanged(user:String){
        _user.value = user
    }

    private val _password = MutableLiveData<String>()
    val password : LiveData<String> = _password

    fun onPasswordChanged(password:String){
        _password.value = password
    }
}
package com.iagofdezperez.fittrack.screens.login

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

class LoginViewModel @Inject constructor(): ViewModel() {

    private val _user = MutableStateFlow<String>("")
    val user = _user

    fun onUserChanged(user:String){
        _user.value = user
    }

    private val _password = MutableStateFlow<String>("")
    val password= _password

    fun onPasswordChanged(password:String){
        _password.value = password
    }
}

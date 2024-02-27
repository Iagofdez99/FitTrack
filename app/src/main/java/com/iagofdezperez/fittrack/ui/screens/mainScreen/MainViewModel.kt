package com.iagofdezperez.fittrack.ui.screens.mainScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(): ViewModel() {

    private val _index = MutableLiveData<Int>()
    val index : LiveData<Int> = _index

    fun onIndexChanged(index:Int){
        _index.value = index
    }
}
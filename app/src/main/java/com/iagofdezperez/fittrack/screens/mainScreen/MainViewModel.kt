package com.iagofdezperez.fittrack.screens.mainScreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iagofdezperez.fittrack.features.addWorkout.WorkoutsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    workoutsRepository: WorkoutsRepository
) : ViewModel() {
    init {
        viewModelScope.launch {
            workoutsRepository.setupWorkoutsDB()
        }
    }

    private val _index = MutableLiveData<Int>()
    val index: LiveData<Int> = _index

    fun onIndexChanged(index: Int) {
        _index.value = index
    }
}
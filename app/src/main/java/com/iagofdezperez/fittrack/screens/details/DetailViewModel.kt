package com.iagofdezperez.fittrack.screens.details

import androidx.lifecycle.ViewModel
import com.iagofdezperez.fittrack.features.addWorkout.WorkoutsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor():ViewModel() {
private val repository: WorkoutsRepository
    get() {
        TODO()
    }
}
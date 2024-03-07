package com.iagofdezperez.fittrack.screens.details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.iagofdezperez.fittrack.domain.WorkoutExercises
import com.iagofdezperez.fittrack.features.addWorkout.WorkoutsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val workoutsRepository: WorkoutsRepository
):ViewModel() {
    private val workoutId = savedStateHandle.get<String>("workoutId") ?: ""
    private val _state = MutableStateFlow<List< WorkoutExercises>>(emptyList())
    val state = _state
    init {
        if (workoutId.isNotEmpty()) {
            _state.value = workoutsRepository.getWorkouts(workoutId)
        }
    }
}


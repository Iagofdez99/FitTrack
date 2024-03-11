package com.iagofdezperez.fittrack.screens.mainScreen

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iagofdezperez.fittrack.domain.WorkoutCategories
import com.iagofdezperez.fittrack.features.addCategory.getCategorias
import com.iagofdezperez.fittrack.features.addWorkout.WorkoutsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
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

//    Intentado hacer lo mismo que en DetailViewModel pero con la lista de categorias
//    private val _state2 = MutableStateFlow<List<WorkoutCategories>>(emptyList())
//    val state2 = _state2

    val state: List<WorkoutCategories> = getCategorias()

    private val _index = MutableStateFlow<Int>(0)
    val index = _index

    fun onIndexChanged(index: Int) {
        _index.value = index
    }
}
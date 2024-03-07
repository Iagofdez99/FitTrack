package com.iagofdezperez.fittrack.features.addCategory

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddCategoryViewModel @Inject constructor(private val respository : CategoryRepository):
    ViewModel() {

}
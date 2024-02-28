package com.iagofdezperez.fittrack.features.addCategory

import com.iagofdezperez.fittrack.R
import com.iagofdezperez.fittrack.domain.WorkoutCategoriesData
import javax.inject.Inject

class CategoryRepository @Inject constructor(){

}

fun getCategorias(): List<WorkoutCategoriesData> = listOf(
    WorkoutCategoriesData("Abs", R.drawable.ejercicioabs),
    WorkoutCategoriesData("Chest", R.drawable.ejerciciochest),
    WorkoutCategoriesData("Back", R.drawable.ejercicioback),
    WorkoutCategoriesData("Front legs", R.drawable.ejerciciolegs),
    WorkoutCategoriesData("Back legs", R.drawable.ejerciciobackleg),
    WorkoutCategoriesData("Shoulders", R.drawable.ejercicioshoulders),
    WorkoutCategoriesData("Biceps", R.drawable.ejerciciobiceps),
    WorkoutCategoriesData("Triceps", R.drawable.ejerciciotriceps),
    WorkoutCategoriesData("Front mix", R.drawable.front),
    WorkoutCategoriesData("Back mix", R.drawable.back),
)
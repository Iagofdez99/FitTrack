package com.iagofdezperez.fittrack.ui.data

import androidx.annotation.DrawableRes
import com.iagofdezperez.fittrack.R

data class WorkoutCategoriesData(
    val name: String,
    @DrawableRes val image: Int
)

fun getCategorias(): List<WorkoutCategoriesData> = mutableListOf(
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


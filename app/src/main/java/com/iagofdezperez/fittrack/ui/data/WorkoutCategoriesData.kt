package com.iagofdezperez.fittrack.ui.data

import androidx.annotation.DrawableRes
import com.iagofdezperez.fittrack.R

data class CategoriasWorkout(
    val name: String,
    @DrawableRes val image: Int
)

fun getCategorias(): List<CategoriasWorkout> = listOf(
    CategoriasWorkout("Abs", R.drawable.ejercicioabs),
    CategoriasWorkout("Chest", R.drawable.ejerciciochest),
    CategoriasWorkout("Back", R.drawable.ejercicioback),
    CategoriasWorkout("Front Legs", R.drawable.ejerciciolegs),
    CategoriasWorkout("Back Legs", R.drawable.ejerciciobackleg),
    CategoriasWorkout("Shoulders", R.drawable.ejercicioshoulders),
    CategoriasWorkout("Biceps", R.drawable.ejerciciobiceps),
    CategoriasWorkout("Triceps", R.drawable.ejerciciotriceps),
    CategoriasWorkout("Front Mix", R.drawable.front),
    CategoriasWorkout("Back Mix", R.drawable.back),
)


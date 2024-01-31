package com.iagofdezperez.fittrack

import androidx.annotation.DrawableRes

data class CategoriasWorkout(
    val name: String,
    @DrawableRes val image: Int
)

fun getCategorias(): List<CategoriasWorkout> = mutableListOf(
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

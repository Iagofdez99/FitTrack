package com.iagofdezperez.fittrack.domain

import androidx.annotation.DrawableRes

data class WorkoutCategories(
    val name: String,
    @DrawableRes val image: Int
)
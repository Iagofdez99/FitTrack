package com.iagofdezperez.fittrack.domain

import androidx.annotation.DrawableRes

data class WorkoutCategoriesData(
    val name: String,
    @DrawableRes val image: Int
)
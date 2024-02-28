package com.iagofdezperez.fittrack.features.addCategory

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.R
import com.iagofdezperez.fittrack.bbdd.CategoriesDBScheme
import com.iagofdezperez.fittrack.domain.WorkoutCategories
import javax.inject.Inject

class CategoryRepository @Inject constructor(private val db: SQLiteDatabase){
    fun guardarCategorie(category: WorkoutCategories){
        val values = ContentValues().apply {
            put(CategoriesDBScheme.COLUMN_CATEGORY,category.name)
            put(CategoriesDBScheme.COLUMN_IMAGE,category.image)
        }
        db.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES,null,values)
    }
}

fun getCategorias(): List<WorkoutCategories> = listOf(
    WorkoutCategories("Abs", R.drawable.ejercicioabs),
    WorkoutCategories("Chest", R.drawable.ejerciciochest),
    WorkoutCategories("Back", R.drawable.ejercicioback),
    WorkoutCategories("Front legs", R.drawable.ejerciciolegs),
    WorkoutCategories("Back legs", R.drawable.ejerciciobackleg),
    WorkoutCategories("Shoulders", R.drawable.ejercicioshoulders),
    WorkoutCategories("Biceps", R.drawable.ejerciciobiceps),
    WorkoutCategories("Triceps", R.drawable.ejerciciotriceps),
    WorkoutCategories("Front mix", R.drawable.front),
    WorkoutCategories("Back mix", R.drawable.back),
)
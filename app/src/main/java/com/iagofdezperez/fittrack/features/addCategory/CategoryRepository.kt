package com.iagofdezperez.fittrack.features.addCategory

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.R
import com.iagofdezperez.fittrack.data.bbdd.CategoriesDBScheme
import com.iagofdezperez.fittrack.di.CategoriesDDBB
import com.iagofdezperez.fittrack.domain.WorkoutCategories
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CategoryRepository @Inject constructor(
    @CategoriesDDBB private val categoriesDb: SQLiteDatabase
) {

    suspend fun setupWorkoutsDB() {
        withContext(Dispatchers.IO) {
            val cursor = categoriesDb.rawQuery(
                "SELECT Count(*) FROM ${CategoriesDBScheme.TABLE_NAME_CATEGORIES}",
                null
            )
            cursor.moveToFirst()
            val count = cursor.getInt(0)
            cursor.close()

            if (count <= 0) {
                var values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Abs")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejercicioabs")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Chest")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejerciciochest")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Back")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejercicioback")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Front legs")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejerciciolegs")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Back legs")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejerciciobackleg")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Shoulders")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejercicioshoulders")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Biceps")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejerciciobiceps")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Triceps")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "ejerciciotriceps")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Front mix")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "front")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)

                values = ContentValues().apply {
                    put(CategoriesDBScheme.COLUMN_CATEGORY, "Back mix")
                    put(CategoriesDBScheme.COLUMN_IMAGE, "back")
                }
                categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)
            }
        }
        fun guardarCategorie(category: WorkoutCategories) {
            val values = ContentValues().apply {
                put(CategoriesDBScheme.COLUMN_CATEGORY, category.name)
                put(CategoriesDBScheme.COLUMN_IMAGE, category.image)
            }
            categoriesDb.insert(CategoriesDBScheme.TABLE_NAME_CATEGORIES, null, values)
        }
    }

//    suspend fun getCategories(): List<WorkoutCategories> {
//        return withContext(IO) {
//
//            val cursor = categoriesDb.query(
//                CategoriesDBScheme.TABLE_NAME_CATEGORIES,
//                null,
//                null,
//                null,
//                null,
//                null,
//                null
//            )
//            val categories = mutableListOf<WorkoutCategories>()
//            while (cursor.moveToNext()) {
//                val name = cursor.getString(cursor.getColumnIndex(CategoriesDBScheme.COLUMN_CATEGORY))
//                val image = cursor.getString(cursor.getColumnIndex(CategoriesDBScheme.COLUMN_IMAGE))
//                categories.add((WorkoutCategories(name, R.drawable.back )))
//            }
//            categories
//        }
//    }

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
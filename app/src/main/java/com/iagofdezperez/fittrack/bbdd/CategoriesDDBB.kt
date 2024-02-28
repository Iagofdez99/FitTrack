package com.iagofdezperez.fittrack.bbdd
import android.provider.BaseColumns
object CategoriesDBScheme : BaseColumns{
    const val TABLE_NAME_CATEGORIES = "Workout_Categories"
    const val COLUMN_CATEGORY = "Category_name"
    const val COLUMN_IMAGE = "Image"
}

const val SQL_CREATE_ENTRIES_CATEGORIES =  """
    CREATE TABLE ${CategoriesDBScheme.TABLE_NAME_CATEGORIES}(
    ${CategoriesDBScheme.COLUMN_CATEGORY} TEXT PRIMARY KEY,
    ${CategoriesDBScheme.COLUMN_IMAGE} INTEGER)
"""

private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXIST ${CategoriesDBScheme.TABLE_NAME_CATEGORIES}"


package com.iagofdezperez.fittrack.data.bbdd

import android.provider.BaseColumns

object WorkoutDBScheme : BaseColumns {
    const val TABLE_NAME_WORKOUTS = "Workout_Exercises"
    const val COLUMN_NAME = "Name"
    const val COLUMN_GROUP = "Muscle_group"
}

const val SQL_CREATE_ENTRIES_WORKOUTS = """
    CREATE TABLE ${WorkoutDBScheme.TABLE_NAME_WORKOUTS}(
        ${BaseColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,
        ${WorkoutDBScheme.COLUMN_NAME} TEXT,
        ${WorkoutDBScheme.COLUMN_GROUP} TEXT)
"""

private const val SQL_DELETE_ENTRIES = "DROP TABLE IF EXISTS ${WorkoutDBScheme.TABLE_NAME_WORKOUTS}"


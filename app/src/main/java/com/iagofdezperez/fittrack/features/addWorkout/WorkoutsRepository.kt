package com.iagofdezperez.fittrack.features.addWorkout

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.iagofdezperez.fittrack.data.bbdd.WorkoutDBScheme
import com.iagofdezperez.fittrack.di.WorkoutsDDBB
import com.iagofdezperez.fittrack.domain.WorkoutExercises
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject

class WorkoutsRepository @Inject constructor(
    @WorkoutsDDBB private val workoutsDb: SQLiteDatabase
) {
    suspend fun setupWorkoutsDB() {
        withContext(IO) {
            val cursor = workoutsDb.rawQuery(
                "SELECT Count(*) FROM ${WorkoutDBScheme.TABLE_NAME_WORKOUTS}",
                null
            )
            cursor.moveToFirst()
            val count = cursor.getInt(0)
            cursor.close()

            if (count <= 0) {
                var values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Abs")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Chest")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)
                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Back")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Front legs")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Back legs")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Shoulders")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Biceps")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Triceps")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Front mix")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

                values = ContentValues().apply {
                    put(WorkoutDBScheme.COLUMN_NAME, "Ejercicio 1")
                    put(WorkoutDBScheme.COLUMN_GROUP, "Back mix")
                }
                workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)

            }
        }
    }

    fun guardarWorkout(exercise: WorkoutExercises) {
        val values = ContentValues().apply {
            put(WorkoutDBScheme.COLUMN_NAME, exercise.name)
            put(WorkoutDBScheme.COLUMN_GROUP, exercise.muscleGroup)
        }
        workoutsDb.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS, null, values)
    }

    fun getWorkouts(workoutId: String): List<WorkoutExercises> {
        Log.d("WorkoutsRepository", "getWorkouts: $workoutId")
        val cursor = workoutsDb.query(
            WorkoutDBScheme.TABLE_NAME_WORKOUTS,
            null,
            "${WorkoutDBScheme.COLUMN_GROUP} = ?",
            arrayOf(workoutId),
            null,
            null,
            null
        )
        val exercises = mutableListOf<WorkoutExercises>()

        while (cursor.moveToNext()) {
            val name = cursor.getString(cursor.getColumnIndexOrThrow(WorkoutDBScheme.COLUMN_NAME))
            val group = cursor.getString(cursor.getColumnIndexOrThrow(WorkoutDBScheme.COLUMN_GROUP))
            exercises.add(WorkoutExercises(name, group))
        }
        cursor.close()
        return exercises
    }
}


fun exercisesWorkoutList(): List<WorkoutExercises> = listOf(
    WorkoutExercises("Absss", "Abs"),
    WorkoutExercises("Absss", "Abs"),
    WorkoutExercises("Absss", "Abs"),

    WorkoutExercises("Chesst", "Chest"),
    WorkoutExercises("Chesst", "Chest"),
    WorkoutExercises("Chesst", "Chest"),

    WorkoutExercises("BAckkk", "Back"),
    WorkoutExercises("BAckkk", "Back"),
    WorkoutExercises("BAckkk", "Back"),

    WorkoutExercises("Legssss", "Front legs"),
    WorkoutExercises("Legssss", "Front legs"),
    WorkoutExercises("Legssss", "Front legs"),

    WorkoutExercises("Back legss", "Back legs"),
    WorkoutExercises("Back legss", "Back legs"),
    WorkoutExercises("Back legss", "Back legs"),

    WorkoutExercises("Shoulderss", "Shoulders"),
    WorkoutExercises("Shoulderss", "Shoulders"),
    WorkoutExercises("Shoulderss", "Shoulders"),

    WorkoutExercises("Bicepss", "Biceps"),
    WorkoutExercises("Bicepss", "Biceps"),
    WorkoutExercises("Bicepss", "Biceps"),

    WorkoutExercises("TRicepsss", "Triceps"),
    WorkoutExercises("TRicepsss", "Triceps"),
    WorkoutExercises("TRicepsss", "Triceps"),

    WorkoutExercises("Front mix", "Front mix"),
    WorkoutExercises("Front mix", "Front mix"),
    WorkoutExercises("Front mix", "Front mix"),

    WorkoutExercises("Back mix", "Back mix"),
    WorkoutExercises("Back mix", "Back mix"),
    WorkoutExercises("Back mix", "Back mix"),
)
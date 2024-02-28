package com.iagofdezperez.fittrack.features.addWorkout

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.bbdd.WorkoutDBScheme
import com.iagofdezperez.fittrack.domain.WorkoutExercises
import javax.inject.Inject

class WorkoutsRepository @Inject constructor(private val db: SQLiteDatabase){
    fun guardarWorkout(exercise:WorkoutExercises){
        val values = ContentValues().apply {
            put(WorkoutDBScheme.COLUMN_NAME,exercise.name)
            put(WorkoutDBScheme.COLUMN_GROUP,exercise.muscleGroup)
        }
        db.insert(WorkoutDBScheme.TABLE_NAME_WORKOUTS,null,values)
    }
}

fun exercisesWorkoutList(): List<WorkoutExercises> = listOf(
    WorkoutExercises("Absss","Abs"),
    WorkoutExercises("Absss","Abs"),
    WorkoutExercises("Absss","Abs"),

    WorkoutExercises("Chesst","Chest"),
    WorkoutExercises("Chesst","Chest"),
    WorkoutExercises("Chesst","Chest"),

    WorkoutExercises("BAckkk","Back"),
    WorkoutExercises("BAckkk","Back"),
    WorkoutExercises("BAckkk","Back"),

    WorkoutExercises("Legssss","Front legs"),
    WorkoutExercises("Legssss","Front legs"),
    WorkoutExercises("Legssss","Front legs"),

    WorkoutExercises("Back legss","Back legs"),
    WorkoutExercises("Back legss","Back legs"),
    WorkoutExercises("Back legss","Back legs"),

    WorkoutExercises("Shoulderss","Shoulders"),
    WorkoutExercises("Shoulderss","Shoulders"),
    WorkoutExercises("Shoulderss","Shoulders"),

    WorkoutExercises("Bicepss","Biceps"),
    WorkoutExercises("Bicepss","Biceps"),
    WorkoutExercises("Bicepss","Biceps"),

    WorkoutExercises("TRicepsss","Triceps"),
    WorkoutExercises("TRicepsss","Triceps"),
    WorkoutExercises("TRicepsss","Triceps"),

    WorkoutExercises("Front mix","Front mix"),
    WorkoutExercises("Front mix","Front mix"),
    WorkoutExercises("Front mix","Front mix"),

    WorkoutExercises("Back mix","Back mix"),
    WorkoutExercises("Back mix","Back mix"),
    WorkoutExercises("Back mix","Back mix"),
)
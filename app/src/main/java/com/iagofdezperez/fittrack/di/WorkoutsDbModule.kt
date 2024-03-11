package com.iagofdezperez.fittrack.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.data.bbdd.WorkoutsDDBBHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class WorkoutsDDBB

@Module
@InstallIn(SingletonComponent::class)
object WorkoutsDbModule {
    const val DATABASE_NAME = "Workouts.db"
    @Provides
    @WorkoutsDDBB
    fun providesWorkoutsDDBBHelper(@ApplicationContext context: Context) : SQLiteDatabase {
        return WorkoutsDDBBHelper(context).writableDatabase
    }
}
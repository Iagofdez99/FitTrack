package com.iagofdezperez.fittrack.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.bbdd.WorkoutsDDBBHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

//@Module
//@InstallIn(ViewModelComponent::class)
//object WorkoutsDbModule {
//    const val DATABASE_NAME = "Workouts.db"
//    @Provides
//    fun providesWorkoutsDDBBHelper(@ApplicationContext context: Context) : SQLiteDatabase{
//        return WorkoutsDDBBHelper(context).writableDatabase
//    }
//}
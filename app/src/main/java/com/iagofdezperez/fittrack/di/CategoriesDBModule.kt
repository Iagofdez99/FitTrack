package com.iagofdezperez.fittrack.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.data.bbdd.CategoriesDDBBHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class CategoriesDDBB

@Module
@InstallIn(SingletonComponent::class)
object CategoriesDBModule {
    @Provides
    @CategoriesDDBB
    fun providesCategoriesDDBBHelper(@ApplicationContext context: Context) : SQLiteDatabase {
        return CategoriesDDBBHelper(context).writableDatabase
    }
}
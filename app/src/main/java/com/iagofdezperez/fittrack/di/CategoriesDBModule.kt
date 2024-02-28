package com.iagofdezperez.fittrack.di

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import com.iagofdezperez.fittrack.bbdd.CategoriesDDBBHelper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.qualifiers.ApplicationContext

//@Module
//@InstallIn(ViewModelComponent::class)
//object CategoriesDBModule {
//    @Provides
//    fun providesCategoriesDDBBHelper(@ApplicationContext context: Context) : SQLiteDatabase {
//        return CategoriesDDBBHelper(context).writableDatabase
//    }
//}
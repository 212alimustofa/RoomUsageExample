package com.example.newtestapp.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import com.example.newtestapp.model.Data

/**
 * Created by ali on 31/10/17.
 */
@Database(entities = arrayOf(Data::class), version = 1)
abstract class AppDb: RoomDatabase(){

    companion object {
        val DB_NAME = "app.db"
        fun getInstance(context: Context): AppDb {
            return Room.databaseBuilder(context, AppDb::class.java, DB_NAME).allowMainThreadQueries().build()
        }
    }

    abstract fun getDao(): Dao
}
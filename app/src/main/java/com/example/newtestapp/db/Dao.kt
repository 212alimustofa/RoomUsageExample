package com.example.newtestapp.db

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Delete
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import com.example.newtestapp.model.Data

/**
 * Created by ali on 31/10/17.
 */
@Dao
interface Dao{
    @Query("SELECT * FROM data")
    fun getAll(): List<Data>

    @Insert
    fun insert(vararg data: Data)

    @Delete
    fun delete(data: Data)
}
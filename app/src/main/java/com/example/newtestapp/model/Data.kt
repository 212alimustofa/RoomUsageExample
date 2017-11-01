package com.example.newtestapp.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by ali on 31/10/17.
 */
@Entity(tableName = "data")
data class Data(
        @PrimaryKey(autoGenerate = true)
        var id: Int? = null,
        @ColumnInfo(name = "name")
        var name: String? = null
)
package com.example.testroomdb

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "animal")
class animal {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    val id: Int = 0
    @ColumnInfo(name = "name")
    val name: String = ""
    @ColumnInfo(name = "age")
    val age: Int = 0
    @ColumnInfo(name = "weight")
    val weight: Int = 0


}
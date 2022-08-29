package com.example.testroomdb

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface animaldao {
    @Insert
    fun add(animal: animal)

    @Delete
    fun delete(animal: animal)

    @Update
    fun update(animal: animal)

    @Query("SELECT * FROM animal ORDER BY id ASC")
    fun getalldb(): LiveData<List<animal>>
}
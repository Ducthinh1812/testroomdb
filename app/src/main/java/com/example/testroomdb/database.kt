package com.example.testroomdb

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [animal::class], version = 1)
abstract class database : RoomDatabase() {

    abstract fun animaldao(): animaldao

    companion object {
        @Volatile
        private var INSTANCE: database? = null
        fun getdatabase(context: Context): database {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder<database>(
                    context.applicationContext,
                    database::class.java, "animal"
                )
                    .allowMainThreadQueries().build()
            }
            return INSTANCE as database
        }
    }
}
package com.example.mappoints.db

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [Point::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase(){
    abstract fun pointDao(): PointDao
}
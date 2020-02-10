package com.rjt.roomdb.Database

import androidx.room.Dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.rjt.roomdb.Model.Employee

@Database(entities = arrayOf(Employee::class), version = 1)
abstract class MyAppDatabase :RoomDatabase(){

    abstract fun myDao() : MyDao

}
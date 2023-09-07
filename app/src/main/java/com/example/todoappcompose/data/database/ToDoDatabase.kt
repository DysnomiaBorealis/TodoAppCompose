package com.example.todoappcompose.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todoappcompose.data.dao.ToDoDao
import com.example.todoappcompose.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase:RoomDatabase() {

    abstract fun toDoDao():ToDoDao
}
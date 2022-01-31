package com.example.teacherassistant

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.teacherassistant.enitities.Classes

@Dao
interface UsersDAO  {

    @Insert
    fun insertUser(user: Classes)

    @Delete
    fun deleteUser(user:Classes)

    @Query("SELECT * FROM class_table")
    fun getAll(): LiveData<List<Classes>>



}
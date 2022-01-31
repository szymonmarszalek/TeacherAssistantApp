package com.example.teacherassistant.enitities

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "class_table")
data class Classes(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    var classId: Long=0L,
    @ColumnInfo(name="first_name")
    var Name:String,
    @ColumnInfo(name="last_name")
    var day:String,
    @ColumnInfo(name="age")
    var hour:Int
)

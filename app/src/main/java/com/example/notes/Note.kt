package com.example.notes

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//this entity will create a table in Room with the given name
@Entity(tableName = "notes_table")
// inside Note Brackets the columns will be defined
// Using column info we can change the name of the columns
// if name is  not defined then the variable name will be the column name
// Auto generate will give increement the ID's
class Note(@ColumnInfo(name = "text")val text: String) {
    @PrimaryKey(autoGenerate = true)val id = 0
}// now the table is created, now we need to create a DAO
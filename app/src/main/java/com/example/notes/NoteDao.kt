package com.example.notes

import androidx.room.*

// in DAO we can write queries and connect them with method calls
@Dao
interface NoteDao {
    // Now we will create multiple abstract function for insert, delete etc, we have to
    // make these function do the sql queries
    // if any conflict arises than we use onconflict
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("Select * from notes_table order by id ASC")
    fun getAllNodes():List<Note>
}
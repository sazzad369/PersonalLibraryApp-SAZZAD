package com.example.personallibraryapp

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user_profile")
data class BookLibrary(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val Title: String,
    val Author: String,
    val Page: String,
): Serializable
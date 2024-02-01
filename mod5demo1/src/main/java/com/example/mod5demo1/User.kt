package com.example.mod5demo1

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User(
    val mail : String,
    val password : String
) : Parcelable

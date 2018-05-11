package com.xfastgames.lychat

import android.os.Message
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Chat(var name: String,
                var users: List<User>,
                var messages: List<Message>) : Parcelable

@Parcelize
data class User(var name: String, var status: String) : Parcelable

@Parcelize
data class Message(var from: User, var to: User, var content: String) : Parcelable

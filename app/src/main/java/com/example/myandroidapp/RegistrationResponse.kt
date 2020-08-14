package com.example.myandroidapp

data class RegistrationResponse (
    @SerializedName("message") var message: String,
    @SerializedName("student") var student: Student
)
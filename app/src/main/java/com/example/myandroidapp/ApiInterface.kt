package com.example.myandroidappimport okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST


interface ApiInterface (
    @POST("register")
    fun registerStudent(

annotation class POST(val value: String)

@Body
annotation class Body
requestBody: RequestBody): Call<RegistrationResponse>
)
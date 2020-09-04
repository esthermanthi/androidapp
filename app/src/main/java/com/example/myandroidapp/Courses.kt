package com.example.myandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

data class Course(
    var courseId: String,
    var courseName: String,
    var courseCode: String,
    var instructor: String,
    var description: String
    @Entity(tableName)
    @SerializedName ("course_id") var courseId: String,
    @SerializedName("course_name") var courseName: String,
    @SerializedName("course_code") var courseCode: String,
    @SerializedName("instructor") var instructor: String,
    @SerializedName("description") var description: String = ""
)
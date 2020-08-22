package com.example.firstapp
import ApiInterface
import CoursesResponse
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.telecom.Call
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myandroidapp.ApiClient
import com.example.myandroidapp.Course
import com.example.myandroidapp.R
import com.example.myandroidapp.Response
import javax.security.auth.callback.Callback

private var Nothing?.layoutManager:
    get() {}
    set() {}
private var Any.courses: Any
    get() {}
    set(value) {}

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        var courseList = listOf<Course>(
            Course("1", "Python", "PY 101", "James Neumann", "Python Intro"),
            Course("2", "Android", "AND 201", "Anne Elson", "Android development training"),
            Course("3", "Database", "DB 304", "Kamwe Wema", "Database administration and development"),
            Course("4", "Network", "DIS 202", "Betty Crocker", "Netwok Config for modern apps")
        )
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter = CoursesAdapter()

        fetchCourses()
    }

    fun fetchCourses() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
        val accessToken = sharedPreferences.getString("ACCESS_TOKEN_KEY", "")

        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val coursesCall = apiClient.getCourses("Bearer " + accessToken)
        coursesCall.enqueue(object : Callback<CoursesResponse> {
            fun onFailure(call: Call<CoursesResponse>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            fun onResponse(
                call: Call<CoursesResponse>,
                response: Response<CoursesResponse>
            ) {
                if (response.isSuccessful) {
                    var courseList = response.body()?.courses as List<Course>
                    var coursesAdapter = CoursesAdapter()
                    val rvCourses = null
                    rvCourses.layoutManager = LinearLayoutManager(baseContext)
                    val rvCourses = null
                    rvCourses.adapter = coursesAdapter
                } else {
                    Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                        .show()
                }
            }
        })
    }
}

class CoursesAdapter {

}

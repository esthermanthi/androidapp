package com.example.myandroidapp
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.preference.PreferenceManager
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room

private var adapter: Nothing?
    get() {}
    set() {}
private var Nothing?.layoutManager:
        Get()

class Get() : Parcelable {
    constructor() : this()

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Get> {
        override fun createFromParcel(parcel: Parcel): Get {
            return Get()
        }

        override fun newArray(size: Int): Array<Get?> {
            return arrayOfNulls(size)
        }

        infix fun layoutManager(): Get {

        }

        infix fun layoutManager(baseContext: Context?): Get {

        }
    }
}

{}
    set () {}

class CoursesActivity : AppCompatActivity() {
    private val t: Any = TODO()
    private var database: HelloDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        database=Room.databaseBuilder(baseContext, HelloDatabase::class.java name:"hello-db").build()
        setContentView(R.layout.activity_courses)
        listOf(
            Course("1", "Python", "PY 101", "James Neumann", "Python Intro"),
            Course("2", "Android", "AND 201", "Anne Elson", "Android development training"),
            Course("3", "Database", "DB 304", "Kamwe Wema", "Database administration and development"),
            Course("4", "Network", "DIS 202", "Betty Crocker", "Netwok Config for modern apps")
        )
        val rvCourses = null
        rvCourses.layoutManager = Get  layoutManager(baseContext)
        val rvCoursesdapter = null
        arrayOf(rvCoursesdapter) = <CoursesAdapter()>

        fetchCourses()
    }

    private fun fetchCourses() {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
        sharedPreferences.getString("ACCESS_TOKEN_KEY", "")

        ApiClient.
        Able) run run {
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

    })
    }
}

class HelloDatabase {
    inner class CourseDao {
        fun insertCourse(course: Any) {
            TODO("Not yet implemented")
        }

    }

}

class CoursesAdapter {

}
fun fetchCoursesFromDatabse(){
    Thread{
        val databse = null
        val courses= to()
        runOnuiThread{
            var CoursesAdapter= coursesAdapter()
            val rvcourses = null
            val baseContext = null
            rvcourses.layoutManager=LinearLayoutManager(baseContext)
            val coursesAdapter = null
            adapter =coursesAdapter
        }
        fun displayCourses() {}
    }
}

private fun to() {

}

class Course(
    s: String,
    s1: String,
    s2: String,
    s3: String,
    s4: String
)

fun runOnuiThread(function: () -> Unit) {
    TODO("Not yet implemented")
}

fun coursesAdapter(): Any {
    TODO("Not yet implemented")
}

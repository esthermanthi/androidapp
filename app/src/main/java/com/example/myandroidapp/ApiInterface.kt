import android.telecom.Call
import com.example.myandroidapp.LoginResponse
import com.example.myandroidapp.RequestBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST


@@ -12,4 +14,7 @@ interface ApiInterface {

    @POST("login")
    fun loginStudent(@Body requestBody: RequestBody): Call<LoginResponse>

    @GET("courses")
    fun getCourses(@Header("Authorization") accessToken: String): Call<CoursesResponse>
}

annotation class POST(val value: String)

annotation class GET(val value: String)

annotation class Body

annotation class Header(val value: String)

class CoursesResponse {

}
 
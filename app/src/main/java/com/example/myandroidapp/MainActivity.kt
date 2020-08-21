package com.example.myandroidapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.telecom.Call
import android.widget.Toast
import com.example.myandroidappimport.ApiInterface
import javax.security.auth.callback.Callback

private val Any.message: Context?
    get() {}
private val Any.accessToken: String?
    get() {}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        @@ -17,10 +24,44 @@
        class MainActivity : AppCompatActivity() {
        }

        btnLogin.setOnClickListener {
            var userName = etUserName.text.toString()
            var email = etUserName.text.toString()
            var password = etPassword.text.toString()
            Toast.makeText(baseContext, password, Toast.LENGTH_SHORT).show()
            startActivity(Intent(baseContext, CoursesActivity::class.java))

            val requestBody = MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .addFormDataPart("email", email)
                .addFormDataPart("password", password)
                .build()

            loginUser(requestBody)
        }
    }

    fun loginUser(requestBody: RequestBody){
        val apiClient = ApiClient.buildService(ApiInterface::class.java)
        val loginCall = apiClient.loginStudent(requestBody)

        loginCall.enqueue(object :Callback<LoginResponse> {
            fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                if (response.isSuccessful){
                    Toast.makeText(baseContext, response.body()?.message, Toast.LENGTH_LONG).show()
                    var accessToken = response.body()?.accessToken
                    var sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
                    var editor = sharedPreferences.edit()
                    editor.putString("ACCESS_TOKEN_KEY", accessToken)
                    editor.apply()
                    val intent = Intent(baseContext, CoursesActivity::class.java)
                    startActivity(intent)
                    finish()
                }
                else{
                    Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG).show()
                }
            }
        })
    }
}

class CoursesActivity {

}

private fun Any.addFormDataPart(s: String, email: Any): Any {

}

class LoginResponse {

}

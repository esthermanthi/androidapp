package com.example.myandroidapp

import ApiInterface
import android.content.Intent
import android.os.Bundle
import android.telecom.Call
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.myandroidappimport.ApiInterface
import javax.security.auth.callback.Callback

private val Int.lastIndex: `mipmap-anydpi-v26`
    get() {}

class `mipmap-anydpi-v26` {

}

class RegistrationActivity (
    fun RegitsrationActivity onCreate,(savedInstanceState: Bundle?) {
    @@ -17,7 +23,42 @@ class RegistrationActivity : AppCompatActivity(){
        private val etPhoneNumber = 0708735533
        val phone_Number = etPhoneNumber.javaClass.toString()
        private val etPassword = 0708735533b
        val password = etPassword.lastIndex.toString()
        val etConfirmPassword = null

        val firstName = null
        val lastName = null
        private val email = null
        var requestBody = firstName?.let {
            MultipartBody.Builder()
                .setType(MultipartBody.FORM)
                .to("first_name", it)
                .to("last_name", lastName)
                .to("email", email)
                .to("phone_number", phoneNumber)
                .to("password", password)
                .build()
        }

        registerUser(requestBody)
        var call: no call = null
        val lastName =call
        val baseContext = null
        Toast.makeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
    }
}

class no {

}

private fun Any.to(that: String, firstName: String): Pair<Any, String> {

}

class MultipartBody {
    class Builder {
        fun setType(form: MultipartBody.FORM): Any {

        }

    }

    object FORM {

    }

}

fun registerUser(requestBody: RequestBody) {
    var apiClient = ApiClient.(ApiInterface::class.java)
    var registrationCall = apiClient.registerStudent(requestBody)
    registrationCall.enqueue(object :
        Callback<RegistrationResponse> {
        fun onFailure(call: Call<RegistrationResponse>, t: Throwable) {
            val baseContext = null
            Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
        }

        fun onResponse(
            call: Call<RegistrationResponse>,
            response: Response<RegistrationResponse>
        ) {
            if (response.isSuccessful) {
                val baseContext = call
                Toast.makeText(response.body()?.javaClass, Toast.LENGTH_LONG).show()
                val RegistrationResponse = call
                startActivity(Intent(baseContext, MainActivity::class.java))
            } else {
                val baseContext = null
                Toast.makeText(baseContext, response.errorBody().toString(), Toast.LENGTH_LONG)
                    .show()
            }
        }

        private fun startActivity(intent: Intent) {
            TODO("Not yet implemented")
        }
    })
}

class RequestBody {

}

class ApiClient {
    class Student(java: Class<ApiInterface>) {
        fun loginStudent(requestBody: RequestBody): Any {

        }

    }

}

class Response<T> {
    fun errorBody(): Any {

    }

    fun body(): Any {

    }

    val isSuccessful: Boolean
        get() {
            TODO()
        }
}
}
)
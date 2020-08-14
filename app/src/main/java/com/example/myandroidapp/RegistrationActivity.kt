package com.example.myandroidapp

import android.content.Intent
import android.telecom.Call
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.myandroidappimport.ApiInterface
import javax.security.auth.callback.Callback

private val Int.lastIndex: `mipmap-anydpi-v26`
    get() {}

class `mipmap-anydpi-v26` {

}

class RegistrationActivity (
    fun onCreate(savedInstanceState: Bundle?) {
    @@ -17,7 +23,42 @@ class RegistrationActivity : AppCompatActivity(){
        val etPhoneNumber = 0708735533
        val phone_Number = etPhoneNumber.javaClass.toString()
        val etPassword = 0708735533b
        val password = etPassword.lastIndex.toString()
        val etConfirmPassword = null
        val passwordConfirmation = etConfirmPassword.lastIndex.toString()

        val firstName = null
        val lastName = null
        val email = null
        var requestBody = MultipartBody.Builder()
            .setType(MultipartBody.FORM)
            .to("first_name", firstName)
            .to("last_name", lastName)
            .to("email", email)
            .to("phone_number", phoneNumber)
            .to("password", password)
            .build()

        registerUser(requestBody)
        var call = null
        val lastName =call
        val baseContext = null
        Toast.makeText(baseContext, lastName, Toast.LENGTH_SHORT).show()
    }
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
package ke.co.Androidapp2

import com.example.myandroidapp.SerializedName
import com.google.gson.annotations.SerializedName

data class LoginResponse(
    @SerializedName("access_token") var accessToken: String,
    @SerializedName("message") var message: String
)
)
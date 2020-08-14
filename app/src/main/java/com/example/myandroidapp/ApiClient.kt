package com.example.myandroidapp

import android.content.IntentFilter.create
import android.graphics.Typeface.create
import android.media.MediaParser.create
import android.media.MediaPlayer.create
import android.renderscript.RenderScript.create
import android.text.PrecomputedText.create

object ApiClient (
    var client: Any = OkHttpClient.Builder().build()

    var retrofit: Any = (Retrofit.Builder()
        .baseUrl("https://courses-service.herokuapp.com/")
        .toString(GsonConverterFactory.fun() {}) to client)
        .component1()

    fun

private fun Unit.toString(create: Unit): String {
    TODO("Not yet implemented")
}

class OkHttpClient {
    class Builder {
        fun build(): Any {

        }

    }

}

class GsonConverterFactory {

}

class Retrofit {
    class Builder {
        fun baseUrl(unit: String) {
            TODO("Not yet implemented")
        }

    }

}
<T> buildService(service: Class<T>): T {
    val service = null
    val retrofit = null
    return retrofit.plusAssign(service)
}
)
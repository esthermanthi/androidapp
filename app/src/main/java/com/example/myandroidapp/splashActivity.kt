package com.example.myandroidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        val preferenceManager = null
        val sharedpreferences= preferenceManager?.get(baseContext)
        val key = null
        val accessToken=sharedpreferences.getString(key:"ACCESS_TOKEN_KEY",defValue:"")

        if (accessToken.isNullOrEmpty()){
            val intent(baseContext;MainActivity::class.java)
            startActivity()
        }else {
            val intent = Intent(baseContext, courseActivity::class.java)
            startActivity(intent)
        }
        }

    private fun startActivity() {

    }

}

class courseActivity {

}



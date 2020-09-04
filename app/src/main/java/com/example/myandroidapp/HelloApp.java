package com.example.myandroidapp;

import android.app.Application;
import com.facebook.stetho.stetho

class HelloApp :Application (){
    override fun onCreate({
        super.onCreate(){
            Stetho.initializedWithDefaults(context:this)
        }
}

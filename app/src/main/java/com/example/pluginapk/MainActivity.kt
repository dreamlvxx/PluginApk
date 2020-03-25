package com.example.pluginapk

import android.content.res.Resources
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun getResources(): Resources {
        return if (application != null && application.resources != null) application.resources else super.getResources()
    }
}

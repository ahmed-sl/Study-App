package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnand : Button
    lateinit var btnkot : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnand = findViewById(R.id.btAndroid)
        btnand.setOnClickListener {
            val intent = Intent(this,AndroidActivity::class.java)
            startActivity(intent)
        }

        btnkot = findViewById(R.id.btKotlin)
        btnkot.setOnClickListener {
            val intent = Intent(this,KotlinActivity::class.java)
            startActivity(intent)
        }
    }
}
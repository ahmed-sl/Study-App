package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AndroidActivity : AppCompatActivity() {
    lateinit var rvand : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)

        val items = arrayListOf(
            arrayListOf("Project Setup", "More detailed..", " Setting up an Android Studio Project."),
            arrayListOf("Console", "More detailed..", "Printing to the console."),
            arrayListOf("Resource Files", "More detailed..", "Identifying, editing, and using resource files."),
            arrayListOf("UI Elements", "More detailed..", "Creating, modifying, and initializing UI Elements.")
        )

        rvand = findViewById(R.id.rvAndroid)
        rvand.adapter = rvAdabter(this, items)
        rvand.layoutManager = LinearLayoutManager(this)

        title = "Android Review"

    }
}
package com.example.studyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class KotlinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val items = arrayListOf(
            arrayListOf("var and val", "More detailed..", "var keyword are mutable,val keyword are not mutable"),
            arrayListOf("User Input", "More detailed..", "take input from user by readLine()"),
            arrayListOf("Strings", "More detailed..", "String concatenations, interpolation, and methods."),
            arrayListOf("Data Types", "More detailed..", "Understanding data types such as Int,Float,Char..etc"),
            arrayListOf("Basic Operations", "More detailed..", "Performing math operations in Kotlin,such as +,-,*,/"),
            arrayListOf("If Statements", "More detailed..", "Understanding when and how to use if, else if, and else statements."),
            arrayListOf("Error Handling", "More detailed..", "Using try blocks to avoid runtime errors."),
            arrayListOf("For Loops", "More detailed..", "Using for loops to automate code, to repeat the cod "),
            arrayListOf("While Loops", "More detailed..", "Using while loops to automate code.")
        )

        val rvKotlin = findViewById<RecyclerView>(R.id.rvKotlin)
        rvKotlin.adapter = rvAdabter(this, items)
        rvKotlin.layoutManager = LinearLayoutManager(this)

        title = "Kotlin Review"
    }
}

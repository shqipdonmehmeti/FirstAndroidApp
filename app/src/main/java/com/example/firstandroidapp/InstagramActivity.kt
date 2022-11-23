package com.example.firstandroidapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class InstagramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        val tvHeader : TextView = findViewById(R.id.tvHeader)
        val etUsername : EditText = findViewById(R.id.etInstagramUsername)
        val btnLogin : Button = findViewById(R.id.btnInstagramLogin)




        btnLogin.setOnClickListener {
            val inputValue = etUsername.text.toString()
            Log.d("InstagramActivity", "inputValue for edit text $inputValue: ")
        }


//        tvHeader.setTextColor(Color.RED)
//        etUsername.setText("Changable from code")
    }
}
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
        val etPassword : EditText = findViewById(R.id.etInstagramPassword)
        val btnLogin : Button = findViewById(R.id.btnInstagramLogin)
        val tvContinueAs : TextView = findViewById(R.id.tvInstagramContinueAs)





        btnLogin.setOnClickListener {
            val inputValueForUsername = etUsername.text.toString()
            val inputValueForPassword = etPassword.text.toString()
            Log.d("InstagramActivity", "inputValue for Username :  $inputValueForUsername")
            Log.d("InstagramActivity", "inputValue for Password :  $inputValueForPassword")
            tvContinueAs.text = "Continue as $inputValueForUsername"
            tvContinueAs.setTextColor(Color.BLUE)
            btnLogin.setBackgroundColor(Color.BLACK)
        }


//        tvHeader.setTextColor(Color.RED)
//        etUsername.setText("Changable from code")
    }
}
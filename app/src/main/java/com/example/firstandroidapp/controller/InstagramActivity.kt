package com.example.firstandroidapp.controller

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.R

class InstagramActivity : AppCompatActivity() {
    private lateinit var btnLogin: Button
    private lateinit var tvHeader: TextView
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var tvContinueAs: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instagram)
        findViews()
        onClickListener()
    }

    private fun findViews() {
        tvHeader = findViewById(R.id.tvHeader)
        etUsername = findViewById(R.id.etInstagramUsername)
        etPassword = findViewById(R.id.etInstagramPassword)
        btnLogin = findViewById(R.id.btnInstagramLogin)
        tvContinueAs = findViewById(R.id.tvInstagramContinueAs)
    }

    private fun onClickListener() {
        btnLogin.setOnClickListener {
            val inputValueForUsername = etUsername.text.toString()
            val inputValueForPassword = etPassword.text.toString()
            Log.d("InstagramActivity", "inputValue for Username :  $inputValueForUsername")
            Log.d("InstagramActivity", "inputValue for Password :  $inputValueForPassword")
            tvContinueAs.text = "Continue as $inputValueForUsername"
            tvContinueAs.setTextColor(Color.BLUE)
            btnLogin.setBackgroundColor(Color.BLACK)
        }
    }


}
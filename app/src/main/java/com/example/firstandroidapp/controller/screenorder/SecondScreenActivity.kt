package com.example.firstandroidapp.controller.screenorder

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.databinding.ActivitySecondScreenBinding

class SecondScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val firstName = intent.getStringExtra("firstName")
        binding.tvFirstNameFromIntent.text = firstName


    }
}
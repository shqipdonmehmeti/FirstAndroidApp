package com.example.firstandroidapp.controller.screenorder

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.databinding.ActivityFirstScreenBinding

class FirstScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFirstScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnToNextScreen.setOnClickListener {
            val intent = Intent(this@FirstScreenActivity,SecondScreenActivity::class.java)
            intent.putExtra("firstName","Shqipdon")
            startActivity(intent)
        }
    }
}
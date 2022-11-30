package com.example.firstandroidapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstandroidapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val btnCreateToast : AppCompatButton = findViewById(R.id.btnCreateToast)
//        btnCreateToast.setOnClickListener {
//            var toast = Toast.makeText(this,
//                "This is one toast when button is clicked",
//                Toast.LENGTH_LONG)
//            toast.setGravity(Gravity.CENTER,0,0)
//            toast.show()
//
//        }
    }
}
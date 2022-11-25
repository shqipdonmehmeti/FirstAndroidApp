package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

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
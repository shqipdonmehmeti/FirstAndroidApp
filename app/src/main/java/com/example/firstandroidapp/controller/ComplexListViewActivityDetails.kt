package com.example.firstandroidapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.firstandroidapp.R

class ComplexListViewActivityDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_complex_list_view_details)
        val ivProfilePicture = intent.getIntExtra("profile_picture",0)
        val firstName = intent.getStringExtra("first_name")
        val lastName = intent.getStringExtra("last_name")
        val age = intent.getIntExtra("age",0)
        Log.d("TAG", "data: $firstName + $lastName + $age")
    }
}
package com.example.firstandroidapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstandroidapp.R
import com.example.firstandroidapp.databinding.ActivityCreateDifferentViewsBinding
import com.google.android.material.snackbar.Snackbar

class CreateDifferentViewsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityCreateDifferentViewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateDifferentViewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createToast()
        createSnackBar()
    }

    private fun createSnackBar() {
        binding.btnCreateSnackBar.setOnClickListener {
            Snackbar.make(binding.root,"Ketu kemi krijuar nje Snackbar.",Snackbar.LENGTH_LONG).show()
        }
    }

    private fun createToast() {
        binding.btnCreateToast.setOnClickListener {
            Toast.makeText(this,"Ketu kemi krijuar nje Toast.",Toast.LENGTH_SHORT).show()
        }
    }
}
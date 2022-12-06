package com.example.firstandroidapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
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
        createSnackBarOnButtonClick()
        createAlertDialog()
    }

    private fun createAlertDialog() {
        binding.btnCreateAlertDialog.setOnClickListener {
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("First Alert Dialog Title")
            alertDialogBuilder.setMessage("First Alert Dialog Message goes right here")
            alertDialogBuilder.setPositiveButton("OK") { dialog , which ->
                createSnackBar("Keni klikuar ne butonin OK")
            }

            alertDialogBuilder.setNeutralButton("I'm not sure") {dialog , which ->

            }

            alertDialogBuilder.setNegativeButton("Cancel") {dialog , which ->
                createSnackBar("Keni klikuar ne butonin Cancel")

            }
            alertDialogBuilder.show()
        }
    }

    private fun createSnackBar(value : String) {
            Snackbar.make(binding.root,value,Snackbar.LENGTH_LONG).show()
    }

    private fun createSnackBarOnButtonClick() {
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
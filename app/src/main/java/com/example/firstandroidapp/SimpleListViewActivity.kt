package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.firstandroidapp.databinding.ActivitySimpleListViewBinding

class SimpleListViewActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySimpleListViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val namesList =
            listOf("Enver","Muala","Omer",
            "Erion","Albi","Albion","Andi",
            "Elemedini","Diellza","Dorant")

        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,namesList)

        binding.lvSimple.adapter = arrayAdapter


    }
}
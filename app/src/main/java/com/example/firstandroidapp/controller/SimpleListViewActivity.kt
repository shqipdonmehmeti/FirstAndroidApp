package com.example.firstandroidapp.controller

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.firstandroidapp.databinding.ActivitySimpleListViewBinding

class SimpleListViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySimpleListViewBinding
    private lateinit var namesList: List<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySimpleListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        createNamesList()
        createAdapterAndSetToListView()
    }

    private fun createAdapterAndSetToListView() {
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namesList)
        binding.lvSimple.adapter = arrayAdapter
    }

    private fun createNamesList() {
        namesList = listOf(
            "Enver", "Muala", "Omer",
            "Erion", "Albi", "Albion", "Andi",
            "Elemedini", "Diellza", "Dorant"
        )
    }
}
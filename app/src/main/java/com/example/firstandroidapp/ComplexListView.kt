package com.example.firstandroidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstandroidapp.databinding.ActivityComplexListViewBinding

class ComplexListView : AppCompatActivity() {
    private lateinit var binding : ActivityComplexListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComplexListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personList = listOf(
            Person("Lirak","Kyqyku"),
            Person("Rigon","Ramajli"),
            Person("Ali","Zekaj"),
            Person("Albin","Hetemi"),
            Person("Leonit","Krasniqi"),
            Person("Lavdim","Krasniqi")
        )

        val personAdapter = PersonAdapter(this,personList)

        binding.lvComplex.adapter = personAdapter






    }
}
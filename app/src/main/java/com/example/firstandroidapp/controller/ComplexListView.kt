package com.example.firstandroidapp.controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firstandroidapp.R
import com.example.firstandroidapp.adapter.PersonAdapter
import com.example.firstandroidapp.databinding.ActivityComplexListViewBinding
import com.example.firstandroidapp.model.Person

class ComplexListView : AppCompatActivity() {
    private lateinit var binding : ActivityComplexListViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityComplexListViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val personList = listOf(
            Person(R.drawable.cr7,"Cristiano","Ronaldo",37),
            Person(R.drawable.messi,"Lionel","Messi",35),
            Person(R.drawable.mbappe,"Kylian","Mbappe",23),
            Person(R.drawable.neymar,"Neymar","Junior",28)
        )

        val personAdapter = PersonAdapter(this,personList)

        binding.lvComplex.adapter = personAdapter

        binding.lvComplex.setOnItemClickListener { adapterView, view, position, l ->
            Toast.makeText(this,"Item with name : ${personList[position]} is clicked",Toast.LENGTH_LONG).show()
            val intent = Intent(this@ComplexListView,ComplexListViewActivityDetails::class.java)
            intent.putExtra("profile_picture",personList[position].profilePicture)
            intent.putExtra("first_name",personList[position].firstName)
            intent.putExtra("last_name",personList[position].lastName)
            intent.putExtra("age",personList[position].age)
            startActivity(intent)

        }






    }
}
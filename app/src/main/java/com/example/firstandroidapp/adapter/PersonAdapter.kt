package com.example.firstandroidapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.example.firstandroidapp.R
import com.example.firstandroidapp.model.Person

class PersonAdapter(private val context: Context , private val personList : List<Person>) : BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int = personList.size

    override fun getItem(position : Int): Any = personList[position]

    override fun getItemId(position : Int): Long = position.toLong()

    override fun getView(position : Int, p1: View?, p2: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.complex_listview_item,p2,false)

        val tvFirstName = rowView.findViewById<TextView>(R.id.tvFirstName)
        val tvLastName = rowView.findViewById<TextView>(R.id.tvLastName)

        tvFirstName.text = personList[position].firstName
        tvLastName.text = personList[position].lastName

        return rowView


    }
}
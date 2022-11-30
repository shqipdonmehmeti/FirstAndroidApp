package com.example.firstandroidapp.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import com.example.firstandroidapp.R

class CostOfServiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cost_of_service)
        val btnCalculateTip : Button = findViewById(R.id.calculate_button)
        btnCalculateTip.setOnClickListener {
            calculateTip()
        }

    }

    private fun calculateTip() {
        val costOfService : EditText = findViewById(R.id.cost_of_service)
        val rgOptions : RadioGroup = findViewById(R.id.tip_options)
        val roundUpSwitch : Switch = findViewById(R.id.round_up_switch)
        val tipResult : TextView = findViewById(R.id.tip_result)


        val serviceValue = costOfService.text.toString().toDoubleOrNull()

        val tipPercentage = when (rgOptions.checkedRadioButtonId) {
            R.id.option_twenty_percent -> 0.20
            R.id.option_eighteen_percent -> 0.18
            else -> 0.15
        }

        val tipAmount = serviceValue?.times(tipPercentage)
        tipResult.setText("Vlera e bakshishit eshte : $tipAmount")


    }
}
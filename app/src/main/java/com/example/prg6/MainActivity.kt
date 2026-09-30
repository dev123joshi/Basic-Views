package com.example.prg6

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etName = findViewById<EditText>(R.id.etName)
        val checkBox = findViewById<CheckBox>(R.id.checkBox)
        val radioMale = findViewById<RadioButton>(R.id.radioMale)
        val radioFemale = findViewById<RadioButton>(R.id.radioFemale)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnSubmit.setOnClickListener {

            val name = etName.text.toString()

            if (name.isEmpty()) {
                Toast.makeText(
                    this,
                    "Please enter your name",
                    Toast.LENGTH_SHORT
                ).show()
                return@setOnClickListener
            }

            val gender = when {
                radioMale.isChecked -> "Male"
                radioFemale.isChecked -> "Female"
                else -> "Not selected"
            }

            val agreement = if (checkBox.isChecked) {
                "Agreed"
            } else {
                "Not agreed"
            }

            tvResult.text = """
                Name: $name
                Gender: $gender
                Terms: $agreement
            """.trimIndent()
        }
    }
}

package com.example.examprepmulti

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val numberOne = findViewById<EditText>(R.id.editNum)
        val numTwo = findViewById<EditText>(R.id.editNum2)
        val buttonCalc = findViewById<Button>(R.id.btnCalc)
        val answer = findViewById<TextView>(R.id.txtResult)

        numberOne = editNum.text
        numTwo = editNum2.text
        buttonCalc = btnCalc.text
        


        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
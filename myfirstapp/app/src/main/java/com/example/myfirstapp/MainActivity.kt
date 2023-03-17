package com.example.myfirstapp

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe= findViewById<Button>(R.id.myFbutton)
        val myLabel= findViewById<TextView>(R.id.myFtextview)
        var peopleCounter: Int = 0
        var clickON : Boolean = false
        btnClickMe.setOnClickListener{
            btnClickMe.text = "HAHA you clicked me!"
            peopleCounter ++
            myLabel.text = peopleCounter.toString()
            if(clickON == false) {
                Toast.makeText(this, "Hello egy utas szamlalo vagyok", Toast.LENGTH_LONG).show()
                clickON = true
            }
        }
    }
}
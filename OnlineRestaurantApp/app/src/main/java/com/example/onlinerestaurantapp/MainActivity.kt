package com.example.onlinerestaurantapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var btnCreateAcc : Button? = null
    private var tvforgetPass : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateAcc = findViewById(R.id.btnCrt)
        tvforgetPass = findViewById(R.id.forgetPass)

        tvforgetPass?.setOnClickListener(this)
        btnCreateAcc?.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.forgetPass->{
                val intent = Intent(this,MainActivity3::class.java)
                startActivity(intent)
                finish()
            }
            R.id.btnCrt->{
                val intent = Intent(this,MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
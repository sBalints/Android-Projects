package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btn_start)
        //edittext
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener{
            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter a name.",
                    Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this,QuizQuestionActivity::class.java)

                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                //intent.putExtra(Constants.TOTAL_QUESTIONS)
                //intent.putExtra(Constants.CORRECT_ANSWERS)
                startActivity(intent)
                finish()
            }
        }


    }
}
package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {

    var tvNumbers: TextView? = null

    var sumCalc: Long? = 0

    var lastNumeric : Boolean = false
    var lastDot : Boolean = false
    var lastArithmetic: Boolean = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumbers = findViewById(R.id.display)

    }
    //view az igazabol a button
    fun onDigit(view: View){
        tvNumbers?.append((view as Button).text)
        lastNumeric = true
        lastDot= false
    }

    fun onClear(view: View){
        tvNumbers?.text = ""
        lastDot = false
        lastNumeric = false
        lastArithmetic=true
    }

    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDot && lastArithmetic){
            tvNumbers?.append((view as Button).text)
            lastDot = true
            lastNumeric = false
            lastArithmetic = false
        }
    }

    fun onArithmetic(view: View){
        if(lastNumeric)
        {
            tvNumbers?.append((view as Button).text)
            lastArithmetic = true
            lastNumeric= false
            lastDot=false
        }
    }

    fun onOperator(view: View){
        //it=tvNumbers?.text igy mukodik a let
        tvNumbers?.text?.let{
            if(lastNumeric && !isOperatorAdded(it.toString())){
                tvNumbers?.append((view as Button).text)
                lastNumeric= false
                lastDot= false
                lastArithmetic = true
            }
        }


    }

    fun onEqual(view: View){
        if(lastNumeric){

            var tvCalculation= tvNumbers?.text.toString()
            var prefix =""

            try{
                if(tvCalculation.startsWith("-")){
                    prefix="-"
                    // "-99"
                    tvCalculation=tvCalculation.substring(1)
                    //"99"

                }
                if(tvCalculation.contains("-")){
                    val splitValue= tvCalculation.split("-")
                    //splitValue="99-1"
                    //splitValue={99,1}

                    var one = splitValue[0]
                    var two= splitValue[1]

                    if(prefix.isNotEmpty()){
                        one = prefix + one
                    }

                    var result = one.toDouble() - two.toDouble()
                    tvNumbers?.text= removeZeroAfterDot(result.toString())
                }
                else if(tvCalculation.contains("+")){
                    val splitValue= tvCalculation.split("+")
                    //splitValue="99-1"
                    //splitValue={99,1}

                    var one = splitValue[0]
                    var two= splitValue[1]

                    if(prefix.isNotEmpty()){
                        one = prefix + one
                    }

                    var result = one.toDouble() + two.toDouble()
                    tvNumbers?.text= removeZeroAfterDot(result.toString())
                }
                else if(tvCalculation.contains("*")){
                    val splitValue= tvCalculation.split("*")
                    //splitValue="99-1"
                    //splitValue={99,1}

                    var one = splitValue[0]
                    var two= splitValue[1]

                    if(prefix.isNotEmpty()){
                        one = prefix + one
                    }

                    var result = one.toDouble() * two.toDouble()
                    tvNumbers?.text= removeZeroAfterDot(result.toString())
                }
                else if(tvCalculation.contains("/")){
                    val splitValue= tvCalculation.split("/")
                    //splitValue="99-1"
                    //splitValue={99,1}

                    var one = splitValue[0]
                    var two= splitValue[1]

                    if(prefix.isNotEmpty()){
                        one = prefix + one
                    }

                    var result = one.toDouble() / two.toDouble()

                    tvNumbers?.text= removeZeroAfterDot(result.toString())
                }



            }
            catch(e:ArithmeticException){
                e.printStackTrace()
            }
        }
    }

    private fun removeZeroAfterDot(result: String): String{
        var value = result
        if(result.contains(".0")){
            value = result.substring(0, result.length - 2)
        }
        return value
    }


    private fun isOperatorAdded(value: String) : Boolean{
        return if(value.startsWith("-")){
            false
        }else{
            value.contains("/")
                    || value.contains("*")
                    || value.contains("+")
                    || value.contains("-")
        }
    }

}
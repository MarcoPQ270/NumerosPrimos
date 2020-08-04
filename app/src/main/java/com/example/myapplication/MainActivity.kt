package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var primos: MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //al momento que le den click en el boton pares, que realice funcion calcular
        var boton= findViewById<Button>(R.id.btnCalular)
        boton.setOnClickListener(View.OnClickListener {
            calcular()
        })
    }

    fun calcular() {
        //declarando variables
        var num1 = etMinimo.text.toString().toInt()
        var num2 = etMaximo.text.toString().toInt()

        for (i in num1..num2) {
            if (checkPrimo(i)) {
                primos.add(i)
            }
                tvResultado.text = primos.toString()
           }
        }

    fun checkPrimo(num: Int): Boolean { // función que retorna un booleano
        var primo = true
        for (i in 2..num / 2) { // bucle sobre un rango
            if (num % i == 0) { // no es número primo
                primo = false
                break // sale del bucle
            }
        }
        return primo // true o false

    }

}


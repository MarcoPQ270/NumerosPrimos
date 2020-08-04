package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class Main2Activity : AppCompatActivity() {

    companion object VerdeCompanion {
        val EXTRA_IMC ="extraimc"
        private val DEFAULT_IMC: Double = -1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }
}

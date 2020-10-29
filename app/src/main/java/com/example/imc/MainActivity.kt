package com.example.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcularImc(view: View){
        val altura = findViewById<EditText>(R.id.inputAltura).text.toString().toFloat()
        val peso = findViewById<EditText>(R.id.inputPeso).text.toString().toFloat()
        val imc = peso/(altura*altura)
        val resultado = findViewById<TextView>(R.id.textResultado);
        resultado.setText(imc.toString());
    }
}
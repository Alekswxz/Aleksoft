package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btCalcular = Calcular
        val Resultado = Resultado
        btCalcular.setOnClickListener {




            val v1 = Integer.parseInt(v1.text.toString())
            val v2 = Integer.parseInt(v2.text.toString())
            val Faltas = Integer.parseInt(Faltas.text.toString())
            val media = (v1 + v2)/2
            if (media >= 6 && Faltas < 10) {
                Resultado.setText("Aluno foi aprovado" + "\n" + "nota final:" + " " + media + "\n" + "faltas" + " " + Faltas)


            } else {
                ("Aluno foi reprovado" + "\n" + "nota final:" + " " + media + "\n" + "faltas" + " " + Faltas)
            }
            }


        }
    }









package com.example.formularioimc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
//import com.example.formularioimc.databinding.ActivityCalculadoraBinding
//import com.example.formularioimc.databinding.ActivityImcpersonaBinding

class Calculadora : AppCompatActivity() {
    var operacion: Int = 0
    var numero1: Double = 0.0
    lateinit var proceso: TextView
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        proceso = findViewById(R.id.proceso)
        resultado = findViewById(R.id.resultado)
        val btnBorrar: Button = findViewById(R.id.btnborrar)
        val btnlimpiar: Button=findViewById(R.id.btnLimpiar)
        val btnIgual : Button =findViewById(R.id.btnigual)

        btnIgual.setOnClickListener {
            var numero2 :Double = proceso.text.toString().toDouble()
            var respuesta:Double=0.0


            when(operacion){
                1-> respuesta = numero1 + numero2
                2-> respuesta = numero1 - numero2
                3-> respuesta = numero1 * numero2
                4-> respuesta = numero1 / numero2


            }
            proceso.setText(respuesta.toString())
            resultado.setText("")
        }
        btnBorrar.setOnClickListener {
            resultado.setText("")
            proceso.setText("")
            numero1=0.0
            operacion=0
        }
        btnlimpiar.setOnClickListener {

            resultado.setText("")
            proceso.setText("")
            numero1=0.0
            operacion=0
        }

    }

    fun precionarBotones(view: View) {
        var procesoCalculadora: String = proceso.text.toString()

        when (view.id) {
            R.id.btncero -> proceso.setText(procesoCalculadora + "0")
            R.id.btnuno -> proceso.setText(procesoCalculadora + "1")
            R.id.btndos -> proceso.setText(procesoCalculadora + "2")
            R.id.btntres -> proceso.setText(procesoCalculadora + "3")
            R.id.btncuatro -> proceso.setText(procesoCalculadora + "4")
            R.id.btncinco -> proceso.setText(procesoCalculadora + "5")
            R.id.btnseis -> proceso.setText(procesoCalculadora + "6")
            R.id.btnsiete -> proceso.setText(procesoCalculadora + "7")
            R.id.btnocho -> proceso.setText(procesoCalculadora + "8")
            R.id.btnnueve -> proceso.setText(procesoCalculadora + "9")
            R.id.btnpunto -> proceso.setText(procesoCalculadora + ".")
            R.id.btnabrirparentesis-> proceso.setText(procesoCalculadora + "(")





        }


    }

    fun clickOperacion(view: View) {
        numero1 = proceso.text.toString().toDouble()
        var proceso_text: String = proceso.text.toString()
        proceso.setText("")

        when (view.id) {
            R.id.btnsumar -> {
                resultado.setText(proceso_text + "+")
                operacion = 1

            }
            R.id.btnrestar -> {
                resultado.setText(proceso_text+ "-")
                operacion = 2

            }
            R.id.btnmultiplicar -> {
                resultado.setText(proceso_text+ "*")
                operacion = 3

            }
            R.id.btndividir -> {
                resultado.setText(proceso_text + "/")
                operacion = 4

            }
            R.id.btncerrarparentesis -> {
                proceso.setText(proceso_text + ")")
                operacion = 5

            }

        }
    }
}
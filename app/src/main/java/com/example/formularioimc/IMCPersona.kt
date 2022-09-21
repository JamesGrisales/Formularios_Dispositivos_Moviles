package com.example.formularioimc

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding
import android.widget.TextView
import android.widget.Toast
import com.example.formularioimc.databinding.ActivityImcpersonaBinding

class IMCPersona : AppCompatActivity() {
    lateinit var binding: ActivityImcpersonaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcpersonaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /* binding.editPeso.setText("100")
        var txtPeso : TextView = findViewById(R.id.txtPeso)*/
        binding.btncalcular.setOnClickListener { this }

    }
}
   /* override fun onClick(v: View?){
        when(v!!.id){
            R.id.btncalcular -> Toast.makeText(this, "su imc  es: ${ IMCPersona()}",Toast.LENGTH_LONG.toUShort())
        }

    }
    public  fun  IMCPersona():Double{
        var imc :Double=binding.editPeso.text.toString().toDouble()/
                (binding.editAltura.text.toString().toDouble()*binding.editAltura.text.toString().toDouble())
        return imc

    }
}



*/
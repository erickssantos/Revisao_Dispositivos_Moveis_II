package com.example.exercicio_revisao

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.exercicio_revisao.databinding.ActivityDashBoardBinding

class DashBoard : AppCompatActivity() {

    private lateinit var binding:  ActivityDashBoardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityDashBoardBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val loginUsuario = intent.getStringExtra("LOGIN_USUARIO") ?: "Desconhecido"
        binding.txtusuario.text="Bem-vindo, $loginUsuario"


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
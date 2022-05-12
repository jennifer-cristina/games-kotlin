package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView

class pesquisaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesquisa)

        val detalhes = findViewById<CardView>(R.id.card_detalhes)

        detalhes.setOnClickListener(){
            val intent = Intent(this, detalhesActivity::class.java)
            startActivity(intent)

        }
    }
}
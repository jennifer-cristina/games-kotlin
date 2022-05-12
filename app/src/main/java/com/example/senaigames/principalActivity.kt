package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.util.*
import kotlin.concurrent.schedule

class principalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        val search = findViewById<EditText>(R.id.search)

        search.setOnClickListener(){
            val intent = Intent(this, pesquisaActivity::class.java)
            startActivity(intent)

        }


    }
}
package com.example.senaigames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Criar um time para abrir a segunda tela do aplicativo
        Timer().schedule(2500) { abrirApp() }
    }

    private fun abrirApp() {
        val intent = Intent(this, principalActivity::class.java)
        startActivity(intent)
        finish()
    }

}

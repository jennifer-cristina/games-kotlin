package com.example.senaigames

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        // Arredondando a ImageView
        val bitmap = BitmapFactory.decodeResource(resources, R.drawable.profile)
        val bitmapRound = RoundedBitmapDrawableFactory.create(resources, bitmap)
        bitmapRound.cornerRadius = 1000f
        val imgFoto = findViewById<ImageView>(R.id.profile)
        imgFoto.setImageDrawable(bitmapRound)

    }
}
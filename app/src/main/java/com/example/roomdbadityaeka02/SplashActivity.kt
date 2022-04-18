package com.example.roomdbadityaeka02

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val splasScreentimeout : Long= 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)



        val note = findViewById(R.id.note) as ImageView
        val judul = findViewById(R.id.judul) as TextView



        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }, splasScreentimeout)


    }
}
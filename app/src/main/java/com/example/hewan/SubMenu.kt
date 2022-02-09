package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub_menu)

        val jangkrik = MediaPlayer.create(this,R.raw.jangkrik)
        val gajah = MediaPlayer.create(this,R.raw.gajah)
        val angsa = MediaPlayer.create(this, R.raw.angsa)

        val pindahs = findViewById<Button>(R.id.button_s);
        pindahs.setOnClickListener {
            jangkrik.start()
            val Serangga = Intent(this,Jangkrik::class.java)
            startActivity(Serangga)
        }

        val pindahm = findViewById<Button>(R.id.button_m);
        pindahm.setOnClickListener {
            gajah.start()
            val Mamalia = Intent(this,Gajah::class.java)
            startActivity(Mamalia)
        }

        val pindahu = findViewById<Button>(R.id.button_u);
        pindahu.setOnClickListener {
            val Unggas = Intent(this,Angsa::class.java)
            angsa.start()
            startActivity(Unggas)
        }
    }
}
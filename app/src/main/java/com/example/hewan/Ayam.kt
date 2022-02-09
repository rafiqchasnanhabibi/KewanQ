package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Ayam : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ayam)
        var clickCount = 0;
        var ayam1 = MediaPlayer.create(this, R.raw.makan_ayam)
        var ayam2 = MediaPlayer.create(this, R.raw.ciri_ciri_ayam)
        var ayam3 = MediaPlayer.create(this, R.raw.berkembang_biak_ayam)
        val ayam = findViewById<Button>(R.id.button_ayam);
        ayam.setOnClickListener {
            if (clickCount == 0) {
                ayam2.start()
                clickCount++
            } else if (clickCount == 1) {
                ayam1.start()
                clickCount++
            } else {
                ayam3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.bebek)
            Suaralanjut.start()
            val Intentl = Intent(this,Bebek::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.angsa)
            Suarakembali.start()
            val Intentb = Intent(this,Angsa::class.java)
            startActivity(Intentb)
        }
    }

}
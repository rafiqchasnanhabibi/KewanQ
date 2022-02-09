package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Bebek : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bebek)
        var clickCount = 0;
        var bebek1 = MediaPlayer.create(this, R.raw.makan_bebek)
        var bebek2 = MediaPlayer.create(this, R.raw.ciri_ciri_bebek)
        var bebek3 = MediaPlayer.create(this, R.raw.berkembang_biak_bebek)
        val bebek = findViewById<Button>(R.id.button_bebek);
        bebek.setOnClickListener {
            if (clickCount == 0) {
                bebek2.start()
                clickCount++
            } else if (clickCount == 1) {
                bebek1.start()
                clickCount++
            } else {
                bebek3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.burung_elang)
            Suaralanjut.start()
            val Intentl = Intent(this,Elang::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.ayam)
            Suarakembali.start()
            val Intentb = Intent(this,Ayam::class.java)
            startActivity(Intentb)
        }
    }

}
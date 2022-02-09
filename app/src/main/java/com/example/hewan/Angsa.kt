package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Angsa : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_angsa)
        var clickCount = 0;
        var angsa1 = MediaPlayer.create(this, R.raw.makan_angsa)
        var angsa2 = MediaPlayer.create(this, R.raw.ciri_ciri_angsa)
        var angsa3 = MediaPlayer.create(this, R.raw.berkembang_biak_angsa)
        val angsa = findViewById<Button>(R.id.button_angsa);
        angsa.setOnClickListener {
            if (clickCount == 0) {
                angsa2.start()
                clickCount++
            } else if (clickCount == 1) {
                angsa1.start()
                clickCount++
            } else {
                angsa3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.ayam)
            Suaralanjut.start()
            val Intentl = Intent(this,Ayam::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suarakembali.start()
            val Intentb = Intent(this,SubMenu::class.java)
            startActivity(Intentb)
        }
    }

}
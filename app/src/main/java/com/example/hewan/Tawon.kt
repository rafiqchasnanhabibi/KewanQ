package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Tawon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tawon)
        var clickCount = 0;
        var tawon1 = MediaPlayer.create(this, R.raw.makan_tawon)
        var tawon2 = MediaPlayer.create(this, R.raw.ciri_ciri_tawon)
        var tawon3 = MediaPlayer.create(this, R.raw.berkembang_biak_tawon)
        val tawon = findViewById<Button>(R.id.button_tawon);
        tawon.setOnClickListener {
            if (clickCount == 0) {
                tawon2.start()
                clickCount++
            } else if (clickCount == 1) {
                tawon1.start()
                clickCount++
            } else {
                tawon3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suaralanjut.start()
            val Intentl = Intent(this,RangkumanSerangga::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.nyamuk)
            Suarakembali.start()
            val Intentb = Intent(this,Nyamuk::class.java)
            startActivity(Intentb)
        }
    }

}
package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Kenari : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kenari)
        var clickCount = 0;
        var kenari1 = MediaPlayer.create(this, R.raw.makan_burung_kenari)
        var kenari2 = MediaPlayer.create(this, R.raw.ciri_ciri_burung_kenari)
        var kenari3 = MediaPlayer.create(this, R.raw.berkembang_biak_burung_kenari)
        val kenari = findViewById<Button>(R.id.button_kenari);
        kenari.setOnClickListener {
            if (clickCount == 0) {
                kenari2.start()
                clickCount++
            } else if (clickCount == 1) {
                kenari1.start()
                clickCount++
            } else {
                kenari3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suaralanjut.start()
            val Intentl = Intent(this,RangkumanUnggas::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.burung_elang)
            Suarakembali.start()
            val Intentb = Intent(this,Elang::class.java)
            startActivity(Intentb)
        }
    }

}
package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Elang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elang)
        var clickCount = 0;
        var elang1 = MediaPlayer.create(this, R.raw.makan_burung_elang)
        var elang2 = MediaPlayer.create(this, R.raw.ciri_ciri_burung_elang)
        var elang3 = MediaPlayer.create(this, R.raw.berkembang_biak_burung_elang)
        val elang = findViewById<Button>(R.id.button_elang);
        elang.setOnClickListener {
            if (clickCount == 0) {
                elang2.start()
                clickCount++
            } else if (clickCount == 1) {
                elang1.start()
                clickCount++
            } else {
                elang3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.burung_kenari)
            Suaralanjut.start()
            val Intentl = Intent(this,Kenari::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.bebek)
            Suarakembali.start()
            val Intentb = Intent(this,Bebek::class.java)
            startActivity(Intentb)
        }
    }

}
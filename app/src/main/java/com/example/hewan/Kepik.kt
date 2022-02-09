package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Kepik : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kepik)
        var clickCount = 0;
        var kepik1 = MediaPlayer.create(this, R.raw.makan_kepik)
        var kepik2 = MediaPlayer.create(this, R.raw.ciri_ciri_kepik)
        var kepik3 = MediaPlayer.create(this, R.raw.berkembang_biak_kepik)
        val kepik = findViewById<Button>(R.id.button_kepik);
        kepik.setOnClickListener {
            if (clickCount == 0) {
                kepik2.start()
                clickCount++
            } else if (clickCount == 1) {
                kepik1.start()
                clickCount++
            } else {
                kepik3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.lebah)
            Suaralanjut.start()
            val Intentl = Intent(this,Lebah::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.jangkrik)
            Suarakembali.start()
            val Intentb = Intent(this,Jangkrik::class.java)
            startActivity(Intentb)
        }
    }

}
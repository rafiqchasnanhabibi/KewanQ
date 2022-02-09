package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Lebah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lebah)
        var clickCount = 0;
        var lebah1 = MediaPlayer.create(this, R.raw.makan_lebah)
        var lebah2 = MediaPlayer.create(this, R.raw.ciri_ciri_lebah)
        var lebah3 = MediaPlayer.create(this, R.raw.berkembang_biak_lebah)
        val lebah = findViewById<Button>(R.id.button_lebah);
        lebah.setOnClickListener {
            if (clickCount == 0) {
                lebah2.start()
                clickCount++
            } else if (clickCount == 1) {
                lebah1.start()
                clickCount++
            } else {
                lebah3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.nyamuk)
            Suaralanjut.start()
            val Intentl = Intent(this,Nyamuk::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.kepik)
            Suarakembali.start()
            val Intentb = Intent(this,Kepik::class.java)
            startActivity(Intentb)
        }
    }

}
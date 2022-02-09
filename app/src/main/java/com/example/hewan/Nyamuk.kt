package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Nyamuk : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nyamuk)
        var clickCount = 0;
        var nyamuk1 = MediaPlayer.create(this, R.raw.makan_nyamuk)
        var nyamuk2 = MediaPlayer.create(this, R.raw.ciri_ciri_nyamuk)
        var nyamuk3 = MediaPlayer.create(this, R.raw.berkembang_biak_nyamuk)
        val nyamuk = findViewById<Button>(R.id.button_nyamuk);
        nyamuk.setOnClickListener {
            if (clickCount == 0) {
                nyamuk2.start()
                clickCount++
            } else if (clickCount == 1) {
                nyamuk1.start()
                clickCount++
            } else {
                nyamuk3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.tawon)
            Suaralanjut.start()
            val Intentl = Intent(this,Tawon::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.lebah)
            Suarakembali.start()
            val Intentb = Intent(this,Lebah::class.java)
            startActivity(Intentb)
        }
    }

}
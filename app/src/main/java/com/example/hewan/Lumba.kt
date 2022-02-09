package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Lumba : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lumba)
        var clickCount = 0;
        var lumba1 = MediaPlayer.create(this, R.raw.makan_lumba_lumba)
        var lumba2 = MediaPlayer.create(this, R.raw.ciri_ciri_lumba_lumba)
        var lumba3 = MediaPlayer.create(this, R.raw.berkembang_biak_lumba_lumba)
        val lumba = findViewById<Button>(R.id.button_lumba);
        lumba.setOnClickListener {
            if (clickCount == 0) {
                lumba2.start()
                clickCount++
            } else if (clickCount == 1) {
                lumba1.start()
                clickCount++
            } else {
                lumba3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.sapi)
            Suaralanjut.start()
            val Berikutnya = Intent(this,Sapi::class.java)
            startActivity(Berikutnya)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.kambing)
            Suarakembali.start()
            val Ulang = Intent(this,Kambing::class.java)
            startActivity(Ulang)
        }
    }

}
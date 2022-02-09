package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Kambing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kambing)
        var clickCount = 0;
        var kambing1 = MediaPlayer.create(this, R.raw.makan_kambing)
        var kambing2 = MediaPlayer.create(this, R.raw.ciri_ciri_kambing)
        var kambing3 = MediaPlayer.create(this, R.raw.berkembang_biak_kambing)
        val kambing = findViewById<Button>(R.id.button_kambing);
        kambing.setOnClickListener {
            if (clickCount == 0) {
                kambing2.start()
                clickCount++
            } else if (clickCount == 1) {
                kambing1.start()
                clickCount++
            } else {
                kambing3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.lumba_lumba)
            Suaralanjut.start()
            val Berikutnya = Intent(this,Lumba::class.java)
            startActivity(Berikutnya)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.gajah)
            Suarakembali.start()
            val Ulang = Intent(this,Gajah::class.java)
            startActivity(Ulang)
        }
    }

}
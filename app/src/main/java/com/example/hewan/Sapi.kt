package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Sapi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sapi)
        var clickCount = 0;
        var sapi1 = MediaPlayer.create(this, R.raw.makan_sapi)
        var sapi2 = MediaPlayer.create(this, R.raw.ciri_ciri_sapi)
        var sapi3 = MediaPlayer.create(this, R.raw.berkembang_biak_sapi)
        val sapi = findViewById<Button>(R.id.button_sapi);
        sapi.setOnClickListener {
            if (clickCount == 0) {
                sapi2.start()
                clickCount++
            } else if (clickCount == 1) {
                sapi1.start()
                clickCount++
            } else {
                sapi3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.singa)
            Suaralanjut.start()
            val Berikutnya = Intent(this,Singa::class.java)
            startActivity(Berikutnya)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.lumba_lumba)
            Suarakembali.start()
            val Ulang = Intent(this,Lumba::class.java)
            startActivity(Ulang)
        }
    }

}
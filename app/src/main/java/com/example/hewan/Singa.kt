package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Singa : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singa)
        var clickCount = 0;
        var singa1 = MediaPlayer.create(this, R.raw.makan_singa)
        var singa2 = MediaPlayer.create(this, R.raw.ciri_ciri_singa)
        var singa3 = MediaPlayer.create(this, R.raw.berkembang_biak_singa)
        val singa = findViewById<Button>(R.id.button_singa);
        singa.setOnClickListener {
            if (clickCount == 0) {
                singa2.start()
                clickCount++
            } else if (clickCount == 1) {
                singa1.start()
                clickCount++
            } else {
                singa3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suaralanjut.start()
            val Berikutnya = Intent(this,RangkumanMamalia::class.java)
            startActivity(Berikutnya)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.sapi)
            Suarakembali.start()
            val Ulang = Intent(this,Sapi::class.java)
            startActivity(Ulang)
        }
    }

}
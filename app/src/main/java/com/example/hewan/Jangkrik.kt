package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Jangkrik : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jangkrik)
        var clickCount = 0;
        var jangkrik1 = MediaPlayer.create(this, R.raw.makan_jangkrik)
        var jangkrik2 = MediaPlayer.create(this, R.raw.ciri_ciri_jangkrik)
        var jangkrik3 = MediaPlayer.create(this, R.raw.berkembang_biak_jangkrik)
        val jangkrik = findViewById<Button>(R.id.button_jangkrik);
        jangkrik.setOnClickListener {
            if (clickCount == 0) {
                jangkrik2.start()
                clickCount++
            } else if (clickCount == 1) {
                jangkrik1.start()
                clickCount++
            } else {
                jangkrik3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.kepik)
            Suaralanjut.start()
            val Berikutnya = Intent(this,Kepik::class.java)
            startActivity(Berikutnya)
            }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suarakembali.start()
            val Ulang = Intent(this,SubMenu::class.java)
            startActivity(Ulang)
        }
    }

}
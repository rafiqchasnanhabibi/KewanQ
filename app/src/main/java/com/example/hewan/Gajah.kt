package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Gajah : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gajah)
        var clickCount = 0;
        var gajah1 = MediaPlayer.create(this, R.raw.makan_gajah)
        var gajah2 = MediaPlayer.create(this, R.raw.ciri_ciri_gajah)
        var gajah3 = MediaPlayer.create(this, R.raw.berkembang_biak_gajah)
        val gajah = findViewById<Button>(R.id.button_gajah);
        gajah.setOnClickListener {
            if (clickCount == 0) {
                gajah2.start()
                clickCount++
            } else if (clickCount == 1) {
                gajah1.start()
                clickCount++
            } else {
                gajah3.start()
                clickCount = 0
            }
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.kambing)
            Suaralanjut.start()
            val Berikutnya = Intent(this,Kambing::class.java)
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
package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RangkumanSerangga : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rangkuman_serangga)
        val jangkrik = findViewById<Button>(R.id.button_jangkrik);
        jangkrik.setOnClickListener {
            val mulaisuarajangkrik = MediaPlayer.create(this,R.raw.jangkrik)
            mulaisuarajangkrik.start()
        }
        val kepik = findViewById<Button>(R.id.button_kepik);
        kepik.setOnClickListener {
            val mulaisuarakepik = MediaPlayer.create(this,R.raw.kepik)
            mulaisuarakepik.start()
        }
        val lebah = findViewById<Button>(R.id.button_lebah);
        lebah.setOnClickListener {
            val mulaisuaralebah = MediaPlayer.create(this,R.raw.lebah)
            mulaisuaralebah.start()
        }
        val nyamuk = findViewById<Button>(R.id.button_nyamuk);
        nyamuk.setOnClickListener {
            val mulaisuaranyamuk = MediaPlayer.create(this,R.raw.nyamuk)
            mulaisuaranyamuk.start()
        }
        val tawon = findViewById<Button>(R.id.button_tawon);
        tawon.setOnClickListener {
            val mulaisuaratawon = MediaPlayer.create(this,R.raw.tawon)
            mulaisuaratawon.start()
        }
        val lanjut = findViewById<ImageView>(R.id.btn_next);
        lanjut.setOnClickListener {
            val Suaralanjut = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            Suaralanjut.start()
            val Intentl = Intent(this,SubMenu::class.java)
            startActivity(Intentl)
        }
        val kembali = findViewById<ImageView>(R.id.btn_back);
        kembali.setOnClickListener {
            val Suarakembali = MediaPlayer.create(this,R.raw.tawon)
            Suarakembali.start()
            val Intentb = Intent(this,Tawon::class.java)
            startActivity(Intentb)
        }
    }
}
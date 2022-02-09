package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RangkumanUnggas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rangkuman_unggas)
        val ayam = findViewById<Button>(R.id.button_ayam);
        ayam.setOnClickListener {
            val mulaisuaraayam = MediaPlayer.create(this,R.raw.ayam)
            mulaisuaraayam.start()
        }
        val angsa = findViewById<Button>(R.id.button_angsa);
        angsa.setOnClickListener {
            val mulaisuaraangsa = MediaPlayer.create(this,R.raw.angsa)
            mulaisuaraangsa.start()
        }
        val kenari = findViewById<Button>(R.id.button_kenari);
        kenari.setOnClickListener {
            val mulaisuarakenari = MediaPlayer.create(this,R.raw.burung_kenari)
            mulaisuarakenari.start()
        }
        val elang = findViewById<Button>(R.id.button_elang);
        elang.setOnClickListener {
            val mulaisuaraelang = MediaPlayer.create(this,R.raw.burung_elang)
            mulaisuaraelang.start()
        }
        val bebek = findViewById<Button>(R.id.button_bebek);
        bebek.setOnClickListener {
            val mulaisuarabebek = MediaPlayer.create(this,R.raw.bebek)
            mulaisuarabebek.start()
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
            val Suarakembali = MediaPlayer.create(this,R.raw.burung_kenari)
            Suarakembali.start()
            val Intentb = Intent(this,Kenari::class.java)
            startActivity(Intentb)
        }
    }
}
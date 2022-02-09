package com.example.hewan

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class RangkumanMamalia : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rangkuman_mamalia)
        val gajah = findViewById<Button>(R.id.button_gajah);
        gajah.setOnClickListener {
            val mulaisuaragajah = MediaPlayer.create(this,R.raw.gajah)
            mulaisuaragajah.start()
        }
        val kambing = findViewById<Button>(R.id.button_kambing);
        kambing.setOnClickListener {
            val mulaisuarakambing = MediaPlayer.create(this,R.raw.kambing)
            mulaisuarakambing.start()
        }
        val lumba = findViewById<Button>(R.id.button_lumba);
        lumba.setOnClickListener {
            val mulaisuaralumba = MediaPlayer.create(this,R.raw.lumba_lumba)
            mulaisuaralumba.start()
        }
        val singa = findViewById<Button>(R.id.button_singa);
        singa.setOnClickListener {
            val mulaisuarasinga = MediaPlayer.create(this,R.raw.singa)
            mulaisuarasinga.start()
        }
        val sapi = findViewById<Button>(R.id.button_sapi);
        sapi.setOnClickListener {
            val mulaisuarasapi = MediaPlayer.create(this,R.raw.sapi)
            mulaisuarasapi.start()
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
            val Suarakembali = MediaPlayer.create(this,R.raw.singa)
            Suarakembali.start()
            val Intentb = Intent(this,Singa::class.java)
            startActivity(Intentb)
        }
    }
}
package com.example.hewan

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Animatable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupWindow

class MenuUtama : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_utama)


        val belajar = findViewById<Button>(R.id.button_belajar);
        belajar.setOnClickListener {
            val Intentb = Intent(this,SubMenu::class.java)
            startActivity(Intentb)
            val putarsuara = MediaPlayer.create(this,R.raw.pilih_jenis_hewan)
            putarsuara.start()
        }
//        val kuis = findViewById<Button>(R.id.button_kuis);
//        kuis.setOnClickListener {
//            val Intentk = Intent(this,SubMenu::class.java)
//            startActivity(Intentk)
//        }

    }

}



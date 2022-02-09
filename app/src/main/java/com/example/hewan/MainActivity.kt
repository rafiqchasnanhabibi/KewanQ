package com.example.hewan

import android.content.Intent
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
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val putarback = MediaPlayer.create(this,R.raw.back_music)
        putarback.start()

        val pindahs = findViewById<Button>(R.id.button_start);
        pindahs.setOnClickListener {
            val mulaisuara = MediaPlayer.create(this,R.raw.selamat_datang)
            mulaisuara.start()
            val Intent = Intent(this,MenuUtama::class.java)
            startActivity(Intent)
        }

        val dialog = AlertDialog.Builder(this)
        val dialogView = layoutInflater.inflate(R.layout.kontribusi,null)
        val kontribusi = findViewById<Button>(R.id.button_info);
        kontribusi.setOnClickListener {
            dialog.setView(dialogView)
            dialog.show()
        }


    }

}




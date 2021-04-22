package com.example.pertemuankeempat

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editJari = findViewById<EditText>(R.id.txtInput1)
        val editTinggi = findViewById<EditText>(R.id.txtInput2)

        val btnVolume = findViewById<Button>(R.id.btnVolume)
        val btnLuas = findViewById<Button>(R.id.btnLuas)

        btnVolume.setOnClickListener{
            val jari = editJari.getText() .toString()
            val tinggi = editTinggi.getText() .toString()

            val intent1 = Intent(this@MainActivity,VolumeActivity::class.java)

            intent1.putExtra("jari",jari)
            intent1.putExtra("tinggi", tinggi)
            startActivity(intent1)
        }
        btnLuas.setOnClickListener {
            val jari = editJari.getText().toString()
            val tinggi = editTinggi.getText().toString()

            val intent2 = Intent(this@MainActivity,LuasActivity::class.java)

            intent2.putExtra("jari", jari)
            intent2.putExtra("tinggi", tinggi)
            startActivity(intent2)
        }
    }
}
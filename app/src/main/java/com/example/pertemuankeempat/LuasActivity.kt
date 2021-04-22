package com.example.pertemuankeempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class LuasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luas)

        val jari = intent.getStringExtra("jari")
        val tinggi = intent.getStringExtra("tinggi")
        val values = intent.getStringExtra("values") ?: "Default values if not provided"

        var jari_num : Double = jari?.toDouble() ?: 0.0;
        var tinggi_num : Double = tinggi?.toDouble() ?: 0.0;

        var luas : Double = (2*(3.14*jari_num*jari_num))+(3.14*2*jari_num*tinggi_num)

        val txtJari = findViewById<TextView>(R.id.txtJari)
        val txtTinggi = findViewById<TextView>(R.id.txtTinggi)
        val txtLuas = findViewById<TextView>(R.id.txtLuas)

        txtJari.text ="Jari-jari :"+jari_num
        txtTinggi.text ="Tinggi :"+tinggi_num
        txtLuas.text ="Luas Silinder:"+luas
    }
}
package com.example.pertemuankeempat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class VolumeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        var values:String? = null
        val jari = intent.getStringExtra("jari")
        val tinggi = intent.getStringExtra("tinggi")


        var jari_num : Double = jari?.toDouble() ?: 0.0 ;
        var tinggi_num : Double = tinggi?.toDouble() ?: 0.0

        var volume : Double = 3.14 * jari_num * jari_num * tinggi_num

        val txtJari = findViewById<TextView>(R.id.txtJari)
        val txtTinggi = findViewById<TextView>(R.id.txtTinggi)
        val txtVolume = findViewById<TextView>(R.id.txtVolume)

        txtJari.text = "Jari-jari :"+jari_num
        txtTinggi.text ="Tinggi :"+tinggi_num
        txtVolume.text = "Volume:"+volume
    }
}
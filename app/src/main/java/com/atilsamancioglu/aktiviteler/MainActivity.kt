package com.atilsamancioglu.aktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("MainActivity onCreate Çağırıldı")
    }

    override fun onResume() {
        super.onResume()

        println("MainActivity onResume Çağırıldı")

    }

    override fun onStart() {
        super.onStart()

        println("MainActivity onStart Çağırıldı")

    }

    override fun onPause() {
        super.onPause()

        println("MainActivity onPause Çağırıldı")

    }

    override fun onStop() {
        super.onStop()

        println("MainActivity onStop Çağırıldı")

    }

    override fun onDestroy() {
        super.onDestroy()

        println("MainActivity onDestroy Çağırıldı")

    }

    fun ileri(view: View) {

        val isim = isimText.text.toString()
        val soyisim = soyisimText.text.toString()
        //Intent
        val intent = Intent(this,IkinciAktivite::class.java)
        intent.putExtra("aktarilanIsim",isim)
        intent.putExtra("aktarilanSoyisim",soyisim)
        startActivity(intent)
        finish()
    }
}
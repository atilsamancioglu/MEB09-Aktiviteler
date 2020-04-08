package com.atilsamancioglu.aktiviteler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_ikinci_aktivite.*

class IkinciAktivite : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ikinci_aktivite)

        //getIntent

        val intent = intent
        val isimAktarilan = intent.getStringExtra("aktarilanIsim")
        val soyisimAktarilan = intent.getStringExtra("aktarilanSoyisim")

        ikinciAktiviteIsimText.text = "Isim: ${isimAktarilan}"
        ikinciAktiviteSoyisimText.text = "Soyisim: ${soyisimAktarilan}"

    }

    fun gerigit(view:View) {
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
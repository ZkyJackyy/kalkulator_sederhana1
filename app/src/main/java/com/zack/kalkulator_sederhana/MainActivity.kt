package com.zack.kalkulator_sederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var etbil1 : EditText
    private lateinit var etbil2 : EditText
    private lateinit var btntambah : Button
    private lateinit var btnkali : Button
    private lateinit var btnkurang : Button
    private lateinit var textView2 : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        etbil1= findViewById(R.id.etbil1)
        etbil2= findViewById(R.id.etbil2)
        btntambah= findViewById(R.id.btntambah)
        btnkali= findViewById(R.id.btnkali)
        btnkurang= findViewById(R.id.btnkurang)
        textView2= findViewById(R.id.textView2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btntambah.setOnClickListener(){
            val angka1 = etbil1.text.toString().toInt()
            val angka2 = etbil2.text.toString().toInt()

            val hasil = angka1 + angka2
            textView2.setText("hasil tambah = "+hasil)
        }
        btnkali.setOnClickListener(){
            val angka1 = etbil1.text.toString().toInt()
            val angka2 = etbil2.text.toString().toInt()

            val hasil = angka1 * angka2
            textView2.setText("hasil tambah = "+hasil)
        }
        btnkurang.setOnClickListener(){
            val angka1 = etbil1.text.toString().toInt()
            val angka2 = etbil2.text.toString().toInt()

            val hasil = angka1 - angka2
            textView2.setText("hasil tambah = "+hasil)
        }

    }
}
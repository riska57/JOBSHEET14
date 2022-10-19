package com.example.riskajob14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTPFL = findViewById<Button>(R.id.fragmentTPFL)
        val btnTO = findViewById<Button>(R.id.fragmentTO)
        val btnPPLG = findViewById<Button>(R.id.fragmentPPLG)
        val btnBusana = findViewById<Button>(R.id.fragmentBusana)
        val btnKuliner = findViewById<Button>(R.id.fragmentKuliner)

        btnTPFL.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TPFLFragment())
            fragmentTransaction.commit()
        }

        btnTO.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, TOFragment())
            fragmentTransaction.commit()
        }

        btnPPLG.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, PPLGFragment())
            fragmentTransaction.commit()
        }

        btnBusana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, BusanaFragment())
            fragmentTransaction.commit()
        }

        btnKuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentContainer, KulinerFragment())
            fragmentTransaction.commit()
        }
    }
}
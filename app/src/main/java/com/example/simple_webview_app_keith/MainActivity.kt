package com.example.simple_webview_app_keith

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var mbtnabsa:Button
    lateinit var mbtnfamily:Button
    lateinit var mbtnstanbic:Button
    lateinit var mbtnequity:Button
    lateinit var mbtnkcb:Button
    lateinit var mbtncoop: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mbtnabsa = findViewById(R.id.absabtn)
        mbtnfamily = findViewById(R.id.familybtn)
        mbtnstanbic = findViewById(R.id.stanbicbtn)
        mbtnequity = findViewById(R.id.equitybtn)
        mbtnkcb = findViewById(R.id.kcbbtn)
        mbtncoop = findViewById(R.id.cooperativebtn)

        mbtnabsa.setOnClickListener {
            var gotoabsabank = Intent(this, AbsaActivity::class.java)
            startActivity(gotoabsabank)
        }

        mbtnfamily.setOnClickListener {
            var gotofamilybank = Intent(this, FamilyActivity::class.java)
            startActivity(gotofamilybank)
        }

        mbtnstanbic.setOnClickListener {
            var gotostanbicbank = Intent(this, StanbicActivity::class.java)
            startActivity(gotostanbicbank)
        }

        mbtnequity.setOnClickListener {
            var gotoequitybank = Intent(this, EquityActivity::class.java)
            startActivity(gotoequitybank)
        }

        mbtnkcb.setOnClickListener {
            var gotokcbbank = Intent(this, KcbActivity::class.java)
            startActivity(gotokcbbank)
        }

        mbtncoop.setOnClickListener {
            var gotocoopbank = Intent(this, CoopActivity::class.java)
            startActivity(gotocoopbank)
        }


    }
}
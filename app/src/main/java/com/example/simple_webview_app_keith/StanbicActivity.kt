package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class StanbicActivity : AppCompatActivity() {
    lateinit var mstanbicview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stanbic)
        mstanbicview = findViewById(R.id.stanbicview)
        var webSettings = mstanbicview.settings
        webSettings.javaScriptEnabled = true
        mstanbicview.loadUrl("https://www.stanbicbank.co.ke")
    }
}
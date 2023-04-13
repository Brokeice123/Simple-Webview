package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class AbsaActivity : AppCompatActivity() {
    lateinit var mWeb:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absa)
        mWeb = findViewById(R.id.myWeb)
        var webSettings = mWeb.settings
        webSettings.javaScriptEnabled = true
        mWeb.loadUrl("https://www.absabank.co.ke")
    }
}
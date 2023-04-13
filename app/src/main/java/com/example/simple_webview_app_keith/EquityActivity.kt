package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class EquityActivity : AppCompatActivity() {
    lateinit var mequityview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_equity)
        mequityview = findViewById(R.id.equityview)
        var webSettings = mequityview.settings
        webSettings.javaScriptEnabled = true
        mequityview.loadUrl("https://equitygroupholdings.com")
    }
}
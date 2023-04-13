package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class CoopActivity : AppCompatActivity() {
    lateinit var mcoopview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coop)
        mcoopview = findViewById(R.id.coopview)
        var webSettings = mcoopview.settings
        webSettings.javaScriptEnabled = true
        mcoopview.loadUrl("https://www.co-opbank.co.ke")
    }

    
}
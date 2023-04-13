package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class KcbActivity : AppCompatActivity() {
    lateinit var mkcbview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kcb)
        mkcbview = findViewById(R.id.kcbview)
        var webSettings = mkcbview.settings
        webSettings.javaScriptEnabled = true
        mkcbview.loadUrl("https://ke.kcbgroup.com")
    }
}
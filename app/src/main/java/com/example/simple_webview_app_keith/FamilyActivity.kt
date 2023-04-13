package com.example.simple_webview_app_keith

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class FamilyActivity : AppCompatActivity() {
    lateinit var mfamilyview:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family)
        mfamilyview = findViewById(R.id.familyview)
        var webSettings = mfamilyview.settings
        webSettings.javaScriptEnabled = true
        mfamilyview.loadUrl("https://familybank.co.ke")
    }
}
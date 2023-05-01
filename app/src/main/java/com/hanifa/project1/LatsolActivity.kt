package com.hanifa.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class LatsolActivity : AppCompatActivity() {

    lateinit var webView : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latsol)

        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSc-FApYRFZE3961f_fUso1kpEnozOIHY5Fm4zykBmYaTUI9Bg/viewform")
// web setting
        val webSettings = webView.settings
// mengaktifkan javascript
        webSettings.javaScriptEnabled = true
// mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }
}
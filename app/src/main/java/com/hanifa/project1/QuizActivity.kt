package com.hanifa.project1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class QuizActivity : AppCompatActivity() {
    lateinit var webView : WebView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)
        webView = findViewById(R.id.WV)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://docs.google.com/forms/d/e/1FAIpQLSd_zurwF5vYceSwz_a4n-hojAEtdJn4YP8sJ7_joeMzw4YWQg/viewform")
// web setting
        val webSettings = webView.settings
// mengaktifkan javascript
        webSettings.javaScriptEnabled = true
// mengaktifkan tool seperti bootstrap
        webSettings.domStorageEnabled = true
    }
}
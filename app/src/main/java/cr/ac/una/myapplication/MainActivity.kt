package cr.ac.una.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView = findViewById(R.id.web)

        // Configurar el WebView
        val webSettings: WebSettings = webView.settings
        webSettings.javaScriptEnabled = true


        // Cargar la URL del artículo de Wikipedia
        val url = "https://en.wikipedia.org/api/rest_v1/page/mobile-html/costa_rica"
        webView.loadUrl(url)
    }
}
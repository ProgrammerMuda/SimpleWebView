package com.example.raga.webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wvBrowser;
    WebSettings webset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wvBrowser=(WebView)findViewById(R.id.web);

        webset = wvBrowser.getSettings();
        webset.setJavaScriptEnabled(true);
        wvBrowser.setWebViewClient(new WebViewClient());
        wvBrowser.loadUrl("www.facebook.com");


    }
}

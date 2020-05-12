package com.example.hackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ActivityAppany extends AppCompatActivity {

    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appany);
        mWebView = findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl("file:///android_asset/index.html");
    }
}
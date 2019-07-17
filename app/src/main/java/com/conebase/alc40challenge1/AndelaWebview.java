package com.conebase.alc40challenge1;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AndelaWebview extends AppCompatActivity {

    WebView webv;
    ProgressBar progbr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andela_webview);

        webv = (WebView) findViewById(R.id.webvw);
        progbr = (ProgressBar) findViewById(R.id.progrb);

        webv.setWebViewClient((new WebViewClient()));
        webv.loadUrl("https://andela.com/alc/");
        WebSettings webSettings = webv.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webv.setWebViewClient(new WebViewClient());

    }
        public class myWebClient extends WebViewClient{

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon){
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                progbr.setVisibility(view.VISIBLE);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url){
                super.onPageFinished(view, url);
                progbr.setVisibility(view.GONE);
            }
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed(); // Ignore SSL certificate errors
            }
        }
    }

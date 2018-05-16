package com.vimukthisadaruwan65gmail.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class youtubewebpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubewebpage);

        Intent youtubeintent =getIntent();


        String url = "https://www.youtube.com/";
        WebView webView = (WebView) findViewById(R.id.youtubeweb);
        webView.setWebViewClient(new youtubewebpage.MyyoutubeBrower());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);


    }

    private class MyyoutubeBrower extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }

    }
}

package com.vimukthisadaruwan65gmail.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class wordpresswebpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordpresswebpage);

        Intent wordpressintent = getIntent();


        String url = "https://www.wordpress.com/";
        WebView webView = (WebView) findViewById(R.id.wordpressweb);
        webView.setWebViewClient(new wordpresswebpage.MywordpressBrower());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);


    }

    private class MywordpressBrower extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }

    }
}

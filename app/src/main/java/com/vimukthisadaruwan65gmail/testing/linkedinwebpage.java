package com.vimukthisadaruwan65gmail.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class linkedinwebpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedinwebpage);

        Intent linkedintent = getIntent();

        String url = "https://www.linkedin.com/";
        WebView webView = (WebView) findViewById(R.id.linkedinweb);
        webView.setWebViewClient(new linkedinwebpage.MylinkedBrower());
        webView.getSettings().setLoadsImagesAutomatically(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        webView.loadUrl(url);


    }

    private class MylinkedBrower extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }

    }
}

package com.vimukthisadaruwan65gmail.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.view.View;

public class fbwebpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fbwebpage);

        Intent fbintent = getIntent();

        String url = "https://m.facebook.com/home.php";
        WebView webView = (WebView) findViewById(R.id.fbweb);
        webView.setWebViewClient(new MyTestBrower());
       webView.getSettings().setLoadsImagesAutomatically(true);
       webView.getSettings().setJavaScriptEnabled(true);
       webView.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
       webView.loadUrl(url);


    }

    private class MyTestBrower extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading(WebView view,String url)
        {
            view.loadUrl(url);
            return true;
        }


    }



}

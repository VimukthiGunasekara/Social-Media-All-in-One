package com.vimukthisadaruwan65gmail.testing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

    }

    public void facebookclick(View view) {

        Intent fbintent = new Intent(this,fbwebpage.class);
        startActivity(fbintent);


    }

    public void twitterclick(View view) {

        Intent twitterintent = new Intent(this,twitterwebpage.class);
        startActivity(twitterintent);


    }

    public void linkedinclick(View view) {

        Intent linkedintent = new Intent(this,linkedinwebpage.class);
        startActivity(linkedintent);

    }

    public void insterclick(View view) {

        Intent insterintent = new Intent(this,insterwebactivity.class);
        startActivity(insterintent);

    }

    public void gclick(View view) {
        Intent gintent = new Intent(this,gwebpage.class);
        startActivity(gintent);

    }

    public void wordpressclick(View view) {
        Intent wordpressintent = new Intent(this,wordpresswebpage.class);
        startActivity(wordpressintent);

    }

    public void bloggerclick(View view) {
        Intent blogerintent = new Intent(this,blogeerwebpage.class);
        startActivity(blogerintent);

    }

    public void youtubeclick(View view) {
        Intent youtubeintent = new Intent(this,youtubewebpage.class);
        startActivity(youtubeintent);

    }

    public void dropclick(View view) {
        Intent dropintent = new Intent(this,dropboxwebpage.class);
        startActivity(dropintent);


    }
}

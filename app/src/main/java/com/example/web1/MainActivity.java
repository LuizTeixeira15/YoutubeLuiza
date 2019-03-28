package com.example.web1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout ll = (LinearLayout) findViewById(R.id.linear);

        WebView wv = new WebView(this);//(WebView) findViewById(R.id.web1);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        wv.setLayoutParams(lp);

        WebSettings ws = wv.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setSupportZoom(false);

        wv.loadUrl("http://ipublico.atwebpages.com");
        ll.addView(wv);

    }
}

package com.srisha.koandja;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class AndActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_and);

        if (getSupportActionBar()!=null){
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        }

        WebView webView= (WebView)findViewById(R.id.weband);

        webView.loadUrl("https://www.tutorialspoint.com/android");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sds = new Intent(AndActivity.this, FirstActivity.class);
                startActivity(sds);
                         }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menubar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id==android.R.id.home){
            finish();
    }else if (id == R.id.and) {
            return true;
        } else if (id==R.id.kot){
            Intent abc = new Intent(AndActivity.this,KotActivity.class);
            startActivity(abc);
        }else if (id==R.id.ja){
            Intent mno = new Intent(AndActivity.this,JavActivity.class);
            startActivity(mno);
        }else if (id==R.id.sc){
             Intent zxc = new Intent(AndActivity.this,SamActivity.class);
             startActivity(zxc);
         }

        return super.onOptionsItemSelected(item);
    }

}

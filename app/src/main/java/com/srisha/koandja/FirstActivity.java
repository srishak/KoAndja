package com.srisha.koandja;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button abc = findViewById(R.id.andtut);
        abc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sds = new Intent(FirstActivity.this, AndActivity.class);
                startActivity(sds);
            }

        });

        Button xyz = findViewById(R.id.kotut);
        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zaq = new Intent(FirstActivity.this, KotActivity.class);
                startActivity(zaq);
            }

        });

        Button mno = findViewById(R.id.jatut);
        mno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xsw = new Intent(FirstActivity.this, JavActivity.class);
                startActivity(xsw);
            }

        });

        Button sd = findViewById(R.id.samco);
        sd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sds = new Intent(FirstActivity.this, SamActivity.class);
                startActivity(sds);

            }
        });

    }

}

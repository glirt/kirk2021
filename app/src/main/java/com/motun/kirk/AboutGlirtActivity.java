package com.motun.kirk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.motun.kirk.R;

public class AboutGlirtActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_glirt);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("About Glirt");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    public void open(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://glirt.blogspot.com/p/privacy-policy.html"));
        startActivity(browserIntent);
    }

    public void close(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://glirt.blogspot.com/p/terms-and-conditions.html"));
        startActivity(browserIntent);
    }
}

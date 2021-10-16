package com.example.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button basic;
    private Button advanced;
    private Button about;
    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        basic =(Button) findViewById(R.id.basic);
        basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                openBasic();
            }
        });

        advanced =(Button) findViewById(R.id.advanced);
        advanced.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                openAdvanced();
            }
        });

        about =(Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                openAbout();
            }
        });

        exit =(Button) findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                finish();
                System.exit(0);
            }
        });

    }
    public void openBasic () {
        Intent intent = new Intent(this, Basic.class);
        startActivity(intent);
    }
    public void openAdvanced () {
        Intent intent = new Intent(this, Advanced.class);
        startActivity(intent);
    }
    public void openAbout () {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}
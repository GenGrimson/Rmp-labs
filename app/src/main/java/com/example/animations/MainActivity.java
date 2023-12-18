package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startCell(View v){
        Intent i = new Intent(MainActivity.this, Cell.class);
        startActivity(i);
    }

    public void startTween(View v){
        Intent i = new Intent(MainActivity.this, Tween.class);
        startActivity(i);
    }
}
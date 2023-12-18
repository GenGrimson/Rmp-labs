package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Tween extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween);

//        ImageView img = findViewById(R.id.animationView);
//        // определим для ImageView какое-нибудь изображение
//        img.setImageResource(R.drawable.dubi2);
//        // создаем анимацию
//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.common_animation);
//        // запуск анимации
//        img.startAnimation(animation);
    }

    public void scale(View view){
        ImageView img = findViewById(R.id.animationView);
        img.setImageResource(R.drawable.dubi2);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.scale);
        img.startAnimation(animation);
    }

    public void rotate(View view){
        ImageView img = findViewById(R.id.animationView);
        img.setImageResource(R.drawable.dubi2);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotate);
        img.startAnimation(animation);
    }

    public void alpha(View view){
        ImageView img = findViewById(R.id.animationView);
        img.setImageResource(R.drawable.dubi2);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.alpha);
        img.startAnimation(animation);
    }

    public void translate(View view){
        ImageView img = findViewById(R.id.animationView);
        img.setImageResource(R.drawable.dubi2);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.translate);
        img.startAnimation(animation);
    }
}
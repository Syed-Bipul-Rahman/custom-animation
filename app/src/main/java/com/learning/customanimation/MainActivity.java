package com.learning.customanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView image = (ImageView) findViewById(R.id.imageView);


        Button button=findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.bounce);
            image.startAnimation(hyperspaceJump);
        });
        Animation hyperspaceJump = AnimationUtils.loadAnimation(this, R.anim.bounce);
        image.startAnimation(hyperspaceJump);
    }
}
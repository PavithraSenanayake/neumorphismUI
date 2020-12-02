package com.example.neumorphism;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;

public class LoginActivity extends AppCompatActivity {

    private LinearLayout layout_main;
    private Animation animation_fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        utils.blackIconStatusBar(LoginActivity.this, R.color.light_Background);

        layout_main = findViewById(R.id.layout_main);

        animation_fadein = AnimationUtils.loadAnimation(LoginActivity.this, R.anim.fade_in);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                layout_main.setVisibility(View.VISIBLE);
                layout_main.setAnimation(animation_fadein);
            }
        },1000);
    }
}
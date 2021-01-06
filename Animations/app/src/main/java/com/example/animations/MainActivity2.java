package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    Animation animBounce,animBlink,animFadeIn,animFadeOut;
    ImageView bounceImg,blinkImg,fadeInImg,fadeOutImg,nextPage;
    Button bounce,blink,fadeIn,fadeOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        declarations();
        animations();
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);
            }
        });
        bounce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bounceImg.startAnimation(animBounce);
            }
        });
        blink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                blinkImg.startAnimation(animBlink);
            }
        });
        fadeIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fadeInImg.startAnimation(animFadeIn);
            }
        });
        fadeOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fadeOutImg.startAnimation(animFadeOut);
            }
        });
    }

    public void declarations(){
        bounce=findViewById(R.id.bounce);
        blink=findViewById(R.id.blink);
        fadeIn=findViewById(R.id.fadeIn);
        fadeOut=findViewById(R.id.fadeOut);
        bounceImg=findViewById(R.id.bounceImg);
        blinkImg=findViewById(R.id.blinkImg);
        fadeInImg=findViewById(R.id.fadeInImg);
        fadeOutImg=findViewById(R.id.fadeOutImg);
        nextPage=findViewById(R.id.nextPage);
    }
    public void animations(){
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_out);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.bounce);
        animBlink = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.blink);


    }
}
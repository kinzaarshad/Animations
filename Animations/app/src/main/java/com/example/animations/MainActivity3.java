package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Animation animMove,animRotate,animSlideIn,animSlideOut;
    ImageView moveImg,rotateImg,slideInImg,slideOutImg;
    Button move,rotate,slideIn,slideOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        declarations();
        animations();
        move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveImg.startAnimation(animMove);
            }
        });
        rotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rotateImg.startAnimation(animRotate);
            }
        });
        slideIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideInImg.startAnimation(animSlideIn);
            }
        });
        slideOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                slideOutImg.startAnimation(animSlideOut);
            }
        });
    }

    public void declarations(){
        move=findViewById(R.id.move);
        rotate=findViewById(R.id.rotate);
        slideIn=findViewById(R.id.slide_down);
        slideOut=findViewById(R.id.slide_up);
        moveImg=findViewById(R.id.moveImg);
        rotateImg=findViewById(R.id.rotateImg);
        slideInImg=findViewById(R.id.SlideDownImg);
        slideOutImg=findViewById(R.id.SlideUpImg);
    }
    public void animations(){
        animSlideIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_down);
        animSlideOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_up);
        animMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.rotate);


    }
}
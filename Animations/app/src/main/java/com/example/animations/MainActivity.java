package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Animation.AnimationListener {
    Animation animMoveOutBottom,animMoveOutRight,animMoveOutLeft,animMoveInDown,animZoomOutAndMove,animFadein,animMoveOut,animSlideIn,animZoomAndMove,animMoveUp,animMoveInRight,animMoveInLeft,animMoveOutUp,animMoveInBottom;
    TextView txt,heading,greeting,purpose;
    ImageView circle,table,camera,blueOne,blueTwo,background,backBtn,nextPage;
    Button btnStart;
    ConstraintLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declarations();
        animations();
        animZoomAndMove.setAnimationListener(this);
        btnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                blueTransition();

            }
        });
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                greyTransition();
            }
        });
        nextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(i);
            }
        });
    }
    public void declarations(){
        txt= (TextView) findViewById(R.id.textview);
        heading=(TextView)findViewById(R.id.heading);
        circle= findViewById(R.id.circle);
        table=findViewById(R.id.table);
        camera=findViewById(R.id.camera);
        blueOne=findViewById(R.id.blueOne);
        blueTwo=findViewById(R.id.blueTwo);
        greeting=findViewById(R.id.greeting);
        purpose=findViewById(R.id.purpose);
        background=findViewById(R.id.background);
        btnStart = (Button) findViewById(R.id.button);
        backBtn=findViewById(R.id.backButton);
        main=findViewById(R.id.main);
        nextPage=findViewById(R.id.nextPage);
    }
    public void animations(){
        animFadein = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.fade_in);
        animMoveOut = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move);
        animSlideIn = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.slide_in_right);
        animZoomAndMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_and_move);
        animMoveUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_up);
        animMoveOutUp = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_out_up);
        animMoveInDown = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_in_down);
        animMoveInLeft = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_in_left);
        animMoveInRight = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_in_right);
        animMoveInBottom = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_in_bottom);
        animZoomOutAndMove = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.zoom_out_and_move);
        animMoveOutRight = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_out_right);
        animMoveOutLeft = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_out_left);
        animMoveOutBottom = AnimationUtils.loadAnimation(getApplicationContext(),
                R.anim.move_out_bottom);
    }

    public void blueTransition(){
        txt.setVisibility(View.VISIBLE);

        // start the animation
        txt.startAnimation(animMoveOut);
        heading.startAnimation(animMoveOut);
        camera.startAnimation(animZoomAndMove);
        table.startAnimation(animMoveOut);
        circle.startAnimation(animMoveOutUp);
        btnStart.startAnimation(animMoveOut);
        background.setVisibility(View.VISIBLE);
        background.startAnimation(animMoveInBottom);
        blueOne.setVisibility(View.VISIBLE);
        blueOne.startAnimation(animMoveInLeft);
        blueTwo.setVisibility(View.VISIBLE);
        blueTwo.startAnimation(animMoveInRight);
        greeting.setVisibility(View.VISIBLE);
        greeting.startAnimation(animMoveInRight);
        purpose.setVisibility(View.VISIBLE);
        purpose.startAnimation(animMoveInRight);
        backBtn.setVisibility(View.VISIBLE);
    }
    public void greyTransition(){
        txt.startAnimation(animMoveInLeft);
        heading.startAnimation(animMoveInLeft);
        camera.startAnimation(animZoomOutAndMove);
        table.startAnimation(animMoveInLeft);
        circle.startAnimation(animMoveInDown);
        btnStart.startAnimation(animMoveInLeft);
        blueOne.startAnimation(animMoveOutLeft);
        background.startAnimation(animMoveOutBottom);
        background.setVisibility(View.GONE);
        blueOne.setVisibility(View.GONE);
        blueTwo.startAnimation(animMoveOutRight);
        blueTwo.setVisibility(View.GONE);
        greeting.setVisibility(View.VISIBLE);
        greeting.startAnimation(animMoveOutRight);
        purpose.setVisibility(View.VISIBLE);
        purpose.startAnimation(animMoveOutRight);
        backBtn.setVisibility(View.GONE);
    }

    @Override
    public void onAnimationEnd(Animation animation) {
        // Take any action after completing the animation

        // check for fade in animation
        if (animation == animZoomAndMove) {


        }

    }

    @Override
    public void onAnimationRepeat(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onAnimationStart(Animation animation) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
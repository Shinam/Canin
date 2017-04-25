package com.example.canin;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    Animation fade_in, fade_out;
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView img;
        img = (ImageView) findViewById(R.id.pict0);
        Glide.with(this).load(R.drawable.pict0).into(img);
        img = (ImageView) findViewById(R.id.pict1);
        Glide.with(this).load(R.drawable.pict1).into(img);
        img = (ImageView) findViewById(R.id.pict2);
        Glide.with(this).load(R.drawable.pict2).into(img);
        img = (ImageView) findViewById(R.id.pict3);
        Glide.with(this).load(R.drawable.pict3).into(img);
        img = (ImageView) findViewById(R.id.pict4);
        Glide.with(this).load(R.drawable.pict4).into(img);
        img = (ImageView) findViewById(R.id.pict5);
        Glide.with(this).load(R.drawable.pict5).into(img);
        img = (ImageView) findViewById(R.id.pict6);
        Glide.with(this).load(R.drawable.pict6).into(img);
        img = (ImageView) findViewById(R.id.pict7);
        Glide.with(this).load(R.drawable.pict7).into(img);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.flip);
        fade_in = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this,
                android.R.anim.fade_out);
        viewFlipper.setInAnimation(fade_in);
        viewFlipper.setOutAnimation(fade_out);
//sets auto flipping
        viewFlipper.setAutoStart(true);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.startFlipping();
    }
}

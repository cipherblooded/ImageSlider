package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    ViewFlipper flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int [] images={R.drawable.image1,R.drawable.image2,R.drawable.image3,R.drawable.image4,R.drawable.images5};
        flipper=findViewById(R.id.flipper);

        for (int i=0;i<images.length;i++){
            flipperImages(images[i]);
        }
    }

    public void flipperImages(int image){

        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        flipper.addView(imageView);
        flipper.setFlipInterval(2500);
        flipper.setAutoStart(true);
        flipper.setInAnimation(this,android.R.anim.slide_in_left);
        flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }
}

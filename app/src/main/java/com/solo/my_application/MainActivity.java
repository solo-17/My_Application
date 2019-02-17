package com.solo.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bcImageView = (ImageView) findViewById(R.id.imageViewbc);
        bcImageView.setImageResource(R.drawable.bc_fruit_veg);
    }
}

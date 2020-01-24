package com.ali.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView homer = findViewById(R.id.homer);
        ImageView bart = findViewById(R.id.bart);;
        if(bart.getAlpha()==0){
            bart.animate().alpha(1f).setDuration(2000);
            homer.animate().alpha(0f).setDuration(2000);
        }
        else{
            bart.animate().alpha(0f).setDuration(2000);
            homer.animate().alpha(1f).setDuration(2000);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

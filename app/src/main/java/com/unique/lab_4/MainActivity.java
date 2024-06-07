package com.unique.lab_4;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rotateButton = findViewById(R.id.rotateButton);
        Button translateButton = findViewById(R.id.translateButton);
        Button resizeButton = findViewById(R.id.resizeButton);
        ImageView targetImage = findViewById(R.id.targetImage);

        rotateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator rotate = ObjectAnimator.ofFloat(targetImage, "rotation", 0f, 360f);
                rotate.setDuration(1000);
                rotate.start();
            }
        });

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator translateX = ObjectAnimator.ofFloat(targetImage, "translationX", 0f, 300f);
                translateX.setDuration(1000);
                translateX.start();
            }
        });

        resizeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ObjectAnimator scaleX = ObjectAnimator.ofFloat(targetImage, "scaleX", 1f, 1.5f);
                ObjectAnimator scaleY = ObjectAnimator.ofFloat(targetImage, "scaleY", 1f, 1.5f);
                scaleX.setDuration(1000);
                scaleY.setDuration(1000);
                scaleX.start();
                scaleY.start();
            }
        });
    }
}

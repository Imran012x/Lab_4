package com.unique.lab_4;

import android.animation.AnimatorSet;
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

        ImageView animateButton = findViewById(R.id.imagebtn);

        animateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Scale animation
                ObjectAnimator scaleX = ObjectAnimator.ofFloat(v, "scaleX", 1f, 1.5f);
                ObjectAnimator scaleY = ObjectAnimator.ofFloat(v, "scaleY", 1f, 1.5f);

                // Rotate animation
                ObjectAnimator rotate = ObjectAnimator.ofFloat(v, "rotation", 0f, 360f);

                // Translate animation
                ObjectAnimator translateX = ObjectAnimator.ofFloat(v, "translationX", 0f, 300f);
                ObjectAnimator translateY = ObjectAnimator.ofFloat(v, "translationY", 0f, 300f);

                // AnimatorSet to play animations together
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(scaleX, scaleY, rotate, translateX, translateY);
                animatorSet.setDuration(1000); // Animation duration in milliseconds
                animatorSet.start();
            }
        });
    }
}

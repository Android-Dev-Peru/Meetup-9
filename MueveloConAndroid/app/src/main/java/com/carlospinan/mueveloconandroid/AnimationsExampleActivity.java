package com.carlospinan.mueveloconandroid;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.carlospinan.mueveloconandroid.animations.Animate;

public class AnimationsExampleActivity extends BaseActivity {

    private static final long ANIMATION_DURATION = 1000L;

    private Animate animate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);
        initLayout();
    }

    @Override
    protected void initLayout() {
        animate = new Animate();
        final ImageView exampleImageView = (ImageView) findViewById(R.id.exampleImageView);

        findViewById(R.id.fadeInAnimation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resetImageView(exampleImageView);
                        Animator animator = animate.fadeIn(exampleImageView, ANIMATION_DURATION);
                        animator.start();
                    }
                });

        findViewById(R.id.fadeOutAnimation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resetImageView(exampleImageView);
                        Animator animator = animate.fadeOut(exampleImageView, ANIMATION_DURATION);
                        animator.start();
                    }
                });

        findViewById(R.id.rotateAnimation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resetImageView(exampleImageView);
                        Animator animator = animate.rotate(exampleImageView, 0, 360);
                        animator.start();
                    }
                });

        findViewById(R.id.zoomAnimation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resetImageView(exampleImageView);
                        exampleImageView.animate().scaleX(5.0f).scaleY(5.0f).withLayer().start();
                    }
                });

        findViewById(R.id.blinkAnimation).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        resetImageView(exampleImageView);
                        ObjectAnimator animator = ObjectAnimator.ofFloat(exampleImageView, View.ALPHA, 0.0f, 1.0f);
                        animator.setDuration(1000);
                        animator.setRepeatCount(20);
                        animator.start();
                    }
                });
    }

    private void resetImageView(ImageView imageView) {
        imageView.clearAnimation();
        imageView.setImageAlpha(255);
        imageView.setRotation(0);
        imageView.setScaleX(1.0f);
        imageView.setScaleY(1.0f);
    }

}

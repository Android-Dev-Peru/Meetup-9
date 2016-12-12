/**
 *
 */
package com.carlospinan.mueveloconandroid.activities;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.carlospinan.mueveloconandroid.BaseActivity;
import com.carlospinan.mueveloconandroid.R;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 */
public class BallExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
        initLayout();
    }

    @Override
    protected void initLayout() {
        final ImageView ballImageView = (ImageView) findViewById(R.id.ballImageView);

        ObjectAnimator rotateAnimator = ObjectAnimator.ofFloat(ballImageView, View.ROTATION, 0, 360);
        rotateAnimator.setDuration(5000L);

        ValueAnimator positionAnimator = ValueAnimator.ofFloat(0, -1000);
        positionAnimator.setDuration(5000L);

        positionAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float value = (float) valueAnimator.getAnimatedValue();
                ballImageView.setTranslationY(value);
            }
        });

        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(rotateAnimator, positionAnimator);
        animatorSet.start();

    }
}

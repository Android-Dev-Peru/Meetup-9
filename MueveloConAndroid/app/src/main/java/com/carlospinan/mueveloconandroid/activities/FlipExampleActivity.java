/**
 *
 */
package com.carlospinan.mueveloconandroid.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.carlospinan.mueveloconandroid.BaseActivity;
import com.carlospinan.mueveloconandroid.R;
import com.carlospinan.mueveloconandroid.animations.FlipAnimation;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 */
public class FlipExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flip_example);
        initLayout();
    }

    @Override
    protected void initLayout() {
        final ImageView cardBackImageView = (ImageView) findViewById(R.id.cardBackImageView);
        final ImageView cardFrontImageView = (ImageView) findViewById(R.id.cardFrontImageView);
        final FlipAnimation animation = new FlipAnimation(cardBackImageView, cardFrontImageView);
        animation.reverse();

        final View container = findViewById(R.id.container);

        cardBackImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.reverse();
                container.startAnimation(animation);
            }
        });

        cardFrontImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animation.reverse();
                container.startAnimation(animation);
            }
        });

    }
}

/**
 *
 */
package com.carlospinan.mueveloconandroid.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ImageView;

import com.carlospinan.mueveloconandroid.BaseActivity;
import com.carlospinan.mueveloconandroid.R;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 */
public class RocketExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rocket);
        initLayout();
    }

    @Override
    protected void initLayout() {
        final ImageView rocketImageView = (ImageView) findViewById(R.id.rocketImageView);
        rocketImageView.animate().translationY(-5000).setDuration(4500L).setStartDelay(500L).start();
    }
}

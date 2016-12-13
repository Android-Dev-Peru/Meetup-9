/**
 *
 */
package com.carlospinan.mueveloconandroid.activities.sharedElement;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.ActivityOptionsCompat;
import android.view.View;
import android.widget.ImageView;

import com.carlospinan.mueveloconandroid.BaseActivity;
import com.carlospinan.mueveloconandroid.R;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 * @source https://guides.codepath.com/android/Shared-Element-Activity-Transition
 * @source https://developer.android.com/training/material/animations.html
 */
public class SharedOneExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared1);
        initLayout();
    }

    @Override
    protected void initLayout() {

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    ActivityOptionsCompat optionsCompat =
                            ActivityOptionsCompat.makeSceneTransitionAnimation(
                                    SharedOneExampleActivity.this,
                                    imageView,
                                    getString(R.string.transition_name)
                            );
                    Intent intent = new Intent(SharedOneExampleActivity.this, SharedTwoExampleActivity.class);
                    ActivityCompat.startActivity(
                            SharedOneExampleActivity.this,
                            intent,
                            optionsCompat.toBundle()
                    );
                }
            }
        });

    }
}

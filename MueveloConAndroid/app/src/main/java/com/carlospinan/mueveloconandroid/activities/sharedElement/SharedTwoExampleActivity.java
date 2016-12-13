/**
 *
 */
package com.carlospinan.mueveloconandroid.activities.sharedElement;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.carlospinan.mueveloconandroid.BaseActivity;
import com.carlospinan.mueveloconandroid.R;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 */
public class SharedTwoExampleActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared2);
        initLayout();
    }

    @Override
    protected void initLayout() {
    }
}

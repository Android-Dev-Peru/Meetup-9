/**
 *
 */
package com.carlospinan.mueveloconandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.carlospinan.mueveloconandroid.activities.BallExampleActivity;
import com.carlospinan.mueveloconandroid.activities.FlipExampleActivity;
import com.carlospinan.mueveloconandroid.activities.KeyFrameExampleActivity;
import com.carlospinan.mueveloconandroid.activities.RocketExampleActivity;
import com.carlospinan.mueveloconandroid.activities.sharedElement.SharedOneExampleActivity;

/**
 * @author Carlos Piñan
 * @date 12/12/16
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.animationExampleItem:
                initializeActivity(AnimationsExampleActivity.class);
                break;
            case R.id.ballItem:
                initializeActivity(BallExampleActivity.class);
                break;
            case R.id.flipItem:
                initializeActivity(FlipExampleActivity.class);
                break;
            case R.id.keyFrameItem:
                initializeActivity(KeyFrameExampleActivity.class);
                break;
            case R.id.rocketItem:
                initializeActivity(RocketExampleActivity.class);
                break;
            case R.id.sharedItem:
                initializeActivity(SharedOneExampleActivity.class);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initializeActivity(Class clazz) {
        Intent intent = new Intent(this, clazz);
        intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        startActivity(intent);
    }

    protected abstract void initLayout();
}

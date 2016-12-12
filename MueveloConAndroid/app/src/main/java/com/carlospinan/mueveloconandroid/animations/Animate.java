/**
 *
 */
package com.carlospinan.mueveloconandroid.animations;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/**
 * @author Carlos Piñan
 * @date 12/9/16
 * @reference http://android-developers.blogspot.pe/2011/05/introducing-viewpropertyanimator.html
 */
public class Animate {

    // ALPHA ANIMATIONS

    public Animator fadeIn(View view, long duration) {
        return fade(view, duration, 0, 1);
    }

    public Animator fadeOut(View view, long duration) {
        return fade(view, duration, 1, 0);
    }

    private Animator fade(
            View view,
            long duration,
            float start,
            float end
    ) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.ALPHA, start, end);
        animator.setDuration(duration);
        return animator;
    }

    // ROTATE ANIMATIONS

    public Animator rotate(
            View view,
            long duration,
            float rotation
    ) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, View.ROTATION, 0, rotation);
        animator.setDuration(duration);
        return animator;
    }
}

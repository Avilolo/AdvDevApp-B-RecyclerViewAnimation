package com.RecyclerViewAnimation;

import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;

import androidx.recyclerview.widget.RecyclerView;

public class AnimationAdapter {

    public enum EnterType { FALL_DOWN, ROTATE_IN, SCALE_IN, SLIDE_UP }
//    public enum SlideType {  }

    private RecyclerView recyclerView;
    private Context context;
    private int resId;

    public AnimationAdapter(Context context, RecyclerView rv) {
        this.context = context;
        this.recyclerView = rv;
        this.resId = 0;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    public void changeEnterAnimation(EnterType toAnim) {
        switch (toAnim) {
            case FALL_DOWN:
                resId = R.anim.layout_animation_fall_down;
                break;
            case ROTATE_IN:
                resId = R.anim.layout_animation_rotate;
                break;
            case SCALE_IN:
                resId = R.anim.layout_animation_scale_in;
                break;
            case SLIDE_UP:
                resId = R.anim.layout_animation_slide_up;
                break;
        }
        if (resId != 0) {
            // Set animation for RecyclerView
            LayoutAnimationController animation = AnimationUtils.loadLayoutAnimation(context, resId);
            recyclerView.setLayoutAnimation(animation);
            recyclerView.getAdapter().notifyDataSetChanged();
        }
    }
}

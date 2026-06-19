package com.bilibili.playerbizcommon.features.danmaku.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerMinMaxLabelSeekBar.class */
public class PlayerMinMaxLabelSeekBar extends RelativeLayout implements SeekBar.OnSeekBarChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AppCompatSeekBar f79705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f79706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f79707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SeekBar.OnSeekBarChangeListener f79708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f79709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f79710f;

    public PlayerMinMaxLabelSeekBar(Context context) {
        super(context);
        a(context, null);
    }

    public PlayerMinMaxLabelSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.h);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            boolean z7 = typedArrayObtainStyledAttributes.getBoolean(4, true);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            if (z6) {
                TextView textView = new TextView(new ContextThemeWrapper(context, 2131886257), null, 2131886257);
                this.f79706b = textView;
                textView.setId(2131304721);
                this.f79706b.setFocusable(false);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9);
                layoutParams.addRule(15);
                this.f79706b.setGravity(19);
                if (colorStateList != null) {
                    this.f79706b.setTextColor(colorStateList);
                }
                addView(this.f79706b, layoutParams);
            }
            if (z7) {
                TextView textView2 = new TextView(new ContextThemeWrapper(context, 2131886256), null, 2131886256);
                this.f79707c = textView2;
                textView2.setId(2131304724);
                this.f79707c.setFocusable(false);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(11);
                layoutParams2.addRule(15);
                this.f79707c.setGravity(19);
                if (colorStateList != null) {
                    this.f79707c.setTextColor(colorStateList);
                }
                addView(this.f79707c, layoutParams2);
            }
            View view = this.f79705a;
            if (view != null && indexOfChild(view) >= 0) {
                removeView(this.f79705a);
            }
            AppCompatSeekBar appCompatSeekBar = new AppCompatSeekBar(new ContextThemeWrapper(getContext(), 2131886273), null, 2131886273);
            this.f79705a = appCompatSeekBar;
            appCompatSeekBar.setMax(1000);
            this.f79705a.setProgress(0);
            this.f79705a.setSelected(true);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams3.addRule(15);
            if (this.f79706b != null) {
                layoutParams3.addRule(1, 2131304721);
            }
            if (this.f79707c != null) {
                layoutParams3.addRule(0, 2131304724);
            }
            addView(this.f79705a, layoutParams3);
            this.f79705a.setOnSeekBarChangeListener(this);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int getMax() {
        return this.f79705a.getMax() - this.f79710f;
    }

    public float getPercentage() {
        if (this.f79705a == null) {
            return 0.0f;
        }
        return getProgress() / getMax();
    }

    public int getProgress() {
        return this.f79705a.getProgress() - this.f79710f;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z6) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f79708d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onProgressChanged(seekBar, getProgress(), z6);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f79708d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStartTrackingTouch(seekBar);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f79708d;
        if (onSeekBarChangeListener != null) {
            onSeekBarChangeListener.onStopTrackingTouch(seekBar);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        TextView textView = this.f79706b;
        if (textView != null) {
            textView.setEnabled(z6);
        }
        TextView textView2 = this.f79707c;
        if (textView2 != null) {
            textView2.setEnabled(z6);
        }
        AppCompatSeekBar appCompatSeekBar = this.f79705a;
        if (appCompatSeekBar != null) {
            Drawable progressDrawable = appCompatSeekBar.getProgressDrawable();
            Drawable thumb = this.f79705a.getThumb();
            progressDrawable.mutate();
            thumb.mutate();
            if (z6) {
                thumb.clearColorFilter();
                progressDrawable.clearColorFilter();
            } else {
                int color = Color.parseColor("#999999");
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                progressDrawable.setColorFilter(color, mode);
                thumb.setColorFilter(Color.parseColor("#999999"), mode);
            }
            this.f79705a.setProgressDrawable(progressDrawable);
            this.f79705a.setThumb(thumb);
        }
    }

    public void setMax(int i7) {
        this.f79705a.setMax(i7);
    }

    public void setMaxLabelTextGravity(int i7) {
        TextView textView = this.f79707c;
        if (textView != null) {
            textView.setGravity(i7);
        }
    }

    public void setMaxLableText(String str) {
        TextView textView = this.f79707c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMinLabelTextGravity(int i7) {
        TextView textView = this.f79706b;
        if (textView != null) {
            textView.setGravity(i7);
        }
    }

    public void setMinLableText(String str) {
        TextView textView = this.f79706b;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setMinOffset(int i7) {
        this.f79710f = i7;
        this.f79705a.setMax(i7 + 1000);
    }

    public void setOnSeekBarChangeListener(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener) {
        this.f79708d = onSeekBarChangeListener;
    }

    public void setProgress(float f7) {
        if (f7 > 0.0f) {
            this.f79705a.setProgress(this.f79710f + ((int) (f7 * getMax())));
            this.f79709e = true;
            return;
        }
        if (f7 < 0.0f) {
            this.f79705a.setProgress(0);
        } else {
            this.f79705a.setProgress(this.f79710f);
        }
        if (this.f79709e) {
            return;
        }
        onProgressChanged(this.f79705a, getProgress(), true);
        this.f79709e = true;
    }

    public void setSeekbarVisibility(int i7) {
        this.f79705a.setVisibility(i7);
    }
}

package com.bilibili.playerbizcommon.features.danmaku.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bilibili.playerbizcommon.features.danmaku.view.a;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerMinMaxLabelSeekBarBox.class */
public final class PlayerMinMaxLabelSeekBarBox extends FrameLayout implements SeekBar.OnSeekBarChangeListener, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SeekBar f79711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TextView f79712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final TextView f79713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final FrameLayout f79714d;

    @JvmOverloads
    public PlayerMinMaxLabelSeekBarBox(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerMinMaxLabelSeekBarBox(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PlayerMinMaxLabelSeekBarBox(Context context, AttributeSet attributeSet, int i7) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, 2131499672, this);
        TextView textView = (TextView) findViewById(2131307428);
        this.f79712b = textView;
        TextView textView2 = (TextView) findViewById(2131307293);
        this.f79713c = textView2;
        this.f79714d = (FrameLayout) findViewById(2131311059);
        LinearLayout linearLayout = (LinearLayout) findViewById(2131304999);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.h);
        try {
            boolean z6 = typedArrayObtainStyledAttributes.getBoolean(5, false);
            boolean z7 = typedArrayObtainStyledAttributes.getBoolean(4, true);
            boolean z8 = typedArrayObtainStyledAttributes.getBoolean(3, false);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            String string = typedArrayObtainStyledAttributes.getString(1);
            String string2 = typedArrayObtainStyledAttributes.getString(2);
            if (z6) {
                if (textView != null) {
                    textView.setVisibility(0);
                }
                if (textView != null) {
                    textView.setFocusable(false);
                }
                if (colorStateList != null && textView != null) {
                    textView.setTextColor(colorStateList);
                }
                if (textView != null) {
                    textView.setText(string2);
                }
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            if (z7) {
                if (textView2 != null) {
                    textView2.setVisibility(0);
                }
                if (textView2 != null) {
                    textView2.setFocusable(false);
                }
                if (colorStateList != null && textView2 != null) {
                    textView2.setTextColor(colorStateList);
                }
                if (textView2 != null) {
                    textView2.setText(string);
                }
            } else if (textView2 != null) {
                textView2.setVisibility(8);
            }
            if (z8) {
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
            } else if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(@NotNull View view, int i7, @NotNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof SeekBar)) {
            super.addView(view, i7, layoutParams);
            return;
        }
        SeekBar seekBar = (SeekBar) view;
        this.f79711a = seekBar;
        SeekBar seekBar2 = seekBar;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar2 = null;
        }
        if (seekBar2 instanceof a) {
            SeekBar seekBar3 = this.f79711a;
            SeekBar seekBar4 = seekBar3;
            if (seekBar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                seekBar4 = null;
            }
            ((a) seekBar4).setOnSectionChangedListener(this);
            TextView textView = this.f79713c;
            SeekBar seekBar5 = this.f79711a;
            SeekBar seekBar6 = seekBar5;
            if (seekBar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                seekBar6 = null;
            }
            textView.setText(((a) seekBar6).getCurrentLabel());
        } else {
            SeekBar seekBar7 = this.f79711a;
            SeekBar seekBar8 = seekBar7;
            if (seekBar7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                seekBar8 = null;
            }
            seekBar8.setOnSeekBarChangeListener(this);
            TextView textView2 = this.f79713c;
            SeekBar seekBar9 = this.f79711a;
            SeekBar seekBar10 = seekBar9;
            if (seekBar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                seekBar10 = null;
            }
            textView2.setText(seekBar10.getProgress());
        }
        SeekBar seekBar11 = this.f79711a;
        if (seekBar11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar11 = null;
        }
        seekBar11.setFocusable(true);
        this.f79714d.addView(view, layoutParams);
        this.f79714d.setSelected(true);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(@NotNull SeekBar seekBar, int i7, boolean z6) {
        this.f79713c.setText(String.valueOf(i7));
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(@NotNull SeekBar seekBar) {
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(@NotNull SeekBar seekBar) {
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        super.setEnabled(z6);
        TextView textView = this.f79712b;
        if (textView != null) {
            textView.setEnabled(z6);
        }
        TextView textView2 = this.f79713c;
        if (textView2 != null) {
            textView2.setEnabled(z6);
        }
        SeekBar seekBar = this.f79711a;
        SeekBar seekBar2 = seekBar;
        if (seekBar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar2 = null;
        }
        Drawable progressDrawable = seekBar2.getProgressDrawable();
        progressDrawable.mutate();
        SeekBar seekBar3 = this.f79711a;
        SeekBar seekBar4 = seekBar3;
        if (seekBar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar4 = null;
        }
        Drawable thumb = seekBar4.getThumb();
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
        SeekBar seekBar5 = this.f79711a;
        SeekBar seekBar6 = seekBar5;
        if (seekBar5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar6 = null;
        }
        seekBar6.setProgressDrawable(progressDrawable);
        SeekBar seekBar7 = this.f79711a;
        if (seekBar7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            seekBar7 = null;
        }
        seekBar7.setThumb(thumb);
    }

    public final void setMinLabel(@NotNull String str) {
        TextView textView = this.f79712b;
        if (textView != null) {
            textView.setText(str);
        }
    }
}

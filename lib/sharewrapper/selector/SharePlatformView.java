package com.bilibili.lib.sharewrapper.selector;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/sharewrapper/selector/SharePlatformView.class */
public class SharePlatformView extends AppCompatTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f64453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f64454b;

    public SharePlatformView(Context context) {
        this(context, null);
    }

    public SharePlatformView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f64453a = -1.0f;
        this.f64454b = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pW0.a.b);
        this.f64453a = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        this.f64454b = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        J();
    }

    public final void J() {
        Drawable[] compoundDrawables;
        Drawable drawable;
        if (this.f64453a <= 0.0f || this.f64454b <= 0.0f || (drawable = (compoundDrawables = getCompoundDrawables())[1]) == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(this.f64453a / intrinsicWidth, this.f64454b / intrinsicHeight);
        if (fMin == 1.0d) {
            return;
        }
        drawable.setBounds(0, 0, (int) (intrinsicWidth * fMin), (int) (fMin * intrinsicHeight));
        setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    public void setIconHeight(float f7) {
        this.f64454b = f7;
    }

    public void setIconWidth(float f7) {
        this.f64453a = f7;
    }

    public void setTopIcon(@DrawableRes int i7) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], getResources().getDrawable(i7), compoundDrawables[2], compoundDrawables[3]);
        J();
    }
}

package com.bilibili.music.podcast.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.bilibili.magicasakura.widgets.TintTextView;
import com.facebook.drawee.view.DraweeHolder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicMenuItemView.class */
public class MusicMenuItemView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f67098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f67099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public DraweeHolder f67100c;

    public MusicMenuItemView(Context context) {
        this(context, null);
    }

    public MusicMenuItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f67098a = -1.0f;
        this.f67099b = -1.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.music.podcast.d.f66415c);
        this.f67098a = typedArrayObtainStyledAttributes.getDimension(1, -1.0f);
        this.f67099b = typedArrayObtainStyledAttributes.getDimension(0, -1.0f);
        typedArrayObtainStyledAttributes.recycle();
        J();
    }

    public final void J() {
        Drawable[] compoundDrawables;
        Drawable drawable;
        if (this.f67098a <= 0.0f || this.f67099b <= 0.0f || (drawable = (compoundDrawables = getCompoundDrawables())[1]) == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        float fMin = Math.min(this.f67098a / intrinsicWidth, this.f67099b / intrinsicHeight);
        if (fMin == 1.0d) {
            return;
        }
        drawable.setBounds(0, 0, (int) (intrinsicWidth * fMin), (int) (fMin * intrinsicHeight));
        setCompoundDrawables(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
    }

    public void setIconHeight(float f7) {
        this.f67099b = f7;
    }

    public void setIconWidth(float f7) {
        this.f67098a = f7;
    }

    public void setTopIcon(@DrawableRes int i7) {
        setTopIcon(getResources().getDrawable(i7));
    }

    public void setTopIcon(Drawable drawable) {
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], drawable, compoundDrawables[2], compoundDrawables[3]);
        J();
    }
}

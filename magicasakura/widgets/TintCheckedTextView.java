package com.bilibili.magicasakura.widgets;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import androidx.appcompat.widget.C3242f;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bilibili.magicasakura.utils.TintManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/magicasakura/widgets/TintCheckedTextView.class */
public class TintCheckedTextView extends C3242f implements Tintable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f65521e = {R.attr.drawableLeft, 2130969392};

    public TintCheckedTextView(Context context) {
        this(context, null);
    }

    public TintCheckedTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130969059);
    }

    public TintCheckedTextView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f65521e);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId == 0 || resourceId2 == 0) {
            return;
        }
        tintCheckTextView(resourceId, resourceId2);
    }

    @Override // androidx.appcompat.widget.C3242f, android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i7) {
        super.setCheckMarkDrawable(i7);
    }

    @Override // androidx.appcompat.widget.C3242f, android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
    }

    @Override // com.bilibili.magicasakura.widgets.Tintable
    public void tint() {
    }

    public void tintCheckTextView(@DrawableRes int i7, int i8) {
        Drawable drawableWrap = DrawableCompat.wrap(getResources().getDrawable(i7));
        DrawableCompat.setTintList(drawableWrap, TintManager.get(getContext()).getColorStateList(i8, 0));
        DrawableCompat.setTintMode(drawableWrap, PorterDuff.Mode.SRC_IN);
        setCompoundDrawablesRelativeWithIntrinsicBounds(drawableWrap, (Drawable) null, (Drawable) null, (Drawable) null);
        setCheckMarkDrawable((Drawable) null);
    }
}

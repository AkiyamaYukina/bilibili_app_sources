package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bilibili.magicasakura.widgets.TintTextView;
import dq0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/FixedDrawableTextView.class */
public class FixedDrawableTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final int[] f80351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final int[] f80352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f80353c;

    public FixedDrawableTextView(@NotNull Context context) {
        this(context, null, 0);
    }

    public FixedDrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FixedDrawableTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        int[] iArr = {typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(5, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(7, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0)};
        this.f80351a = iArr;
        this.f80352b = new int[]{typedArrayObtainStyledAttributes.getDimensionPixelOffset(2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(4, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(6, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0)};
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.f116621a, i7, 0);
        typedArrayObtainStyledAttributes.recycle();
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            if (i8 >= length) {
                for (int i9 : this.f80352b) {
                    if (i9 <= 0) {
                    }
                }
            } else if (iArr[i8] > 0) {
                break;
            } else {
                i8++;
            }
        }
        Drawable[] compoundDrawables = getCompoundDrawables();
        setCompoundDrawablesWithIntrinsicBounds(compoundDrawables[0], compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Nh1.a.t, i7, 0);
        this.f80353c = typedArrayObtainStyledAttributes2.getInt(0, 0);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final int getWidgetFrom() {
        return this.f80353c;
    }

    @Override // com.bilibili.magicasakura.widgets.TintTextView, androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        int[] iArr = this.f80351a;
        if (iArr == null || iArr.length < 4 || this.f80352b.length < 4) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        if (drawable != null) {
            int i7 = iArr[0];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (i7 <= 0) {
                i7 = intrinsicWidth;
            }
            int i8 = this.f80352b[0];
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (i8 <= 0) {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, i7, i8);
        }
        if (drawable3 != null) {
            int i9 = this.f80351a[1];
            int intrinsicWidth2 = drawable3.getIntrinsicWidth();
            if (i9 > 0) {
                intrinsicWidth2 = i9;
            }
            int i10 = this.f80352b[1];
            int intrinsicHeight2 = drawable3.getIntrinsicHeight();
            if (i10 <= 0) {
                i10 = intrinsicHeight2;
            }
            drawable3.setBounds(0, 0, intrinsicWidth2, i10);
        }
        if (drawable2 != null) {
            int i11 = this.f80351a[2];
            int intrinsicWidth3 = drawable2.getIntrinsicWidth();
            if (i11 > 0) {
                intrinsicWidth3 = i11;
            }
            int i12 = this.f80352b[2];
            int intrinsicHeight3 = drawable2.getIntrinsicHeight();
            if (i12 <= 0) {
                i12 = intrinsicHeight3;
            }
            drawable2.setBounds(0, 0, intrinsicWidth3, i12);
        }
        if (drawable4 != null) {
            int i13 = this.f80351a[3];
            int intrinsicWidth4 = drawable4.getIntrinsicWidth();
            if (i13 <= 0) {
                i13 = intrinsicWidth4;
            }
            int i14 = this.f80352b[3];
            int intrinsicHeight4 = drawable4.getIntrinsicHeight();
            if (i14 > 0) {
                intrinsicHeight4 = i14;
            }
            drawable4.setBounds(0, 0, i13, intrinsicHeight4);
        }
        setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    public final void setWidgetFrom(int i7) {
        this.f80353c = i7;
    }
}

package com.bilibili.playerbizcommon.view;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/FromTextView.class */
public class FromTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80354a;

    public FromTextView(@NotNull Context context) {
        this(context, null, R.attr.textViewStyle);
    }

    public FromTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public FromTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.t, i7, 0);
        this.f80354a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getWidgetFrom() {
        return this.f80354a;
    }

    public final void setWidgetFrom(int i7) {
        this.f80354a = i7;
    }
}

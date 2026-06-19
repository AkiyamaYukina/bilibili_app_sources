package com.bilibili.playerbizcommonv2.view;

import Nh1.a;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.magicasakura.widgets.TintTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/view/FromTextView.class */
@StabilityInferred(parameters = 0)
public class FromTextView extends TintTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82076a;

    public FromTextView(@NotNull Context context) {
        this(context, null, R.attr.textViewStyle);
    }

    public FromTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public FromTextView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.t, i7, 0);
        this.f82076a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int getWidgetFrom() {
        return this.f82076a;
    }

    public final void setWidgetFrom(int i7) {
        this.f82076a = i7;
    }
}

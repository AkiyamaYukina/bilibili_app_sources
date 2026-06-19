package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/RoundedTextView.class */
public class RoundedTextView extends AppCompatTextView {
    @JvmOverloads
    public RoundedTextView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public RoundedTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    @kotlin.jvm.JvmOverloads
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RoundedTextView(@org.jetbrains.annotations.NotNull android.content.Context r7, @org.jetbrains.annotations.Nullable android.util.AttributeSet r8, int r9) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommon.view.RoundedTextView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public /* synthetic */ RoundedTextView(Context context, AttributeSet attributeSet, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i8 & 2) != 0 ? null : attributeSet, (i8 & 4) != 0 ? 16842884 : i7);
    }

    public static boolean J(float[] fArr, TypedArray typedArray, int i7, int i8) {
        float dimension = typedArray.getDimension(i7, 0.0f);
        if (dimension <= 0.0f) {
            return false;
        }
        if (i8 < 0 || i8 >= 4) {
            ArraysKt.s(dimension, fArr);
            return true;
        }
        int i9 = i8 * 2;
        fArr[i9] = dimension;
        fArr[i9 + 1] = dimension;
        return true;
    }

    public final void updateBackground(@ColorInt int i7) {
        Drawable background = getBackground();
        GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
        if (gradientDrawable == null) {
            return;
        }
        gradientDrawable.setColor(i7);
        setBackground(gradientDrawable);
    }
}

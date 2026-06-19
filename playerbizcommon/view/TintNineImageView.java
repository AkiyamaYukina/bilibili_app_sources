package com.bilibili.playerbizcommon.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.DrawableRes;
import com.bilibili.lib.ui.util.NightTheme;
import com.bilibili.magicasakura.widgets.TintImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/view/TintNineImageView.class */
public final class TintNineImageView extends TintImageView {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @DrawableRes
    public int f80373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @DrawableRes
    public int f80374f;

    public TintNineImageView(@NotNull Context context) {
        super(context);
        q(context, null);
    }

    public TintNineImageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        q(context, attributeSet);
    }

    public final void q(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Nh1.a.p);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i7 = 0; i7 < indexCount; i7++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i7);
            if (index == 0) {
                this.f80373e = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
            } else if (index == 1) {
                this.f80374f = typedArrayObtainStyledAttributes.getResourceId(i7, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        v();
    }

    @Override // com.bilibili.magicasakura.widgets.TintImageView, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
        super.tint();
        v();
    }

    public final void v() {
        setBackground(NightTheme.isNightTheme(getContext()) ? getResources().getDrawable(this.f80374f) : getResources().getDrawable(this.f80373e));
    }
}

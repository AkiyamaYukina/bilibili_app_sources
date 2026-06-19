package com.bilibili.playerbizcommonv2.danmaku.view;

import Cr0.a;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerOptionTitleView.class */
@StabilityInferred(parameters = 0)
public final class PlayerOptionTitleView extends AppCompatTextView implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f81539b;

    public PlayerOptionTitleView(@NotNull Context context) {
        super(context);
        this.f81538a = 102;
        this.f81539b = 255;
    }

    public PlayerOptionTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f81538a = 102;
        this.f81539b = 255;
    }

    @Override // Cr0.a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        Color.colorToHSV(getCurrentTextColor(), fArr);
        setTextColor(Color.HSVToColor(z6 ? this.f81539b : this.f81538a, fArr));
    }
}

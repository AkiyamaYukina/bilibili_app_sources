package com.bilibili.playerbizcommon.features.danmaku.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qq0.InterfaceC8477a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/view/PlayerOptionTitleView.class */
public final class PlayerOptionTitleView extends AppCompatTextView implements InterfaceC8477a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f79733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79734b;

    public PlayerOptionTitleView(@NotNull Context context) {
        super(context);
        this.f79733a = 102;
        this.f79734b = 255;
    }

    public PlayerOptionTitleView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f79733a = 102;
        this.f79734b = 255;
    }

    @Override // qq0.InterfaceC8477a
    public void setAvailableState(boolean z6) {
        float[] fArr = new float[3];
        Color.colorToHSV(getCurrentTextColor(), fArr);
        setTextColor(Color.HSVToColor(z6 ? this.f79734b : this.f79733a, fArr));
    }
}

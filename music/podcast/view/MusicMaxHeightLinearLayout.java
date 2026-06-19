package com.bilibili.music.podcast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicMaxHeightLinearLayout.class */
public final class MusicMaxHeightLinearLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67095a;

    @JvmOverloads
    public MusicMaxHeightLinearLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public MusicMaxHeightLinearLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public MusicMaxHeightLinearLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final int getMaxHeight() {
        return this.f67095a;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        if (this.f67095a <= 0) {
            super.onMeasure(i7, i8);
        } else {
            super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i8), this.f67095a), View.MeasureSpec.getMode(i8)));
        }
    }

    public final void setMaxHeight(int i7) {
        this.f67095a = i7;
    }
}

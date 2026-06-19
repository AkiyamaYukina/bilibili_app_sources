package com.bilibili.music.podcast.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/music/podcast/view/MusicMaxHeightScrollView.class */
public final class MusicMaxHeightScrollView extends NestedScrollView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f67097b;

    @JvmOverloads
    public MusicMaxHeightScrollView(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public MusicMaxHeightScrollView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67096a = -1;
        this.f67097b = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.bilibili.music.podcast.d.f66414b);
        this.f67096a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, this.f67096a);
        this.f67097b = typedArrayObtainStyledAttributes.getFloat(1, this.f67097b);
        typedArrayObtainStyledAttributes.recycle();
        if (this.f67096a < 0) {
            float f7 = this.f67097b;
            if (f7 > 0.0f) {
                this.f67096a = (int) (context.getResources().getDisplayMetrics().heightPixels * Math.min(f7, 1.0f));
            }
        }
    }

    public final int getMMaxHeight() {
        return this.f67096a;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i8) {
        int i9 = this.f67096a;
        if (i9 > 0) {
            i8 = View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        super.onMeasure(i7, i8);
    }

    public final void setMMaxHeight(int i7) {
        this.f67096a = i7;
    }
}

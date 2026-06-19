package com.bilibili.playset.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/widget/DisabledScrollViewPager.class */
public class DisabledScrollViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f85669a;

    public DisabledScrollViewPager(@NonNull @NotNull Context context) {
        super(context);
        this.f85669a = true;
    }

    public DisabledScrollViewPager(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f85669a = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean canScrollHorizontally(int i7) {
        if (this.f85669a) {
            return false;
        }
        return super.canScrollHorizontally(i7);
    }

    public void setDisabled(boolean z6) {
        this.f85669a = z6;
    }
}

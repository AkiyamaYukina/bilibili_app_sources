package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/UnitedViewPager.class */
@StabilityInferred(parameters = 0)
public final class UnitedViewPager extends ViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f104916a;

    @JvmOverloads
    public UnitedViewPager(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public UnitedViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f104916a = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        boolean z6 = false;
        try {
            if (this.f104916a) {
                z6 = false;
                if (super.onInterceptTouchEvent(motionEvent)) {
                    z6 = true;
                }
            }
        } catch (Exception e7) {
            z6 = false;
        }
        return z6;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        boolean z6 = false;
        try {
            if (this.f104916a) {
                z6 = false;
                if (super.onTouchEvent(motionEvent)) {
                    z6 = true;
                }
            }
        } catch (Exception e7) {
            z6 = false;
        }
        return z6;
    }
}

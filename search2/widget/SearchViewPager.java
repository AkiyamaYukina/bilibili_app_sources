package com.bilibili.search2.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import j4.t;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.bili.widget.SafeViewPager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/SearchViewPager.class */
@StabilityInferred(parameters = 0)
public final class SearchViewPager extends SafeViewPager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f88958a;

    @JvmOverloads
    public SearchViewPager(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public SearchViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public SearchViewPager(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet);
        this.f88958a = true;
    }

    public final boolean getCanScroll() {
        return this.f88958a;
    }

    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.f88958a ? super.onInterceptTouchEvent(motionEvent) : false;
    }

    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.f88958a ? super.onTouchEvent(motionEvent) : false;
    }

    public final void setCanScroll(boolean z6) {
        this.f88958a = z6;
        t.a("set canScroll ", "SearchViewPager", z6);
    }
}

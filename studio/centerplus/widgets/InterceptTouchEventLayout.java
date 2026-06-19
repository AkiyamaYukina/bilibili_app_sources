package com.bilibili.studio.centerplus.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/widgets/InterceptTouchEventLayout.class */
public final class InterceptTouchEventLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f105319a;

    @JvmOverloads
    public InterceptTouchEventLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public InterceptTouchEventLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public InterceptTouchEventLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    public final boolean getIntercept() {
        return this.f105319a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Nullable MotionEvent motionEvent) {
        return this.f105319a ? true : super.onInterceptTouchEvent(motionEvent);
    }

    public final void setIntercept(boolean z6) {
        this.f105319a = z6;
    }
}

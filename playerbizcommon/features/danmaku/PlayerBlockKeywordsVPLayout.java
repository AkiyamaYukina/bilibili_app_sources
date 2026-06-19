package com.bilibili.playerbizcommon.features.danmaku;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import kotlin.jvm.JvmOverloads;
import oq0.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/danmaku/PlayerBlockKeywordsVPLayout.class */
public final class PlayerBlockKeywordsVPLayout extends FrameLayout {
    @JvmOverloads
    public PlayerBlockKeywordsVPLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerBlockKeywordsVPLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PlayerBlockKeywordsVPLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public final void setActionListener(@NotNull i iVar) {
    }
}

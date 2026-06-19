package com.bilibili.playerbizcommonv2.danmaku.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.JvmOverloads;
import lr0.C7887d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/view/PlayerBlockKeywordsVPLayout.class */
@StabilityInferred(parameters = 0)
public final class PlayerBlockKeywordsVPLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public C7887d.a f81519a;

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
        C7887d.a aVar;
        if (motionEvent != null && motionEvent.getAction() == 1 && (aVar = this.f81519a) != null) {
            aVar.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f81519a = null;
        super.onDetachedFromWindow();
    }

    public final void setActionListener(@NotNull C7887d.a aVar) {
        this.f81519a = aVar;
    }
}

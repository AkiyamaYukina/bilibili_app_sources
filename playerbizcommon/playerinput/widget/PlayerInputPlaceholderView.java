package com.bilibili.playerbizcommon.playerinput.widget;

import Tq0.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/playerinput/widget/PlayerInputPlaceholderView.class */
public final class PlayerInputPlaceholderView extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f80246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f80247b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f80248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f80249d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f80250e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f80251f;

    @JvmOverloads
    public PlayerInputPlaceholderView(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public PlayerInputPlaceholderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public PlayerInputPlaceholderView(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f80246a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Nullable MotionEvent motionEvent) {
        if (this.f80251f && motionEvent != null) {
            int action = motionEvent.getAction();
            float x6 = motionEvent.getX();
            float y6 = motionEvent.getY();
            int i7 = action & 255;
            if (i7 == 0) {
                this.f80250e = false;
                this.f80248c = x6;
                this.f80249d = y6;
                return true;
            }
            if (i7 == 1) {
                float f7 = x6 - this.f80248c;
                float f8 = y6 - this.f80249d;
                this.f80247b = (float) Math.sqrt((f8 * f8) + (f7 * f7));
                return true;
            }
            if (i7 != 2) {
                return true;
            }
            float f9 = x6 - this.f80248c;
            float f10 = y6 - this.f80249d;
            if (this.f80247b != 0.0f) {
                this.f80247b = 0.0f;
            }
            float fSqrt = this.f80247b + ((float) Math.sqrt((f10 * f10) + (f9 * f9)));
            this.f80247b = fSqrt;
            if (fSqrt <= this.f80246a) {
                return true;
            }
            if (!this.f80250e) {
                this.f80250e = true;
            }
            this.f80247b = 0.0f;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setGestureInterceptEnable(boolean z6) {
        this.f80251f = z6;
    }

    public final void setOnGestureCallback(@NotNull a aVar) {
    }
}

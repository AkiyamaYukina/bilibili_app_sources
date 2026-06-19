package com.bilibili.studio.editor.moudle.music.view;

import Ax.m;
import Fz0.a;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/music/view/AutoMarqueeTextView.class */
public final class AutoMarqueeTextView extends AppCompatTextView {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f107919k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f107920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f107921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f107922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f107923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public String f107924e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f107925f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f107926g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f107927i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f107928j;

    @JvmOverloads
    public AutoMarqueeTextView(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public AutoMarqueeTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public AutoMarqueeTextView(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f107923d = true;
        this.f107924e = "";
        this.f107925f = 1000L;
        this.f107926g = 1.0f;
        this.h = 50.0f;
        this.f107927i = true;
        setSingleLine();
        post(new m(this));
    }

    public static void J(AutoMarqueeTextView autoMarqueeTextView) {
        long j7 = autoMarqueeTextView.f107925f;
        autoMarqueeTextView.f107921b = 0.0f;
        autoMarqueeTextView.f107922c = autoMarqueeTextView.f107920a + autoMarqueeTextView.h;
        autoMarqueeTextView.postDelayed(new a(autoMarqueeTextView, 0), j7);
    }

    public final void K() {
        this.f107923d = false;
        this.f107921b = 0.0f;
        this.f107922c = this.f107920a + this.h;
        invalidate();
    }

    public final float getDistance() {
        return this.h;
    }

    public final int getGravityValue() {
        return this.f107928j;
    }

    public final float getScrollTile() {
        return this.f107926g;
    }

    public final long getWaitTime() {
        return this.f107925f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        if (!this.f107927i) {
            super.onDraw(canvas);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = getPaint().getFontMetricsInt();
        int height = ((getHeight() - fontMetricsInt.bottom) - fontMetricsInt.top) / 2;
        float width = 0.0f;
        if (this.f107920a <= getWidth()) {
            if (this.f107928j != 1) {
                width = (getWidth() / 2) - (this.f107920a / 2);
            }
            canvas.drawText(this.f107924e, width, height, getPaint());
            return;
        }
        float f7 = height;
        canvas.drawText(this.f107924e, this.f107921b, f7, getPaint());
        canvas.drawText(this.f107924e, this.f107922c, f7, getPaint());
        if (this.f107923d) {
            float f8 = this.f107921b;
            float f9 = this.f107926g;
            this.f107921b = f8 - f9;
            float f10 = this.f107922c - f9;
            this.f107922c = f10;
            if (f10 <= 0.0f) {
                J(this);
            } else {
                invalidate();
            }
        }
    }

    public final void setDistance(float f7) {
        this.h = f7;
    }

    public final void setEnable(boolean z6) {
        this.f107927i = z6;
    }

    public final void setGravityValue(int i7) {
        this.f107928j = i7;
    }

    public final void setScrollTile(float f7) {
        this.f107926g = f7;
    }

    @Override // android.widget.TextView
    public final void setText(@Nullable CharSequence charSequence, @Nullable TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        if (charSequence == null) {
            this.f107924e = "";
        } else {
            this.f107924e = charSequence.toString();
            this.f107920a = getPaint().measureText(charSequence.toString());
        }
        if (this.f107923d) {
            J(this);
        } else {
            K();
        }
    }

    @Override // android.widget.TextView
    public void setTextColor(int i7) {
        super.setTextColor(i7);
        getPaint().setColor(i7);
        if (this.f107923d) {
            J(this);
        } else {
            K();
        }
    }

    public final void setWaitTime(long j7) {
        this.f107925f = j7;
    }
}

package com.bilibili.playerbizcommonv2.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.droid.DimenUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/view/PlayerSwitch.class */
@StabilityInferred(parameters = 0)
public final class PlayerSwitch extends View implements Checkable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f82079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f82080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f82081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f82082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Paint f82083g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f82084i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f82085j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f82086k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82087l;

    public PlayerSwitch(@NotNull Context context) {
        this(context, null);
    }

    public PlayerSwitch(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f82079c = DimenUtilsKt.dpToPx(22.0f);
        this.f82080d = DimenUtilsKt.dpToPx(10.0f);
        this.f82081e = DimenUtilsKt.dpToPx(15.0f);
        this.f82082f = DimenUtilsKt.dpToPx(7.0f);
        this.f82083g = new Paint(5);
        setBackground(null);
    }

    public final void a(int i7, int i8, int i9, int i10) {
        this.f82084i = i7;
        this.f82085j = i8;
        this.f82086k = i9;
        this.f82087l = i10;
        invalidate();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h;
    }

    @Override // android.view.View
    public final void onDraw(@NotNull Canvas canvas) {
        super.onDraw(canvas);
        int i7 = this.f82077a;
        int i8 = this.f82078b;
        if (this.h) {
            this.f82083g.setColor(this.f82084i);
            float f7 = i8;
            float f8 = this.f82077a;
            float f9 = this.f82081e;
            canvas.drawRoundRect(0.0f, 0.0f, f7, f8, f9, f9, this.f82083g);
            this.f82083g.setColor(this.f82086k);
            canvas.drawCircle(this.f82079c, i7 / 2.0f, this.f82082f, this.f82083g);
            return;
        }
        this.f82083g.setColor(this.f82085j);
        float f10 = i8;
        float f11 = this.f82077a;
        float f12 = this.f82081e;
        canvas.drawRoundRect(0.0f, 0.0f, f10, f11, f12, f12, this.f82083g);
        this.f82083g.setColor(this.f82087l);
        canvas.drawCircle(this.f82080d, i7 / 2.0f, this.f82082f, this.f82083g);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.h);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        super.onMeasure(i7, i8);
        this.f82077a = getMeasuredHeight();
        this.f82078b = getMeasuredWidth();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        this.h = z6;
        invalidate();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.h);
    }
}

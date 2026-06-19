package com.bilibili.playerbizcommonv2.widget.popup;

import I3.C2203b1;
import I3.C2207c1;
import I3.C2211d1;
import I3.C2215e1;
import I3.C2219f1;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bilibili.magicasakura.widgets.Tintable;
import ir0.C7613b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.NewPlayerUtilsKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/popup/BubbleBackgroundConstraintLayout.class */
@StabilityInferred(parameters = 0)
public class BubbleBackgroundConstraintLayout extends ConstraintLayout implements Tintable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f82600o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f82601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f82602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f82603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f82604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f82605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f82606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f82607g;
    public float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82608i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f82609j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f82610k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f82611l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final Lazy f82612m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f82613n;

    @JvmOverloads
    public BubbleBackgroundConstraintLayout(@NotNull Context context) {
        this(context, null, 6, 0);
    }

    @JvmOverloads
    public BubbleBackgroundConstraintLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BubbleBackgroundConstraintLayout(Context context, AttributeSet attributeSet, int i7, int i8) {
        attributeSet = (i7 & 2) != 0 ? null : attributeSet;
        super(context, attributeSet, 0);
        this.f82601a = 8.0f;
        this.f82602b = -7829368;
        this.f82603c = 8.0f;
        this.f82606f = 2.0f;
        this.f82607g = 24.0f;
        this.h = 18.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7613b.f122195a, 0, 0);
        setMCornerRadius(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, NewPlayerUtilsKt.toPx(4)));
        setMTriangleHorizonCenterPosition(typedArrayObtainStyledAttributes.getDimensionPixelSize(5, NewPlayerUtilsKt.toPx(4)));
        setMTriangleVerticalLocation(typedArrayObtainStyledAttributes.getInt(6, 0));
        setMRenderStrokeWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, NewPlayerUtilsKt.toPx(1)));
        setMTriangleWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(7, NewPlayerUtilsKt.toPx(12)));
        setMTriangleHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(4, NewPlayerUtilsKt.toPx(9)));
        setMRenderColor(typedArrayObtainStyledAttributes.getColor(1, -7829368));
        setMRenderMode(typedArrayObtainStyledAttributes.getInt(2, 0));
        typedArrayObtainStyledAttributes.recycle();
        this.f82609j = LazyKt.lazy(new C2203b1(8));
        this.f82610k = LazyKt.lazy(new C2207c1(10));
        this.f82611l = LazyKt.lazy(new C2211d1(8));
        this.f82612m = LazyKt.lazy(new C2215e1(8));
        this.f82613n = LazyKt.lazy(new C2219f1(8));
    }

    private final Paint getMErase() {
        return (Paint) this.f82609j.getValue();
    }

    private final Paint getMPaint() {
        return (Paint) this.f82613n.getValue();
    }

    private final RectF getMRectF() {
        return (RectF) this.f82612m.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c  */
    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dispatchDraw(@org.jetbrains.annotations.NotNull android.graphics.Canvas r8) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.popup.BubbleBackgroundConstraintLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final float getMCornerRadius() {
        return this.f82601a;
    }

    @NotNull
    public final Path getMPath() {
        return (Path) this.f82611l.getValue();
    }

    public final int getMRenderColor() {
        return this.f82602b;
    }

    public final int getMRenderMode() {
        return this.f82605e;
    }

    public final float getMRenderStrokeWidth() {
        return this.f82606f;
    }

    public final float getMTriangleHeight() {
        return this.h;
    }

    public final float getMTriangleHorizonCenterPosition() {
        return this.f82603c;
    }

    @NotNull
    public final Path getMTrianglePath() {
        return (Path) this.f82610k.getValue();
    }

    public final int getMTriangleVerticalLocation() {
        return this.f82604d;
    }

    public final float getMTriangleWidth() {
        return this.f82607g;
    }

    public final boolean getToErase() {
        return this.f82608i;
    }

    public final void setMCornerRadius(float f7) {
        this.f82601a = f7;
        invalidate();
    }

    public final void setMRenderColor(int i7) {
        this.f82602b = i7;
        invalidate();
    }

    public final void setMRenderMode(int i7) {
        this.f82605e = i7;
        invalidate();
    }

    public final void setMRenderStrokeWidth(float f7) {
        this.f82606f = f7;
        invalidate();
    }

    public final void setMTriangleHeight(float f7) {
        this.h = f7;
        invalidate();
    }

    public final void setMTriangleHorizonCenterPosition(float f7) {
        this.f82603c = f7;
        invalidate();
    }

    public final void setMTriangleVerticalLocation(int i7) {
        this.f82604d = i7;
        invalidate();
    }

    public final void setMTriangleWidth(float f7) {
        this.f82607g = f7;
        invalidate();
    }

    public final void setToErase(boolean z6) {
        this.f82608i = z6;
        invalidate();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, com.bilibili.magicasakura.widgets.Tintable
    public final void tint() {
    }
}

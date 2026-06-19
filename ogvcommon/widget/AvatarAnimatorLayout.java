package com.bilibili.ogvcommon.widget;

import Uj0.c;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alipay.sdk.app.PayTask;
import com.bilibili.ogvcommon.widget.AvatarAnimatorLayout;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/widget/AvatarAnimatorLayout.class */
@StabilityInferred(parameters = 0)
public final class AvatarAnimatorLayout extends ViewGroup {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f73362f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f73365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f73366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ValueAnimator f73367e;

    @JvmOverloads
    public AvatarAnimatorLayout(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public AvatarAnimatorLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        int iB = c.b(24.0f, context);
        int iA = (int) c.a(-6.0f, context);
        this.f73363a = iB;
        this.f73364b = iA;
        this.f73365c = 3;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 3.0f);
        this.f73367e = valueAnimatorOfFloat;
        setChildrenDrawingOrderEnabled(true);
        valueAnimatorOfFloat.setDuration(PayTask.f60018j);
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, booleanRef) { // from class: Wl0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AvatarAnimatorLayout f26925a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Ref.BooleanRef f26926b;

            {
                this.f26925a = this;
                this.f26926b = booleanRef;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                AvatarAnimatorLayout avatarAnimatorLayout = this.f26925a;
                Ref.BooleanRef booleanRef2 = this.f26926b;
                int i7 = AvatarAnimatorLayout.f73362f;
                if (avatarAnimatorLayout.getChildCount() <= avatarAnimatorLayout.f73365c) {
                    return;
                }
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue >= 0.15f) {
                    if (booleanRef2.element) {
                        return;
                    }
                    avatarAnimatorLayout.a(0.15f);
                    avatarAnimatorLayout.getChildAt(avatarAnimatorLayout.f73366d).setAlpha(0.0f);
                    avatarAnimatorLayout.f73366d = (avatarAnimatorLayout.f73366d + 1) % avatarAnimatorLayout.getChildCount();
                    booleanRef2.element = true;
                    return;
                }
                booleanRef2.element = false;
                View childAt = avatarAnimatorLayout.getChildAt((avatarAnimatorLayout.f73366d + avatarAnimatorLayout.f73365c) % avatarAnimatorLayout.getChildCount());
                childAt.setAlpha(1.0f);
                int i8 = avatarAnimatorLayout.f73363a;
                childAt.layout(0, 0, i8, i8);
                avatarAnimatorLayout.a(fFloatValue);
                avatarAnimatorLayout.getChildAt(avatarAnimatorLayout.f73366d).setAlpha(1 - (fFloatValue / 0.15f));
            }
        });
        valueAnimatorOfFloat.setRepeatCount(-1);
    }

    public final void a(float f7) {
        int i7 = this.f73363a;
        int i8 = this.f73364b;
        int i9 = this.f73365c;
        int i10 = 0;
        while (i10 < i9) {
            View childAt = getChildAt((this.f73366d + i10) % getChildCount());
            childAt.setAlpha(1.0f);
            int right = getRight();
            int left = getLeft();
            int i11 = this.f73363a;
            i10++;
            int i12 = (int) ((((i7 + i8) * f7) / 0.15f) + ((right - left) - ((this.f73364b + i11) * i10)));
            childAt.layout(i12 - i11, 0, i12, i11);
        }
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return (((i7 - i8) + this.f73366d) - 1) % i7;
    }

    public final int getItemSize() {
        return this.f73363a;
    }

    public final int getMaxVisibleCount() {
        return this.f73365c;
    }

    public final int getSpacing() {
        return this.f73364b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f73367e.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f73367e.cancel();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11 = getChildCount() > this.f73365c ? this.f73363a + this.f73364b : 0;
        int iCoerceAtMost = RangesKt.coerceAtMost(getChildCount(), this.f73365c);
        for (int i12 = 0; i12 < iCoerceAtMost; i12++) {
            View childAt = getChildAt(i12);
            int i13 = this.f73363a;
            int i14 = (((i9 - i11) - (i12 * i13)) - (this.f73364b * i12)) - i7;
            childAt.layout(i14 - i13, 0, i14, i13);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int childCount;
        int iCoerceAtMost = RangesKt.coerceAtMost(this.f73365c, getChildCount());
        for (int i9 = 0; i9 < iCoerceAtMost; i9++) {
            View childAt = getChildAt(i9);
            int i10 = this.f73363a;
            childAt.measure(i10, i10);
        }
        int i11 = this.f73363a;
        int childCount2 = getChildCount();
        int i12 = this.f73365c;
        if (childCount2 <= i12) {
            int i13 = this.f73363a;
            childCount = ((getChildCount() - 1) * this.f73364b) + (getChildCount() * i13);
        } else {
            childCount = ((i12 + 1) * this.f73363a) + (this.f73364b * i12);
        }
        setMeasuredDimension(childCount, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        this.f73366d = 0;
    }

    public final void setItemSize(int i7) {
        this.f73363a = i7;
    }

    public final void setMaxVisibleCount(int i7) {
        this.f73365c = i7;
    }

    public final void setSpacing(int i7) {
        this.f73364b = i7;
    }
}

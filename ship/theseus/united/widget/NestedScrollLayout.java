package com.bilibili.ship.theseus.united.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.InterfaceC4571o;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.ViewCompat;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/NestedScrollLayout.class */
@StabilityInferred(parameters = 0)
public final class NestedScrollLayout extends LinearLayout implements InterfaceC4571o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NestedScrollingChildHelper f104887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f104888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f104889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final int[] f104891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final int[] f104892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f104893g;

    @Nullable
    public VelocityTracker h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final a f104894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public OverScroller f104895j;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/widget/NestedScrollLayout$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final NestedScrollLayout f104897b;

        public a(NestedScrollLayout nestedScrollLayout) {
            this.f104897b = nestedScrollLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            OverScroller overScroller;
            NestedScrollLayout nestedScrollLayout = this.f104897b;
            if (nestedScrollLayout.f104893g == 0) {
                return;
            }
            OverScroller overScroller2 = nestedScrollLayout.f104895j;
            int currY = 0;
            if ((overScroller2 != null && overScroller2.isFinished()) || ((overScroller = this.f104897b.f104895j) != null && !overScroller.computeScrollOffset())) {
                this.f104897b.f104893g = 0;
                return;
            }
            OverScroller overScroller3 = this.f104897b.f104895j;
            if (overScroller3 != null) {
                currY = overScroller3.getCurrY();
            }
            int i7 = currY - this.f104896a;
            this.f104896a = currY;
            NestedScrollLayout nestedScrollLayout2 = this.f104897b;
            int i8 = i7;
            if (nestedScrollLayout2.f104887a.dispatchNestedPreScroll(0, i7, nestedScrollLayout2.f104891e, nestedScrollLayout2.f104892f, 1)) {
                i8 = i7 - this.f104897b.f104891e[1];
            }
            if (i8 != 0) {
                NestedScrollLayout nestedScrollLayout3 = this.f104897b;
                nestedScrollLayout3.dispatchNestedScroll(0, nestedScrollLayout3.f104891e[1], 0, i8, nestedScrollLayout3.f104892f, 1);
            }
            ViewCompat.postOnAnimation(this.f104897b, this);
        }
    }

    @JvmOverloads
    public NestedScrollLayout(@NotNull Context context) {
        this(context, null, 6);
    }

    @JvmOverloads
    public NestedScrollLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public NestedScrollLayout(Context context, AttributeSet attributeSet, int i7) {
        super(context, (i7 & 2) != 0 ? null : attributeSet, 0);
        this.f104891e = new int[2];
        this.f104892f = new int[2];
        this.f104894i = new a(this);
        this.f104888b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f104887a = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedPreScroll(int i7, int i8, @Nullable int[] iArr, @Nullable int[] iArr2, int i9) {
        return this.f104887a.dispatchNestedPreScroll(i7, i8, iArr, iArr2, i9);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @Nullable int[] iArr, int i11) {
        return this.f104887a.dispatchNestedScroll(i7, i8, i9, i10, iArr, i11);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean hasNestedScrollingParent(int i7) {
        return this.f104887a.hasNestedScrollingParent(i7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f104887a.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f104894i;
        aVar.f104897b.removeCallbacks(aVar);
        OverScroller overScroller = aVar.f104897b.f104895j;
        if (overScroller != null) {
            overScroller.abortAnimation();
        }
        aVar.f104897b.f104893g = 0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NotNull MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        int action = motionEventObtain.getAction();
        float rawY = motionEventObtain.getRawY();
        if (action == 0) {
            this.f104889c = motionEvent.getRawY();
            return false;
        }
        float yVelocity = 0.0f;
        if (action != 1) {
            if (action == 2) {
                if (Math.abs(this.f104889c - motionEvent.getRawY()) < this.f104888b) {
                    return false;
                }
                if (this.f104893g == 1) {
                    a aVar = this.f104894i;
                    aVar.f104897b.removeCallbacks(aVar);
                    OverScroller overScroller = aVar.f104897b.f104895j;
                    if (overScroller != null) {
                        overScroller.abortAnimation();
                    }
                    aVar.f104897b.f104893g = 0;
                }
                if (this.h == null) {
                    this.h = VelocityTracker.obtain();
                }
                if (!this.f104890d) {
                    this.f104890d = true;
                    startNestedScroll(2, 0);
                }
                int i7 = (int) (this.f104889c - rawY);
                this.f104889c = rawY;
                int i8 = i7;
                if (this.f104887a.dispatchNestedPreScroll(0, i7, this.f104891e, this.f104892f, 0)) {
                    i8 = i7 - this.f104891e[1];
                    motionEventObtain.offsetLocation(0.0f, -this.f104892f[1]);
                }
                VelocityTracker velocityTracker = this.h;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEventObtain);
                }
                if (i8 == 0) {
                    return false;
                }
                dispatchNestedScroll(0, this.f104891e[1], 0, i8, this.f104892f, 0);
                return false;
            }
            if (action != 3) {
                return false;
            }
        }
        VelocityTracker velocityTracker2 = this.h;
        if (velocityTracker2 != null) {
            velocityTracker2.computeCurrentVelocity(1000);
        }
        VelocityTracker velocityTracker3 = this.h;
        if (velocityTracker3 != null) {
            yVelocity = velocityTracker3.getYVelocity();
        }
        int i9 = -((int) yVelocity);
        defpackage.a.a(i9, "onFlingY: ", "NestedScrollLayout");
        if (this.f104895j == null) {
            this.f104895j = new OverScroller(getContext());
        }
        OverScroller overScroller2 = this.f104895j;
        if (overScroller2 != null) {
            overScroller2.fling(0, 0, 0, i9, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        startNestedScroll(2, 1);
        this.f104893g = 1;
        a aVar2 = this.f104894i;
        aVar2.f104896a = 0;
        ViewCompat.postOnAnimation(this, aVar2);
        VelocityTracker velocityTracker4 = this.h;
        if (velocityTracker4 != null) {
            velocityTracker4.clear();
        }
        this.f104890d = false;
        stopNestedScroll(0);
        return false;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z6) {
        this.f104887a.setNestedScrollingEnabled(z6);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean startNestedScroll(int i7, int i8) {
        return this.f104887a.startNestedScroll(i7, i8);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final void stopNestedScroll(int i7) {
        this.f104887a.stopNestedScroll(i7);
    }
}

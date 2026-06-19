package com.bilibili.ogv.review.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.InterfaceC4573q;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/widget/NonScrollableScrollView.class */
public class NonScrollableScrollView extends FrameLayout implements InterfaceC4573q, NestedScrollingChild3, ScrollingView {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f72555p = {R.attr.fillViewport};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OverScroller f72556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f72557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f72558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f72559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f72560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f72561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f72562g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f72563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int[] f72564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f72565k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f72566l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final NestedScrollingParentHelper f72567m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final NestedScrollingChildHelper f72568n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f72569o;

    public NonScrollableScrollView(@NonNull Context context) {
        this(context, null);
    }

    public NonScrollableScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 2130970358);
        this.f72558c = false;
        this.h = -1;
        this.f72563i = new int[2];
        this.f72564j = new int[2];
        this.f72556a = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f72560e = viewConfiguration.getScaledTouchSlop();
        this.f72561f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f72562g = viewConfiguration.getScaledMaximumFlingVelocity();
        context.obtainStyledAttributes(attributeSet, f72555p, 2130970358, 0).recycle();
        this.f72567m = new NestedScrollingParentHelper(this);
        this.f72568n = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f72569o == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f72569o = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f72569o;
    }

    public final void a(int i7, int i8, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i7);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f72568n.dispatchNestedScroll(0, scrollY2, 0, i7 - scrollY2, null, i8, iArr);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i7, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    public final void b(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.h) {
            int i7 = actionIndex == 0 ? 1 : 0;
            this.f72557b = (int) motionEvent.getY(i7);
            this.h = motionEvent.getPointerId(i7);
            VelocityTracker velocityTracker = this.f72559d;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean c(int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, boolean z6) {
        int i15;
        boolean z7;
        boolean z8;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i16 = i10 + i8;
        if (i9 <= 0 && i9 >= 0) {
            i15 = i9;
            z7 = false;
        } else {
            z7 = true;
            i15 = 0;
        }
        if (i16 > i12) {
            i16 = i12;
            z8 = true;
        } else if (i16 < 0) {
            z8 = true;
            i16 = 0;
        } else {
            z8 = false;
        }
        if (z8 && !this.f72568n.hasNestedScrollingParent(1)) {
            this.f72556a.springBack(i15, i16, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i15, i16);
        boolean z9 = true;
        if (!z7) {
            z9 = z8;
        }
        return z9;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.f72556a.isFinished()) {
            return;
        }
        this.f72556a.computeScrollOffset();
        int currY = this.f72556a.getCurrY();
        int i7 = currY - this.f72566l;
        this.f72566l = currY;
        int[] iArr = this.f72564j;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i7, iArr, null, 1);
        int i8 = i7 - this.f72564j[1];
        int scrollRange = getScrollRange();
        int i9 = i8;
        if (i8 != 0) {
            int scrollY = getScrollY();
            c(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i10 = i8 - scrollY2;
            int[] iArr2 = this.f72564j;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i10, this.f72563i, 1, iArr2);
            i9 = i10 - this.f72564j[1];
        }
        if (i9 != 0) {
            this.f72556a.abortAnimation();
            stopNestedScroll(1);
        }
        if (this.f72556a.isFinished()) {
            stopNestedScroll(1);
        } else {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public final int computeVerticalScrollRange() {
        int i7;
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            i7 = bottom - scrollY;
        } else {
            i7 = bottom;
            if (scrollY > iMax) {
                i7 = bottom + (scrollY - iMax);
            }
        }
        return i7;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f72568n.dispatchNestedFling(f7, f8, z6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f72568n.dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f72568n.dispatchNestedPreScroll(i7, i8, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild3, androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2, int i9) {
        return this.f72568n.dispatchNestedPreScroll(i7, i8, iArr, iArr2, i9);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public final void dispatchNestedScroll(int i7, int i8, int i9, int i10, @Nullable int[] iArr, int i11, @NonNull int[] iArr2) {
        this.f72568n.dispatchNestedScroll(i7, i8, i9, i10, iArr, i11, iArr2);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f72568n.dispatchNestedScroll(i7, i8, i9, i10, iArr);
    }

    @Override // androidx.core.view.NestedScrollingChild3, androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr, int i11) {
        return this.f72568n.dispatchNestedScroll(i7, i8, i9, i10, iArr, i11);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f72567m.getNestedScrollAxes();
    }

    public int getScrollRange() {
        int iMax = 0;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            iMax = Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return iMax;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean hasNestedScrollingParent() {
        return this.f72568n.hasNestedScrollingParent(0);
    }

    @Override // androidx.core.view.NestedScrollingChild3, androidx.core.view.InterfaceC4571o
    public final boolean hasNestedScrollingParent(int i7) {
        return this.f72568n.hasNestedScrollingParent(i7);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f72568n.isNestedScrollingEnabled();
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || this.f72558c) {
            return false;
        }
        float axisValue = motionEvent.getAxisValue(9);
        if (axisValue == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
        int scrollRange = getScrollRange();
        int scrollY = getScrollY();
        int i7 = scrollY - verticalScrollFactorCompat;
        if (i7 < 0) {
            scrollRange = 0;
        } else if (i7 <= scrollRange) {
            scrollRange = i7;
        }
        if (scrollRange == scrollY) {
            return false;
        }
        super.scrollTo(getScrollX(), scrollRange);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0198  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.widget.NonScrollableScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(@NonNull View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(@NonNull View view, float f7, float f8) {
        return this.f72568n.dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(@NonNull View view, int i7, int i8, @NonNull int[] iArr) {
        dispatchNestedPreScroll(i7, i8, iArr, null, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedPreScroll(@NonNull View view, int i7, int i8, @NonNull int[] iArr, int i9) {
        dispatchNestedPreScroll(i7, i8, iArr, null, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(@NonNull View view, int i7, int i8, int i9, int i10) {
        a(i10, 0, null);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScroll(@NonNull View view, int i7, int i8, int i9, int i10, int i11) {
        a(i10, i11, null);
    }

    @Override // androidx.core.view.InterfaceC4573q
    public final void onNestedScroll(@NonNull View view, int i7, int i8, int i9, int i10, int i11, @NonNull int[] iArr) {
        a(i10, i11, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i7, int i8) {
        this.f72567m.onNestedScrollAccepted(view, view2, i7, i8);
        startNestedScroll(2, i8);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i7, int i8, boolean z6, boolean z7) {
        super.scrollTo(i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i7, int i8) {
        return (i7 & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onStopNestedScroll(@NonNull View view, int i7) {
        this.f72567m.onStopNestedScroll(view, i7);
        stopNestedScroll(i7);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f72559d == null) {
            this.f72559d = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f72565k = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f72565k);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f72559d;
                velocityTracker.computeCurrentVelocity(1000, this.f72562g);
                int yVelocity = (int) velocityTracker.getYVelocity(this.h);
                if (Math.abs(yVelocity) >= this.f72561f) {
                    float f7 = -yVelocity;
                    if (!this.f72568n.dispatchNestedPreFling(0.0f, f7)) {
                        dispatchNestedFling(0.0f, f7, true);
                    }
                } else if (this.f72556a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.h = -1;
                this.f72558c = false;
                VelocityTracker velocityTracker2 = this.f72559d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f72559d = null;
                }
                stopNestedScroll(0);
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.h);
                if (iFindPointerIndex == -1) {
                    BLog.e("NestedScrollView", "Invalid pointerId=" + this.h + " in onTouchEvent");
                } else {
                    int y6 = (int) motionEvent.getY(iFindPointerIndex);
                    int i7 = this.f72557b;
                    motionEvent.getX(iFindPointerIndex);
                    getWidth();
                    getHeight();
                    int iRound = Math.round(getHeight() * 0.0f);
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i8 = (i7 - y6) - iRound;
                    int i9 = i8;
                    if (!this.f72558c) {
                        i9 = i8;
                        if (Math.abs(i8) > this.f72560e) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f72558c = true;
                            i9 = i8 > 0 ? i8 - this.f72560e : i8 + this.f72560e;
                        }
                    }
                    if (this.f72558c) {
                        int i10 = i9;
                        if (this.f72568n.dispatchNestedPreScroll(0, i9, this.f72564j, this.f72563i, 0)) {
                            i10 = i9 - this.f72564j[1];
                            this.f72565k += this.f72563i[1];
                        }
                        this.f72557b = y6 - this.f72563i[1];
                        int scrollY = getScrollY();
                        boolean z6 = c(0, i10, 0, getScrollY(), 0, getScrollRange(), 0, 0, true) && !this.f72568n.hasNestedScrollingParent(0);
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f72564j;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i10 - scrollY2, this.f72563i, 0, iArr);
                        int i11 = this.f72557b;
                        int i12 = this.f72563i[1];
                        this.f72557b = i11 - i12;
                        this.f72565k += i12;
                        if (z6) {
                            this.f72559d.clear();
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f72558c && getChildCount() > 0 && this.f72556a.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.h = -1;
                this.f72558c = false;
                VelocityTracker velocityTracker3 = this.f72559d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f72559d = null;
                }
                stopNestedScroll(0);
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f72557b = (int) motionEvent.getY(actionIndex);
                this.h = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                b(motionEvent);
                this.f72557b = (int) motionEvent.getY(motionEvent.findPointerIndex(this.h));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f72558c && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f72556a.isFinished()) {
                this.f72556a.abortAnimation();
                stopNestedScroll(1);
            }
            this.f72557b = (int) motionEvent.getY();
            this.h = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f72559d;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z6) {
        VelocityTracker velocityTracker;
        if (z6 && (velocityTracker = this.f72559d) != null) {
            velocityTracker.recycle();
            this.f72559d = null;
        }
        super.requestDisallowInterceptTouchEvent(z6);
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        int i9;
        int i10;
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i7 < 0) {
                i9 = 0;
            } else {
                i9 = i7;
                if (width + i7 > width2) {
                    i9 = width2 - width;
                }
            }
            if (height >= height2 || i8 < 0) {
                i10 = 0;
            } else {
                i10 = i8;
                if (height + i8 > height2) {
                    i10 = height2 - height;
                }
            }
            if (i9 == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i9, i10);
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z6) {
        this.f72568n.setNestedScrollingEnabled(z6);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean startNestedScroll(int i7) {
        return this.f72568n.startNestedScroll(i7, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild3, androidx.core.view.InterfaceC4571o
    public final boolean startNestedScroll(int i7, int i8) {
        return this.f72568n.startNestedScroll(i7, i8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.NestedScrollingChild3, androidx.core.view.InterfaceC4571o
    public final void stopNestedScroll(int i7) {
        this.f72568n.stopNestedScroll(i7);
    }
}

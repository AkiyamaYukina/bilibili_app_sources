package com.bilibili.studio.videoeditor.bgm.bgmlist;

import S9.r;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.C3259x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import com.bilibili.studio.videoeditor.bgm.bgmlist.BgmListActivity;
import com.bilibili.studio.videoeditor.util.V;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior.class */
public class BgmListSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f108959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f108962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f108963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f108964g;

    @Nullable
    public ViewDragHelper h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f108965i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f108966j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f108967k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f108968l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public WeakReference<V> f108969m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f108970n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public c f108971o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public VelocityTracker f108972p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f108973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f108974r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f108975s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f108976t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f108977u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f108978v;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$SavedState.class */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f108979a;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$SavedState$a.class */
        public final class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcel parcel, @Nullable ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f108979a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, int i7) {
            super(parcelable);
            this.f108979a = i7;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.f108979a);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$a.class */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f108980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f108981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BgmListSheetBehavior f108982c;

        public a(BgmListSheetBehavior bgmListSheetBehavior, View view, int i7) {
            this.f108982c = bgmListSheetBehavior;
            this.f108980a = view;
            this.f108981b = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f108982c.startSettlingAnimation(this.f108980a, this.f108981b);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$b.class */
    public final class b extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BgmListSheetBehavior f108983a;

        public b(BgmListSheetBehavior bgmListSheetBehavior) {
            this.f108983a = bgmListSheetBehavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i7, int i8) {
            BgmListSheetBehavior bgmListSheetBehavior = this.f108983a;
            return MathUtils.clamp(i7, bgmListSheetBehavior.f108960c, bgmListSheetBehavior.f108962e ? bgmListSheetBehavior.f108968l : bgmListSheetBehavior.f108961d);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(View view) {
            int i7;
            int i8;
            BgmListSheetBehavior bgmListSheetBehavior = this.f108983a;
            if (bgmListSheetBehavior.f108962e) {
                i7 = bgmListSheetBehavior.f108968l;
                i8 = bgmListSheetBehavior.f108960c;
            } else {
                i7 = bgmListSheetBehavior.f108961d;
                i8 = bgmListSheetBehavior.f108960c;
            }
            return i7 - i8;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i7) {
            if (i7 == 1) {
                this.f108983a.setStateInternal(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
            this.f108983a.dispatchOnSlide(i8);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f7, float f8) {
            int i7;
            int i8 = 3;
            BgmListSheetBehavior bgmListSheetBehavior = this.f108983a;
            if (f8 < 0.0f) {
                i7 = bgmListSheetBehavior.f108976t;
            } else if (bgmListSheetBehavior.f108962e && bgmListSheetBehavior.shouldHide(view)) {
                i7 = bgmListSheetBehavior.f108968l;
                i8 = 5;
            } else {
                if (f8 == 0.0f) {
                    int top = view.getTop();
                    if (Math.abs(top - bgmListSheetBehavior.f108960c) < Math.abs(top - bgmListSheetBehavior.f108961d)) {
                        i7 = bgmListSheetBehavior.f108976t;
                    } else {
                        i7 = bgmListSheetBehavior.f108961d;
                    }
                } else {
                    i7 = bgmListSheetBehavior.f108961d;
                }
                i8 = 4;
            }
            ViewDragHelper viewDragHelper = bgmListSheetBehavior.h;
            if (viewDragHelper == null || !viewDragHelper.settleCapturedViewAt(view.getLeft(), i7)) {
                bgmListSheetBehavior.setStateInternal(i8);
            } else {
                bgmListSheetBehavior.setStateInternal(2);
                ViewCompat.postOnAnimation(view, new d(bgmListSheetBehavior, view, i8));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i7) {
            View view2;
            BgmListSheetBehavior bgmListSheetBehavior = this.f108983a;
            int i8 = bgmListSheetBehavior.f108964g;
            if (i8 == 1 || bgmListSheetBehavior.f108975s) {
                return false;
            }
            if (i8 == 3 && bgmListSheetBehavior.f108973q == i7 && (view2 = bgmListSheetBehavior.f108970n.get()) != null && view2.canScrollVertically(-1)) {
                return false;
            }
            WeakReference<V> weakReference = bgmListSheetBehavior.f108969m;
            boolean z6 = false;
            if (weakReference != null) {
                z6 = false;
                if (weakReference.get() == view) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$c.class */
    public static abstract class c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bgm/bgmlist/BgmListSheetBehavior$d.class */
    public final class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f108984a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f108985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final BgmListSheetBehavior f108986c;

        public d(BgmListSheetBehavior bgmListSheetBehavior, View view, int i7) {
            this.f108986c = bgmListSheetBehavior;
            this.f108984a = view;
            this.f108985b = i7;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewDragHelper viewDragHelper = this.f108986c.h;
            if (viewDragHelper == null || !viewDragHelper.continueSettling(true)) {
                this.f108986c.setStateInternal(this.f108985b);
            } else {
                ViewCompat.postOnAnimation(this.f108984a, this);
            }
        }
    }

    public BgmListSheetBehavior() {
        this.f108964g = 4;
        this.f108978v = new b(this);
    }

    public BgmListSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108964g = 4;
        this.f108978v = new b(this);
        setPeekHeight(-1);
        setHideable(true);
        setSkipCollapsed(false);
        int iA = V.a(2131165455, context);
        this.f108976t = iA;
        this.f108977u = (context.getResources().getDisplayMetrics().heightPixels / 2) - iA;
    }

    public static <V extends View> BgmListSheetBehavior<V> from(V v7) {
        ViewGroup.LayoutParams layoutParams = v7.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof BgmListSheetBehavior) {
            return (BgmListSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private void reset() {
        this.f108973q = -1;
        VelocityTracker velocityTracker = this.f108972p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f108972p = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHide(View view) {
        return this.f108963f || view.getTop() >= this.f108977u;
    }

    public void dispatchOnSlide(int i7) {
        c cVar;
        WeakReference<V> weakReference = this.f108969m;
        if ((weakReference == null ? null : weakReference.get()) == null || (cVar = this.f108971o) == null) {
            return;
        }
        if (i7 > this.f108961d) {
            ((BgmListActivity.a) cVar).f108957a.f108945E.setAlpha(1.0f - ((i7 - r0) / (this.f108968l - r0)));
        } else {
            ((BgmListActivity.a) cVar).f108957a.f108945E.setAlpha(1.0f);
        }
    }

    @Nullable
    @VisibleForTesting
    public View findScrollingChild(View view) {
        if (ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i7));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    public final int getPeekHeight() {
        return this.f108959b ? -1 : this.f108958a;
    }

    public boolean getSkipCollapsed() {
        return this.f108963f;
    }

    public final int getState() {
        return this.f108964g;
    }

    public boolean isHideable() {
        return this.f108962e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.f108972p == null) {
            this.f108972p = VelocityTracker.obtain();
        }
        this.f108972p.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x6 = (int) motionEvent.getX();
            this.f108974r = (int) motionEvent.getY();
            WeakReference<View> weakReference = this.f108970n;
            View view = weakReference != null ? weakReference.get() : null;
            if (view != null && coordinatorLayout.isPointInChildBounds(view, x6, this.f108974r)) {
                this.f108973q = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f108975s = true;
            }
            this.f108965i = this.f108973q == -1 && !coordinatorLayout.isPointInChildBounds(v7, x6, this.f108974r);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f108975s = false;
            this.f108973q = -1;
            if (this.f108965i) {
                this.f108965i = false;
                return false;
            }
        }
        if (!this.f108965i && (viewDragHelper = this.h) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f108970n;
        View view2 = null;
        if (weakReference2 != null) {
            view2 = weakReference2.get();
        }
        boolean z6 = false;
        if (actionMasked == 2) {
            z6 = false;
            if (view2 != null) {
                z6 = false;
                if (!this.f108965i) {
                    z6 = false;
                    if (this.f108964g != 1) {
                        z6 = false;
                        if (!coordinatorLayout.isPointInChildBounds(view2, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            z6 = false;
                            if (this.h != null) {
                                z6 = false;
                                if (r.a(motionEvent, this.f108974r) > this.h.getTouchSlop()) {
                                    z6 = true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        if (ViewCompat.getFitsSystemWindows(coordinatorLayout) && !ViewCompat.getFitsSystemWindows(v7)) {
            ViewCompat.setFitsSystemWindows(v7, true);
        }
        int top = v7.getTop();
        coordinatorLayout.onLayoutChild(v7, i7);
        int height = coordinatorLayout.getHeight();
        this.f108968l = height;
        boolean z6 = this.f108959b;
        int i8 = this.f108976t;
        int iMax = z6 ? Math.max(0, height - i8) : this.f108958a;
        int iMax2 = Math.max(0, this.f108968l - v7.getHeight());
        this.f108960c = iMax2;
        int iMax3 = Math.max(this.f108968l - iMax, iMax2);
        this.f108961d = iMax3;
        int i9 = this.f108964g;
        if (i9 == 3) {
            ViewCompat.offsetTopAndBottom(v7, i8);
        } else if (this.f108962e && i9 == 5) {
            ViewCompat.offsetTopAndBottom(v7, this.f108968l);
        } else if (i9 == 4) {
            ViewCompat.offsetTopAndBottom(v7, iMax3);
        } else if (i9 == 1 || i9 == 2) {
            ViewCompat.offsetTopAndBottom(v7, top - v7.getTop());
        }
        if (this.h == null) {
            this.h = ViewDragHelper.create(coordinatorLayout, this.f108978v);
        }
        this.f108969m = new WeakReference<>(v7);
        this.f108970n = new WeakReference<>(findScrollingChild(v7));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v7, View view, float f7, float f8) {
        int i7;
        View view2 = this.f108970n.get();
        return view2 != null && view.getTop() < view2.getTop() && (!((i7 = this.f108964g) == 3 || i7 == 4) || super.onNestedPreFling(coordinatorLayout, v7, view, f7, f8));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr) {
        WeakReference<View> weakReference = this.f108970n;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 == null || view == view2) {
            int top = v7.getTop();
            int i9 = top - i8;
            int i10 = this.f108976t;
            if (i8 > 0) {
                if (v7.getTop() != i10 || !view.canScrollVertically(1)) {
                    int i11 = this.f108960c;
                    if (i9 < i11) {
                        int i12 = top - i11;
                        iArr[1] = i12;
                        ViewCompat.offsetTopAndBottom(v7, -i12);
                        setStateInternal(3);
                    } else {
                        iArr[1] = i8;
                        ViewCompat.offsetTopAndBottom(v7, -i8);
                        setStateInternal(1);
                    }
                }
            } else if (i8 < 0 && (v7.getTop() != i10 || !view.canScrollVertically(-1))) {
                int i13 = this.f108961d;
                if (i9 <= i13 || this.f108962e) {
                    iArr[1] = i8;
                    ViewCompat.offsetTopAndBottom(v7, -i8);
                    setStateInternal(1);
                } else {
                    int i14 = top - i13;
                    iArr[1] = i14;
                    ViewCompat.offsetTopAndBottom(v7, -i14);
                    setStateInternal(4);
                }
            }
            this.f108966j = i8;
            this.f108967k = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v7, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v7, savedState.getSuperState());
        int i7 = savedState.f108979a;
        if (i7 == 1 || i7 == 2) {
            this.f108964g = 4;
        } else {
            this.f108964g = i7;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v7) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v7), this.f108964g);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v7, View view, View view2, int i7) {
        boolean z6 = false;
        this.f108966j = 0;
        this.f108967k = false;
        if ((i7 & 2) != 0) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v7, View view) {
        int i7;
        if (this.f108967k) {
            if (v7.getTop() > this.f108977u) {
                startSettlingAnimation(v7, 5);
                return;
            }
            int i8 = 4;
            if (this.f108966j == 0) {
                int top = v7.getTop();
                if (Math.abs(top - this.f108960c) < Math.abs(top - this.f108961d)) {
                    i7 = this.f108961d;
                    i8 = 3;
                } else {
                    i7 = this.f108961d;
                }
            } else {
                i7 = this.f108961d;
            }
            ViewDragHelper viewDragHelper = this.h;
            if (viewDragHelper == null || !viewDragHelper.smoothSlideViewTo(v7, v7.getLeft(), i7)) {
                setStateInternal(i8);
            } else {
                setStateInternal(2);
                ViewCompat.postOnAnimation(v7, new d(this, v7, i8));
            }
            this.f108967k = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        if (!v7.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f108964g == 1 && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.h;
        if (viewDragHelper != null) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.f108972p == null) {
            this.f108972p = VelocityTracker.obtain();
        }
        this.f108972p.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f108965i && this.h != null && r.a(motionEvent, this.f108974r) > this.h.getTouchSlop()) {
            this.h.captureChildView(v7, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f108965i;
    }

    public void setBottomSheetCallback(c cVar) {
        this.f108971o = cVar;
    }

    public void setHideable(boolean z6) {
        this.f108962e = z6;
    }

    public final void setPeekHeight(int i7) {
        boolean z6;
        WeakReference<V> weakReference;
        V v7;
        if (i7 == -1) {
            if (this.f108959b) {
                z6 = false;
            } else {
                this.f108959b = true;
                z6 = true;
            }
            this.f108958a = 50;
        } else if (this.f108959b || this.f108958a != i7) {
            this.f108959b = false;
            this.f108958a = Math.max(0, i7);
            this.f108961d = this.f108968l - i7;
            z6 = true;
        } else {
            z6 = false;
        }
        if (!z6 || this.f108964g != 4 || (weakReference = this.f108969m) == null || (v7 = weakReference.get()) == null) {
            return;
        }
        v7.requestLayout();
    }

    public void setSkipCollapsed(boolean z6) {
        this.f108963f = z6;
    }

    public final void setState(int i7) {
        if (i7 == this.f108964g) {
            return;
        }
        WeakReference<V> weakReference = this.f108969m;
        if (weakReference == null) {
            if (i7 == 4 || i7 == 3 || (this.f108962e && i7 == 5)) {
                this.f108964g = i7;
                return;
            }
            return;
        }
        V v7 = weakReference.get();
        if (v7 == null) {
            return;
        }
        ViewParent parent = v7.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(v7)) {
            v7.post(new a(this, v7, i7));
        } else {
            startSettlingAnimation(v7, i7);
        }
    }

    public void setStateInternal(int i7) {
        c cVar;
        if (this.f108964g == i7) {
            return;
        }
        this.f108964g = i7;
        WeakReference<V> weakReference = this.f108969m;
        if ((weakReference == null ? null : weakReference.get()) == null || (cVar = this.f108971o) == null) {
            return;
        }
        BgmListActivity.a aVar = (BgmListActivity.a) cVar;
        if (i7 == 5) {
            aVar.f108957a.finish();
        } else {
            aVar.getClass();
        }
    }

    public void startSettlingAnimation(View view, int i7) {
        int i8;
        if (i7 == 4) {
            i8 = this.f108961d;
        } else if (i7 == 3) {
            i8 = this.f108960c;
        } else {
            if (!this.f108962e || i7 != 5) {
                throw new IllegalArgumentException(C3259x.a(i7, "Illegal state argument: "));
            }
            i8 = this.f108968l;
        }
        ViewDragHelper viewDragHelper = this.h;
        if (viewDragHelper == null || !viewDragHelper.smoothSlideViewTo(view, view.getLeft(), i8)) {
            setStateInternal(i7);
        } else {
            setStateInternal(2);
            ViewCompat.postOnAnimation(view, new d(this, view, i7));
        }
    }
}

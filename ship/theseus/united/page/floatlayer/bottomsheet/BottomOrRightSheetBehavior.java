package com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet;

import S9.r;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import cV0.i;
import com.bilibili.mobile.BLMobileHumanActionNative;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetBehavior.class */
@StabilityInferred(parameters = 0)
public final class BottomOrRightSheetBehavior extends CoordinatorLayout.Behavior<View> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f99682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final b f99683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f99685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f99686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f99687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f99688g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f99689i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f99690j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f99691k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f99692l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f99693m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f99694n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f99695o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f99696p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f99697q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final ArrayList<a> f99698r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public VelocityTracker f99699s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f99700t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f99701u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f99702v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f99703w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NotNull
    public final c f99704x;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetBehavior$a.class */
    @StabilityInferred(parameters = 1)
    public static abstract class a {
        public abstract void a(float f7);

        public abstract void b(int i7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetBehavior$b.class */
    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f99705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f99706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final i f99707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final BottomOrRightSheetBehavior f99708d;

        public b(BottomOrRightSheetBehavior bottomOrRightSheetBehavior) {
            this.f99708d = bottomOrRightSheetBehavior;
            this.f99707c = new i(1, this, bottomOrRightSheetBehavior);
        }

        public final void a(int i7) {
            View view;
            WeakReference weakReference = this.f99708d.f99696p;
            if (weakReference == null || (view = (View) weakReference.get()) == null) {
                return;
            }
            this.f99705a = i7;
            if (this.f99706b) {
                return;
            }
            ViewCompat.postOnAnimation(view, this.f99707c);
            this.f99706b = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/bottomsheet/BottomOrRightSheetBehavior$c.class */
    public static final class c extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BottomOrRightSheetBehavior f99709a;

        public c(BottomOrRightSheetBehavior bottomOrRightSheetBehavior) {
            this.f99709a = bottomOrRightSheetBehavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i7, int i8) {
            return this.f99709a.f99694n ? view.getLeft() : MathUtils.clamp(i7, 0, getViewHorizontalDragRange(view));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i7, int i8) {
            BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
            return bottomOrRightSheetBehavior.f99694n ? MathUtils.clamp(i7, bottomOrRightSheetBehavior.getExpandedOffset(), getViewVerticalDragRange(view)) : view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewHorizontalDragRange(View view) {
            BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
            return bottomOrRightSheetBehavior.f99694n ? 0 : bottomOrRightSheetBehavior.f99692l;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(View view) {
            BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
            return bottomOrRightSheetBehavior.f99694n ? bottomOrRightSheetBehavior.f99693m : 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i7) {
            if (i7 == 1) {
                BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
                if (bottomOrRightSheetBehavior.f99685d) {
                    bottomOrRightSheetBehavior.setStateInternal(1);
                }
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
            BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
            if (bottomOrRightSheetBehavior.f99694n) {
                bottomOrRightSheetBehavior.dispatchOnSlide(i8);
            } else {
                bottomOrRightSheetBehavior.dispatchOnSlide(i7);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onViewReleased(android.view.View r6, float r7, float r8) {
            /*
                Method dump skipped, instruction units count: 260
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior.c.onViewReleased(android.view.View, float, float):void");
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i7) {
            BottomOrRightSheetBehavior bottomOrRightSheetBehavior = this.f99709a;
            boolean z6 = false;
            if (bottomOrRightSheetBehavior.f99686e == 1 || bottomOrRightSheetBehavior.f99703w) {
                return false;
            }
            if (bottomOrRightSheetBehavior.f99686e == 3 && bottomOrRightSheetBehavior.f99700t == i7) {
                WeakReference weakReference = bottomOrRightSheetBehavior.f99697q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (bottomOrRightSheetBehavior.f99694n) {
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                } else if (view2 != null && view2.canScrollHorizontally(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference weakReference2 = bottomOrRightSheetBehavior.f99696p;
            View view3 = null;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (view3 == view) {
                z6 = true;
            }
            return z6;
        }
    }

    public BottomOrRightSheetBehavior() {
        this.f99683b = new b(this);
        this.f99684c = true;
        this.f99685d = true;
        this.f99686e = 3;
        this.f99698r = new ArrayList<>();
        this.f99701u = -1;
        this.f99702v = -1;
        this.f99704x = new c(this);
    }

    public BottomOrRightSheetBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f99683b = new b(this);
        this.f99684c = true;
        this.f99685d = true;
        this.f99686e = 3;
        this.f99698r = new ArrayList<>();
        this.f99701u = -1;
        this.f99702v = -1;
        this.f99704x = new c(this);
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }

    public static final /* synthetic */ int access$getSignificantVelocityThreshold$p(BottomOrRightSheetBehavior bottomOrRightSheetBehavior) {
        bottomOrRightSheetBehavior.getClass();
        return 0;
    }

    private final boolean canBeHiddenByDragging() {
        return this.f99684c;
    }

    private final View findScrollingChild(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
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

    private final int getChildMeasureSpec(int i7, int i8, int i9, int i10) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i8, i10);
        if (i9 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            if (size != 0) {
                i9 = Math.min(size, i9);
            }
            return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i9), BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE);
        }
        if (size != 0) {
            i9 = Math.min(size, i9);
        }
        return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getExpandedOffset() {
        return this.f99682a;
    }

    private final int getTopOffsetForState(int i7) {
        if (i7 == 3) {
            return getExpandedOffset();
        }
        if (i7 == 5) {
            return this.f99693m;
        }
        throw new IllegalArgumentException(C3259x.a(i7, "Invalid state to get top offset: "));
    }

    private final boolean isLayouting(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && ViewCompat.isAttachedToWindow(view);
    }

    private final void reset() {
        this.f99700t = -1;
        this.f99701u = -1;
        this.f99702v = -1;
        VelocityTracker velocityTracker = this.f99699s;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f99699s = null;
        }
    }

    private final void runAfterLayout(View view, Runnable runnable) {
        if (isLayouting(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStateInternal(int i7) {
        if (this.f99686e == i7) {
            return;
        }
        this.f99686e = i7;
        WeakReference<View> weakReference = this.f99696p;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        int size = this.f99698r.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = this.f99698r.get(i8);
            if (aVar != null) {
                aVar.b(i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean shouldHandleDraggingWithHelper() {
        /*
            r3 = this;
            r0 = r3
            androidx.customview.widget.ViewDragHelper r0 = r0.f99687f
            if (r0 == 0) goto L21
            r0 = r3
            boolean r0 = r0.f99685d
            r6 = r0
            r0 = 1
            r5 = r0
            r0 = r5
            r4 = r0
            r0 = r6
            if (r0 != 0) goto L23
            r0 = r3
            int r0 = r0.f99686e
            r1 = 1
            if (r0 != r1) goto L21
            r0 = r5
            r4 = r0
            goto L23
        L21:
            r0 = 0
            r4 = r0
        L23:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior.shouldHandleDraggingWithHelper():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSettling(View view, int i7, boolean z6) {
        ViewDragHelper viewDragHelper = this.f99687f;
        boolean zSmoothSlideViewTo = false;
        if (viewDragHelper != null) {
            if (this.f99694n) {
                int topOffsetForState = getTopOffsetForState(i7);
                zSmoothSlideViewTo = z6 ? viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState) : viewDragHelper.smoothSlideViewTo(view, view.getLeft(), topOffsetForState);
            } else {
                int i8 = 0;
                if (i7 != 3) {
                    i8 = i7 != 5 ? 0 : this.f99692l;
                }
                zSmoothSlideViewTo = z6 ? viewDragHelper.settleCapturedViewAt(i8, view.getTop()) : viewDragHelper.smoothSlideViewTo(view, i8, view.getTop());
            }
        }
        if (!zSmoothSlideViewTo) {
            setStateInternal(i7);
        } else {
            setStateInternal(2);
            this.f99683b.a(i7);
        }
    }

    public final void addBottomSheetCallback(@NotNull a aVar) {
        if (this.f99698r.contains(aVar)) {
            return;
        }
        this.f99698r.add(aVar);
    }

    public final void dispatchOnSlide(int i7) {
        float f7;
        int expandedOffset;
        if (this.f99696p.get() == null || this.f99698r.isEmpty()) {
            return;
        }
        if (this.f99694n) {
            int i8 = this.f99693m;
            f7 = i8 - i7;
            expandedOffset = i8 - getExpandedOffset();
        } else {
            int i9 = this.f99692l;
            f7 = i9 - i7;
            expandedOffset = i9;
        }
        float f8 = f7 / expandedOffset;
        int size = this.f99698r.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f99698r.get(i10);
            if (aVar != null) {
                aVar.a(f8);
            }
        }
    }

    public final int getState() {
        return this.f99686e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(@NotNull CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.f99696p = null;
        this.f99687f = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.f99696p = null;
        this.f99687f = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
        int i7;
        int i8;
        ViewDragHelper viewDragHelper;
        if (!view.isShown() || !this.f99685d) {
            this.f99688g = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.f99699s == null) {
            this.f99699s = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker = this.f99699s;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        if (actionMasked == 0) {
            this.f99702v = (int) motionEvent.getX();
            this.f99701u = (int) motionEvent.getY();
            if (this.f99686e != 2) {
                WeakReference<View> weakReference = this.f99697q;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, this.f99702v, this.f99701u)) {
                    this.f99700t = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f99703w = this.f99694n ? view2.canScrollVertically(-1) : view2.canScrollHorizontally(-1);
                }
            }
            this.f99688g = this.f99700t == -1 && !coordinatorLayout.isPointInChildBounds(view, this.f99702v, this.f99701u);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f99703w = false;
            this.f99700t = -1;
            if (this.f99688g) {
                this.f99688g = false;
                return false;
            }
        }
        if (!this.f99688g && (viewDragHelper = this.f99687f) != null && viewDragHelper.shouldInterceptTouchEvent(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.f99697q;
        View view3 = null;
        if (weakReference2 != null) {
            view3 = weakReference2.get();
        }
        boolean z6 = !this.f99694n ? this.f99687f == null || (i7 = this.f99702v) == -1 || Math.abs(((float) i7) - motionEvent.getX()) <= ((float) this.f99687f.getTouchSlop()) : this.f99687f == null || (i8 = this.f99701u) == -1 || r.a(motionEvent, (float) i8) <= ((float) this.f99687f.getTouchSlop());
        boolean z7 = false;
        if (actionMasked == 2) {
            z7 = false;
            if (view3 != null) {
                z7 = false;
                if (!this.f99688g) {
                    z7 = false;
                    if (this.f99686e != 1) {
                        z7 = false;
                        if (!coordinatorLayout.isPointInChildBounds(view3, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                            z7 = false;
                            if (z6) {
                                z7 = true;
                            }
                        }
                    }
                }
            }
        }
        return z7;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i7) {
        if (this.f99696p == null) {
            this.f99696p = new WeakReference<>(view);
            if (ViewCompat.getImportantForAccessibility(view) == 0) {
                ViewCompat.setImportantForAccessibility(view, 1);
            }
        }
        if (this.f99687f == null) {
            this.f99687f = ViewDragHelper.create(coordinatorLayout, this.f99704x);
        }
        int top = view.getTop();
        int left = view.getLeft();
        coordinatorLayout.onLayoutChild(view, i7);
        this.f99692l = coordinatorLayout.getWidth();
        this.f99693m = coordinatorLayout.getHeight();
        this.f99691k = view.getHeight();
        view.getWidth();
        int i8 = this.f99693m;
        if (i8 - this.f99691k < 0) {
            this.f99691k = i8;
        }
        this.f99682a = Math.max(0, i8 - this.f99691k);
        int i9 = this.f99686e;
        if (i9 == 3) {
            ViewCompat.offsetTopAndBottom(view, this.f99694n ? getExpandedOffset() : 0);
            ViewCompat.offsetLeftAndRight(view, 0);
        } else if (this.f99684c && i9 == 5) {
            if (this.f99694n) {
                ViewCompat.offsetTopAndBottom(view, this.f99693m);
                ViewCompat.offsetLeftAndRight(view, 0);
            } else {
                ViewCompat.offsetLeftAndRight(view, this.f99692l);
                ViewCompat.offsetTopAndBottom(view, 0);
            }
        } else if (i9 == 1 || i9 == 2) {
            if (this.f99694n) {
                ViewCompat.offsetTopAndBottom(view, top - view.getTop());
                ViewCompat.offsetLeftAndRight(view, 0);
            } else {
                ViewCompat.offsetLeftAndRight(view, left - view.getLeft());
                ViewCompat.offsetTopAndBottom(view, 0);
            }
        }
        if (!this.f99695o) {
            this.f99697q = new WeakReference<>(findScrollingChild(view));
        }
        int size = this.f99698r.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f99698r.get(i10);
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i7, int i8, int i9, int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(getChildMeasureSpec(i7, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, -1, marginLayoutParams.width), getChildMeasureSpec(i9, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, -1, marginLayoutParams.height));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onNestedPreFling(@org.jetbrains.annotations.NotNull androidx.coordinatorlayout.widget.CoordinatorLayout r8, @org.jetbrains.annotations.NotNull android.view.View r9, @org.jetbrains.annotations.NotNull android.view.View r10, float r11, float r12) {
        /*
            r7 = this;
            r0 = r7
            java.lang.ref.WeakReference<android.view.View> r0 = r0.f99697q
            r15 = r0
            r0 = 0
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r15
            if (r0 == 0) goto L3c
            r0 = r14
            r13 = r0
            r0 = r10
            r1 = r15
            java.lang.Object r1 = r1.get()
            if (r0 != r1) goto L3c
            r0 = r7
            int r0 = r0.f99686e
            r1 = 3
            if (r0 != r1) goto L39
            r0 = r14
            r13 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            boolean r0 = super.onNestedPreFling(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L3c
        L39:
            r0 = 1
            r13 = r0
        L3c:
            r0 = r13
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.BottomOrRightSheetBehavior.onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, float, float):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i7, int i8, @NotNull int[] iArr, int i9) {
        if (i9 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.f99697q;
        if (view2 != (weakReference != null ? weakReference.get() : null)) {
            return;
        }
        boolean z6 = this.f99694n;
        boolean z7 = this.f99685d;
        if (z6) {
            int top = view.getTop();
            int i10 = top - i8;
            if (i8 > 0) {
                if (i10 < getExpandedOffset()) {
                    int expandedOffset = top - getExpandedOffset();
                    iArr[1] = expandedOffset;
                    ViewCompat.offsetTopAndBottom(view, -expandedOffset);
                    setStateInternal(3);
                } else {
                    if (!z7) {
                        return;
                    }
                    iArr[1] = i8;
                    ViewCompat.offsetTopAndBottom(view, -i8);
                    setStateInternal(1);
                }
            } else if (i8 < 0 && !view2.canScrollVertically(-1)) {
                if (i10 > this.f99693m && !canBeHiddenByDragging()) {
                    int i11 = top - this.f99693m;
                    iArr[1] = i11;
                    ViewCompat.offsetTopAndBottom(view, -i11);
                    setStateInternal(3);
                } else {
                    if (!z7) {
                        return;
                    }
                    iArr[1] = i8;
                    ViewCompat.offsetTopAndBottom(view, -i8);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(view.getTop());
        } else {
            int left = view.getLeft();
            int i12 = left - i7;
            if (i7 > 0) {
                if (i12 < 0) {
                    iArr[0] = left;
                    ViewCompat.offsetLeftAndRight(view, -left);
                    setStateInternal(3);
                } else {
                    if (!z7) {
                        return;
                    }
                    iArr[0] = i7;
                    ViewCompat.offsetLeftAndRight(view, -i7);
                    setStateInternal(1);
                }
            } else if (i7 < 0 && !view2.canScrollHorizontally(-1)) {
                if (i12 > this.f99692l && !canBeHiddenByDragging()) {
                    int i13 = left - this.f99692l;
                    iArr[0] = i13;
                    ViewCompat.offsetLeftAndRight(view, -i13);
                    setStateInternal(3);
                } else {
                    if (!z7) {
                        return;
                    }
                    iArr[0] = i7;
                    ViewCompat.offsetLeftAndRight(view, -i7);
                    setStateInternal(1);
                }
            }
            dispatchOnSlide(view.getLeft());
        }
        this.h = i8;
        this.f99689i = i7;
        this.f99690j = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, int i7, int i8) {
        boolean z6 = false;
        this.h = 0;
        this.f99689i = 0;
        this.f99690j = false;
        if (!this.f99694n ? (i7 & 1) != 0 : (i7 & 2) != 0) {
            z6 = true;
        }
        return z6;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i7) {
        int i8 = 3;
        if (view.getTop() == getExpandedOffset()) {
            setStateInternal(3);
            return;
        }
        WeakReference<View> weakReference = this.f99697q;
        if (weakReference != null && view2 == weakReference.get() && this.f99690j) {
            boolean z6 = this.f99694n;
            boolean z7 = this.f99684c;
            if (!z6 ? this.f99689i <= 0 && z7 : this.h <= 0 && z7) {
                i8 = 5;
            }
            startSettling(view, i8, false);
            this.f99690j = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f99686e == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.f99687f.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.f99699s == null) {
            this.f99699s = VelocityTracker.obtain();
        }
        this.f99699s.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.f99688g && (!this.f99694n ? Math.abs(this.f99702v - motionEvent.getX()) > this.f99687f.getTouchSlop() : r.a(motionEvent, this.f99701u) > this.f99687f.getTouchSlop())) {
            this.f99687f.captureChildView(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f99688g;
    }

    public final void removeBottomSheetCallback(@NotNull a aVar) {
        this.f99698r.remove(aVar);
    }

    public final void setBottomOrRight(boolean z6) {
        this.f99694n = z6;
    }

    public final void setCustomNestedScrollerChild(@Nullable View view) {
        View view2;
        this.f99695o = view != null;
        if (view != null) {
            this.f99697q = new WeakReference<>(view);
            return;
        }
        WeakReference<View> weakReference = this.f99696p;
        if (weakReference == null || (view2 = weakReference.get()) == null) {
            return;
        }
        this.f99697q = new WeakReference<>(findScrollingChild(view2));
    }

    public final void setState(final int i7) {
        final View view;
        if (i7 == 1 || i7 == 2) {
            throw new IllegalArgumentException(android.support.v4.media.a.a("STATE_", i7 == 1 ? "DRAGGING" : "SETTLING", " should not be set externally.").toString());
        }
        if (!this.f99684c && i7 == 5) {
            pi.a.a(i7, "Cannot set state: ", "BottomOrRightSheetBehavior");
            return;
        }
        bilibili.live.app.service.resolver.c.a(i7, "set state: ", "BottomOrRightSheetBehavior");
        WeakReference<View> weakReference = this.f99696p;
        if (weakReference == null || weakReference.get() == null) {
            setStateInternal(i7);
            return;
        }
        WeakReference<View> weakReference2 = this.f99696p;
        if (weakReference2 == null || (view = weakReference2.get()) == null) {
            return;
        }
        runAfterLayout(view, new Runnable(this, view, i7) { // from class: com.bilibili.ship.theseus.united.page.floatlayer.bottomsheet.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final BottomOrRightSheetBehavior f99713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f99714b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f99715c;

            {
                this.f99713a = this;
                this.f99714b = view;
                this.f99715c = i7;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f99713a.startSettling(this.f99714b, this.f99715c, false);
            }
        });
    }
}

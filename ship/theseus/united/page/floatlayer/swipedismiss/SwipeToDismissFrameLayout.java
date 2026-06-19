package com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.InterfaceC4573q;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import com.bilibili.app.screen.adjust.widget.z;
import com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kv0.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/swipedismiss/SwipeToDismissFrameLayout.class */
@StabilityInferred(parameters = 0)
public final class SwipeToDismissFrameLayout extends FrameLayout implements InterfaceC4573q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function1<? super Float, Unit> f99830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<? extends Direction> f99831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public Direction f99832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f99833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f99834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f99835f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f99836g;
    public int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f99837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f99838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f99839k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f99840l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public View f99841m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public VelocityTracker f99842n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public ValueAnimator f99843o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f99844p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final NestedScrollingParentHelper f99845q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public View f99846r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f99847s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f99848t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f99849u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f99850v;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/swipedismiss/SwipeToDismissFrameLayout$Direction.class */
    public static final class Direction {
        private static final EnumEntries $ENTRIES;
        private static final Direction[] $VALUES;
        public static final Direction BOTTOM = new Direction("BOTTOM", 0);
        public static final Direction RIGHT = new Direction("RIGHT", 1);

        private static final /* synthetic */ Direction[] $values() {
            return new Direction[]{BOTTOM, RIGHT};
        }

        static {
            Direction[] directionArr$values = $values();
            $VALUES = directionArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(directionArr$values);
        }

        private Direction(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<Direction> getEntries() {
            return $ENTRIES;
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/floatlayer/swipedismiss/SwipeToDismissFrameLayout$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f99851a;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[Direction.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f99851a = iArr;
        }
    }

    @JvmOverloads
    public SwipeToDismissFrameLayout(@NotNull Context context) {
        this(context, 0);
    }

    public SwipeToDismissFrameLayout(Context context, int i7) {
        super(context, null);
        this.f99832c = Direction.BOTTOM;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f99833d = Math.max(ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 2.0f, 1000.0f);
        float f7 = scaledTouchSlop;
        this.f99834e = 1.5f * f7;
        this.f99835f = 0.25f * f7;
        this.f99836g = f7 * 0.35f;
        this.h = -1;
        this.f99845q = new NestedScrollingParentHelper(this);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void a(SwipeToDismissFrameLayout swipeToDismissFrameLayout, ValueAnimator valueAnimator) throws NoWhenBranchMatchedException {
        swipeToDismissFrameLayout.setAxisTranslation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        swipeToDismissFrameLayout.j();
    }

    public static float n(MotionEvent motionEvent, int i7) {
        return motionEvent.getX(i7) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public static float o(MotionEvent motionEvent, int i7) {
        return motionEvent.getY(i7) + (motionEvent.getRawY() - motionEvent.getY());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void setAxisTranslation(float f7) throws NoWhenBranchMatchedException {
        int i7 = a.f99851a[this.f99832c.ordinal()];
        if (i7 == 1) {
            setTranslationY(f7);
            setTranslationX(0.0f);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            setTranslationX(f7);
            setTranslationY(0.0f);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(float f7, boolean z6) throws NoWhenBranchMatchedException {
        ValueAnimator valueAnimator = this.f99843o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float fI = i();
        if (fI == f7) {
            if (z6) {
                z.a(this);
                return;
            } else {
                p(false);
                return;
            }
        }
        this.f99840l = true;
        this.f99839k = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fI, f7);
        valueAnimatorOfFloat.setDuration(z6 ? 220L : 180L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: kv0.a

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SwipeToDismissFrameLayout f123004a;

            {
                this.f123004a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) throws NoWhenBranchMatchedException {
                SwipeToDismissFrameLayout.a(this.f123004a, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new b(this, z6));
        valueAnimatorOfFloat.start();
        this.f99843o = valueAnimatorOfFloat;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int c(float f7) throws NoWhenBranchMatchedException {
        float fI = i();
        if (d(f7)) {
            return MathKt.roundToInt(fI - i());
        }
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean d(float f7) throws NoWhenBranchMatchedException {
        float fRoundToInt = f7 < this.f99835f ? 0.0f : MathKt.roundToInt(RangesKt.coerceIn(f7, 0.0f, e()));
        if (Math.abs(fRoundToInt - this.f99844p) < this.f99836g) {
            fRoundToInt = this.f99844p;
        } else {
            this.f99844p = fRoundToInt;
        }
        if (fRoundToInt == i()) {
            return false;
        }
        setAxisTranslation(fRoundToInt);
        j();
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float e() throws NoWhenBranchMatchedException {
        int height;
        Direction direction = this.f99832c;
        int[] iArr = a.f99851a;
        int i7 = iArr[direction.ordinal()];
        if (i7 == 1) {
            height = getHeight();
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            height = getWidth();
        }
        if (height > 0) {
            return height;
        }
        int height2 = 0;
        View childAt = getChildAt(0);
        int i8 = iArr[this.f99832c.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (childAt != null) {
                height2 = childAt.getWidth();
            }
        } else if (childAt != null) {
            height2 = childAt.getHeight();
        }
        return RangesKt.coerceAtLeast(height2, 1.0f);
    }

    public final void f(MotionEvent motionEvent) {
        int iIntValue;
        int i7 = this.h;
        if (i7 == -1) {
            iIntValue = RangesKt.coerceAtLeast(motionEvent.getActionIndex(), 0);
        } else {
            int iFindPointerIndex = motionEvent.findPointerIndex(i7);
            Integer numValueOf = Integer.valueOf(iFindPointerIndex);
            if (iFindPointerIndex < 0) {
                numValueOf = null;
            }
            iIntValue = numValueOf != null ? numValueOf.intValue() : RangesKt.coerceAtLeast(motionEvent.getActionIndex(), 0);
        }
        if (iIntValue < motionEvent.getPointerCount()) {
            this.f99837i = n(motionEvent, iIntValue);
            this.f99838j = o(motionEvent, iIntValue);
        }
        this.f99839k = true;
        this.f99844p = i();
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean g() throws NoWhenBranchMatchedException {
        boolean zCanScrollVertically;
        View view = this.f99841m;
        if (view == null) {
            return false;
        }
        int i7 = a.f99851a[this.f99832c.ordinal()];
        if (i7 == 1) {
            zCanScrollVertically = view.canScrollVertically(-1);
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            zCanScrollVertically = view.canScrollHorizontally(-1);
        }
        return zCanScrollVertically;
    }

    @NotNull
    public final Direction getDirection() {
        return this.f99832c;
    }

    @Nullable
    public final Function0<Direction> getDirectionProvider() {
        return this.f99831b;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f99845q.getNestedScrollAxes();
    }

    @Nullable
    public final Function1<Float, Unit> getOnSlideListener() {
        return this.f99830a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int h(int i7, int i8, View view) throws NoWhenBranchMatchedException {
        float fI = i();
        if (this.f99832c == Direction.BOTTOM) {
            if (i8 < 0 && !view.canScrollVertically(-1)) {
                return c(RangesKt.coerceAtMost(fI - i8, e()));
            }
            if (i8 <= 0 || fI <= 0.0f) {
                return 0;
            }
            return c(RangesKt.coerceAtLeast(fI - i8, 0.0f));
        }
        if (i7 < 0 && !view.canScrollHorizontally(-1)) {
            return c(RangesKt.coerceAtMost(fI - i7, e()));
        }
        if (i7 <= 0 || fI <= 0.0f) {
            return 0;
        }
        return c(RangesKt.coerceAtLeast(fI - i7, 0.0f));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float i() throws NoWhenBranchMatchedException {
        float translationY;
        int i7 = a.f99851a[this.f99832c.ordinal()];
        if (i7 == 1) {
            translationY = getTranslationY();
        } else {
            if (i7 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            translationY = getTranslationX();
        }
        return translationY;
    }

    public final void j() {
        float fCoerceIn = RangesKt.coerceIn(i() / RangesKt.coerceAtLeast(e(), 1.0f), 0.0f, 1.0f);
        Function1<? super Float, Unit> function1 = this.f99830a;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fCoerceIn));
        }
    }

    public final Pair<Float, Float> k(MotionEvent motionEvent) {
        int iIntValue;
        int i7 = this.h;
        if (i7 == -1) {
            iIntValue = 0;
        } else {
            int iFindPointerIndex = motionEvent.findPointerIndex(i7);
            Integer numValueOf = Integer.valueOf(iFindPointerIndex);
            if (iFindPointerIndex < 0) {
                numValueOf = null;
            }
            if (numValueOf == null) {
                return null;
            }
            iIntValue = numValueOf.intValue();
        }
        return TuplesKt.to(Float.valueOf(n(motionEvent, iIntValue) - this.f99837i), Float.valueOf(o(motionEvent, iIntValue) - this.f99838j));
    }

    public final View l(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view != this && ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View viewL = l(viewGroup.getChildAt(childCount));
                if (viewL != null) {
                    return viewL;
                }
            }
        }
        if (view == this) {
            return null;
        }
        if (view.canScrollVertically(-1) || view.canScrollVertically(1) || view.canScrollHorizontally(-1) || view.canScrollHorizontally(1)) {
            return view;
        }
        return null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void m(MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        float fI;
        float fI2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.h) {
            return;
        }
        int i7 = actionIndex == 0 ? 1 : 0;
        if (i7 >= motionEvent.getPointerCount()) {
            this.h = -1;
            return;
        }
        this.h = motionEvent.getPointerId(i7);
        float fN = n(motionEvent, i7);
        Direction direction = this.f99832c;
        int[] iArr = a.f99851a;
        int i8 = iArr[direction.ordinal()];
        if (i8 == 1) {
            fI = 0.0f;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fI = i();
        }
        this.f99837i = fN - fI;
        float fO = o(motionEvent, i7);
        int i9 = iArr[this.f99832c.ordinal()];
        if (i9 == 1) {
            fI2 = i();
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fI2 = 0.0f;
        }
        this.f99838j = fO - fI2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f99843o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f99843o = null;
        VelocityTracker velocityTracker = this.f99842n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f99842n = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(@NotNull View view, float f7, float f8, boolean z6) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(@NotNull View view, float f7, float f8) {
        return Intrinsics.areEqual(view, this.f99846r) && i() > 0.0f;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr) throws NoWhenBranchMatchedException {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) throws NoWhenBranchMatchedException {
        int iH;
        if (i9 == 1 || this.f99839k || this.f99840l) {
            return;
        }
        View view2 = this.f99846r;
        if ((view2 == null || Intrinsics.areEqual(view, view2)) && (iH = h(i7, i8, view)) != 0) {
            int i10 = a.f99851a[this.f99832c.ordinal()];
            if (i10 == 1) {
                iArr[1] = iArr[1] + iH;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr[0] = iArr[0] + iH;
            }
            this.f99847s = i7;
            this.f99848t = i8;
            this.f99849u = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10) {
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10, int i11) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.core.view.InterfaceC4573q
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10, int i11, @NotNull int[] iArr) throws NoWhenBranchMatchedException {
        int iH;
        if (i11 == 1 || this.f99839k || this.f99840l) {
            return;
        }
        View view2 = this.f99846r;
        if ((view2 == null || Intrinsics.areEqual(view, view2)) && (iH = h(i9, i10, view)) != 0) {
            int i12 = a.f99851a[this.f99832c.ordinal()];
            if (i12 == 1) {
                iArr[1] = iArr[1] + iH;
            } else {
                if (i12 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr[0] = iArr[0] + iH;
            }
            this.f99847s = i9;
            this.f99848t = i10;
            this.f99849u = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7, int i8) {
        this.f99845q.onNestedScrollAccepted(view, view2, i7, i8);
        this.f99846r = view2;
        this.f99850v = i8 == 0;
        this.f99847s = 0;
        this.f99848t = 0;
        this.f99849u = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0050  */
    @Override // androidx.core.view.InterfaceC4572p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull android.view.View r4, @org.jetbrains.annotations.NotNull android.view.View r5, int r6, int r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            r3 = this;
            r0 = r3
            boolean r0 = r0.isEnabled()
            r10 = r0
            r0 = 0
            r9 = r0
            r0 = r9
            r8 = r0
            r0 = r10
            if (r0 == 0) goto L6b
            r0 = r9
            r8 = r0
            r0 = r3
            boolean r0 = r0.f99840l
            if (r0 != 0) goto L6b
            r0 = r3
            boolean r0 = r0.f99839k
            if (r0 == 0) goto L2b
            r0 = r9
            r8 = r0
            goto L6b
        L2b:
            r0 = r3
            com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout$Direction r0 = r0.f99832c
            r4 = r0
            int[] r0 = com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.a.f99851a
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L5e
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L56
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L6b
        L50:
            r0 = 1
            r8 = r0
            goto L6b
        L56:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L5e:
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L6b
            goto L50
        L6b:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.onStartNestedScroll(android.view.View, android.view.View, int, int):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onStopNestedScroll(@NotNull View view) throws NoWhenBranchMatchedException {
        onStopNestedScroll(view, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    @Override // androidx.core.view.InterfaceC4572p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onStopNestedScroll(@org.jetbrains.annotations.NotNull android.view.View r5, int r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.onStopNestedScroll(android.view.View, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(boolean z6) {
        this.h = -1;
        this.f99839k = false;
        this.f99841m = null;
        this.f99844p = i();
        this.f99846r = null;
        this.f99847s = 0;
        this.f99848t = 0;
        this.f99849u = false;
        this.f99850v = false;
        VelocityTracker velocityTracker = this.f99842n;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f99842n = null;
        if (z6) {
            setTranslationX(0.0f);
            setTranslationY(0.0f);
            this.f99844p = 0.0f;
            j();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean q(float r5, float r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            r4 = this;
            r0 = r4
            com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout$Direction r0 = r0.f99832c
            r10 = r0
            int[] r0 = com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.a.f99851a
            r1 = r10
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = 0
            r9 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L53
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L4b
            r0 = r9
            r8 = r0
            r0 = r5
            r1 = r4
            float r1 = r1.f99834e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r0 = r9
            r8 = r0
            r0 = r5
            r1 = r6
            float r1 = java.lang.Math.abs(r1)
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.g()
            if (r0 != 0) goto L7e
        L45:
            r0 = 1
            r8 = r0
            goto L7e
        L4b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L53:
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = r4
            float r1 = r1.f99834e
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = r5
            float r1 = java.lang.Math.abs(r1)
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7e
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.g()
            if (r0 != 0) goto L7e
            goto L45
        L7e:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.floatlayer.swipedismiss.SwipeToDismissFrameLayout.q(float, float):boolean");
    }

    public final void setDirectionProvider(@Nullable Function0<? extends Direction> function0) {
        this.f99831b = function0;
    }

    public final void setOnSlideListener(@Nullable Function1<? super Float, Unit> function1) {
        this.f99830a = function1;
    }
}

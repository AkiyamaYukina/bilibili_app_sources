package com.bilibili.playerbizcommonv2.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.InterfaceC4573q;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerWebNestedSwipeDismissLayout.class */
@StabilityInferred(parameters = 0)
public final class PlayerWebNestedSwipeDismissLayout extends ConstraintLayout implements InterfaceC4573q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f82165A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f82166B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f82167C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f82168D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f82169E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function0<? extends Direction> f82170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f82171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function0<Boolean> f82172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f82173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Function1<? super Float, Unit> f82174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f82175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public Direction f82176g;
    public final float h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f82177i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f82178j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final NestedScrollingParentHelper f82179k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f82180l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f82181m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f82182n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f82183o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f82184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public View f82185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public VelocityTracker f82186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public ValueAnimator f82187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public View f82188t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f82189u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f82190v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f82191w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f82192x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f82193y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f82194z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerWebNestedSwipeDismissLayout$Direction.class */
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

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerWebNestedSwipeDismissLayout$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82195a;

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
            f82195a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/PlayerWebNestedSwipeDismissLayout$b.class */
    public static final class b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f82196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlayerWebNestedSwipeDismissLayout f82197b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f82198c;

        public b(PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout, boolean z6) {
            this.f82197b = playerWebNestedSwipeDismissLayout;
            this.f82198c = z6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            this.f82196a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout = this.f82197b;
            if (playerWebNestedSwipeDismissLayout.f82187s == animator) {
                playerWebNestedSwipeDismissLayout.f82187s = null;
            }
            playerWebNestedSwipeDismissLayout.f82184p = false;
            if (this.f82196a) {
                return;
            }
            if (!this.f82198c) {
                playerWebNestedSwipeDismissLayout.C0(false);
                return;
            }
            Function0<Unit> onDismissed = playerWebNestedSwipeDismissLayout.getOnDismissed();
            if (onDismissed != null) {
                onDismissed.invoke();
            }
        }
    }

    @JvmOverloads
    public PlayerWebNestedSwipeDismissLayout(@NotNull Context context) {
        this(context, null);
    }

    @JvmOverloads
    public PlayerWebNestedSwipeDismissLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82176g = Direction.BOTTOM;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.h = Math.max(ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 2.0f, 1000.0f);
        float f7 = scaledTouchSlop;
        this.f82177i = 1.5f * f7;
        this.f82178j = f7 * 0.25f;
        this.f82179k = new NestedScrollingParentHelper(this);
        this.f82180l = -1;
    }

    public static float A0(MotionEvent motionEvent, int i7) {
        return motionEvent.getX(i7) + (motionEvent.getRawX() - motionEvent.getX());
    }

    public static float B0(MotionEvent motionEvent, int i7) {
        return motionEvent.getY(i7) + (motionEvent.getRawY() - motionEvent.getY());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static void j0(PlayerWebNestedSwipeDismissLayout playerWebNestedSwipeDismissLayout, ValueAnimator valueAnimator) throws NoWhenBranchMatchedException {
        playerWebNestedSwipeDismissLayout.setAxisTranslation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        playerWebNestedSwipeDismissLayout.w0();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void setAxisTranslation(float f7) throws NoWhenBranchMatchedException {
        int i7 = a.f82195a[this.f82176g.ordinal()];
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

    public final void C0(boolean z6) {
        this.f82180l = -1;
        this.f82183o = false;
        this.f82185q = null;
        this.f82188t = null;
        this.f82189u = 0;
        this.f82190v = 0;
        this.f82191w = false;
        this.f82192x = false;
        this.f82193y = false;
        this.f82194z = false;
        this.f82165A = false;
        this.f82166B = false;
        this.f82167C = false;
        this.f82168D = false;
        this.f82169E = false;
        VelocityTracker velocityTracker = this.f82186r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f82186r = null;
        if (z6) {
            setAxisTranslation(0.0f);
            w0();
        }
    }

    public final boolean D0(View view) {
        return this.f82168D || this.f82169E || s0(view);
    }

    public final boolean E0(String str) {
        String str2;
        if (this.f82165A) {
            str2 = "touch_sequence_protected_by_h5";
        } else {
            Function0<Boolean> function0 = this.f82172c;
            if (function0 == null || !((Boolean) function0.invoke()).booleanValue()) {
                return false;
            }
            str2 = "touch_intercept_disabled_by_h5";
        }
        if (this.f82167C) {
            return true;
        }
        this.f82167C = true;
        Direction direction = this.f82176g;
        StringBuilder sbA = G0.b.a("dismissGesture blocked scene=", str, " reason=", str2, " direction=");
        sbA.append(direction);
        BLog.i("PlayerWebNestedSwipeDismissLayout", sbA.toString());
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F0(float r5, float r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            r4 = this;
            r0 = r4
            java.lang.String r1 = "start_drag"
            boolean r0 = r0.E0(r1)
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r4
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r0 = r0.f82176g
            r10 = r0
            int[] r0 = com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.a.f82195a
            r1 = r10
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto L6e
            r0 = r7
            r1 = 2
            if (r0 != r1) goto L66
            r0 = r9
            r8 = r0
            r0 = r5
            r1 = r4
            float r1 = r1.f82177i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r5
            r1 = r6
            float r1 = java.lang.Math.abs(r1)
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.f82194z
            if (r0 != 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.r0()
            if (r0 != 0) goto La4
        L60:
            r0 = 1
            r8 = r0
            goto La4
        L66:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L6e:
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = r4
            float r1 = r1.f82177i
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r6
            r1 = r5
            float r1 = java.lang.Math.abs(r1)
            r2 = 1069547520(0x3fc00000, float:1.5)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.f82194z
            if (r0 != 0) goto La4
            r0 = r9
            r8 = r0
            r0 = r4
            boolean r0 = r0.r0()
            if (r0 != 0) goto La4
            goto L60
        La4:
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.F0(float, float):boolean");
    }

    @Nullable
    public final Function0<Boolean> getCanStartDismissGesture() {
        return this.f82171b;
    }

    @NotNull
    public final Direction getDirection() {
        return this.f82176g;
    }

    @Nullable
    public final Function0<Direction> getDirectionProvider() {
        return this.f82170a;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.f82179k.getNestedScrollAxes();
    }

    @Nullable
    public final Function0<Unit> getOnDismissed() {
        return this.f82175f;
    }

    @Nullable
    public final Function0<Unit> getOnDragStarted() {
        return this.f82173d;
    }

    @Nullable
    public final Function1<Float, Unit> getOnSlideProgressChanged() {
        return this.f82174e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void k0(float f7, boolean z6) throws NoWhenBranchMatchedException {
        ValueAnimator valueAnimator = this.f82187s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float fV0 = v0();
        if (fV0 == f7) {
            if (!z6) {
                C0(false);
                return;
            }
            Function0<Unit> function0 = this.f82175f;
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        this.f82184p = true;
        this.f82183o = false;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fV0, f7);
        valueAnimatorOfFloat.setDuration(z6 ? 220L : 180L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: com.bilibili.playerbizcommonv2.web.x

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final PlayerWebNestedSwipeDismissLayout f82269a;

            {
                this.f82269a = this;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) throws NoWhenBranchMatchedException {
                PlayerWebNestedSwipeDismissLayout.j0(this.f82269a, valueAnimator2);
            }
        });
        valueAnimatorOfFloat.addListener(new b(this, z6));
        valueAnimatorOfFloat.start();
        this.f82187s = valueAnimatorOfFloat;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int l0(float f7) throws NoWhenBranchMatchedException {
        float fV0 = v0();
        if (m0(f7)) {
            return MathKt.roundToInt(fV0 - v0());
        }
        return 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean m0(float f7) throws NoWhenBranchMatchedException {
        float fCoerceIn = f7 < this.f82178j ? 0.0f : RangesKt.coerceIn(f7, 0.0f, n0());
        if (fCoerceIn == v0()) {
            return false;
        }
        if (!this.f82193y) {
            this.f82193y = true;
            Function0<Unit> function0 = this.f82173d;
            if (function0 != null) {
                function0.invoke();
            }
        }
        setAxisTranslation(fCoerceIn);
        w0();
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float n0() throws NoWhenBranchMatchedException {
        int height;
        int measuredHeight;
        Direction direction = this.f82176g;
        int[] iArr = a.f82195a;
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
        int i8 = iArr[this.f82176g.ordinal()];
        if (i8 == 1) {
            measuredHeight = getMeasuredHeight();
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            measuredHeight = getMeasuredWidth();
        }
        return RangesKt.coerceAtLeast(measuredHeight, 1.0f);
    }

    public final void o0(MotionEvent motionEvent) {
        int iIntValue;
        int i7 = this.f82180l;
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
            this.f82181m = A0(motionEvent, iIntValue);
            this.f82182n = B0(motionEvent, iIntValue);
        }
        this.f82183o = true;
        if (!this.f82193y) {
            this.f82193y = true;
            Function0<Unit> function0 = this.f82173d;
            if (function0 != null) {
                function0.invoke();
            }
        }
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f82187s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f82187s = null;
        VelocityTracker velocityTracker = this.f82186r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f82186r = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b4  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedFling(@NotNull View view, float f7, float f8, boolean z6) {
        return false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onNestedPreFling(@NotNull View view, float f7, float f8) throws NoWhenBranchMatchedException {
        boolean z6 = false;
        if (!Intrinsics.areEqual(view, this.f82188t) || v0() <= 0.0f) {
            return false;
        }
        int i7 = a.f82195a[this.f82176g.ordinal()];
        if (i7 == 1) {
            f7 = f8;
        } else if (i7 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (f7 > this.h || v0() > n0() * 0.4f) {
            z6 = true;
        }
        float fN0 = 0.0f;
        if (z6) {
            fN0 = n0();
        }
        k0(fN0, z6);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr) throws NoWhenBranchMatchedException {
        onNestedPreScroll(view, i7, i8, iArr, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedPreScroll(@NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) throws NoWhenBranchMatchedException {
        int iU0;
        if (i9 == 1 || this.f82183o || this.f82184p || E0("nested_pre_scroll")) {
            return;
        }
        View view2 = this.f82188t;
        if ((view2 == null || Intrinsics.areEqual(view, view2)) && (iU0 = u0(view, i7, i8, true)) != 0) {
            int i10 = a.f82195a[this.f82176g.ordinal()];
            if (i10 == 1) {
                iArr[1] = iArr[1] + iU0;
            } else {
                if (i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iArr[0] = iArr[0] + iU0;
            }
            this.f82189u = i7;
            this.f82190v = i8;
            this.f82191w = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10) {
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScroll(@NotNull View view, int i7, int i8, int i9, int i10, int i11) {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e2  */
    @Override // androidx.core.view.InterfaceC4573q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onNestedScroll(@org.jetbrains.annotations.NotNull android.view.View r7, int r8, int r9, int r10, int r11, int r12, @org.jetbrains.annotations.NotNull int[] r13) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.onNestedScroll(android.view.View, int, int, int, int, int, int[]):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7) {
        onNestedScrollAccepted(view, view2, i7, 0);
    }

    @Override // androidx.core.view.InterfaceC4572p
    public final void onNestedScrollAccepted(@NotNull View view, @NotNull View view2, int i7, int i8) {
        this.f82179k.onNestedScrollAccepted(view, view2, i7, i8);
        this.f82188t = view2;
        this.f82192x = i8 == 0;
        this.f82189u = 0;
        this.f82190v = 0;
        this.f82191w = false;
        this.f82193y = false;
        this.f82168D = s0(view2);
        this.f82169E = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public final boolean onStartNestedScroll(@NotNull View view, @NotNull View view2, int i7) {
        return onStartNestedScroll(view, view2, i7, 0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e  */
    @Override // androidx.core.view.InterfaceC4572p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartNestedScroll(@org.jetbrains.annotations.NotNull android.view.View r4, @org.jetbrains.annotations.NotNull android.view.View r5, int r6, int r7) throws kotlin.NoWhenBranchMatchedException {
        /*
            r3 = this;
            r0 = r3
            kotlin.jvm.functions.Function0<? extends com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction> r0 = r0.f82170a
            r4 = r0
            r0 = 1
            r8 = r0
            r0 = r4
            if (r0 == 0) goto L32
            r0 = r4
            java.lang.Object r0 = r0.invoke()
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r0 = (com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.Direction) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L1d
            goto L32
        L1d:
            r0 = r3
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r0 = r0.f82176g
            r1 = r4
            if (r0 != r1) goto L28
            goto L32
        L28:
            r0 = r3
            r1 = r4
            r0.f82176g = r1
            r0 = r3
            r1 = 1
            r0.C0(r1)
        L32:
            r0 = r7
            if (r0 != 0) goto L51
            r0 = r3
            android.animation.ValueAnimator r0 = r0.f82187s
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L43
            goto L51
        L43:
            r0 = r3
            r1 = 0
            r0.f82187s = r1
            r0 = r4
            r0.cancel()
            r0 = r3
            r1 = 0
            r0.f82184p = r1
        L51:
            r0 = r3
            boolean r0 = r0.q0()
            if (r0 == 0) goto Lb5
            r0 = r3
            boolean r0 = r0.f82184p
            if (r0 != 0) goto Lb5
            r0 = r3
            boolean r0 = r0.f82183o
            if (r0 == 0) goto L69
            goto Lb5
        L69:
            r0 = r7
            if (r0 != 0) goto L7a
            r0 = r3
            java.lang.String r1 = "start_nested_scroll"
            boolean r0 = r0.E0(r1)
            if (r0 == 0) goto L7a
            r0 = 0
            return r0
        L7a:
            r0 = r3
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r0 = r0.f82176g
            r4 = r0
            int[] r0 = com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.a.f82195a
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r7 = r0
            r0 = r7
            r1 = 1
            if (r0 == r1) goto Lac
            r0 = r7
            r1 = 2
            if (r0 != r1) goto La4
            r0 = r6
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L9e
            goto Lb2
        L9e:
            r0 = 0
            r8 = r0
            goto Lb2
        La4:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        Lac:
            r0 = r6
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L9e
        Lb2:
            r0 = r8
            return r0
        Lb5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.onStartNestedScroll(android.view.View, android.view.View, int, int):boolean");
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
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.onStopNestedScroll(android.view.View, int):void");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01a6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r5) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 726
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean q0() {
        Function0<Boolean> function0;
        return isEnabled() && getChildCount() > 0 && ((function0 = this.f82171b) == null || ((Boolean) function0.invoke()).booleanValue());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final boolean r0() throws NoWhenBranchMatchedException {
        boolean zCanScrollVertically;
        View view = this.f82185q;
        if (view == null) {
            return false;
        }
        int i7 = a.f82195a[this.f82176g.ordinal()];
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s0(android.view.View r4) throws kotlin.NoWhenBranchMatchedException {
        /*
            r3 = this;
            r0 = r3
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r0 = r0.f82176g
            r9 = r0
            int[] r0 = com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.a.f82195a
            r8 = r0
            r0 = r8
            r1 = r9
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r5 = r0
            r0 = 1
            r7 = r0
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L32
            r0 = r5
            r1 = 2
            if (r0 != r1) goto L2a
            r0 = r4
            r1 = -1
            boolean r0 = r0.canScrollHorizontally(r1)
            r6 = r0
            goto L38
        L2a:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L32:
            r0 = r4
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r6 = r0
        L38:
            r0 = r6
            if (r0 == 0) goto L3e
            r0 = 1
            return r0
        L3e:
            r0 = r3
            r1 = r4
            android.view.View r0 = r0.y0(r1)
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L7f
            r0 = r8
            r1 = r3
            com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout$Direction r1 = r1.f82176g
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r5 = r0
            r0 = r5
            r1 = 1
            if (r0 == r1) goto L6e
            r0 = r5
            r1 = 2
            if (r0 != r1) goto L66
            r0 = r4
            r1 = -1
            boolean r0 = r0.canScrollHorizontally(r1)
            r6 = r0
            goto L74
        L66:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r1 = r0
            r1.<init>()
            throw r0
        L6e:
            r0 = r4
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r6 = r0
        L74:
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L7f
            r0 = r7
            r6 = r0
            goto L81
        L7f:
            r0 = 0
            r6 = r0
        L81:
            r0 = r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.web.PlayerWebNestedSwipeDismissLayout.s0(android.view.View):boolean");
    }

    public final void setCanStartDismissGesture(@Nullable Function0<Boolean> function0) {
        this.f82171b = function0;
    }

    public final void setDirectionProvider(@Nullable Function0<? extends Direction> function0) {
        this.f82170a = function0;
    }

    public final void setOnDismissed(@Nullable Function0<Unit> function0) {
        this.f82175f = function0;
    }

    public final void setOnDragStarted(@Nullable Function0<Unit> function0) {
        this.f82173d = function0;
    }

    public final void setOnSlideProgressChanged(@Nullable Function1<? super Float, Unit> function1) {
        this.f82174e = function1;
    }

    public final void setTouchEventInterceptDisabled(@Nullable Function0<Boolean> function0) {
        this.f82172c = function0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final int u0(View view, int i7, int i8, boolean z6) throws NoWhenBranchMatchedException {
        int iL0;
        int iL02;
        float fV0 = v0();
        if (this.f82176g == Direction.BOTTOM) {
            if (i8 >= 0 || ((z6 && fV0 <= 0.0f) || D0(view))) {
                iL02 = 0;
                if (i8 > 0) {
                    iL02 = 0;
                    if (fV0 > 0.0f) {
                        iL02 = l0(RangesKt.coerceAtLeast(fV0 - i8, 0.0f));
                    }
                }
            } else {
                iL02 = l0(RangesKt.coerceAtMost(fV0 - i8, n0()));
            }
            return iL02;
        }
        if (i7 >= 0 || ((z6 && fV0 <= 0.0f) || D0(view))) {
            iL0 = 0;
            if (i7 > 0) {
                iL0 = 0;
                if (fV0 > 0.0f) {
                    iL0 = l0(RangesKt.coerceAtLeast(fV0 - i7, 0.0f));
                }
            }
        } else {
            iL0 = l0(RangesKt.coerceAtMost(fV0 - i7, n0()));
        }
        return iL0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final float v0() throws NoWhenBranchMatchedException {
        float translationY;
        int i7 = a.f82195a[this.f82176g.ordinal()];
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

    public final void w0() {
        float fCoerceIn = RangesKt.coerceIn(v0() / RangesKt.coerceAtLeast(n0(), 1.0f), 0.0f, 1.0f);
        Function1<? super Float, Unit> function1 = this.f82174e;
        if (function1 != null) {
            function1.invoke(Float.valueOf(fCoerceIn));
        }
    }

    public final Pair<Float, Float> x0(MotionEvent motionEvent) {
        int iIntValue;
        int i7 = this.f82180l;
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
        return TuplesKt.to(Float.valueOf(A0(motionEvent, iIntValue) - this.f82181m), Float.valueOf(B0(motionEvent, iIntValue) - this.f82182n));
    }

    public final View y0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View viewY0 = y0(viewGroup.getChildAt(childCount));
                if (viewY0 != null) {
                    return viewY0;
                }
            }
        }
        if (view != this && ViewCompat.isNestedScrollingEnabled(view)) {
            return view;
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
    public final void z0(MotionEvent motionEvent) throws NoWhenBranchMatchedException {
        float fV0;
        float fV02;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) != this.f82180l) {
            return;
        }
        int i7 = actionIndex == 0 ? 1 : 0;
        if (i7 >= motionEvent.getPointerCount()) {
            this.f82180l = -1;
            return;
        }
        this.f82180l = motionEvent.getPointerId(i7);
        float fA0 = A0(motionEvent, i7);
        Direction direction = this.f82176g;
        int[] iArr = a.f82195a;
        int i8 = iArr[direction.ordinal()];
        if (i8 == 1) {
            fV0 = 0.0f;
        } else {
            if (i8 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fV0 = v0();
        }
        this.f82181m = fA0 - fV0;
        float fB02 = B0(motionEvent, i7);
        int i9 = iArr[this.f82176g.ordinal()];
        if (i9 == 1) {
            fV02 = v0();
        } else {
            if (i9 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fV02 = 0.0f;
        }
        this.f82182n = fB02 - fV02;
    }
}

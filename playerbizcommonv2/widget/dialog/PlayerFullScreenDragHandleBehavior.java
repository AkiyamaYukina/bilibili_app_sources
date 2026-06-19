package com.bilibili.playerbizcommonv2.widget.dialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDragHandleBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDragHandleBehavior.class */
@StabilityInferred(parameters = 0)
public final class PlayerFullScreenDragHandleBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f82467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f82468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public VelocityTracker f82469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public Function1<? super MotionEvent, Boolean> f82470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f82471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f82472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f82473g;
    public boolean h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f82474i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f82475j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f82476k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f82477l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public NestedScrollSource f82478m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f82479n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public Integer f82480o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDragHandleBehavior$NestedScrollSource.class */
    public static final class NestedScrollSource {
        private static final EnumEntries $ENTRIES;
        private static final NestedScrollSource[] $VALUES;
        public static final NestedScrollSource NONE = new NestedScrollSource("NONE", 0);
        public static final NestedScrollSource DRAG_AREA = new NestedScrollSource("DRAG_AREA", 1);
        public static final NestedScrollSource WHOLE_SHEET_CONTENT = new NestedScrollSource("WHOLE_SHEET_CONTENT", 2);
        public static final NestedScrollSource CONTENT_OVERSCROLL = new NestedScrollSource("CONTENT_OVERSCROLL", 3);

        private static final /* synthetic */ NestedScrollSource[] $values() {
            return new NestedScrollSource[]{NONE, DRAG_AREA, WHOLE_SHEET_CONTENT, CONTENT_OVERSCROLL};
        }

        static {
            NestedScrollSource[] nestedScrollSourceArr$values = $values();
            $VALUES = nestedScrollSourceArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(nestedScrollSourceArr$values);
        }

        private NestedScrollSource(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<NestedScrollSource> getEntries() {
            return $ENTRIES;
        }

        public static NestedScrollSource valueOf(String str) {
            return (NestedScrollSource) Enum.valueOf(NestedScrollSource.class, str);
        }

        public static NestedScrollSource[] values() {
            return (NestedScrollSource[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/dialog/PlayerFullScreenDragHandleBehavior$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f82481a;

        static {
            int[] iArr = new int[NestedScrollSource.values().length];
            try {
                iArr[NestedScrollSource.DRAG_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[NestedScrollSource.WHOLE_SHEET_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[NestedScrollSource.CONTENT_OVERSCROLL.ordinal()] = 3;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[NestedScrollSource.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError e10) {
            }
            f82481a = iArr;
        }
    }

    public PlayerFullScreenDragHandleBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f82467a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f82468b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
        this.f82478m = NestedScrollSource.NONE;
    }

    public /* synthetic */ PlayerFullScreenDragHandleBehavior(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    private final float computeContentOverscrollYVelocity() {
        VelocityTracker velocityTracker = this.f82469c;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f82468b);
        return velocityTracker.getYVelocity();
    }

    private final View findTouchedScrollable(View view, MotionEvent motionEvent) {
        if (!isRawTouchInsideView(view, motionEvent)) {
            return null;
        }
        if (view.canScrollVertically(-1)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
            View viewFindTouchedScrollable = findTouchedScrollable(viewGroup.getChildAt(childCount), motionEvent);
            if (viewFindTouchedScrollable != null) {
                return viewFindTouchedScrollable;
            }
        }
        return null;
    }

    private final void handleContentOverscrollPreScroll(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr, int i9) {
        Integer num;
        if (isDraggable()) {
            if (i8 < 0 && isContentScrolledToTop(view)) {
                int top = v7.getTop();
                int i10 = iArr[1];
                super.onNestedPreScroll(coordinatorLayout, v7, view, i7, i8, iArr, i9);
                updateContentOverscrollTracking(v7, top, iArr, i10);
                return;
            }
            if (!this.f82479n || i8 <= 0 || (num = this.f82480o) == null) {
                return;
            }
            int top2 = v7.getTop() - num.intValue();
            if (top2 <= 0) {
                this.f82479n = false;
                return;
            }
            int iMin = Math.min(i8, top2);
            int top3 = v7.getTop();
            int i11 = iArr[1];
            super.onNestedPreScroll(coordinatorLayout, v7, view, i7, iMin, iArr, i9);
            updateContentOverscrollTracking(v7, top3, iArr, i11);
        }
    }

    private final void handleContentOverscrollScroll(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        if (isDraggable()) {
            if (i10 < 0 || this.f82479n) {
                if (i10 <= 0) {
                    int top = v7.getTop();
                    int i12 = iArr[1];
                    super.onNestedScroll(coordinatorLayout, v7, view, i7, i8, i9, i10, i11, iArr);
                    updateContentOverscrollTracking(v7, top, iArr, i12);
                    return;
                }
                Integer num = this.f82480o;
                if (num != null) {
                    int top2 = v7.getTop() - num.intValue();
                    if (top2 <= 0) {
                        this.f82479n = false;
                        return;
                    }
                    int iMin = Math.min(i10, top2);
                    int top3 = v7.getTop();
                    int i13 = iArr[1];
                    super.onNestedScroll(coordinatorLayout, v7, view, i7, i8, i9, iMin, i11, iArr);
                    updateContentOverscrollTracking(v7, top3, iArr, i13);
                }
            }
        }
    }

    private final void handleSheetDragNestedPreScroll(CoordinatorLayout coordinatorLayout, V v7, View view, int i7, int i8, int[] iArr, int i9) {
        int top = v7.getTop();
        int i10 = iArr[1];
        int state = getState();
        super.onNestedPreScroll(coordinatorLayout, v7, view, i7, i8, iArr, i9);
        if (shouldFallbackExpandFromNestedDrag(i8, i9, state, top, v7, iArr, i10)) {
            iArr[1] = iArr[1] + i8;
            setState(3);
        }
    }

    private final boolean isContentScrolledToTop(View view) {
        return !view.canScrollVertically(-1);
    }

    private final boolean isRawTouchInsideView(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        float f7 = iArr[0];
        float f8 = iArr[1];
        float width = view.getWidth();
        float height = view.getHeight();
        float rawX = motionEvent.getRawX();
        boolean z6 = false;
        if (f7 <= rawX) {
            z6 = false;
            if (rawX <= width + f7) {
                float rawY = motionEvent.getRawY();
                z6 = false;
                if (f8 <= rawY) {
                    z6 = false;
                    if (rawY <= height + f8) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNestedScrollAccepted$lambda$0(CoordinatorLayout coordinatorLayout, PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior) {
        coordinatorLayout.requestDisallowInterceptTouchEvent(false);
        playerFullScreenDragHandleBehavior.f82473g = true;
        playerFullScreenDragHandleBehavior.f82477l = true;
    }

    private final void resetGestureTracking() {
        this.f82473g = false;
        this.h = false;
        this.f82477l = false;
        this.f82474i = false;
        this.f82479n = false;
        this.f82480o = null;
        VelocityTracker velocityTracker = this.f82469c;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f82469c = null;
    }

    private final NestedScrollSource resolveNestedScrollSource() {
        return !isDraggable() ? NestedScrollSource.NONE : this.f82471e ? NestedScrollSource.WHOLE_SHEET_CONTENT : this.f82477l ? NestedScrollSource.DRAG_AREA : (this.f82472f && getState() == 4) ? NestedScrollSource.CONTENT_OVERSCROLL : NestedScrollSource.NONE;
    }

    private final boolean settleContentOverscrollIfNeeded(V v7) {
        if (this.f82478m != NestedScrollSource.CONTENT_OVERSCROLL || !this.f82479n || getState() != 1) {
            return false;
        }
        setState(shouldHideAfterContentOverscroll$default(this, v7, 0.0f, 2, null) ? 5 : 4);
        return true;
    }

    private final boolean shouldFallbackExpandFromNestedDrag(int i7, int i8, int i9, int i10, V v7, int[] iArr, int i11) {
        boolean z6 = false;
        if (isDraggable()) {
            z6 = false;
            if (i7 > 0) {
                if (i8 != 0) {
                    z6 = false;
                } else {
                    if (i9 != 4 && i9 != 6 && i9 != 1) {
                        return false;
                    }
                    z6 = false;
                    if (v7.getTop() == i10) {
                        z6 = false;
                        if (iArr[1] == i11) {
                            z6 = true;
                        }
                    }
                }
            }
        }
        return z6;
    }

    private final boolean shouldHideAfterContentOverscroll(V v7, float f7) {
        if (!isHideable()) {
            return false;
        }
        Integer num = this.f82480o;
        boolean z6 = false;
        if (num != null) {
            int iIntValue = num.intValue();
            if (v7.getTop() - iIntValue <= 0 && f7 <= 0.0f) {
                return false;
            }
            z6 = false;
            if (Math.abs(((f7 * 0.1f) + v7.getTop()) - iIntValue) / RangesKt.coerceAtLeast(getPeekHeight(), 1) > 0.5f) {
                z6 = true;
            }
        }
        return z6;
    }

    public static /* synthetic */ boolean shouldHideAfterContentOverscroll$default(PlayerFullScreenDragHandleBehavior playerFullScreenDragHandleBehavior, View view, float f7, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            f7 = 0.0f;
        }
        return playerFullScreenDragHandleBehavior.shouldHideAfterContentOverscroll(view, f7);
    }

    private final boolean shouldInterceptContentOverscroll(V v7, MotionEvent motionEvent) {
        if (!isDraggable() || !this.f82472f || getState() != 4 || motionEvent.getActionMasked() != 2) {
            return false;
        }
        float x6 = motionEvent.getX();
        float f7 = this.f82475j;
        float y6 = motionEvent.getY() - this.f82476k;
        if (y6 <= this.f82467a || Math.abs(y6) <= Math.abs(x6 - f7) || !isRawTouchInsideView(v7, motionEvent)) {
            return false;
        }
        View viewFindTouchedScrollable = findTouchedScrollable(v7, motionEvent);
        boolean z6 = false;
        if (viewFindTouchedScrollable != null) {
            z6 = false;
            if (viewFindTouchedScrollable.canScrollVertically(-1)) {
                z6 = true;
            }
        }
        return !z6;
    }

    private final boolean shouldInterceptDragArea(MotionEvent motionEvent) {
        boolean z6 = false;
        if (isDraggable()) {
            if (!this.f82473g) {
                z6 = false;
            } else {
                if (motionEvent.getActionMasked() != 2) {
                    return false;
                }
                float x6 = motionEvent.getX();
                float f7 = this.f82475j;
                float y6 = motionEvent.getY() - this.f82476k;
                z6 = false;
                if (Math.abs(y6) > this.f82467a) {
                    z6 = false;
                    if (Math.abs(y6) > Math.abs(x6 - f7)) {
                        z6 = true;
                    }
                }
            }
        }
        return z6;
    }

    private final void trackContentOverscrollVelocity(MotionEvent motionEvent) {
        VelocityTracker velocityTracker = this.f82469c;
        VelocityTracker velocityTrackerObtain = velocityTracker;
        if (velocityTracker == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.f82469c = velocityTrackerObtain;
        }
        if (motionEvent.getActionMasked() == 0) {
            velocityTrackerObtain.clear();
        }
        velocityTrackerObtain.addMovement(motionEvent);
    }

    private final void updateContentOverscrollTracking(V v7, int i7, int[] iArr, int i8) {
        if (v7.getTop() == i7 && iArr[1] == i8) {
            return;
        }
        this.f82479n = true;
        Integer num = this.f82480o;
        Integer numValueOf = num;
        if (num == null) {
            numValueOf = Integer.valueOf(i7);
        }
        this.f82480o = numValueOf;
    }

    public final boolean getAllowCollapseOnContentOverscroll() {
        return this.f82472f;
    }

    public final boolean getAllowContentNestedScrollAsDrag() {
        return this.f82471e;
    }

    @Nullable
    public final Function1<MotionEvent, Boolean> getTouchInDragAreaPredicate() {
        return this.f82470d;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull androidx.coordinatorlayout.widget.CoordinatorLayout r7, @org.jetbrains.annotations.NotNull V r8, @org.jetbrains.annotations.NotNull android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playerbizcommonv2.widget.dialog.PlayerFullScreenDragHandleBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull View view, int i7, int i8, @NotNull int[] iArr, int i9) throws NoWhenBranchMatchedException {
        int i10 = a.f82481a[this.f82478m.ordinal()];
        if (i10 == 1 || i10 == 2) {
            handleSheetDragNestedPreScroll(coordinatorLayout, v7, view, i7, i8, iArr, i9);
        } else if (i10 == 3) {
            handleContentOverscrollPreScroll(coordinatorLayout, v7, view, i7, i8, iArr, i9);
        } else if (i10 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull View view, int i7, int i8, int i9, int i10, int i11, @NotNull int[] iArr) throws NoWhenBranchMatchedException {
        int i12 = a.f82481a[this.f82478m.ordinal()];
        if (i12 == 1 || i12 == 2) {
            super.onNestedScroll(coordinatorLayout, v7, view, i7, i8, i9, i10, i11, iArr);
        } else if (i12 == 3) {
            handleContentOverscrollScroll(coordinatorLayout, v7, view, i7, i8, i9, i10, i11, iArr);
        } else if (i12 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onNestedScrollAccepted(@NotNull final CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull View view, @NotNull View view2, int i7, int i8) {
        super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onNestedScrollAccepted(coordinatorLayout, v7, view, view2, i7, i8);
        if (this.f82478m == NestedScrollSource.WHOLE_SHEET_CONTENT) {
            v7.post(new Runnable(coordinatorLayout, this) { // from class: Pr0.k

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CoordinatorLayout f19091a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final PlayerFullScreenDragHandleBehavior f19092b;

                {
                    this.f19091a = coordinatorLayout;
                    this.f19092b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    PlayerFullScreenDragHandleBehavior.onNestedScrollAccepted$lambda$0(this.f19091a, this.f19092b);
                }
            });
        }
    }

    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull View view, @NotNull View view2, int i7, int i8) {
        NestedScrollSource nestedScrollSourceResolveNestedScrollSource = resolveNestedScrollSource();
        if (nestedScrollSourceResolveNestedScrollSource == NestedScrollSource.NONE) {
            return false;
        }
        boolean zOnStartNestedScroll = super.onStartNestedScroll(coordinatorLayout, v7, view, view2, i7, i8);
        if (zOnStartNestedScroll) {
            this.f82478m = nestedScrollSourceResolveNestedScrollSource;
        }
        return zOnStartNestedScroll;
    }

    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull View view, int i7) {
        boolean z6 = this.f82478m == NestedScrollSource.CONTENT_OVERSCROLL && this.f82479n;
        super.onStopNestedScroll(coordinatorLayout, v7, view, i7);
        if (z6) {
            settleContentOverscrollIfNeeded(v7);
        }
        if (!this.f82473g) {
            this.f82477l = false;
        }
        this.f82478m = NestedScrollSource.NONE;
        this.f82479n = false;
        this.f82480o = null;
    }

    public boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull V v7, @NotNull MotionEvent motionEvent) {
        if (!this.f82473g && !this.h) {
            return false;
        }
        if (this.f82474i && motionEvent.getActionMasked() == 2) {
            this.f82474i = false;
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), 0);
            super.onTouchEvent(coordinatorLayout, v7, motionEventObtain);
            motionEventObtain.recycle();
        }
        if (!this.f82473g && this.f82472f) {
            trackContentOverscrollVelocity(motionEvent);
        }
        int top = v7.getTop();
        boolean zOnTouchEvent = super.onTouchEvent(coordinatorLayout, v7, motionEvent);
        if (!this.f82473g && this.f82472f) {
            if (v7.getTop() != top) {
                if (this.f82480o == null) {
                    this.f82480o = Integer.valueOf(top);
                }
                this.f82479n = true;
            }
            Integer num = this.f82480o;
            if (num != null && v7.getTop() < num.intValue()) {
                ViewCompat.offsetTopAndBottom(v7, num.intValue() - v7.getTop());
            }
        }
        if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 3) {
            if (this.f82479n && this.f82480o != null) {
                setState(shouldHideAfterContentOverscroll(v7, motionEvent.getActionMasked() == 1 ? computeContentOverscrollYVelocity() : 0.0f) ? 5 : 4);
            }
            resetGestureTracking();
        }
        return zOnTouchEvent;
    }

    public final void setAllowCollapseOnContentOverscroll(boolean z6) {
        this.f82472f = z6;
    }

    public final void setAllowContentNestedScrollAsDrag(boolean z6) {
        this.f82471e = z6;
    }

    public final void setTouchInDragAreaPredicate(@Nullable Function1<? super MotionEvent, Boolean> function1) {
        this.f82470d = function1;
    }
}

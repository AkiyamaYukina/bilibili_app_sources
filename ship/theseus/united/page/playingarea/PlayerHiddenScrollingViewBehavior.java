package com.bilibili.ship.theseus.united.page.playingarea;

import Vn.A;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C3259x;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import androidx.media3.exoplayer.C4690e;
import androidx.media3.exoplayer.video.z;
import com.bilibili.ship.theseus.united.page.behavior.CollapsablePinnedBottomScrollingBehavior;
import java.lang.ref.WeakReference;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayerHiddenScrollingViewBehavior.class */
@StabilityInferred(parameters = 0)
public final class PlayerHiddenScrollingViewBehavior extends CollapsablePinnedBottomScrollingBehavior {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public View f102281A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f102282B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f102283C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f102284D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f102285E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f102286F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f102287G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public final c f102288H;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public State f102289q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<State> f102290r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    public final StateFlow<State> f102291s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f102292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f102293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f102294v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @Nullable
    public VelocityTracker f102295w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @Nullable
    public ViewDragHelper f102296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final a f102297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public WeakReference<View> f102298z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayerHiddenScrollingViewBehavior$State.class */
    public static final class State {
        private static final EnumEntries $ENTRIES;
        private static final State[] $VALUES;
        public static final State STATE_EXPANDED = new State("STATE_EXPANDED", 0);
        public static final State STATE_DRAGGING = new State("STATE_DRAGGING", 1);
        public static final State STATE_SETTLING = new State("STATE_SETTLING", 2);
        public static final State STATE_HIDDEN = new State("STATE_HIDDEN", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{STATE_EXPANDED, STATE_DRAGGING, STATE_SETTLING, STATE_HIDDEN};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(stateArr$values);
        }

        private State(String str, int i7) {
        }

        @NotNull
        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayerHiddenScrollingViewBehavior$a.class */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public State f102299a = State.STATE_EXPANDED;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f102300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final z f102301c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final PlayerHiddenScrollingViewBehavior f102302d;

        public a(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior) {
            this.f102302d = playerHiddenScrollingViewBehavior;
            this.f102301c = new z(1, this, playerHiddenScrollingViewBehavior);
        }

        public final void a(@NotNull State state) {
            View view = this.f102302d.f102281A;
            if (view == null) {
                return;
            }
            defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior$StateSettlingTracker-continueSettlingToState] ", "continueSettlingToState: targetState=" + state + ", isContinueSettlingRunnablePosted=" + this.f102300b, "PlayerHiddenScrollingViewBehavior$StateSettlingTracker-continueSettlingToState");
            this.f102299a = state;
            if (this.f102300b) {
                return;
            }
            view.postOnAnimation(this.f102301c);
            this.f102300b = true;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayerHiddenScrollingViewBehavior$b.class */
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f102303a;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.STATE_EXPANDED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[State.STATE_HIDDEN.ordinal()] = 2;
            } catch (NoSuchFieldError e8) {
            }
            f102303a = iArr;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playingarea/PlayerHiddenScrollingViewBehavior$c.class */
    public static final class c extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PlayerHiddenScrollingViewBehavior f102304a;

        public c(PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior) {
            this.f102304a = playerHiddenScrollingViewBehavior;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionHorizontal(View view, int i7, int i8) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int clampViewPositionVertical(View view, int i7, int i8) {
            return MathUtils.clamp(i7, 0, this.f102304a.f102285E);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final int getViewVerticalDragRange(View view) {
            return this.f102304a.f102285E;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewDragStateChanged(int i7) {
            defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewDragStateChanged] ", C3259x.a(i7, "onViewDragStateChanged: state="), "PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewDragStateChanged");
            if (i7 == 1) {
                this.f102304a.setStateInternal(State.STATE_DRAGGING);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewPositionChanged(View view, int i7, int i8, int i9, int i10) {
            PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior = this.f102304a;
            State state = playerHiddenScrollingViewBehavior.getState();
            StringBuilder sbB = A.b(i7, i8, "onViewPositionChanged: left=", ", top=", ", dx=");
            C4690e.a(i9, i10, ", dy=", ", state=", sbB);
            sbB.append(state);
            BLog.i("PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewPositionChanged", "[theseus-united-PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewPositionChanged] " + sbB.toString());
            playerHiddenScrollingViewBehavior.f102292t.setValue(Integer.valueOf(i8));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final void onViewReleased(View view, float f7, float f8) {
            PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior = this.f102304a;
            State state = playerHiddenScrollingViewBehavior.getState();
            StringBuilder sbA = Dp.b.a("onViewReleased: xvel=", f7, ", yvel=", f8, ", state=");
            sbA.append(state);
            BLog.i("PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewReleased", "[theseus-united-PlayerHiddenScrollingViewBehavior$dragCallback$1-onViewReleased] " + sbA.toString());
            playerHiddenScrollingViewBehavior.startSettling(view, (!playerHiddenScrollingViewBehavior.f102282B || view.getTop() <= playerHiddenScrollingViewBehavior.f102283C) ? State.STATE_EXPANDED : State.STATE_HIDDEN);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public final boolean tryCaptureView(View view, int i7) {
            PlayerHiddenScrollingViewBehavior playerHiddenScrollingViewBehavior = this.f102304a;
            boolean z6 = false;
            if (playerHiddenScrollingViewBehavior.getState() == State.STATE_DRAGGING) {
                BLog.i("PlayerHiddenScrollingViewBehavior$dragCallback$1-tryCaptureView", "[theseus-united-PlayerHiddenScrollingViewBehavior$dragCallback$1-tryCaptureView] tryCaptureView: STATE_DRAGGING, ignoring capture");
                return false;
            }
            if (playerHiddenScrollingViewBehavior.getState() == State.STATE_EXPANDED) {
                WeakReference weakReference = playerHiddenScrollingViewBehavior.f102298z;
                if ((weakReference != null ? (View) weakReference.get() : null) != null) {
                    BLog.i("PlayerHiddenScrollingViewBehavior$dragCallback$1-tryCaptureView", "[theseus-united-PlayerHiddenScrollingViewBehavior$dragCallback$1-tryCaptureView] tryCaptureView: content can scroll up, ignoring capture");
                    return false;
                }
            }
            if (playerHiddenScrollingViewBehavior.f102281A == view) {
                z6 = true;
            }
            return z6;
        }
    }

    public PlayerHiddenScrollingViewBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        State state = State.STATE_EXPANDED;
        this.f102289q = state;
        MutableStateFlow<State> MutableStateFlow = StateFlowKt.MutableStateFlow(state);
        this.f102290r = MutableStateFlow;
        this.f102291s = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.f102292t = MutableStateFlow2;
        this.f102293u = FlowKt.asStateFlow(MutableStateFlow2);
        this.f102294v = -1;
        this.f102297y = new a(this);
        this.f102288H = new c(this);
    }

    public /* synthetic */ PlayerHiddenScrollingViewBehavior(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    private final VelocityTracker ensureVelocityTracker() {
        VelocityTracker velocityTracker = this.f102295w;
        VelocityTracker velocityTrackerObtain = velocityTracker;
        if (velocityTracker == null) {
            velocityTrackerObtain = VelocityTracker.obtain();
            this.f102295w = velocityTrackerObtain;
        }
        return velocityTrackerObtain;
    }

    private final View findScrollingChild(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && ViewCompat.isNestedScrollingEnabled(view) && view.canScrollVertically(-1)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewFindScrollingChild = findScrollingChild(coordinatorLayout, viewGroup.getChildAt(i7), motionEvent);
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final State getState() {
        return (State) this.f102290r.getValue();
    }

    private final int getTopOffsetForState(State state) {
        int i7 = b.f102303a[state.ordinal()];
        if (i7 == 1) {
            return 0;
        }
        if (i7 == 2) {
            return this.f102286F;
        }
        com.bilibili.bangumi.logic.page.detail.service.e.a("[theseus-united-PlayerHiddenScrollingViewBehavior-getTopOffsetForState] ", "getTopOffsetForState: Invalid state " + state + " to get top offset", "PlayerHiddenScrollingViewBehavior-getTopOffsetForState", (Throwable) null);
        return 0;
    }

    private final void reset() {
        BLog.i("PlayerHiddenScrollingViewBehavior-reset", "[theseus-united-PlayerHiddenScrollingViewBehavior-reset] reset: resetting state");
        this.f102294v = -1;
        VelocityTracker velocityTracker = this.f102295w;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f102295w = null;
    }

    private final void setState(State state) {
        this.f102290r.setValue(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setStateInternal(State state) {
        if (getState() == state) {
            return;
        }
        defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior-setStateInternal] ", "setStateInternal: state=" + state + ", lastStableState=" + this.f102289q, "PlayerHiddenScrollingViewBehavior-setStateInternal");
        setState(state);
        if (state == State.STATE_EXPANDED || (this.f102282B && state == State.STATE_HIDDEN)) {
            this.f102289q = state;
        }
    }

    private final boolean shouldHandleDraggingWithHelper() {
        return this.f102296x != null && (getState() == State.STATE_DRAGGING || this.f102282B);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startSettling(View view, State state) {
        defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior-startSettling] ", "startSettling: state=" + state, "PlayerHiddenScrollingViewBehavior-startSettling");
        int topOffsetForState = getTopOffsetForState(state);
        ViewDragHelper viewDragHelper = this.f102296x;
        if (viewDragHelper == null || !viewDragHelper.settleCapturedViewAt(view.getLeft(), topOffsetForState)) {
            setStateInternal(state);
        } else {
            setStateInternal(State.STATE_SETTLING);
            this.f102297y.a(state);
        }
    }

    @NotNull
    public final StateFlow<Integer> getOffsetFlow() {
        return this.f102293u;
    }

    @NotNull
    public final StateFlow<State> getStateFlow() {
        return this.f102291s;
    }

    public final float hideOffsetRatio() {
        if (this.f102283C <= 0) {
            return 0.0f;
        }
        return ((Number) this.f102293u.getValue()).floatValue() / this.f102283C;
    }

    public final void moveToExpanded() {
        defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior-moveToExpanded] ", "moveToExpanded: currentState=" + getState() + " " + this.f102286F, "PlayerHiddenScrollingViewBehavior-moveToExpanded");
        State state = getState();
        State state2 = State.STATE_EXPANDED;
        if (state == state2) {
            return;
        }
        setStateInternal(state2);
        View view = this.f102281A;
        if (view == null) {
            BLog.w("PlayerHiddenScrollingViewBehavior-moveToExpanded", "[theseus-united-PlayerHiddenScrollingViewBehavior-moveToExpanded] moveToExpanded: targetView is null, cannot move to expanded state", (Throwable) null);
        } else {
            ViewCompat.offsetTopAndBottom(view, -view.getTop());
            this.f102292t.setValue(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToLayoutParams(@NotNull CoordinatorLayout.LayoutParams layoutParams) {
        BLog.i("PlayerHiddenScrollingViewBehavior-onAttachedToLayoutParams", "[theseus-united-PlayerHiddenScrollingViewBehavior-onAttachedToLayoutParams] onAttachedToLayoutParams");
        super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onAttachedToLayoutParams(layoutParams);
        this.f102281A = null;
        this.f102296x = null;
    }

    public boolean onDependentViewChanged(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2) {
        if (getState() == State.STATE_EXPANDED) {
            return super.onDependentViewChanged(coordinatorLayout, view, view2);
        }
        BLog.i("PlayerHiddenScrollingViewBehavior-onDependentViewChanged", "[theseus-united-PlayerHiddenScrollingViewBehavior-onDependentViewChanged] onDependentViewChanged: STATE_HIDDEN, ignoring change");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromLayoutParams() {
        BLog.i("PlayerHiddenScrollingViewBehavior-onDetachedFromLayoutParams", "[theseus-united-PlayerHiddenScrollingViewBehavior-onDetachedFromLayoutParams] onDetachedFromLayoutParams");
        super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onDetachedFromLayoutParams();
        this.f102281A = null;
        this.f102296x = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull androidx.coordinatorlayout.widget.CoordinatorLayout r9, @org.jetbrains.annotations.NotNull android.view.View r10, @org.jetbrains.annotations.NotNull android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.united.page.playingarea.PlayerHiddenScrollingViewBehavior.onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.bilibili.ship.theseus.united.page.behavior.CollapsablePinnedBottomScrollingBehavior
    public boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i7) {
        int height = coordinatorLayout.getHeight();
        int height2 = view.getHeight();
        super.onLayoutChild(coordinatorLayout, view, i7);
        if (!(view instanceof ViewGroup)) {
            return true;
        }
        View view2 = this.f102281A;
        View childAt = view2;
        if (view2 == null) {
            childAt = ((ViewGroup) view).getChildAt(0);
            this.f102281A = childAt;
        }
        if (this.f102296x == null) {
            this.f102296x = ViewDragHelper.create((ViewGroup) view, this.f102288H);
        }
        this.f102285E = coordinatorLayout.getHeight();
        this.f102284D = childAt.getHeight();
        this.f102286F = ((ViewGroup) view).getHeight();
        if (this.f102282B && getState() == State.STATE_HIDDEN) {
            int top = this.f102286F - childAt.getTop();
            BLog.i("PlayerHiddenScrollingViewBehavior-onLayoutChild", "[theseus-united-PlayerHiddenScrollingViewBehavior-onLayoutChild] " + C3259x.a(top, "onLayoutChild: STATE_HIDDEN, offsetting target to bottom "));
            ViewCompat.offsetTopAndBottom(childAt, top);
        } else if (getState() == State.STATE_EXPANDED || height != this.f102285E || height2 != this.f102284D) {
            ViewCompat.offsetTopAndBottom(childAt, getCurrentOffset() - childAt.getTop());
        }
        this.f102292t.setValue(Integer.valueOf(childAt.getTop()));
        int i8 = this.f102284D;
        int i9 = this.f102286F;
        State state = getState();
        StringBuilder sbB = A.b(i8, i9, "onLayoutChild: childHeight=", ", containerHeight=", ", state=");
        sbB.append(state);
        defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior-onLayoutChild] ", sbB.toString(), "PlayerHiddenScrollingViewBehavior-onLayoutChild");
        return true;
    }

    public boolean onTouchEvent(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (getState() == State.STATE_DRAGGING && actionMasked == 0) {
            return true;
        }
        ViewDragHelper viewDragHelper = this.f102296x;
        if (viewDragHelper == null) {
            return false;
        }
        if (shouldHandleDraggingWithHelper()) {
            viewDragHelper.processTouchEvent(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        View view2 = this.f102281A;
        if (view2 == null) {
            return false;
        }
        ensureVelocityTracker().addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.f102287G && Math.abs(this.f102294v - motionEvent.getY()) > viewDragHelper.getTouchSlop()) {
            viewDragHelper.captureChildView(view2, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f102287G;
    }

    public final void setHideByDrag(boolean z6) {
        defpackage.a.b("[theseus-united-PlayerHiddenScrollingViewBehavior-setHideByDrag] ", "setHideByDrag: hideByDrag=" + z6 + ", currentState=" + getState(), "PlayerHiddenScrollingViewBehavior-setHideByDrag");
        this.f102282B = z6;
    }
}

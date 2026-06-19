package com.bilibili.ship.theseus.united.page.behavior;

import Ef.c;
import Vn.A;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.media3.exoplayer.C4690e;
import androidx.viewpager.widget.ViewPager;
import cf.e;
import com.bilibili.ad.adview.pegasus.holders.inline.player.egg.tragger.slide.f;
import com.bilibili.ship.theseus.united.widget.PinnedBottomFrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import gv0.C7382c;
import gv0.InterfaceC7381b;
import j4.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q4.D;
import tv.danmaku.android.log.BLog;
import tv.danmaku.bili.widget.PinnedBottomScrollingBehavior;
import tv.danmaku.bili.widget.RecyclerView;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/behavior/CollapsablePinnedBottomScrollingBehavior.class */
@StabilityInferred(parameters = 0)
public class CollapsablePinnedBottomScrollingBehavior extends PinnedBottomScrollingBehavior {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f99054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public View f99055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Integer> f99056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f99057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f99058f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public View f99059g;

    @NotNull
    public final MutableStateFlow<Integer> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final StateFlow<Integer> f99060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OverScroller f99061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Runnable f99062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f99063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<Float> f99064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final StateFlow<Float> f99065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public List<a> f99066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public List<a> f99067p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/behavior/CollapsablePinnedBottomScrollingBehavior$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f99068a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f99069b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99070c;

        public a(@NotNull View view, int i7, int i8) {
            this.f99068a = view;
            this.f99069b = i7;
            this.f99070c = i8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f99068a, aVar.f99068a) && this.f99069b == aVar.f99069b && this.f99070c == aVar.f99070c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f99070c) + I.a(this.f99069b, this.f99068a.hashCode() * 31, 31);
        }

        @NotNull
        public final String toString() {
            View view = this.f99068a;
            StringBuilder sb = new StringBuilder("ViewInfo(view=");
            sb.append(view);
            sb.append(", originalTopMargin=");
            sb.append(this.f99069b);
            sb.append(", originalBottomMargin=");
            return C4277b.a(this.f99070c, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/behavior/CollapsablePinnedBottomScrollingBehavior$b.class */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsablePinnedBottomScrollingBehavior f99071a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Ref.IntRef f99072b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f99073c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Ref.IntRef f99074d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f99075e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final View f99076f;

        public b(CollapsablePinnedBottomScrollingBehavior collapsablePinnedBottomScrollingBehavior, Ref.IntRef intRef, int i7, Ref.IntRef intRef2, boolean z6, View view) {
            this.f99071a = collapsablePinnedBottomScrollingBehavior;
            this.f99072b = intRef;
            this.f99073c = i7;
            this.f99074d = intRef2;
            this.f99075e = z6;
            this.f99076f = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.f99071a.f99061j.computeScrollOffset()) {
                D.a(this.f99074d.element, this.f99073c, "fling completed: totalScrolled=", "/", "CollapsablePinnedBottomScrollingBehavior");
                BLog.d("CollapsablePinnedBottomScrollingBehavior", ">>>>>> startFling 结束 <<<<<<");
                this.f99071a.f99062k = null;
                return;
            }
            int currY = this.f99071a.f99061j.getCurrY();
            Ref.IntRef intRef = this.f99072b;
            int i7 = currY - intRef.element;
            intRef.element = currY;
            if (i7 != 0) {
                int i8 = this.f99073c - this.f99074d.element;
                if (i8 > 0) {
                    int iCoerceAtMost = RangesKt.coerceAtMost(i7, i8);
                    int i9 = this.f99075e ? -iCoerceAtMost : iCoerceAtMost;
                    int iAbs = Math.abs(this.f99071a.offsetViews(i9));
                    Ref.IntRef intRef2 = this.f99074d;
                    intRef2.element = Math.abs(iAbs) + intRef2.element;
                    int i10 = this.f99074d.element;
                    int i11 = this.f99073c;
                    StringBuilder sbB = A.b(i7, iCoerceAtMost, "fling running: dy=", ", actualDy=", ", offset=");
                    C4690e.a(i9, iAbs, ", actualOffset=", ", totalScrolled=", sbB);
                    C4690e.a(i10, i11, "/", ", currY=", sbB);
                    sbB.append(currY);
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", sbB.toString());
                    if (Math.abs(iAbs) < Math.abs(i9)) {
                        BLog.d("CollapsablePinnedBottomScrollingBehavior", "fling: 到达边界（offsetViews 限制），继续消耗惯性");
                    }
                } else {
                    D.a(i7, currY, "fling: 已到达边界，消耗剩余惯性 dy=", ", currY=", "CollapsablePinnedBottomScrollingBehavior");
                }
            }
            ViewCompat.postOnAnimation(this.f99076f, this);
        }
    }

    public CollapsablePinnedBottomScrollingBehavior(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        MutableStateFlow<Integer> MutableStateFlow = StateFlowKt.MutableStateFlow(0);
        this.f99056d = MutableStateFlow;
        this.f99057e = FlowKt.asStateFlow(MutableStateFlow);
        MutableStateFlow<Integer> MutableStateFlow2 = StateFlowKt.MutableStateFlow(0);
        this.h = MutableStateFlow2;
        this.f99060i = FlowKt.asStateFlow(MutableStateFlow2);
        this.f99061j = new OverScroller(context);
        MutableStateFlow<Float> MutableStateFlow3 = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));
        this.f99064m = MutableStateFlow3;
        this.f99065n = FlowKt.asStateFlow(MutableStateFlow3);
    }

    public /* synthetic */ CollapsablePinnedBottomScrollingBehavior(Context context, AttributeSet attributeSet, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i7 & 2) != 0 ? null : attributeSet);
    }

    private final void adjustBottomMargins() {
        List<a> list;
        if (C7382c.a() && (list = this.f99067p) != null) {
            for (a aVar : list) {
                adjustMargin$default(this, aVar.f99068a, null, Integer.valueOf((getScrollableHeight() + aVar.f99070c) - Math.abs(getCurrentOffset())), 2, null);
            }
        }
    }

    private final void adjustMargin(View view, Integer num, Integer num2) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        if (num != null && marginLayoutParams.topMargin != num.intValue()) {
            marginLayoutParams.topMargin = num.intValue();
        }
        if (num2 != null && marginLayoutParams.bottomMargin != num2.intValue()) {
            marginLayoutParams.bottomMargin = num2.intValue();
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static /* synthetic */ void adjustMargin$default(CollapsablePinnedBottomScrollingBehavior collapsablePinnedBottomScrollingBehavior, View view, Integer num, Integer num2, int i7, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adjustMargin");
        }
        if ((i7 & 2) != 0) {
            num = null;
        }
        if ((i7 & 4) != 0) {
            num2 = null;
        }
        collapsablePinnedBottomScrollingBehavior.adjustMargin(view, num, num2);
    }

    private final void adjustTopMargins() {
        List<a> list;
        if (C7382c.a() && (list = this.f99066o) != null) {
            for (a aVar : list) {
                adjustMargin$default(this, aVar.f99068a, Integer.valueOf(Math.abs(getCurrentOffset()) + aVar.f99069b), null, 4, null);
            }
        }
    }

    private final void disableRecyclerViewOverScroll(View view) {
        RecyclerView recyclerViewFindRecyclerViewRecursive = findRecyclerViewRecursive(view);
        if (recyclerViewFindRecyclerViewRecursive == null || recyclerViewFindRecyclerViewRecursive.getOverScrollMode() == 2) {
            return;
        }
        recyclerViewFindRecyclerViewRecursive.setOverScrollMode(2);
    }

    private final AppBarLayout findAppBar(CoordinatorLayout coordinatorLayout, View view) {
        Iterator<View> it = coordinatorLayout.getDependencies(view).iterator();
        while (it.hasNext()) {
            AppBarLayout appBarLayout = (View) it.next();
            if (appBarLayout instanceof AppBarLayout) {
                return appBarLayout;
            }
        }
        return null;
    }

    private final View findCollapsableChildRecursive(View view) {
        if (view instanceof InterfaceC7381b) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View viewFindCollapsableChildRecursive = findCollapsableChildRecursive(viewGroup.getChildAt(i7));
            if (viewFindCollapsableChildRecursive != null) {
                return viewFindCollapsableChildRecursive;
            }
        }
        return null;
    }

    private final RecyclerView findRecyclerViewRecursive(View view) {
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            RecyclerView recyclerViewFindRecyclerViewRecursive = findRecyclerViewRecursive(viewGroup.getChildAt(i7));
            if (recyclerViewFindRecyclerViewRecursive != null) {
                return recyclerViewFindRecyclerViewRecursive;
            }
        }
        return null;
    }

    private final void findViewsNeedToAdjustBottom() {
        List<a> list;
        if (C7382c.a() && this.f99067p == null) {
            this.f99067p = new ArrayList();
            View view = this.f99059g;
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                int bottom = viewGroup.getBottom();
                for (View view2 : ViewGroupKt.getChildren(viewGroup)) {
                    if ((view2 instanceof ViewGroup) && !(view2 instanceof ViewPager) && !(view2 instanceof PinnedBottomFrameLayout)) {
                        ViewGroup viewGroup2 = (ViewGroup) view2;
                        if (viewGroup2.getBottom() == bottom && (list = this.f99067p) != null) {
                            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            int i7 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            ((ArrayList) list).add(new a(view2, i7, marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
                        }
                    }
                }
            }
        }
    }

    private final void findViewsNeedToAdjustTop(View view) {
        List<a> list;
        if (C7382c.a() && view.getHeight() == view.getMeasuredHeight() && this.f99066o == null) {
            this.f99066o = new ArrayList();
            View view2 = this.f99059g;
            ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
            if (viewGroup != null) {
                for (View view3 : ViewGroupKt.getChildren(viewGroup)) {
                    if ((view3 instanceof ViewGroup) && !(view3 instanceof InterfaceC7381b)) {
                        ViewGroup viewGroup2 = (ViewGroup) view3;
                        if (viewGroup2.getTop() < view.getBottom() && (list = this.f99066o) != null) {
                            ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                            int i7 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
                            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                            ((ArrayList) list).add(new a(view3, i7, marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0));
                        }
                    }
                }
            }
        }
    }

    private final int getAppBarLockedHeight(AppBarLayout appBarLayout) {
        IntRange intRangeUntil = RangesKt.until(0, appBarLayout.getChildCount());
        int minimumHeight = appBarLayout.getMinimumHeight();
        IntIterator it = intRangeUntil.iterator();
        while (it.hasNext()) {
            minimumHeight = Math.max(minimumHeight, appBarLayout.getChildAt(it.nextInt()).getMinimumHeight());
        }
        return minimumHeight;
    }

    private final int getMinVisibleHeight() {
        return RangesKt.coerceIn(this.f99058f, 0, getScrollableHeight());
    }

    private final boolean isAppBarCollapsed(AppBarLayout appBarLayout) {
        return appBarLayout.getTotalScrollRange() != 0 && appBarLayout.getBottom() <= getAppBarLockedHeight(appBarLayout);
    }

    private final boolean isAppBarScrollable(AppBarLayout appBarLayout) {
        int childCount = appBarLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            AppBarLayout.LayoutParams layoutParams = appBarLayout.getChildAt(i7).getLayoutParams();
            AppBarLayout.LayoutParams layoutParams2 = layoutParams instanceof AppBarLayout.LayoutParams ? layoutParams : null;
            if (layoutParams2 != null && (layoutParams2.getScrollFlags() & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean isViewParentAdjustedBottom(CoordinatorLayout coordinatorLayout, View view) {
        List<a> list;
        if (!C7382c.a() || (list = this.f99067p) == null) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (isViewInParent(coordinatorLayout, view, ((a) it.next()).f99068a)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int offsetViews(int i7) {
        View view = this.f99059g;
        if (view == null || i7 == 0) {
            return 0;
        }
        int iCoerceIn = RangesKt.coerceIn(getCurrentOffset() + i7, -(getScrollableHeight() - getMinVisibleHeight()), 0);
        int currentOffset = iCoerceIn - getCurrentOffset();
        if (currentOffset != 0) {
            ViewCompat.offsetTopAndBottom(view, currentOffset);
            Iterator it = ((PinnedBottomScrollingBehavior) this).a.iterator();
            while (it.hasNext()) {
                ViewCompat.offsetTopAndBottom((View) it.next(), -currentOffset);
            }
            setCurrentOffset(iCoerceIn);
            updateCollapseRatio();
        }
        return currentOffset;
    }

    private final void startFling(View view, float f7, int i7) {
        int i8;
        BLog.d("CollapsablePinnedBottomScrollingBehavior", ">>>>>> startFling 开始 <<<<<<");
        StringBuilder sb = new StringBuilder("startFling: velocityY=");
        sb.append(f7);
        sb.append(", maxDistance=");
        com.bilibili.ad.adview.videodetail.pausedpage.brand.base.b.b(i7, "CollapsablePinnedBottomScrollingBehavior", sb);
        stopFling(view);
        if (f7 > 0.0f) {
            i8 = (int) f7;
        } else {
            i8 = -((int) f7);
            i7 = -i7;
        }
        this.f99061j.fling(0, 0, 0, i8, 0, 0, 0, Integer.MAX_VALUE);
        int finalY = this.f99061j.getFinalY();
        BLog.d("CollapsablePinnedBottomScrollingBehavior", "startFling: scrollerVelocity=" + i8 + ", maxScrollDistance=" + i7);
        c.a(finalY, "startFling: scroller.finalY=", " (预计滚动距离)", "CollapsablePinnedBottomScrollingBehavior");
        BLog.d("CollapsablePinnedBottomScrollingBehavior", "startFling: 预计能否滚完: " + (finalY >= i7));
        b bVar = new b(this, new Ref.IntRef(), i7, new Ref.IntRef(), f7 > 0.0f, view);
        this.f99062k = bVar;
        ViewCompat.postOnAnimation(view, bVar);
    }

    private final void stopFling(View view) {
        Runnable runnable = this.f99062k;
        if (runnable != null) {
            view.removeCallbacks(runnable);
            this.f99062k = null;
        }
        if (this.f99061j.isFinished()) {
            return;
        }
        this.f99061j.abortAnimation();
    }

    private final void updateCollapseRatio() {
        int scrollableHeight = getScrollableHeight() - getMinVisibleHeight();
        float fCoerceIn = RangesKt.coerceIn(scrollableHeight > 0 ? Math.abs(getCurrentOffset()) / scrollableHeight : 0.0f, 0.0f, 1.0f);
        MutableStateFlow<Float> mutableStateFlow = this.f99064m;
        if (((Number) mutableStateFlow.getValue()).floatValue() != fCoerceIn) {
            mutableStateFlow.setValue(Float.valueOf(fCoerceIn));
            StringBuilder sbB = A.b((int) (fCoerceIn * 100), getCurrentOffset(), "广告区域折叠比例变化: ", "% (currentOffset=", ", maxScrollDistance=");
            sbB.append(scrollableHeight);
            sbB.append(")");
            BLog.d("CollapsablePinnedBottomScrollingBehavior", sbB.toString());
        }
        adjustTopMargins();
        adjustBottomMargins();
    }

    @NotNull
    public final StateFlow<Float> getCollapseRatioFlow() {
        return this.f99065n;
    }

    public final int getCurrentOffset() {
        return ((Number) this.h.getValue()).intValue();
    }

    @NotNull
    public final StateFlow<Integer> getCurrentOffsetFlow() {
        return this.f99060i;
    }

    public int getScrollableDownDistance() {
        return Math.abs(getCurrentOffset());
    }

    public final int getScrollableHeight() {
        return ((Number) this.f99056d.getValue()).intValue();
    }

    @NotNull
    public final StateFlow<Integer> getScrollableHeightFlow() {
        return this.f99057e;
    }

    public int getScrollableUpDistance() {
        if (getScrollableHeight() == 0) {
            return 0;
        }
        return RangesKt.coerceAtLeast((getScrollableHeight() - getMinVisibleHeight()) - (-getCurrentOffset()), 0);
    }

    public boolean layoutDependsOn(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2) {
        return view2 instanceof AppBarLayout;
    }

    public boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i7) {
        if (!this.f99054b) {
            return super.onLayoutChild(coordinatorLayout, view, i7);
        }
        if (view instanceof ViewGroup) {
            if (this.f99059g == null) {
                this.f99059g = ((ViewGroup) view).getChildAt(0);
            }
            if (this.f99055c == null) {
                this.f99055c = findCollapsableChildRecursive(view);
            }
        }
        View view2 = this.f99055c;
        if (view2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = null;
            if (view2.getVisibility() != 0 || view2.getMeasuredHeight() <= 0) {
                setScrollableHeight(0);
                final View view3 = this.f99059g;
                if (view3 != null) {
                    ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = null;
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                    }
                    if (getCurrentOffset() != 0) {
                        ViewCompat.offsetTopAndBottom(view3, -getCurrentOffset());
                        setCurrentOffset(0);
                        BLog.d("CollapsablePinnedBottomScrollingBehavior", "广告区域不可见，重置 contentView 位置，currentOffset=0");
                    }
                    if (marginLayoutParams2 != null && marginLayoutParams2.bottomMargin != 0) {
                        marginLayoutParams2.bottomMargin = 0;
                        final ViewGroup.MarginLayoutParams marginLayoutParams3 = marginLayoutParams2;
                        view3.post(new Runnable(view3, marginLayoutParams3) { // from class: gv0.a

                            /* JADX INFO: renamed from: a, reason: collision with root package name */
                            public final View f120787a;

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final ViewGroup.MarginLayoutParams f120788b;

                            {
                                this.f120787a = view3;
                                this.f120788b = marginLayoutParams3;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f120787a.setLayoutParams(this.f120788b);
                            }
                        });
                    }
                    updateCollapseRatio();
                }
            } else {
                setScrollableHeight(view2.getMeasuredHeight());
                findViewsNeedToAdjustTop(view2);
                findViewsNeedToAdjustBottom();
                View view4 = this.f99059g;
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
                    }
                    if (marginLayoutParams != null && marginLayoutParams.bottomMargin != (-getScrollableHeight())) {
                        marginLayoutParams.bottomMargin = -getScrollableHeight();
                        view4.setLayoutParams(marginLayoutParams);
                        BLog.d("CollapsablePinnedBottomScrollingBehavior", "设置 " + view4 + " 负 bottom margin: -" + getScrollableHeight());
                        adjustTopMargins();
                        adjustBottomMargins();
                    }
                    disableRecyclerViewOverScroll(view4);
                }
            }
            defpackage.a.a(getScrollableHeight(), "广告区域高度: ", "CollapsablePinnedBottomScrollingBehavior");
        }
        return super.onLayoutChild(coordinatorLayout, view, i7);
    }

    public boolean onNestedFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, float f7, float f8, boolean z6) {
        BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedFling: velocityY=" + f8 + ", consumed=" + z6);
        return false;
    }

    public boolean onNestedPreFling(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, float f7, float f8) {
        boolean z6;
        BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling: velocityY=" + f8 + ", scrollableHeight=" + getScrollableHeight());
        if (getScrollableHeight() == 0) {
            return false;
        }
        if (f8 > 0.0f) {
            int scrollableUpDistance = getScrollableUpDistance();
            defpackage.a.a(scrollableUpDistance, "onNestedPreFling 向上: scrollableUp=", "CollapsablePinnedBottomScrollingBehavior");
            if (scrollableUpDistance > 0) {
                AppBarLayout appBarLayoutFindAppBar = findAppBar(coordinatorLayout, view);
                if (appBarLayoutFindAppBar != null) {
                    boolean zIsAppBarCollapsed = isAppBarCollapsed(appBarLayoutFindAppBar);
                    boolean zIsAppBarScrollable = isAppBarScrollable(appBarLayoutFindAppBar);
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling: AppBar collapsed=" + zIsAppBarCollapsed + ", scrollable=" + zIsAppBarScrollable);
                    if (!zIsAppBarCollapsed && zIsAppBarScrollable) {
                        BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向上: 不拦截，返回 false");
                    }
                } else {
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling: AppBar=null");
                }
                startFling(view, f8, scrollableUpDistance);
                BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向上: 拦截成功, 返回 true");
                return true;
            }
        } else if (f8 < 0.0f) {
            AppBarLayout appBarLayoutFindAppBar2 = findAppBar(coordinatorLayout, view);
            if (appBarLayoutFindAppBar2 != null) {
                z6 = appBarLayoutFindAppBar2.getTop() == 0 && appBarLayoutFindAppBar2.getBottom() >= appBarLayoutFindAppBar2.getHeight();
                int top = appBarLayoutFindAppBar2.getTop();
                int bottom = appBarLayoutFindAppBar2.getBottom();
                int height = appBarLayoutFindAppBar2.getHeight();
                StringBuilder sbB = A.b(top, bottom, "onNestedPreFling 向下: AppBar top=", ", bottom=", ", height=");
                sbB.append(height);
                sbB.append(", expanded=");
                sbB.append(z6);
                BLog.d("CollapsablePinnedBottomScrollingBehavior", sbB.toString());
            } else {
                BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向下: AppBar=null, 视为已展开");
                z6 = true;
            }
            int scrollableDownDistance = getScrollableDownDistance();
            RecyclerView recyclerViewFindRecyclerViewRecursive = findRecyclerViewRecursive(view2);
            boolean z7 = (recyclerViewFindRecyclerViewRecursive == null || recyclerViewFindRecyclerViewRecursive.canScrollVertically(-1)) ? false : true;
            f.a(e.a(scrollableDownDistance, "onNestedPreFling 向下: isAppBarExpanded=", ", scrollableDown=", ", isRecyclerViewAtTop=", z6), z7, "CollapsablePinnedBottomScrollingBehavior");
            if (!z6 || scrollableDownDistance <= 0) {
                if (!z6 && scrollableDownDistance > 0) {
                    this.f99063l = f8;
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向下: AppBar未展开，保存速度=" + f8);
                }
            } else {
                if (z7) {
                    startFling(view, f8, -scrollableDownDistance);
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向下: RV已在顶部，AppBar已展开，拦截成功, 返回 true");
                    return true;
                }
                this.f99063l = f8;
                BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling 向下: RV未在顶部，保存速度，返回 false");
            }
        }
        BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedPreFling: 返回 false（不拦截）");
        return false;
    }

    public void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i7, int i8, @NotNull int[] iArr, int i9) {
        int scrollableUpDistance;
        if (getScrollableHeight() != 0 && i8 > 0 && (scrollableUpDistance = getScrollableUpDistance()) > 0) {
            AppBarLayout appBarLayoutFindAppBar = findAppBar(coordinatorLayout, view);
            if (appBarLayoutFindAppBar == null || isAppBarCollapsed(appBarLayoutFindAppBar) || !isAppBarScrollable(appBarLayoutFindAppBar)) {
                int iAbs = Math.abs(offsetViews(-RangesKt.coerceAtMost(i8, scrollableUpDistance)));
                iArr[1] = iArr[1] + iAbs;
                defpackage.a.a(iAbs, "onNestedPreScroll 向上: actualConsumed=", "CollapsablePinnedBottomScrollingBehavior");
            }
        }
    }

    public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i7, int i8, int i9, int i10, int i11, @NotNull int[] iArr) {
        int scrollableUpDistance;
        int scrollableDownDistance;
        if (getScrollableHeight() == 0) {
            return;
        }
        if (i10 >= 0) {
            if (i10 <= 0 || (scrollableUpDistance = getScrollableUpDistance()) <= 0) {
                return;
            }
            int iAbs = Math.abs(offsetViews(-RangesKt.coerceAtMost(i10, scrollableUpDistance)));
            iArr[1] = iArr[1] + iAbs;
            D.a(iAbs, i11, "onNestedScroll 向上: actualConsumed=", ", type=", "CollapsablePinnedBottomScrollingBehavior");
            return;
        }
        AppBarLayout appBarLayoutFindAppBar = findAppBar(coordinatorLayout, view);
        if ((appBarLayoutFindAppBar == null || (appBarLayoutFindAppBar.getTop() == 0 && appBarLayoutFindAppBar.getBottom() >= appBarLayoutFindAppBar.getHeight())) && (scrollableDownDistance = getScrollableDownDistance()) > 0) {
            if (i11 == 1) {
                float f7 = this.f99063l;
                if (f7 != 0.0f) {
                    BLog.d("CollapsablePinnedBottomScrollingBehavior", "onNestedScroll: dyUnconsumed=" + i10 + ", pendingVelocity=" + f7);
                    float fAbs = (float) Math.abs(i10);
                    iArr[1] = Math.abs(i10) + iArr[1];
                    startFling(view, -(fAbs * 60.0f), -scrollableDownDistance);
                    this.f99063l = 0.0f;
                    return;
                }
            }
            int iOffsetViews = offsetViews(RangesKt.coerceAtMost(Math.abs(i10), scrollableDownDistance));
            iArr[1] = iArr[1] + iOffsetViews;
            D.a(iOffsetViews, i11, "onNestedScroll 向下（广告区）: actualConsumed=", ", type=", "CollapsablePinnedBottomScrollingBehavior");
        }
    }

    public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, int i7, int i8) {
        if (i8 == 0) {
            stopFling(view);
            this.f99063l = 0.0f;
            BLog.d("CollapsablePinnedBottomScrollingBehavior", "onStartNestedScroll: 清除待处理的 fling");
        }
        return (i7 & 2) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStopNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i7) {
        super/*androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior*/.onStopNestedScroll(coordinatorLayout, view, view2, i7);
        defpackage.a.a(i7, "onStopNestedScroll: type=", "CollapsablePinnedBottomScrollingBehavior");
    }

    public final void setCurrentOffset(int i7) {
        this.h.setValue(Integer.valueOf(i7));
    }

    public final void setMinVisibleHeight(int i7) {
        this.f99058f = i7;
        com.bilibili.bplus.im.protobuf.a.b(i7, getScrollableHeight(), "setMinVisibleHeight: ", ", scrollableHeight=", "CollapsablePinnedBottomScrollingBehavior");
        int i8 = -(getScrollableHeight() - getMinVisibleHeight());
        if (getCurrentOffset() >= i8) {
            updateCollapseRatio();
            return;
        }
        int currentOffset = getCurrentOffset();
        View view = this.f99059g;
        if (view != null) {
            ViewCompat.offsetTopAndBottom(view, i8 - currentOffset);
            setCurrentOffset(i8);
            updateCollapseRatio();
        }
    }

    public final void setScrollCollapseEnable(boolean z6) {
        this.f99054b = z6;
        t.a("setScrollCollapseEnabledEnabled, enabled=", "CollapsablePinnedBottomScrollingBehavior", z6);
    }

    public final void setScrollableHeight(int i7) {
        this.f99056d.setValue(Integer.valueOf(i7));
    }

    public boolean updatePinnedOffset(@Nullable CoordinatorLayout coordinatorLayout, @Nullable View view, @Nullable View view2) {
        if (coordinatorLayout == null || view == null) {
            return false;
        }
        if (!this.f99054b) {
            return super.updatePinnedOffset(coordinatorLayout, view, view2);
        }
        ViewGroup.LayoutParams layoutParams = view2 != null ? view2.getLayoutParams() : null;
        CoordinatorLayout.LayoutParams layoutParams2 = layoutParams instanceof CoordinatorLayout.LayoutParams ? (CoordinatorLayout.LayoutParams) layoutParams : null;
        CoordinatorLayout.Behavior behavior = layoutParams2 != null ? layoutParams2.getBehavior() : null;
        boolean z6 = behavior instanceof AppBarLayout.Behavior;
        int topAndBottomOffset = z6 ? ((AppBarLayout.Behavior) behavior).getTopAndBottomOffset() : 0;
        int totalScrollRange = view2 instanceof AppBarLayout ? ((AppBarLayout) view2).getTotalScrollRange() : 0;
        for (View view3 : ((PinnedBottomScrollingBehavior) this).a) {
            if (!layoutDependsOn(coordinatorLayout, view, view3) && view3.isLaidOut() && isViewInParent(coordinatorLayout, view3, view)) {
                Object parent = view3.getParent();
                View view4 = parent instanceof View ? (View) parent : null;
                if (view4 != null) {
                    ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                    if (marginLayoutParams != null) {
                        view3.offsetTopAndBottom(topAndBottomOffset);
                        int height = ((view4.getHeight() - (totalScrollRange + topAndBottomOffset)) - marginLayoutParams.bottomMargin) - (isViewParentAdjustedBottom(coordinatorLayout, view3) ? 0 : getCurrentOffset() + getScrollableHeight());
                        view3.layout(view3.getLeft(), (height - view3.getHeight()) - marginLayoutParams.topMargin, view3.getRight(), height);
                    }
                }
            }
        }
        return z6;
    }
}

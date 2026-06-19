package com.bilibili.opd.app.bizcommon.hybridruntime.scroll;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.C3237a;
import androidx.core.view.InterfaceC4571o;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.media3.exoplayer.analytics.C4667i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout.class */
public class ConsecutiveScrollerLayout extends ViewGroup implements InterfaceC4571o {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final com.bilibili.opd.app.bizcommon.hybridruntime.scroll.a f73592B = new Object();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f73593A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f73594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f73595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final OverScroller f73596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public VelocityTracker f73597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public VelocityTracker f73598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f73599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f73600g;
    public final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f73601i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f73602j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f73603k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int[] f73604l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f73605m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f73606n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f73607o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final NestedScrollingParentHelper f73608p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final NestedScrollingChildHelper f73609q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f73610r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f73611s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f73612t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f73613u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f73614v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f73615w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final List<View> f73616x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final List<View> f73617y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f73618z;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$LayoutParams.class */
    public static final class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f73619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f73620b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Align f73621c;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$LayoutParams$Align.class */
        public enum Align {
            LEFT(1),
            RIGHT(2),
            CENTER(3);

            int value;

            Align(int i7) {
                this.value = i7;
            }

            public static Align get(int i7) {
                return i7 != 2 ? i7 != 3 ? LEFT : CENTER : RIGHT;
            }
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
            this.f73619a = true;
            this.f73620b = true;
            this.f73621c = Align.LEFT;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f73622a;

        /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:11:0x002f
            	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
            	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
            	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
            */
        static {
            /*
                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams$Align[] r0 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.LayoutParams.Align.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r4 = r0
                r0 = r4
                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.a.f73622a = r0
                r0 = r4
                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams$Align r1 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.LayoutParams.Align.RIGHT     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L14:
                int[] r0 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.a.f73622a     // Catch: java.lang.NoSuchFieldError -> L2b java.lang.NoSuchFieldError -> L2f
                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams$Align r1 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.LayoutParams.Align.CENTER     // Catch: java.lang.NoSuchFieldError -> L2f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2f
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2f
            L1f:
                int[] r0 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.a.f73622a     // Catch: java.lang.NoSuchFieldError -> L2f java.lang.NoSuchFieldError -> L33
                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams$Align r1 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.LayoutParams.Align.LEFT     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L2a:
                return
            L2b:
                r4 = move-exception
                goto L14
            L2f:
                r4 = move-exception
                goto L1f
            L33:
                r4 = move-exception
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.a.m7820clinit():void");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$b.class */
    public interface b {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$c.class */
    public interface c {
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/ConsecutiveScrollerLayout$d.class */
    public interface d {
    }

    public ConsecutiveScrollerLayout(Context context) {
        this(context, null);
    }

    public ConsecutiveScrollerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f73604l = new int[2];
        this.f73605m = false;
        this.f73606n = 0;
        this.f73610r = new int[2];
        this.f73611s = new int[2];
        this.f73614v = -1;
        this.f73616x = new ArrayList();
        this.f73617y = new ArrayList();
        this.f73618z = 0;
        this.f73593A = 0;
        this.f73596c = new OverScroller(getContext(), f73592B);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f73599f = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f73600g = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        setWillNotDraw(false);
        setVerticalScrollBarEnabled(true);
        this.f73608p = new NestedScrollingParentHelper(this);
        this.f73609q = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        setChildrenDrawingOrderEnabled(true);
    }

    private View getBottomView() {
        List<View> effectiveChildren = getEffectiveChildren();
        if (effectiveChildren.isEmpty()) {
            return null;
        }
        return (View) C4667i.a(1, effectiveChildren);
    }

    private List<View> getEffectiveChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8 && childAt.getHeight() > 0) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    private List<View> getNonGoneChildren() {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z6) {
        int i7;
        int iC;
        List<View> scrolledViews;
        int iC2;
        if (!this.f73605m && this.f73596c.isFinished() && this.f73614v == -1) {
            computeVerticalScrollOffset();
            View viewC = c();
            if (viewC == null) {
                return;
            }
            int iIndexOfChild = indexOfChild(viewC);
            if (z6) {
                int iF = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.f(viewC);
                int top = viewC.getTop() - getScrollY();
                if (iF > 0 && top < 0) {
                    int iMin = Math.min(iF, -top);
                    i(getScrollY() - iMin);
                    com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.g(viewC).scrollBy(0, iMin);
                }
            }
            int i8 = 0;
            while (true) {
                i7 = iIndexOfChild;
                if (i8 >= iIndexOfChild) {
                    break;
                }
                KeyEvent.Callback childAt = getChildAt(i8);
                if ((childAt instanceof com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) && (scrolledViews = ((com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) childAt).getScrolledViews()) != null && !scrolledViews.isEmpty()) {
                    int size = scrolledViews.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        View view = scrolledViews.get(i9);
                        do {
                            int iF2 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.f(view);
                            if (iF2 > 0) {
                                int iC3 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view);
                                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.g(view).scrollBy(0, iF2);
                                iC2 = iC3 - com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view);
                            } else {
                                iC2 = 0;
                            }
                        } while (iC2 != 0);
                    }
                }
                i8++;
            }
            while (true) {
                int i10 = i7 + 1;
                if (i10 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i10);
                if (i10 != getChildCount() - 1 || childAt2.getHeight() >= getHeight() || getScrollY() < this.f73595b) {
                    i7 = i10;
                    if (childAt2 instanceof com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) {
                        List<View> scrolledViews2 = ((com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) childAt2).getScrolledViews();
                        i7 = i10;
                        if (scrolledViews2 != null) {
                            i7 = i10;
                            if (!scrolledViews2.isEmpty()) {
                                int size2 = scrolledViews2.size();
                                int i11 = 0;
                                while (true) {
                                    i7 = i10;
                                    if (i11 < size2) {
                                        View view2 = scrolledViews2.get(i11);
                                        do {
                                            int iMin2 = (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(view2) && com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.b(view2, -1)) ? Math.min(-com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view2), -1) : 0;
                                            if (iMin2 < 0) {
                                                int iC4 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view2);
                                                com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.g(view2).scrollBy(0, iMin2);
                                                iC = iC4 - com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view2);
                                            } else {
                                                iC = 0;
                                            }
                                        } while (iC != 0);
                                        i11++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i7 = i10;
                }
            }
            this.f73594a = computeVerticalScrollOffset();
            if (z6) {
                computeVerticalScrollOffset();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        List<View> scrolledViews;
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = 0;
        }
        super.addView(view, i7, layoutParams);
        if (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(view)) {
            view.setVerticalScrollBarEnabled(false);
            view.setHorizontalScrollBarEnabled(false);
            view.setOverScrollMode(2);
            ViewCompat.setNestedScrollingEnabled(view, false);
            if ((view instanceof com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) && (scrolledViews = ((com.bilibili.opd.app.bizcommon.hybridruntime.scroll.b) view).getScrolledViews()) != null && !scrolledViews.isEmpty()) {
                int size = scrolledViews.size();
                for (int i8 = 0; i8 < size; i8++) {
                    View view2 = scrolledViews.get(i8);
                    view2.setVerticalScrollBarEnabled(false);
                    view2.setHorizontalScrollBarEnabled(false);
                    view2.setOverScrollMode(2);
                    ViewCompat.setNestedScrollingEnabled(view2, false);
                }
            }
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setClipToPadding(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010c A[EDGE_INSN: B:101:0x010c->B:37:0x010c BREAK  A[LOOP:0: B:5:0x000b->B:103:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0304 A[EDGE_INSN: B:106:0x0304->B:97:0x0304 BREAK  A[LOOP:1: B:41:0x011f->B:108:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r6) {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.b(int):void");
    }

    public final View c() {
        int paddingTop = getPaddingTop() + getScrollY();
        List<View> effectiveChildren = getEffectiveChildren();
        int size = effectiveChildren.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = effectiveChildren.get(i7);
            if (view.getTop() <= paddingTop && view.getBottom() > paddingTop) {
                return view;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return i7 > 0 ? !f() : !g();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        int scrollY = getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i7 = 0;
        while (i7 < size) {
            View view = nonGoneChildren.get(i7);
            int iC = scrollY;
            if (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(view)) {
                iC = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.c(view) + scrollY;
            }
            i7++;
            scrollY = iC;
        }
        return scrollY;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int height;
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            View view = nonGoneChildren.get(i8);
            if (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(view) && com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(view) && (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.b(view, 1) || com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.b(view, -1))) {
                View viewG = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.g(view);
                height = viewG.getPaddingBottom() + viewG.getPaddingTop() + com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.g(viewG).getHeight();
            } else {
                height = view.getHeight();
            }
            i7 = height + i7;
        }
        return i7;
    }

    public final void d(int i7) {
        if (Math.abs(i7) > this.f73600g) {
            float f7 = i7;
            if (this.f73609q.dispatchNestedPreFling(0.0f, f7)) {
                return;
            }
            dispatchNestedFling(0.0f, f7, (i7 < 0 && !g()) || (i7 > 0 && !f()));
            this.f73596c.fling(0, this.f73594a, 1, i7, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            startNestedScroll(2, 1);
            setScrollState(2);
            this.f73615w = this.f73594a;
            invalidate();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedFling(float f7, float f8, boolean z6) {
        return this.f73609q.dispatchNestedFling(f7, f8, z6);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreFling(float f7, float f8) {
        return this.f73609q.dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedPreScroll(int i7, int i8, int[] iArr, int[] iArr2) {
        return this.f73609q.dispatchNestedPreScroll(i7, i8, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedPreScroll(int i7, int i8, @Nullable int[] iArr, @Nullable int[] iArr2, int i9) {
        return this.f73609q.dispatchNestedPreScroll(i7, i8, iArr, iArr2, i9);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, int[] iArr) {
        return this.f73609q.dispatchNestedScroll(i7, i8, i9, i10, iArr);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean dispatchNestedScroll(int i7, int i8, int i9, int i10, @Nullable int[] iArr, int i11) {
        return this.f73609q.dispatchNestedScroll(i7, i8, i9, i10, iArr, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0257  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            Method dump skipped, instruction units count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean e(MotionEvent motionEvent) {
        View next;
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f73607o);
        if (iFindPointerIndex < 0 || iFindPointerIndex >= motionEvent.getPointerCount()) {
            return true;
        }
        int iD = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.d(this, motionEvent, iFindPointerIndex);
        int iE = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.e(this, motionEvent, iFindPointerIndex);
        Iterator<View> it = getNonGoneChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.i(iD, iE, next)) {
                break;
            }
        }
        return next != null ? com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(next) : false;
    }

    public final boolean f() {
        List<View> effectiveChildren = getEffectiveChildren();
        boolean z6 = true;
        if (!effectiveChildren.isEmpty()) {
            z6 = getScrollY() >= this.f73595b && !com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.b((View) C4667i.a(1, effectiveChildren), 1);
        }
        return z6;
    }

    public final boolean g() {
        List<View> effectiveChildren = getEffectiveChildren();
        boolean z6 = true;
        if (effectiveChildren.size() > 0) {
            z6 = getScrollY() <= 0 && !com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.b(effectiveChildren.get(0), -1);
        }
        return z6;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
        marginLayoutParams.f73619a = true;
        marginLayoutParams.f73620b = true;
        marginLayoutParams.f73621c = LayoutParams.Align.LEFT;
        return marginLayoutParams;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout$LayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ?? marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.f73619a = true;
        marginLayoutParams.f73620b = true;
        marginLayoutParams.f73621c = LayoutParams.Align.LEFT;
        return marginLayoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i7, int i8) {
        return ((ArrayList) this.f73617y).size() > i8 ? indexOfChild((View) ((ArrayList) this.f73617y).get(i8)) : super.getChildDrawingOrder(i7, i8);
    }

    public View getCurrentStickyView() {
        return null;
    }

    public List<View> getCurrentStickyViews() {
        return this.f73616x;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f73608p.getNestedScrollAxes();
    }

    public b getOnPermanentStickyChangeListener() {
        return null;
    }

    public d getOnStickyChangeListener() {
        return null;
    }

    public c getOnVerticalScrollChangeListener() {
        return null;
    }

    public int getOwnScrollY() {
        return computeVerticalScrollOffset();
    }

    public int getScrollState() {
        return this.f73593A;
    }

    public int getStickyOffset() {
        return 0;
    }

    public final int h(int i7, int i8) {
        int iMin;
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode == 1073741824) {
            iMin = size;
        } else {
            iMin = i8;
            if (mode == Integer.MIN_VALUE) {
                iMin = Math.min(i8, size);
            }
        }
        return ViewGroup.resolveSizeAndState(Math.max(iMin, getSuggestedMinimumWidth()), i7, 0);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean hasNestedScrollingParent(int i7) {
        return this.f73609q.hasNestedScrollingParent(i7);
    }

    public final void i(int i7) {
        int i8;
        if (i7 < 0) {
            i8 = 0;
        } else {
            int i9 = this.f73595b;
            i8 = i7;
            if (i7 > i9) {
                i8 = i9;
            }
        }
        super.scrollTo(0, i8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final boolean isNestedScrollingEnabled() {
        return this.f73609q.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i7, int i8, int i9, int i10) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
        super.measureChildWithMargins(view, i7, i8, i9, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007a  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r0 = r5
            int r0 = r0.getActionMasked()
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L82
            r0 = 0
            r8 = r0
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L7a
            r0 = r6
            r1 = 2
            if (r0 == r1) goto L1e
            r0 = r6
            r1 = 3
            if (r0 == r1) goto L7a
            goto La4
        L1e:
            r0 = r4
            r1 = r5
            boolean r0 = r0.e(r1)
            if (r0 != 0) goto L78
            r0 = r4
            int[] r0 = r0.f73604l
            r9 = r0
            r0 = r9
            r1 = 0
            r0 = r0[r1]
            r7 = r0
            r0 = r9
            r1 = 1
            r0 = r0[r1]
            r6 = r0
            r0 = r4
            java.util.List r0 = r0.getNonGoneChildren()
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        L41:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L64
            r0 = r10
            java.lang.Object r0 = r0.next()
            android.view.View r0 = (android.view.View) r0
            r9 = r0
            r0 = r7
            r1 = r6
            r2 = r9
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.i(r0, r1, r2)
            if (r0 == 0) goto L41
            goto L67
        L64:
            r0 = 0
            r9 = r0
        L67:
            r0 = r9
            if (r0 == 0) goto L73
            r0 = r9
            boolean r0 = com.bilibili.opd.app.bizcommon.hybridruntime.scroll.c.h(r0)
            r8 = r0
        L73:
            r0 = r8
            if (r0 == 0) goto La4
        L78:
            r0 = 1
            return r0
        L7a:
            r0 = r4
            r1 = 0
            r0.stopNestedScroll(r1)
            goto La4
        L82:
            r0 = r4
            android.view.VelocityTracker r0 = r0.f73597d
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L97
            r0 = r4
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r0.f73597d = r1
            goto L9c
        L97:
            r0 = r9
            r0.clear()
        L9c:
            r0 = r4
            android.view.VelocityTracker r0 = r0.f73597d
            r1 = r5
            r0.addMovement(r1)
        La4:
            r0 = r4
            r1 = r5
            boolean r0 = super.onInterceptTouchEvent(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i7, int i8, int i9, int i10) {
        int i11;
        int measuredWidth;
        this.f73595b = 0;
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int measuredWidth2 = getMeasuredWidth();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i12 = 0;
        while (i12 < size) {
            View view = nonGoneChildren.get(i12);
            int measuredHeight = view.getMeasuredHeight() + paddingTop;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i13 = a.f73622a[layoutParams.f73621c.ordinal()];
            if (i13 == 1) {
                measuredWidth = ((measuredWidth2 - view.getMeasuredWidth()) - paddingRight) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            } else if (i13 != 2) {
                measuredWidth = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
            } else {
                measuredWidth = C3237a.a((((measuredWidth2 - view.getMeasuredWidth()) - paddingLeft) - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - paddingRight, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 2, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft);
            }
            int i14 = measuredWidth;
            view.layout(i14, paddingTop, view.getMeasuredWidth() + i14, measuredHeight);
            this.f73595b = view.getHeight() + this.f73595b;
            i12++;
            paddingTop = measuredHeight;
        }
        int measuredHeight2 = this.f73595b - ((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        this.f73595b = measuredHeight2;
        if (measuredHeight2 < 0) {
            this.f73595b = 0;
        }
        View view2 = this.f73612t;
        if (view2 == null || !z6) {
            i(getScrollY());
        } else if (indexOfChild(view2) != -1) {
            i(this.f73612t.getTop() + this.f73613u);
        }
        this.f73612t = null;
        this.f73613u = 0;
        a(true);
        Iterator<View> it = getNonGoneChildren().iterator();
        while (it.hasNext()) {
            it.next().setTranslationY(0.0f);
        }
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        int i15 = 0;
        while (true) {
            if (i15 >= childCount) {
                break;
            }
            View childAt = getChildAt(i15);
            ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
            if (layoutParams2 instanceof LayoutParams) {
                ((LayoutParams) layoutParams2).getClass();
            }
            arrayList.add(childAt);
            i15++;
        }
        for (i11 = 0; i11 < childCount; i11++) {
            ViewGroup.LayoutParams layoutParams3 = getChildAt(i11).getLayoutParams();
            if (layoutParams3 instanceof LayoutParams) {
                ((LayoutParams) layoutParams3).getClass();
            }
        }
        ((ArrayList) this.f73617y).clear();
        ((ArrayList) this.f73617y).addAll(arrayList);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        View view;
        int paddingTop = getPaddingTop() + getScrollY();
        List<View> nonGoneChildren = getNonGoneChildren();
        int size = nonGoneChildren.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                view = null;
                break;
            }
            view = nonGoneChildren.get(i9);
            if (view.getTop() <= paddingTop && view.getBottom() >= paddingTop) {
                break;
            } else {
                i9++;
            }
        }
        this.f73612t = view;
        if (view != null) {
            this.f73613u = getScrollY() - this.f73612t.getTop();
        }
        List<View> nonGoneChildren2 = getNonGoneChildren();
        int size2 = nonGoneChildren2.size();
        int iMax = 0;
        int measuredHeight = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            View view2 = nonGoneChildren2.get(i10);
            measureChildWithMargins(view2, i7, 0, i8, 0);
            int measuredWidth = view2.getMeasuredWidth();
            LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
            iMax = Math.max(iMax, measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
            measuredHeight += view2.getMeasuredHeight();
        }
        setMeasuredDimension(h(i7, getPaddingRight() + getPaddingLeft() + iMax), h(i8, getPaddingBottom() + getPaddingTop() + measuredHeight));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@NonNull View view, float f7, float f8, boolean z6) {
        if (z6) {
            return false;
        }
        dispatchNestedFling(0.0f, f8, true);
        d((int) f8);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@NonNull View view, float f7, float f8) {
        return this.f73609q.dispatchNestedPreFling(f7, f8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i7, int i8, int[] iArr) {
        dispatchNestedPreScroll(i7, i8, iArr, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i7, int i8, int i9, int i10) {
        int i11 = this.f73594a;
        b(i10);
        int i12 = this.f73594a - i11;
        this.f73609q.dispatchNestedScroll(0, i12, 0, i10 - i12, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i7) {
        this.f73608p.onNestedScrollAccepted(view, view2, i7, 0);
        a(false);
        startNestedScroll(2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        boolean z6 = false;
        if (layoutParams instanceof LayoutParams ? ((LayoutParams) layoutParams).f73620b : false) {
            z6 = false;
            if ((i7 & 2) != 0) {
                z6 = true;
            }
        }
        return z6;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        this.f73608p.onStopNestedScroll(view, 0);
        stopNestedScroll(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01c4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.hybridruntime.scroll.ConsecutiveScrollerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void scrollBy(int i7, int i8) {
        scrollTo(0, this.f73594a + i8);
    }

    @Override // android.view.View
    public final void scrollTo(int i7, int i8) {
        b(i8 - this.f73594a);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z6) {
        this.f73609q.setNestedScrollingEnabled(z6);
    }

    public void setOnPermanentStickyChangeListener(b bVar) {
    }

    @Override // android.view.View
    public void setOnScrollChangeListener(View.OnScrollChangeListener onScrollChangeListener) {
    }

    public void setOnStickyChangeListener(d dVar) {
    }

    public void setOnVerticalScrollChangeListener(c cVar) {
    }

    public void setScrollState(int i7) {
        if (i7 == this.f73593A) {
            return;
        }
        this.f73593A = i7;
        computeVerticalScrollOffset();
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final boolean startNestedScroll(int i7, int i8) {
        return this.f73609q.startNestedScroll(i7, i8);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public final void stopNestedScroll() {
        stopNestedScroll(0);
    }

    @Override // androidx.core.view.InterfaceC4571o
    public final void stopNestedScroll(int i7) {
        this.f73609q.stopNestedScroll(i7);
    }
}

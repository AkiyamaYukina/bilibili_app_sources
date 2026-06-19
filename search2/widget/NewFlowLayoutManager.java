package com.bilibili.search2.widget;

import G.f;
import android.content.Context;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.GravityCompat;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/NewFlowLayoutManager.class */
@StabilityInferred(parameters = 0)
public class NewFlowLayoutManager extends RecyclerView.LayoutManager implements RecyclerView.SmoothScroller.ScrollVectorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f88894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f88895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f88896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f88897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f88898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f88899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f88900g;

    @NotNull
    public List<c> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public SparseArray<Integer> f88901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f88902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f88903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f88904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f88905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final OrientationHelper f88906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final a f88907o;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/NewFlowLayoutManager$a.class */
    public static abstract class a {
        public abstract int a(int i7, int i8);

        public abstract int b(int i7);

        public abstract int c();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/NewFlowLayoutManager$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f88909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public View f88910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f88911d;
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/widget/NewFlowLayoutManager$c.class */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<b> f88912a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f88913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f88914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f88915d;
    }

    @JvmOverloads
    public NewFlowLayoutManager() {
        this(0);
    }

    public NewFlowLayoutManager(int i7) {
        this.f88894a = "FlowLayoutManager";
        this.f88895b = true;
        this.h = new ArrayList();
        this.f88901i = new SparseArray<>();
        setAutoMeasureEnabled(true);
        this.f88896c = 1;
        this.f88906n = OrientationHelper.createOrientationHelper(this, 1);
        this.f88907o = new com.bilibili.search2.widget.a(this, GravityCompat.START);
        this.f88898e = Integer.MAX_VALUE;
        this.f88897d = Integer.MAX_VALUE;
        this.f88899f = 0;
        this.f88900g = 0;
    }

    public final View c() {
        List<b> list;
        b bVar;
        c cVar = (c) CollectionsKt.firstOrNull(this.h);
        return (cVar == null || (list = cVar.f88912a) == null || (bVar = (b) CollectionsKt.firstOrNull(list)) == null) ? null : bVar.f88910c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollHorizontally() {
        return this.f88896c == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollVertically() {
        boolean z6 = true;
        if (this.f88896c != 1) {
            z6 = false;
        }
        return z6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider
    @Nullable
    public final PointF computeScrollVectorForPosition(int i7) {
        View childAt;
        if (getChildCount() == 0 || (childAt = getChildAt(0)) == null) {
            return null;
        }
        float f7 = i7 < getPosition(childAt) ? -1.0f : 1.0f;
        return this.f88896c == 0 ? new PointF(f7, 0.0f) : new PointF(0.0f, f7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollExtent(@NotNull RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        View viewC = c();
        View viewD = d();
        int iMin = 0;
        if (getChildCount() != 0) {
            iMin = 0;
            if (state.getItemCount() != 0) {
                iMin = 0;
                if (viewC != null) {
                    iMin = 0;
                    if (viewD != null) {
                        OrientationHelper orientationHelper = this.f88906n;
                        iMin = Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(viewD) - orientationHelper.getDecoratedStart(viewC));
                    }
                }
            }
        }
        return iMin;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollOffset(@NotNull RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        View viewC = c();
        View viewD = d();
        int iRound = 0;
        if (getChildCount() != 0) {
            iRound = 0;
            if (state.getItemCount() != 0) {
                iRound = 0;
                if (viewC != null) {
                    if (viewD == null) {
                        iRound = 0;
                    } else {
                        int iMin = Math.min(getPosition(viewC), getPosition(viewD));
                        Math.max(getPosition(viewC), getPosition(viewD));
                        int iMax = Math.max(0, iMin);
                        OrientationHelper orientationHelper = this.f88906n;
                        iRound = Math.round((iMax * (Math.abs(orientationHelper.getDecoratedEnd(viewD) - orientationHelper.getDecoratedStart(viewC)) / (Math.abs(getPosition(viewC) - getPosition(viewD)) + 1))) + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(viewC)));
                    }
                }
            }
        }
        return iRound;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int computeVerticalScrollRange(@NotNull RecyclerView.State state) {
        if (getChildCount() == 0) {
            return 0;
        }
        View viewC = c();
        View viewD = d();
        int decoratedEnd = 0;
        if (getChildCount() != 0) {
            decoratedEnd = 0;
            if (state.getItemCount() != 0) {
                decoratedEnd = 0;
                if (viewC != null) {
                    if (viewD == null) {
                        decoratedEnd = 0;
                    } else {
                        OrientationHelper orientationHelper = this.f88906n;
                        decoratedEnd = (int) (((orientationHelper.getDecoratedEnd(viewD) - orientationHelper.getDecoratedStart(viewC)) / (Math.abs(getPosition(viewC) - getPosition(viewD)) + 1)) * state.getItemCount());
                    }
                }
            }
        }
        return decoratedEnd;
    }

    public final View d() {
        List<b> list;
        b bVar;
        c cVar = (c) CollectionsKt.lastOrNull(this.h);
        return (cVar == null || (list = cVar.f88912a) == null || (bVar = (b) CollectionsKt.lastOrNull(list)) == null) ? null : bVar.f88910c;
    }

    public final void e(c cVar) {
        int i7 = cVar.f88913b;
        int i8 = cVar.f88915d;
        int i9 = cVar.f88914c;
        a aVar = this.f88907o;
        int iB = aVar.b(i7);
        int i10 = cVar.f88914c;
        for (b bVar : (ArrayList) cVar.f88912a) {
            int i11 = bVar.f88909b;
            int i12 = bVar.f88908a;
            int iA = aVar.a(i11, i8 - i9) + i10;
            View view = bVar.f88910c;
            if (view != null) {
                if (this.f88896c == 1) {
                    layoutDecoratedWithMargins(view, iB, iA, iB + i12, iA + i11);
                } else {
                    layoutDecoratedWithMargins(view, iA, iB, iA + i11, iB + i12);
                }
                iB = i12 + this.f88899f + iB;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bilibili.search2.widget.NewFlowLayoutManager.c f(int r6, int r7, androidx.recyclerview.widget.RecyclerView.Recycler r8, boolean r9) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.search2.widget.NewFlowLayoutManager.f(int, int, androidx.recyclerview.widget.RecyclerView$Recycler, boolean):com.bilibili.search2.widget.NewFlowLayoutManager$c");
    }

    public final void g(int i7, List list, boolean z6) {
        Iterator it = ((ArrayList) this.h).iterator();
        while (true) {
            int iMax = 0;
            if (!it.hasNext()) {
                this.h = list;
                this.f88904l = ((b) ((ArrayList) ((c) ((ArrayList) list).get(0)).f88912a).get(0)).f88911d;
                this.f88905m = ((c) ((ArrayList) this.h).get(0)).f88914c;
                return;
            }
            c cVar = (c) it.next();
            Iterator it2 = ((ArrayList) cVar.f88912a).iterator();
            while (it2.hasNext()) {
                iMax = Math.max(iMax, ((b) it2.next()).f88909b);
            }
            if (z6) {
                cVar.f88914c += iMax;
                cVar.f88915d += iMax;
            } else {
                cVar.f88914c -= i7;
                cVar.f88915d -= i7;
            }
            ((ArrayList) list).add(cVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void h(int i7, RecyclerView.Recycler recycler, boolean z6) {
        OrientationHelper orientationHelper = this.f88906n;
        if (!z6) {
            c cVar = (c) CollectionsKt.getOrNull(this.h, 0);
            c cVar2 = cVar;
            if (cVar == null) {
                return;
            }
            while (cVar2.f88915d - i7 < orientationHelper.getStartAfterPadding()) {
                int size = ((ArrayList) cVar2.f88912a).size();
                for (int i8 = 0; i8 < size; i8++) {
                    View childAt = getChildAt(0);
                    if (childAt != null) {
                        removeAndRecycleView(childAt, recycler);
                    }
                }
                this.h.remove(cVar2);
                c cVar3 = (c) CollectionsKt.getOrNull(this.h, 0);
                if (cVar3 != null) {
                    cVar2 = cVar3;
                }
            }
            return;
        }
        List<c> list = this.h;
        c cVar4 = (c) CollectionsKt.getOrNull(list, list.size() - 1);
        c cVar5 = cVar4;
        if (cVar4 == null) {
            return;
        }
        while (cVar5.f88914c - i7 > orientationHelper.getEndAfterPadding()) {
            int size2 = ((ArrayList) cVar5.f88912a).size();
            for (int i9 = 0; i9 < size2; i9++) {
                View childAt2 = getChildAt(getChildCount() - 1);
                if (childAt2 == null) {
                    return;
                }
                removeAndRecycleView(childAt2, recycler);
            }
            this.h.remove(cVar5);
            List<c> list2 = this.h;
            c cVar6 = (c) CollectionsKt.getOrNull(list2, list2.size() - 1);
            if (cVar6 != null) {
                cVar5 = cVar6;
            }
        }
    }

    public final int i(RecyclerView.Recycler recycler, RecyclerView.State state, int i7, int i8) {
        if (getChildCount() == 0 || i7 == 0 || ((ArrayList) this.h).isEmpty()) {
            return 0;
        }
        int iJ = i7 > 0 ? j(i7, recycler, state, false) : j(i7, recycler, state, true);
        if (iJ != 0) {
            for (c cVar : this.h) {
                int i9 = -iJ;
                cVar.f88914c += i9;
                cVar.f88915d += i9;
            }
            if (i8 == 1) {
                offsetChildrenVertical(-iJ);
            } else {
                offsetChildrenHorizontal(-iJ);
            }
        }
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.f88904l = getPosition(childAt);
            this.f88905m = this.f88906n.getDecoratedStart(childAt);
        }
        return iJ;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    public final int j(int i7, RecyclerView.Recycler recycler, RecyclerView.State state, boolean z6) {
        View childAt;
        View childAt2;
        if (state.isPreLayout() || ((ArrayList) this.h).isEmpty()) {
            return 0;
        }
        OrientationHelper orientationHelper = this.f88906n;
        int i8 = this.f88900g;
        if (z6) {
            c cVar = (c) CollectionsKt.getOrNull(this.h, 0);
            if (cVar == null || (childAt2 = getChildAt(0)) == null) {
                return 0;
            }
            int position = getPosition(childAt2) - 1;
            int i9 = cVar.f88914c;
            int i10 = i9 - i8;
            int iMax = Math.max(Math.min(i9 - orientationHelper.getStartAfterPadding(), 0), i7);
            while (position >= 0) {
                h(Math.max(iMax, i7), recycler, true);
                if (iMax <= i7) {
                    break;
                }
                c cVarF = f(position, i10, recycler, true);
                e(cVarF);
                ((ArrayList) this.h).add(0, cVarF);
                iMax = cVarF.f88914c;
                i10 = iMax - i8;
                position -= ((ArrayList) cVarF.f88912a).size();
            }
            return Math.max(iMax, i7);
        }
        ArrayList arrayList = (ArrayList) this.h;
        c cVar2 = (c) CollectionsKt.getOrNull(arrayList, arrayList.size() - 1);
        if (cVar2 == null || (childAt = getChildAt(getChildCount() - 1)) == null) {
            return 0;
        }
        int position2 = getPosition(childAt) + 1;
        int i11 = cVar2.f88915d;
        int i12 = i11 + i8;
        int iMin = Math.min(Math.max(orientationHelper.getEndPadding() + (i11 - orientationHelper.getEnd()), 0), i7);
        while (position2 < getItemCount()) {
            h(Math.min(iMin, i7), recycler, false);
            if (iMin >= i7) {
                break;
            }
            c cVarF2 = f(position2, i12, recycler, false);
            e(cVarF2);
            ((ArrayList) this.h).add(cVarF2);
            int i13 = cVarF2.f88915d;
            int end = orientationHelper.getEnd();
            position2 += ((ArrayList) cVarF2.f88912a).size();
            iMin = i13 - end;
            i12 = i13 + i8;
        }
        return Math.min(iMin, i7);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int i7;
        ((ArrayList) this.h).clear();
        this.f88902j = true;
        boolean z6 = this.f88903k != getItemCount();
        this.f88903k = getItemCount();
        if (z6) {
            this.f88901i.clear();
        }
        this.f88902j = false;
        if (getChildCount() == 0 && state.isPreLayout()) {
            return;
        }
        detachAndScrapAttachedViews(recycler);
        if (getItemCount() == 0) {
            return;
        }
        int i8 = this.f88900g;
        OrientationHelper orientationHelper = this.f88906n;
        if (z6 && this.f88904l > 0) {
            int startAfterPadding = orientationHelper.getStartAfterPadding();
            int size = 0;
            while (size < this.f88904l && size < getItemCount()) {
                c cVarF = f(size, startAfterPadding, recycler, false);
                int i9 = cVarF.f88915d;
                size += ((ArrayList) cVarF.f88912a).size();
                Iterator it = ((ArrayList) cVarF.f88912a).iterator();
                while (it.hasNext()) {
                    View view = ((b) it.next()).f88910c;
                    if (view != null) {
                        removeAndRecycleView(view, recycler);
                    }
                }
                startAfterPadding = i9 + i8;
            }
        }
        int size2 = this.f88904l;
        int i10 = this.f88905m;
        while (true) {
            int i11 = i10;
            if (size2 >= getItemCount()) {
                break;
            }
            c cVarF2 = f(size2, i11, recycler, false);
            ((ArrayList) this.h).add(cVarF2);
            int i12 = cVarF2.f88915d;
            size2 += ((ArrayList) cVarF2.f88912a).size();
            if (((ArrayList) this.h).size() == this.f88898e || (orientationHelper.getMode() != 0 && cVarF2.f88915d > orientationHelper.getEndAfterPadding())) {
                break;
            } else {
                i10 = i12 + i8;
            }
        }
        int i13 = this.f88898e;
        int size3 = ((ArrayList) this.h).size();
        if (1 <= size3 && size3 < i13 && ((c) d.a(1, (ArrayList) this.h)).f88915d < orientationHelper.getEndAfterPadding()) {
            ArrayList arrayList = new ArrayList();
            if (this.f88904l > 0 && ((c) ((ArrayList) this.h).get(0)).f88915d > orientationHelper.getStartAfterPadding()) {
                c cVarF3 = f(this.f88904l - 1, this.f88905m, recycler, true);
                Iterator it2 = ((ArrayList) cVarF3.f88912a).iterator();
                int iMax = 0;
                while (true) {
                    i7 = iMax;
                    if (!it2.hasNext()) {
                        break;
                    } else {
                        iMax = Math.max(i7, ((b) it2.next()).f88909b);
                    }
                }
                cVarF3.f88914c += i7;
                cVarF3.f88915d += i7;
                if (this.f88895b) {
                    BLog.d(this.f88894a, f.a(this.f88904l, this.f88905m, "append line first pos=", " mLayoutStart ="));
                }
                arrayList.add(cVarF3);
            }
            if (((c) d.a(1, (ArrayList) this.h)).f88915d < orientationHelper.getEndAfterPadding()) {
                g(0, arrayList, true);
            }
        }
        int i14 = this.f88898e;
        int size4 = ((ArrayList) this.h).size();
        if (1 <= size4 && size4 < i14 && ((c) ((ArrayList) this.h).get(0)).f88914c > orientationHelper.getStartAfterPadding()) {
            g(((c) ((ArrayList) this.h).get(0)).f88914c - orientationHelper.getStartAfterPadding(), new ArrayList(), false);
        }
        Iterator<T> it3 = this.h.iterator();
        while (it3.hasNext()) {
            e((c) it3.next());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onRestoreInstanceState(@NotNull Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        this.f88904l = bundle.getInt("state_first_visible_position");
        this.f88905m = bundle.getInt("state_layout_start");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putInt("state_first_visible_position", this.f88904l);
        bundle.putInt("state_layout_start", this.f88905m);
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollHorizontallyBy(int i7, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        return i(recycler, state, i7, 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        this.f88904l = i7;
        this.f88905m = 0;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final int scrollVerticallyBy(int i7, @NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        return i(recycler, state, i7, 1);
    }

    public final void setMaxLines(int i7) {
        if (i7 <= 0) {
            throw new IllegalArgumentException("maxLines must be greater than 0");
        }
        assertNotInLayoutOrScroll(null);
        this.f88898e = i7;
        requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void smoothScrollToPosition(@Nullable RecyclerView recyclerView, @Nullable RecyclerView.State state, int i7) {
        Context context;
        if (recyclerView == null || (context = recyclerView.getContext()) == null) {
            return;
        }
        LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(context);
        linearSmoothScroller.setTargetPosition(i7);
        startSmoothScroll(linearSmoothScroller);
    }
}

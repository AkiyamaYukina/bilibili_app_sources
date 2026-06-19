package com.bilibili.upper.widget.recycler;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.C4690e;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/UpperFlowLayoutManager.class */
@StabilityInferred(parameters = 0)
public final class UpperFlowLayoutManager extends RecyclerView.LayoutManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final c f114566a = new c(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f114567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f114568c = this.f114567b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/UpperFlowLayoutManager$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f114570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f114571c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f114572d;

        public a(int i7, int i8, int i9, @NotNull View view) {
            this.f114569a = i7;
            this.f114570b = view;
            this.f114571c = i8;
            this.f114572d = i9;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f114569a == aVar.f114569a && Intrinsics.areEqual(this.f114570b, aVar.f114570b) && this.f114571c == aVar.f114571c && this.f114572d == aVar.f114572d;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f114569a);
            return Integer.hashCode(this.f114572d) + I.a(this.f114571c, (this.f114570b.hashCode() + (iHashCode * 31)) * 31, 31);
        }

        @NotNull
        public final String toString() {
            View view = this.f114570b;
            StringBuilder sb = new StringBuilder("FlowItem(position=");
            sb.append(this.f114569a);
            sb.append(", view=");
            sb.append(view);
            sb.append(", width=");
            sb.append(this.f114571c);
            sb.append(", height=");
            return C4277b.a(this.f114572d, ")", sb);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/UpperFlowLayoutManager$b.class */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f114573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f114574b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f114575c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f114576d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final List<a> f114577e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f114578f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f114579g;
        public boolean h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f114580i;

        public b(int i7) {
            this.f114573a = i7;
        }

        public final void a() {
            int i7 = 0;
            this.f114580i = false;
            this.f114579g = 0;
            this.h = false;
            a aVar = (a) CollectionsKt.firstOrNull(this.f114577e);
            if (aVar != null) {
                i7 = aVar.f114569a;
            }
            this.f114578f = i7;
            ((ArrayList) this.f114577e).clear();
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/widget/recycler/UpperFlowLayoutManager$c.class */
    public final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f114582b;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final UpperFlowLayoutManager f114585e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final List<b> f114581a = CollectionsKt.mutableListOf(new b[]{new b(0)});

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final List<Integer> f114583c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final SparseIntArray f114584d = new SparseIntArray();

        public c(UpperFlowLayoutManager upperFlowLayoutManager) {
            this.f114585e = upperFlowLayoutManager;
        }

        public final boolean a(@NotNull b bVar, @NotNull a aVar) {
            int i7 = bVar.f114579g;
            int i8 = aVar.f114571c;
            UpperFlowLayoutManager upperFlowLayoutManager = this.f114585e;
            boolean zAdd = false;
            int i9 = 0;
            if (i7 + i8 <= (upperFlowLayoutManager.getWidth() - upperFlowLayoutManager.getPaddingStart()) - upperFlowLayoutManager.getPaddingEnd()) {
                bVar.f114580i = true;
                bVar.f114574b = true;
                bVar.f114579g += i8;
                bVar.f114575c = Math.max(aVar.f114572d, bVar.f114575c);
                b bVarB = b(bVar.f114573a - 1);
                if (bVarB != null) {
                    i9 = bVarB.f114576d;
                }
                bVar.f114576d = i9 + bVar.f114575c;
                this.f114584d.put(aVar.f114569a, i8);
                zAdd = ((ArrayList) bVar.f114577e).add(aVar);
            } else {
                bVar.h = true;
            }
            return zAdd;
        }

        @Nullable
        public final b b(int i7) {
            return (b) CollectionsKt.getOrNull(this.f114581a, i7);
        }

        @Nullable
        public final b c(@NotNull b bVar, boolean z6) {
            int i7 = bVar.f114573a;
            if (z6) {
                return b(i7 - 1);
            }
            b bVarB = b(i7 + 1);
            b bVar2 = bVarB;
            if (bVarB == null) {
                bVar2 = new b(i7 + 1);
                this.f114581a.add(bVar2);
                bVar2.f114576d = bVar.f114576d;
            }
            bVar2.f114578f = ((ArrayList) bVar.f114577e).size() + bVar.f114578f;
            return bVar2;
        }

        public final boolean d(@NotNull b bVar) {
            int iD = this.f114585e.d();
            int i7 = bVar.f114575c;
            int i8 = bVar.f114576d + this.f114582b;
            boolean z6 = false;
            if (i8 >= 0) {
                z6 = false;
                if (i8 <= iD + i7) {
                    z6 = true;
                }
            }
            return z6;
        }
    }

    public final a c(int i7, RecyclerView.Recycler recycler) {
        if (i7 < 0 || i7 >= getItemCount()) {
            return null;
        }
        View viewForPosition = recycler.getViewForPosition(i7);
        int i8 = 0;
        measureChildWithMargins(viewForPosition, 0, 0);
        ViewGroup.LayoutParams layoutParams = viewForPosition.getLayoutParams();
        RecyclerView.LayoutParams layoutParams2 = layoutParams instanceof RecyclerView.LayoutParams ? (RecyclerView.LayoutParams) layoutParams : null;
        int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
        int i9 = layoutParams2 != null ? ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin : 0;
        int i10 = layoutParams2 != null ? ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin : 0;
        ViewGroup.LayoutParams layoutParams3 = viewForPosition.getLayoutParams();
        RecyclerView.LayoutParams layoutParams4 = null;
        if (layoutParams3 instanceof RecyclerView.LayoutParams) {
            layoutParams4 = (RecyclerView.LayoutParams) layoutParams3;
        }
        int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
        int i11 = layoutParams4 != null ? ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin : 0;
        if (layoutParams4 != null) {
            i8 = ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
        }
        return new a(i7, decoratedMeasuredWidth + i9 + i10, decoratedMeasuredHeight + i11 + i8, viewForPosition);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean canScrollVertically() {
        return true;
    }

    public final int d() {
        return (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public final void e(boolean z6) {
        Integer numValueOf;
        Integer numValueOf2;
        c cVar = this.f114566a;
        Iterator<b> it = cVar.f114581a.iterator();
        Integer num = null;
        Integer num2 = null;
        while (true) {
            numValueOf = num;
            numValueOf2 = num2;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            int i7 = next.f114576d + cVar.f114582b;
            if (i7 > 0) {
                int i8 = next.f114573a;
                numValueOf = num;
                if (num == null) {
                    numValueOf = Integer.valueOf(i8);
                }
                numValueOf2 = Integer.valueOf(i8);
                num = numValueOf;
                num2 = numValueOf2;
                if (i7 >= d()) {
                    break;
                }
            }
        }
        this.f114567b = numValueOf != null ? numValueOf.intValue() : 0;
        int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
        this.f114568c = iIntValue;
        if (!z6) {
            iIntValue = this.f114567b;
        }
        while (true) {
            b bVarB = cVar.b(iIntValue);
            if (bVarB != null && bVarB.f114574b) {
                bVarB.f114574b = false;
                int paddingStart = getPaddingStart();
                int paddingTop = getPaddingTop();
                int i9 = bVarB.f114576d;
                int i10 = cVar.f114582b;
                int i11 = paddingTop + i9 + i10;
                StringBuilder sb = new StringBuilder("layoutLine, ");
                C4690e.a(bVarB.f114573a, i11, ", ", ", ", sb);
                sb.append(i10);
                BLog.e(sb.toString());
                for (a aVar : (ArrayList) bVarB.f114577e) {
                    View view = aVar.f114570b;
                    int i12 = aVar.f114572d;
                    int i13 = aVar.f114571c + paddingStart;
                    layoutDecoratedWithMargins(view, paddingStart, i11 - i12, i13, i11);
                    paddingStart = i13;
                }
            }
            if (z6) {
                int i14 = iIntValue - 1;
                iIntValue = i14;
                if (i14 < this.f114567b - 2) {
                    return;
                }
            } else {
                int i15 = iIntValue + 1;
                iIntValue = i15;
                if (i15 > this.f114568c + 2) {
                    return;
                }
            }
        }
    }

    public final void f(int i7, RecyclerView.Recycler recycler, boolean z6) {
        b bVarC;
        c cVar = this.f114566a;
        b bVarB = cVar.b(i7);
        if (bVarB == null) {
            return;
        }
        boolean zD = cVar.d(bVarB);
        BLog.i("measureLine", String.valueOf(bVarB.f114573a));
        int i8 = 0;
        while (true) {
            if (zD && i8 > 2) {
                return;
            }
            if (bVarB.h) {
                bVarC = cVar.c(bVarB, z6);
                if (bVarC == null) {
                    return;
                }
                if (cVar.d(bVarC)) {
                    bVarB = bVarC;
                    zD = true;
                } else {
                    bVarB = bVarC;
                    if (zD) {
                        bVarB = bVarC;
                        i8++;
                    }
                }
            } else {
                a aVarC = c(((ArrayList) bVarB.f114577e).size() + bVarB.f114578f, recycler);
                if (aVarC == null) {
                    return;
                }
                boolean zA = cVar.a(bVarB, aVarC);
                if (zA || !z6) {
                    addView(aVarC.f114570b);
                }
                BLog.d("measureItem", aVarC.f114569a + ", " + zA);
                if (zA) {
                    continue;
                } else {
                    bVarC = cVar.c(bVarB, z6);
                    if (bVarC == null) {
                        return;
                    }
                    BLog.e("measureLine", String.valueOf(bVarC.f114573a));
                    if (!z6) {
                        cVar.a(bVarC, aVarC);
                    }
                    if (cVar.d(bVarC)) {
                        bVarB = bVarC;
                        zD = true;
                    } else {
                        bVarB = bVarC;
                        if (zD) {
                            bVarB = bVarC;
                            i8++;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    @NotNull
    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onAdapterChanged(@Nullable RecyclerView.Adapter<?> adapter, @Nullable RecyclerView.Adapter<?> adapter2) {
        super.onAdapterChanged(adapter, adapter2);
        scrollToPosition(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsChanged(@NotNull RecyclerView recyclerView) {
        this.f114567b = 0;
        this.f114566a.f114582b = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onItemsUpdated(@NotNull RecyclerView recyclerView, int i7, int i8) {
        c cVar = this.f114566a;
        b bVarB = cVar.b(cVar.f114585e.f114567b);
        if (i7 < (bVarB != null ? bVarB.f114578f : 0)) {
            ((ArrayList) cVar.f114583c).add(Integer.valueOf(i7));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void onLayoutChildren(@NotNull RecyclerView.Recycler recycler, @NotNull RecyclerView.State state) {
        int i7;
        b bVarB;
        int i8;
        b bVarB2;
        boolean z6;
        if (getChildCount() == 0 && state.isPreLayout()) {
            removeAndRecycleAllViews(recycler);
            return;
        }
        if (getItemCount() == 0) {
            return;
        }
        c cVar = this.f114566a;
        for (b bVar : cVar.f114581a) {
            if (!bVar.f114580i) {
                bVar = null;
            }
            if (bVar != null) {
                bVar.a();
            }
        }
        Iterator it = ((ArrayList) cVar.f114583c).iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            UpperFlowLayoutManager upperFlowLayoutManager = cVar.f114585e;
            a aVarC = upperFlowLayoutManager.c(iIntValue, recycler);
            if (aVarC != null) {
                Iterator<b> it2 = cVar.f114581a.iterator();
                int i9 = 0;
                while (true) {
                    i7 = i9;
                    if (!it2.hasNext()) {
                        break;
                    }
                    b next = it2.next();
                    if (iIntValue < next.f114578f) {
                        break;
                    } else {
                        i9 = next.f114573a;
                    }
                }
                int i10 = cVar.f114584d.get(iIntValue);
                int i11 = aVarC.f114571c;
                if (i11 != i10) {
                    cVar.f114584d.put(aVarC.f114569a, i11);
                    int i12 = i7;
                    if (i7 > 0) {
                        i12 = i7 - 1;
                    }
                    int i13 = upperFlowLayoutManager.f114567b;
                    while (i12 < i13 && (bVarB = cVar.b(i12)) != null && (bVarB2 = cVar.b((i8 = i12 + 1))) != null) {
                        int i14 = bVarB2.f114578f;
                        int i15 = bVarB.f114578f;
                        int i16 = 0;
                        while (true) {
                            if (i15 < i14) {
                                i16 += cVar.f114584d.get(i15);
                                if (i16 > (upperFlowLayoutManager.getWidth() - upperFlowLayoutManager.getPaddingStart()) - upperFlowLayoutManager.getPaddingEnd()) {
                                    bVarB2.f114578f = i15;
                                    T7.a.a(i15, "下移  ", "mUpdatedItem");
                                    z6 = true;
                                    break;
                                }
                                i15++;
                            } else {
                                int i17 = i16;
                                int i18 = i14;
                                boolean z7 = false;
                                while (true) {
                                    z6 = z7;
                                    if (((upperFlowLayoutManager.getWidth() - upperFlowLayoutManager.getPaddingStart()) - upperFlowLayoutManager.getPaddingEnd()) - i17 < cVar.f114584d.get(i18)) {
                                        break;
                                    }
                                    i17 += cVar.f114584d.get(bVarB2.f114578f);
                                    i18++;
                                    T7.a.a(i18, "上移  ", "mUpdatedItem");
                                    z7 = true;
                                }
                                bVarB2.f114578f = i18;
                            }
                        }
                        i12 = i8;
                        if (!z6) {
                            break;
                        }
                    }
                }
            }
        }
        ((ArrayList) cVar.f114583c).clear();
        detachAndScrapAttachedViews(recycler);
        f(this.f114567b, recycler, false);
        e(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public final void scrollToPosition(int i7) {
        int i8;
        c cVar = this.f114566a;
        Iterator<b> it = cVar.f114581a.iterator();
        int i9 = 0;
        while (true) {
            i8 = i9;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (i7 < next.f114578f) {
                break;
            } else {
                i9 = next.f114573a;
            }
        }
        this.f114567b = i8;
        b bVarB = cVar.b(i8);
        if (bVarB != null) {
            int i10 = bVarB.f114575c;
            int i11 = bVarB.f114576d;
            int i12 = cVar.f114582b;
            cVar.f114582b = ((i10 - i11) - i12) + i12;
        }
        requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af  */
    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int scrollVerticallyBy(int r6, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.Recycler r7, @org.jetbrains.annotations.NotNull androidx.recyclerview.widget.RecyclerView.State r8) {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.upper.widget.recycler.UpperFlowLayoutManager.scrollVerticallyBy(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
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

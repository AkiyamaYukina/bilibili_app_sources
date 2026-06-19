package com.bilibili.pegasus.page;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.OneShotPreDrawListener;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.exposer.child.ExposeItem;
import com.bilibili.pegasus.holders.oversea.C5679d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import n.C8047a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.pegasus.page.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m.class */
@StabilityInferred(parameters = 0)
public final class C5724m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RecyclerView f78414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Boolean> f78415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final c f78416c = new c(this);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final b f78417d = new b(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final ViewTreeObserverOnGlobalLayoutListenerC5723l f78418e = new ViewTreeObserver.OnGlobalLayoutListener(this) { // from class: com.bilibili.pegasus.page.l

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5724m f78413a;

        {
            this.f78413a = this;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C5724m.b(this.f78413a);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final a f78419f = new a(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f78420g;

    @Nullable
    public RecyclerView.Adapter<?> h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public RunnableC5722k f78421i;

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.m$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m$a.class */
    public static final class a extends RecyclerView.AdapterDataObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5724m f78422a;

        public a(C5724m c5724m) {
            this.f78422a = c5724m;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onChanged() {
            C5724m.b(this.f78422a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i8) {
            C5724m.b(this.f78422a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeChanged(int i7, int i8, Object obj) {
            C5724m.b(this.f78422a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeInserted(int i7, int i8) {
            C5724m.b(this.f78422a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeMoved(int i7, int i8, int i9) {
            C5724m.b(this.f78422a);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public final void onItemRangeRemoved(int i7, int i8) {
            C5724m.b(this.f78422a);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.m$b */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m$b.class */
    public static final class b implements RecyclerView.OnChildAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5724m f78423a;

        /* JADX INFO: renamed from: com.bilibili.pegasus.page.m$b$a */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m$b$a.class */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final View f78424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C5724m f78425b;

            public a(View view, C5724m c5724m) {
                this.f78424a = view;
                this.f78425b = c5724m;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.f78425b.c()) {
                    return;
                }
                C5724m.b(this.f78425b);
            }
        }

        public b(C5724m c5724m) {
            this.f78423a = c5724m;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewAttachedToWindow(View view) {
            OneShotPreDrawListener.add(view, new a(view, this.f78423a));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public final void onChildViewDetachedFromWindow(View view) {
            C5724m c5724m = this.f78423a;
            c5724m.getClass();
            view.setAlpha(1.0f);
            Object childViewHolder = c5724m.f78414a.getChildViewHolder(view);
            C5679d c5679d = childViewHolder instanceof C5679d ? (C5679d) childViewHolder : null;
            if (c5679d != null) {
                if (c5679d.f77994C) {
                    c5679d.f77994C = false;
                    c5679d.G0();
                }
                c5679d.f77995D = false;
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.m$c */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m$c.class */
    public static final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5724m f78426a;

        public c(C5724m c5724m) {
            this.f78426a = c5724m;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(RecyclerView recyclerView, int i7) {
            this.f78426a.c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrolled(RecyclerView recyclerView, int i7, int i8) {
            this.f78426a.c();
        }
    }

    /* JADX INFO: renamed from: com.bilibili.pegasus.page.m$d */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/m$d.class */
    public static final class d<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t7, T t8) {
            return ComparisonsKt.compareValues(Integer.valueOf(((C5679d) ((Pair) t7).component1()).itemView.getTop()), Integer.valueOf(((C5679d) ((Pair) t8).component1()).itemView.getTop()));
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.bilibili.pegasus.page.l] */
    public C5724m(@NotNull RecyclerView recyclerView, @NotNull Function0<Boolean> function0) {
        this.f78414a = recyclerView;
        this.f78415b = function0;
    }

    public static void b(C5724m c5724m) {
        if (c5724m.f78420g && c5724m.f78421i == null) {
            RunnableC5722k runnableC5722k = new RunnableC5722k(c5724m, 3);
            c5724m.f78421i = runnableC5722k;
            c5724m.f78414a.postOnAnimation(runnableC5722k);
        }
    }

    public final List<C5679d> a() {
        ArrayList arrayList = new ArrayList();
        RecyclerView recyclerView = this.f78414a;
        int childCount = recyclerView.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = recyclerView.getChildAt(i7);
            if (childAt != null) {
                Object childViewHolder = recyclerView.getChildViewHolder(childAt);
                C5679d c5679d = childViewHolder instanceof C5679d ? (C5679d) childViewHolder : null;
                if (c5679d != null) {
                    arrayList.add(c5679d);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, com.bilibili.pegasus.holders.oversea.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Comparator] */
    public final boolean c() {
        if (!this.f78420g) {
            return false;
        }
        List<C5679d> listA = a();
        ArrayList<??> arrayList = (ArrayList) listA;
        if (arrayList.isEmpty()) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            float fCoerceIn = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            ExposeItem exposeItem = (C5679d) it.next();
            View view = exposeItem.itemView;
            int height = view.getHeight();
            if (height > 0) {
                int top = view.getTop();
                RecyclerView recyclerView = this.f78414a;
                fCoerceIn = RangesKt.coerceIn(RangesKt.coerceAtLeast(Math.min(view.getBottom(), recyclerView.getHeight() - recyclerView.getPaddingBottom()) - Math.max(top, recyclerView.getPaddingTop()), 0) / height, 0.0f, 1.0f);
            }
            arrayList2.add(TuplesKt.to(exposeItem, Float.valueOf(fCoerceIn)));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((Number) ((Pair) obj).component2()).floatValue() > 0.0f) {
                arrayList3.add(obj);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList3, (Comparator) new Object());
        if (listSortedWith.isEmpty()) {
            return false;
        }
        Pair pair = (Pair) CollectionsKt.firstOrNull(listSortedWith);
        C5679d c5679d = pair != null ? (C5679d) pair.getFirst() : null;
        Pair pair2 = (Pair) CollectionsKt.firstOrNull(listSortedWith);
        float fFloatValue = pair2 != null ? ((Number) pair2.getSecond()).floatValue() : 0.0f;
        Pair pair3 = (Pair) CollectionsKt.getOrNull(listSortedWith, 1);
        C5679d c5679d2 = pair3 != null ? (C5679d) pair3.getFirst() : null;
        boolean zBooleanValue = ((Boolean) this.f78415b.invoke()).booleanValue();
        for (?? r02 : arrayList) {
            View view2 = r02.itemView;
            float fA = 0.55f;
            if (Intrinsics.areEqual((Object) r02, c5679d)) {
                fA = 0.55f + (0.45f * fFloatValue);
            } else if (Intrinsics.areEqual((Object) r02, c5679d2)) {
                fA = C8047a.a(1.0f, fFloatValue, 0.45f, 0.55f);
            }
            view2.setAlpha(fA);
            boolean z6 = !zBooleanValue && r02 == c5679d;
            if (r02.f77994C != z6) {
                r02.f77994C = z6;
                r02.G0();
            }
            r02.f77995D = r02 == c5679d;
        }
        return true;
    }
}

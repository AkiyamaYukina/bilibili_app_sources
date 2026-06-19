package com.bilibili.ogv.infra.legacy.exposure;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bilibili.ogv.infra.legacy.exposure.IExposureReporter;
import com.bilibili.ogv.infra.legacy.exposure.d;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.internal.functions.Functions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d.class */
@Deprecated(message = "Migrate to https://info.bilibili.co/pages/viewpage.action?pageId=673191113")
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final HashMap<String, b> f67889a = new HashMap<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$a.class */
    public interface a {
        int a();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$b.class */
    @StabilityInferred(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f67890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final g f67891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList<ViewPager> f67892c = new ArrayList<>();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList<RecyclerView> f67893d = new ArrayList<>();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final ArrayList<View> f67894e = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final ArrayList<j> f67895f = new ArrayList<>();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public final ArrayList<h> f67896g = new ArrayList<>();

        @NotNull
        public final HashMap<Integer, c> h = new HashMap<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, e> f67897i = new HashMap<>();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, IExposureReporter> f67898j = new HashMap<>();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, Integer> f67899k = new HashMap<>();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, a> f67900l = new HashMap<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, Oj0.d> f67901m = new HashMap<>();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @NotNull
        public final HashMap<Integer, Oj0.d> f67902n = new HashMap<>();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @NotNull
        public final CompositeDisposable f67903o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f67904p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NotNull
        public final c f67905q;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$b$a.class */
        public static final class a<T> implements Consumer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f67906a;

            public a(b bVar) {
                this.f67906a = bVar;
            }

            public final void accept(Object obj) {
                b bVar = this.f67906a;
                if (bVar.f67904p) {
                    Iterator<ViewPager> it = bVar.f67892c.iterator();
                    while (it.hasNext()) {
                        bVar.e(it.next());
                    }
                    Iterator<RecyclerView> it2 = bVar.f67893d.iterator();
                    while (it2.hasNext()) {
                        bVar.e(it2.next());
                    }
                    Iterator<View> it3 = bVar.f67894e.iterator();
                    while (it3.hasNext()) {
                        bVar.e(it3.next());
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.bilibili.ogv.infra.legacy.exposure.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$b$b.class */
        public static final class C0395b<T> implements Consumer {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f67907a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final View f67908b;

            public C0395b(b bVar, View view) {
                this.f67907a = bVar;
                this.f67908b = view;
            }

            public final void accept(Object obj) {
                this.f67907a.e(this.f67908b);
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$b$c.class */
        public static final class c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f67909a;

            public c(b bVar) {
                this.f67909a = bVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                this.f67909a.b(view);
                view.postDelayed(new Oj0.c(0, this.f67909a, view), 300L);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                this.f67909a.g(view);
            }
        }

        public b(@NotNull Oj0.e eVar, @Nullable View view, @Nullable g gVar) {
            this.f67890a = view;
            this.f67891b = gVar;
            CompositeDisposable compositeDisposable = new CompositeDisposable();
            this.f67903o = compositeDisposable;
            this.f67905q = new c(this);
            compositeDisposable.add(eVar.x8().subscribe(new Consumer(this) { // from class: Oj0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final d.b f17868a;

                {
                    this.f17868a = this;
                }

                public final void accept(Object obj) {
                    Boolean bool = (Boolean) obj;
                    boolean zBooleanValue = bool.booleanValue();
                    d.b bVar = this.f17868a;
                    bVar.f67904p = zBooleanValue;
                    Boolean bool2 = Boolean.TRUE;
                    if (Intrinsics.areEqual(bool, bool2)) {
                        bVar.f67903o.add(Observable.just(bool2).delay(500L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new d.b.a(bVar)));
                    }
                }
            }, Functions.f, Functions.c));
        }

        public final void a(View view, View view2) {
            view.setTag(2131312897, "exposure_view_holder");
            view2.addOnAttachStateChangeListener(this.f67905q);
            if (ViewCompat.isAttachedToWindow(view2)) {
                b(view2);
                view2.postDelayed(new Oj0.a(this, view2), 300L);
            }
            if (view2 instanceof ViewPager) {
                this.f67892c.add(view2);
                ViewPager viewPager = (ViewPager) view2;
                j jVar = new j(new k(viewPager, this.f67901m.get(Integer.valueOf(view2.hashCode())), this.f67902n.get(Integer.valueOf(view2.hashCode()))));
                this.f67895f.add(jVar);
                viewPager.addOnPageChangeListener(jVar);
                return;
            }
            if (!(view2 instanceof RecyclerView)) {
                this.f67894e.add(view2);
                return;
            }
            this.f67893d.add(view2);
            h hVar = new h(new i(this.f67901m.get(Integer.valueOf(view2.hashCode())), this.f67902n.get(Integer.valueOf(view2.hashCode()))), this.f67891b);
            this.f67896g.add(hVar);
            ((RecyclerView) view2).addOnScrollListener(hVar);
        }

        public final void b(View view) {
            View view2;
            View view3 = Intrinsics.areEqual(view.getTag(2131312897), "exposure_view_holder") ? view : null;
            View view4 = (View) view.getParent();
            while (view4 != null) {
                View view5 = this.f67890a;
                if (Intrinsics.areEqual(view4, view5 != null ? view5.getParent() : null)) {
                    return;
                }
                if (view4 instanceof RecyclerView) {
                    view2 = view3;
                    if (view3 != null) {
                        RecyclerView recyclerView = (RecyclerView) view4;
                        c cVar = this.h.get(Integer.valueOf(recyclerView.hashCode()));
                        c cVar2 = cVar;
                        if (cVar == null) {
                            cVar2 = new c(this.f67891b);
                            recyclerView.addOnScrollListener(cVar2);
                            this.h.put(Integer.valueOf(recyclerView.hashCode()), cVar2);
                        }
                        IExposureReporter iExposureReporter = this.f67898j.get(Integer.valueOf(view.hashCode()));
                        Integer num = this.f67899k.get(Integer.valueOf(view.hashCode()));
                        cVar2.f67911b.add(new C0396d(view3, view, iExposureReporter, num != null ? num.intValue() : 0, this.f67901m.get(Integer.valueOf(view.hashCode())), this.f67902n.get(Integer.valueOf(view.hashCode()))));
                        view2 = null;
                    }
                } else if (view4 instanceof ViewPager) {
                    view2 = view3;
                    if (view3 != null) {
                        ViewPager viewPager = (ViewPager) view4;
                        e eVar = this.f67897i.get(Integer.valueOf(viewPager.hashCode()));
                        e eVar2 = eVar;
                        if (eVar == null) {
                            eVar2 = new e(viewPager);
                            viewPager.addOnPageChangeListener(eVar2);
                            this.f67897i.put(Integer.valueOf(viewPager.hashCode()), eVar2);
                        }
                        eVar2.f67919b.add(new f(view3, view4, this.f67901m.get(Integer.valueOf(view.hashCode())), this.f67902n.get(Integer.valueOf(view.hashCode()))));
                        view2 = null;
                    }
                } else {
                    view2 = view3;
                    if (Intrinsics.areEqual(view4.getTag(2131312897), "exposure_view_holder")) {
                        view2 = view4;
                    }
                }
                Object parent = view4.getParent();
                if (parent instanceof View) {
                    view4 = (View) parent;
                    view3 = view2;
                } else {
                    view4 = null;
                    view3 = view2;
                }
            }
        }

        public final void c(@NotNull View view, @Nullable Oj0.d dVar, @Nullable Oj0.d dVar2, @Nullable IExposureReporter iExposureReporter, int i7) {
            com.bilibili.ogv.infra.legacy.exposure.e eVar = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.e ? (com.bilibili.ogv.infra.legacy.exposure.e) dVar2 : null;
            if (eVar != null) {
                eVar.d(view, iExposureReporter, i7, IExposureReporter.ReporterCheckerType.CustomChecker);
            } else {
                com.bilibili.ogv.infra.legacy.exposure.a aVar = com.bilibili.ogv.infra.legacy.exposure.a.f67883a;
                com.bilibili.ogv.infra.legacy.exposure.a.f67883a.d(view, this.f67898j.get(Integer.valueOf(view.hashCode())), i7, IExposureReporter.ReporterCheckerType.DefaultChecker);
            }
            com.bilibili.ogv.infra.legacy.exposure.e eVar2 = null;
            if (dVar instanceof com.bilibili.ogv.infra.legacy.exposure.e) {
                eVar2 = (com.bilibili.ogv.infra.legacy.exposure.e) dVar;
            }
            if (eVar2 != null) {
                eVar2.d(view, this.f67898j.get(Integer.valueOf(view.hashCode())), i7, IExposureReporter.ReporterCheckerType.ExtraChecker);
            }
        }

        public final boolean d(View view) {
            if (!(view instanceof ViewPager ? this.f67892c.contains(view) : view instanceof RecyclerView ? this.f67893d.contains(view) : this.f67894e.contains(view))) {
                return false;
            }
            Observable.just(Boolean.TRUE).delay(200L, TimeUnit.MILLISECONDS, AndroidSchedulers.mainThread()).subscribe(new C0395b(this, view));
            return true;
        }

        public final void e(@NotNull View view) {
            int iIntValue;
            if (!this.f67904p || view.getParent() == null || !ViewCompat.isAttachedToWindow(view)) {
                return;
            }
            Object parent = view;
            while (true) {
                Object obj = parent;
                if (!(obj instanceof View)) {
                    if (view instanceof RecyclerView) {
                        RecyclerView recyclerView = (RecyclerView) view;
                        Oj0.d dVar = this.f67902n.get(Integer.valueOf(recyclerView.hashCode()));
                        com.bilibili.ogv.infra.legacy.exposure.f fVar = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar : null;
                        if (fVar != null) {
                            fVar.b(recyclerView, IExposureReporter.ReporterCheckerType.CustomChecker);
                        } else {
                            com.bilibili.ogv.infra.legacy.exposure.b bVar = com.bilibili.ogv.infra.legacy.exposure.b.f67885a;
                            com.bilibili.ogv.infra.legacy.exposure.b.f67885a.b(recyclerView, IExposureReporter.ReporterCheckerType.DefaultChecker);
                        }
                        Oj0.d dVar2 = this.f67901m.get(Integer.valueOf(recyclerView.hashCode()));
                        com.bilibili.ogv.infra.legacy.exposure.f fVar2 = null;
                        if (dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.f) {
                            fVar2 = (com.bilibili.ogv.infra.legacy.exposure.f) dVar2;
                        }
                        if (fVar2 != null) {
                            fVar2.b(recyclerView, IExposureReporter.ReporterCheckerType.ExtraChecker);
                            return;
                        }
                        return;
                    }
                    if (!(view instanceof ViewPager)) {
                        Oj0.d dVar3 = this.f67901m.get(Integer.valueOf(view.hashCode()));
                        Oj0.d dVar4 = this.f67902n.get(Integer.valueOf(view.hashCode()));
                        IExposureReporter iExposureReporter = this.f67898j.get(Integer.valueOf(view.hashCode()));
                        Integer num = this.f67899k.get(Integer.valueOf(view.hashCode()));
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            a aVar = this.f67900l.get(Integer.valueOf(view.hashCode()));
                            Integer numValueOf = null;
                            if (aVar != null) {
                                numValueOf = Integer.valueOf(aVar.a());
                            }
                            iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                        }
                        c(view, dVar3, dVar4, iExposureReporter, iIntValue);
                        return;
                    }
                    ViewPager viewPager = (ViewPager) view;
                    Oj0.d dVar5 = this.f67902n.get(Integer.valueOf(viewPager.hashCode()));
                    com.bilibili.ogv.infra.legacy.exposure.g gVar = dVar5 instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar5 : null;
                    if (gVar == null) {
                        gVar = com.bilibili.ogv.infra.legacy.exposure.c.f67887a;
                    }
                    com.bilibili.ogv.infra.legacy.exposure.g.h(gVar, viewPager);
                    Oj0.d dVar6 = this.f67901m.get(Integer.valueOf(viewPager.hashCode()));
                    com.bilibili.ogv.infra.legacy.exposure.g gVar2 = null;
                    if (dVar6 instanceof com.bilibili.ogv.infra.legacy.exposure.g) {
                        gVar2 = (com.bilibili.ogv.infra.legacy.exposure.g) dVar6;
                    }
                    if (gVar2 != null) {
                        com.bilibili.ogv.infra.legacy.exposure.g.h(gVar2, viewPager);
                        return;
                    }
                    return;
                }
                View view2 = (View) obj;
                if (view2.getVisibility() != 0) {
                    return;
                } else {
                    parent = view2.getParent();
                }
            }
        }

        public final void f(@NotNull View view) {
            if (view instanceof RecyclerView) {
                int iIndexOf = this.f67893d.indexOf(view);
                if (iIndexOf != -1) {
                    this.f67893d.get(iIndexOf).removeOnScrollListener(this.f67896g.get(iIndexOf));
                    this.f67896g.remove(iIndexOf);
                    this.f67893d.remove(iIndexOf);
                }
            } else if (view instanceof ViewPager) {
                int iIndexOf2 = this.f67892c.indexOf(view);
                if (iIndexOf2 != -1) {
                    this.f67892c.get(iIndexOf2).removeOnPageChangeListener(this.f67895f.get(iIndexOf2));
                    this.f67895f.remove(iIndexOf2);
                    this.f67892c.remove(iIndexOf2);
                }
            } else {
                int iIndexOf3 = this.f67894e.indexOf(view);
                if (iIndexOf3 != -1) {
                    this.f67894e.remove(iIndexOf3);
                    if (this.f67898j.containsKey(Integer.valueOf(view.hashCode()))) {
                        this.f67898j.remove(Integer.valueOf(view.hashCode()));
                    }
                    if (this.f67899k.containsKey(Integer.valueOf(view.hashCode()))) {
                        this.f67899k.remove(Integer.valueOf(view.hashCode()));
                    }
                    if (this.f67900l.containsKey(Integer.valueOf(view.hashCode()))) {
                        this.f67900l.remove(Integer.valueOf(view.hashCode()));
                    }
                }
            }
            this.f67902n.remove(Integer.valueOf(view.hashCode()));
            this.f67901m.remove(Integer.valueOf(view.hashCode()));
            g(view);
            view.removeOnAttachStateChangeListener(this.f67905q);
        }

        public final void g(View view) {
            View view2 = Intrinsics.areEqual(view.getTag(2131312897), "exposure_view_holder") ? view : null;
            View view3 = (View) view.getParent();
            while (true) {
                View view4 = view3;
                View view5 = view2;
                if (view4 == null) {
                    return;
                }
                View view6 = this.f67890a;
                if (Intrinsics.areEqual(view4, view6 != null ? view6.getParent() : null)) {
                    return;
                }
                int i7 = 0;
                if (view4 instanceof RecyclerView) {
                    view2 = view5;
                    if (view5 != null) {
                        RecyclerView recyclerView = (RecyclerView) view4;
                        c cVar = this.h.get(Integer.valueOf(recyclerView.hashCode()));
                        if (cVar != null) {
                            int i8 = -1;
                            for (C0396d c0396d : cVar.f67911b) {
                                if (i7 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (Intrinsics.areEqual(c0396d.f67912a, view5)) {
                                    i8 = i7;
                                }
                                i7++;
                            }
                            if (i8 != -1) {
                                cVar.f67911b.remove(i8);
                            }
                            if (cVar.f67911b.isEmpty()) {
                                recyclerView.removeOnScrollListener(cVar);
                                this.h.remove(Integer.valueOf(recyclerView.hashCode()));
                            }
                        }
                        view2 = null;
                    }
                } else if (view4 instanceof ViewPager) {
                    view2 = view5;
                    if (view5 != null) {
                        ViewPager viewPager = (ViewPager) view4;
                        e eVar = this.f67897i.get(Integer.valueOf(viewPager.hashCode()));
                        if (eVar != null) {
                            int i9 = -1;
                            int i10 = 0;
                            for (f fVar : eVar.f67919b) {
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (Intrinsics.areEqual(fVar.f67920a, view5)) {
                                    i9 = i10;
                                }
                                i10++;
                            }
                            if (i9 != -1) {
                                eVar.f67919b.remove(i9);
                            }
                            if (eVar.f67919b.isEmpty()) {
                                viewPager.removeOnPageChangeListener(eVar);
                                this.f67897i.remove(Integer.valueOf(viewPager.hashCode()));
                            }
                        }
                        view2 = null;
                    }
                } else {
                    view2 = view5;
                    if (Intrinsics.areEqual(view4.getTag(2131312897), "exposure_view_holder")) {
                        view2 = view4;
                    }
                }
                Object parent = view4.getParent();
                view3 = parent instanceof View ? (View) parent : null;
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$c.class */
    @StabilityInferred(parameters = 0)
    public static final class c extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final g f67910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<C0396d> f67911b = new ArrayList<>();

        public c(@Nullable g gVar) {
            this.f67910a = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
            g gVar;
            super.onScrollStateChanged(recyclerView, i7);
            if (i7 != 0) {
                if ((i7 == 1 || i7 == 2) && (gVar = this.f67910a) != null) {
                    gVar.scrolling();
                    return;
                }
                return;
            }
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                return;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                for (C0396d c0396d : this.f67911b) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                    if (Intrinsics.areEqual(viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView : null, c0396d.f67912a)) {
                        View view = c0396d.f67913b;
                        boolean z6 = view instanceof ViewPager;
                        Oj0.d dVar = c0396d.f67917f;
                        Oj0.d dVar2 = c0396d.f67916e;
                        if (z6) {
                            com.bilibili.ogv.infra.legacy.exposure.g gVar2 = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar2 : null;
                            if (gVar2 != null) {
                                com.bilibili.ogv.infra.legacy.exposure.g.h(gVar2, (ViewPager) view);
                            }
                            com.bilibili.ogv.infra.legacy.exposure.g gVar3 = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar : null;
                            if (gVar3 != null) {
                                com.bilibili.ogv.infra.legacy.exposure.g.h(gVar3, (ViewPager) c0396d.f67913b);
                            } else {
                                com.bilibili.ogv.infra.legacy.exposure.g.h(com.bilibili.ogv.infra.legacy.exposure.c.f67887a, (ViewPager) c0396d.f67913b);
                            }
                        } else if (view instanceof RecyclerView) {
                            com.bilibili.ogv.infra.legacy.exposure.f fVar = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar2 : null;
                            if (fVar != null) {
                                fVar.b((RecyclerView) view, IExposureReporter.ReporterCheckerType.ExtraChecker);
                            }
                            com.bilibili.ogv.infra.legacy.exposure.f fVar2 = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar : null;
                            if (fVar2 != null) {
                                fVar2.b((RecyclerView) c0396d.f67913b, IExposureReporter.ReporterCheckerType.CustomChecker);
                            } else {
                                com.bilibili.ogv.infra.legacy.exposure.b bVar = com.bilibili.ogv.infra.legacy.exposure.b.f67885a;
                                com.bilibili.ogv.infra.legacy.exposure.b.f67885a.b((RecyclerView) c0396d.f67913b, IExposureReporter.ReporterCheckerType.DefaultChecker);
                            }
                        } else {
                            com.bilibili.ogv.infra.legacy.exposure.e eVar = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.e ? (com.bilibili.ogv.infra.legacy.exposure.e) dVar2 : null;
                            IExposureReporter iExposureReporter = c0396d.f67914c;
                            int i8 = c0396d.f67915d;
                            if (eVar != null) {
                                eVar.d(view, iExposureReporter, i8, IExposureReporter.ReporterCheckerType.ExtraChecker);
                            }
                            com.bilibili.ogv.infra.legacy.exposure.e eVar2 = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.e ? (com.bilibili.ogv.infra.legacy.exposure.e) dVar : null;
                            if (eVar2 != null) {
                                eVar2.d(c0396d.f67913b, iExposureReporter, i8, IExposureReporter.ReporterCheckerType.CustomChecker);
                            } else {
                                com.bilibili.ogv.infra.legacy.exposure.a aVar = com.bilibili.ogv.infra.legacy.exposure.a.f67883a;
                                com.bilibili.ogv.infra.legacy.exposure.a.f67883a.d(c0396d.f67913b, iExposureReporter, i8, IExposureReporter.ReporterCheckerType.DefaultChecker);
                            }
                        }
                    }
                }
                if (iFindFirstVisibleItemPosition == iFindLastVisibleItemPosition) {
                    return;
                } else {
                    iFindFirstVisibleItemPosition++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ogv.infra.legacy.exposure.d$d, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$d.class */
    @StabilityInferred(parameters = 0)
    public static final class C0396d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f67912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f67913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final IExposureReporter f67914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f67915d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67916e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67917f;

        public C0396d(@NotNull View view, @NotNull View view2, @Nullable IExposureReporter iExposureReporter, int i7, @Nullable Oj0.d dVar, @Nullable Oj0.d dVar2) {
            this.f67912a = view;
            this.f67913b = view2;
            this.f67914c = iExposureReporter;
            this.f67915d = i7;
            this.f67916e = dVar;
            this.f67917f = dVar2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0396d)) {
                return false;
            }
            C0396d c0396d = (C0396d) obj;
            return Intrinsics.areEqual(this.f67912a, c0396d.f67912a) && Intrinsics.areEqual(this.f67913b, c0396d.f67913b) && Intrinsics.areEqual(this.f67914c, c0396d.f67914c) && this.f67915d == c0396d.f67915d && Intrinsics.areEqual(this.f67916e, c0396d.f67916e) && Intrinsics.areEqual(this.f67917f, c0396d.f67917f);
        }

        public final int hashCode() {
            int iHashCode = this.f67912a.hashCode();
            int iHashCode2 = this.f67913b.hashCode();
            int iHashCode3 = 0;
            IExposureReporter iExposureReporter = this.f67914c;
            int iA = I.a(this.f67915d, (((iHashCode2 + (iHashCode * 31)) * 31) + (iExposureReporter == null ? 0 : iExposureReporter.hashCode())) * 31, 31);
            Oj0.d dVar = this.f67916e;
            int iHashCode4 = dVar == null ? 0 : dVar.hashCode();
            Oj0.d dVar2 = this.f67917f;
            if (dVar2 != null) {
                iHashCode3 = dVar2.hashCode();
            }
            return ((iA + iHashCode4) * 31) + iHashCode3;
        }

        @NotNull
        public final String toString() {
            return "ParentRecycleViewExposureTarget(viewHolder=" + this.f67912a + ", targetView=" + this.f67913b + ", reporter=" + this.f67914c + ", position=" + this.f67915d + ", extraChecker=" + this.f67916e + ", customChecker=" + this.f67917f + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$e.class */
    @StabilityInferred(parameters = 0)
    public static final class e implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewPager f67918a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ArrayList<f> f67919b = new ArrayList<>();

        public e(@NotNull ViewPager viewPager) {
            this.f67918a = viewPager;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            PagerAdapter adapter = this.f67918a.getAdapter();
            if (adapter == 0 || i7 < 0 || i7 >= adapter.getCount()) {
                return;
            }
            boolean z6 = adapter instanceof Oj0.f;
            if (!z6) {
                com.bilibili.ogv.infra.util.e.b(new IllegalStateException("pageViewer must implement the IViewPagerExposureReporter interface, may cause wrong exposure（Check whether the ExposureTracker.detach() method is called in time)"));
            }
            Oj0.f fVar = z6 ? (Oj0.f) adapter : null;
            View viewX1 = fVar != null ? fVar.X1() : null;
            if (viewX1 != null) {
                for (f fVar2 : this.f67919b) {
                    if (Intrinsics.areEqual(fVar2.f67921b, viewX1)) {
                        boolean z7 = viewX1 instanceof ViewPager;
                        Oj0.d dVar = fVar2.f67922c;
                        Oj0.d dVar2 = fVar2.f67923d;
                        if (z7) {
                            com.bilibili.ogv.infra.legacy.exposure.g gVar = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar2 : null;
                            if (gVar == null) {
                                gVar = com.bilibili.ogv.infra.legacy.exposure.c.f67887a;
                            }
                            com.bilibili.ogv.infra.legacy.exposure.g.h(gVar, (ViewPager) viewX1);
                            com.bilibili.ogv.infra.legacy.exposure.g gVar2 = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar : null;
                            if (gVar2 != null) {
                                com.bilibili.ogv.infra.legacy.exposure.g.h(gVar2, (ViewPager) viewX1);
                            }
                        } else if (viewX1 instanceof RecyclerView) {
                            com.bilibili.ogv.infra.legacy.exposure.f fVar3 = dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar2 : null;
                            if (fVar3 != null) {
                                fVar3.b((RecyclerView) viewX1, IExposureReporter.ReporterCheckerType.CustomChecker);
                            } else {
                                com.bilibili.ogv.infra.legacy.exposure.b bVar = com.bilibili.ogv.infra.legacy.exposure.b.f67885a;
                                com.bilibili.ogv.infra.legacy.exposure.b.f67885a.b((RecyclerView) viewX1, IExposureReporter.ReporterCheckerType.DefaultChecker);
                            }
                            com.bilibili.ogv.infra.legacy.exposure.f fVar4 = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar : null;
                            if (fVar4 != null) {
                                fVar4.b((RecyclerView) viewX1, IExposureReporter.ReporterCheckerType.ExtraChecker);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$f.class */
    @StabilityInferred(parameters = 0)
    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final View f67920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final View f67921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67923d;

        public f(@NotNull View view, @NotNull View view2, @Nullable Oj0.d dVar, @Nullable Oj0.d dVar2) {
            this.f67920a = view;
            this.f67921b = view2;
            this.f67922c = dVar;
            this.f67923d = dVar2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.areEqual(this.f67920a, fVar.f67920a) && Intrinsics.areEqual(this.f67921b, fVar.f67921b) && Intrinsics.areEqual(this.f67922c, fVar.f67922c) && Intrinsics.areEqual(this.f67923d, fVar.f67923d);
        }

        public final int hashCode() {
            int iHashCode = this.f67920a.hashCode();
            int iHashCode2 = this.f67921b.hashCode();
            int iHashCode3 = 0;
            Oj0.d dVar = this.f67922c;
            int iHashCode4 = dVar == null ? 0 : dVar.hashCode();
            Oj0.d dVar2 = this.f67923d;
            if (dVar2 != null) {
                iHashCode3 = dVar2.hashCode();
            }
            return ((((iHashCode2 + (iHashCode * 31)) * 31) + iHashCode4) * 31) + iHashCode3;
        }

        @NotNull
        public final String toString() {
            return "ParentViewPagerExposureTarget(holder=" + this.f67920a + ", target=" + this.f67921b + ", extraChecker=" + this.f67922c + ", customChecker=" + this.f67923d + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$g.class */
    public interface g {
        void scrolling();
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$h.class */
    @StabilityInferred(parameters = 0)
    public static final class h extends RecyclerView.OnScrollListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final i f67924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final g f67925b;

        public h(@NotNull i iVar, @Nullable g gVar) {
            this.f67924a = iVar;
            this.f67925b = gVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public final void onScrollStateChanged(@NotNull RecyclerView recyclerView, int i7) {
            g gVar;
            if (i7 != 0) {
                if ((i7 == 1 || i7 == 2) && (gVar = this.f67925b) != null) {
                    gVar.scrolling();
                    return;
                }
                return;
            }
            i iVar = this.f67924a;
            Oj0.d dVar = iVar.f67927b;
            com.bilibili.ogv.infra.legacy.exposure.f fVar = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.f ? (com.bilibili.ogv.infra.legacy.exposure.f) dVar : null;
            if (fVar != null) {
                fVar.b(recyclerView, IExposureReporter.ReporterCheckerType.CustomChecker);
            } else {
                com.bilibili.ogv.infra.legacy.exposure.b bVar = com.bilibili.ogv.infra.legacy.exposure.b.f67885a;
                com.bilibili.ogv.infra.legacy.exposure.b.f67885a.b(recyclerView, IExposureReporter.ReporterCheckerType.DefaultChecker);
            }
            Oj0.d dVar2 = iVar.f67926a;
            com.bilibili.ogv.infra.legacy.exposure.f fVar2 = null;
            if (dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.f) {
                fVar2 = (com.bilibili.ogv.infra.legacy.exposure.f) dVar2;
            }
            if (fVar2 != null) {
                fVar2.b(recyclerView, IExposureReporter.ReporterCheckerType.ExtraChecker);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$i.class */
    @StabilityInferred(parameters = 1)
    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67927b;

        public i() {
            this(null, null);
        }

        public i(@Nullable Oj0.d dVar, @Nullable Oj0.d dVar2) {
            this.f67926a = dVar;
            this.f67927b = dVar2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Intrinsics.areEqual(this.f67926a, iVar.f67926a) && Intrinsics.areEqual(this.f67927b, iVar.f67927b);
        }

        public final int hashCode() {
            int iHashCode = 0;
            Oj0.d dVar = this.f67926a;
            int iHashCode2 = dVar == null ? 0 : dVar.hashCode();
            Oj0.d dVar2 = this.f67927b;
            if (dVar2 != null) {
                iHashCode = dVar2.hashCode();
            }
            return (iHashCode2 * 31) + iHashCode;
        }

        @NotNull
        public final String toString() {
            return "TargetRecycleViewExposureTarget(extraChecker=" + this.f67926a + ", customChecker=" + this.f67927b + ")";
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$j.class */
    @StabilityInferred(parameters = 0)
    public static final class j implements ViewPager.OnPageChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final k f67928a;

        public j(@NotNull k kVar) {
            this.f67928a = kVar;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i7) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i7, float f7, int i8) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i7) {
            k kVar = this.f67928a;
            Oj0.d dVar = kVar.f67931c;
            com.bilibili.ogv.infra.legacy.exposure.g gVar = dVar instanceof com.bilibili.ogv.infra.legacy.exposure.g ? (com.bilibili.ogv.infra.legacy.exposure.g) dVar : null;
            ViewPager viewPager = kVar.f67929a;
            if (gVar == null) {
                gVar = com.bilibili.ogv.infra.legacy.exposure.c.f67887a;
            }
            com.bilibili.ogv.infra.legacy.exposure.g.c(gVar, viewPager, i7);
            Oj0.d dVar2 = kVar.f67930b;
            com.bilibili.ogv.infra.legacy.exposure.g gVar2 = null;
            if (dVar2 instanceof com.bilibili.ogv.infra.legacy.exposure.g) {
                gVar2 = (com.bilibili.ogv.infra.legacy.exposure.g) dVar2;
            }
            if (gVar2 != null) {
                com.bilibili.ogv.infra.legacy.exposure.g.c(gVar2, viewPager, i7);
            }
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/legacy/exposure/d$k.class */
    @StabilityInferred(parameters = 0)
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final ViewPager f67929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Oj0.d f67931c;

        public k(@NotNull ViewPager viewPager, @Nullable Oj0.d dVar, @Nullable Oj0.d dVar2) {
            this.f67929a = viewPager;
            this.f67930b = dVar;
            this.f67931c = dVar2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Intrinsics.areEqual(this.f67929a, kVar.f67929a) && Intrinsics.areEqual(this.f67930b, kVar.f67930b) && Intrinsics.areEqual(this.f67931c, kVar.f67931c);
        }

        public final int hashCode() {
            int iHashCode = this.f67929a.hashCode();
            int iHashCode2 = 0;
            Oj0.d dVar = this.f67930b;
            int iHashCode3 = dVar == null ? 0 : dVar.hashCode();
            Oj0.d dVar2 = this.f67931c;
            if (dVar2 != null) {
                iHashCode2 = dVar2.hashCode();
            }
            return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            return "TargetViewPagerExposureTarget(viewPager=" + this.f67929a + ", extraChecker=" + this.f67930b + ", customChecker=" + this.f67931c + ")";
        }
    }

    @JvmStatic
    public static final void a(@NotNull String str, @NotNull View view, @NotNull View view2, @Nullable IExposureReporter iExposureReporter, @Nullable Ck0.a aVar, @NotNull a aVar2) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view2.getContext());
        if (activityFindActivityOrNull != null) {
            String strB = R0.k.b(activityFindActivityOrNull.hashCode(), str);
            HashMap<String, b> map = f67889a;
            if (map.containsKey(strB)) {
                b bVar = map.get(strB);
                if (iExposureReporter != null) {
                    bVar.f67898j.put(Integer.valueOf(view2.hashCode()), iExposureReporter);
                    bVar.f67900l.put(Integer.valueOf(view2.hashCode()), aVar2);
                    if (aVar != null) {
                        bVar.f67901m.put(Integer.valueOf(view2.hashCode()), aVar);
                    }
                }
                if (bVar.d(view2)) {
                    return;
                }
                bVar.a(view, view2);
            }
        }
    }

    @JvmStatic
    public static final boolean b(@NotNull Oj0.e eVar, @Nullable FragmentActivity fragmentActivity, @Nullable View view, @Nullable g gVar) {
        if (fragmentActivity == null) {
            com.bilibili.ogv.infra.util.e.b(new IllegalArgumentException("null activity when attach fragmentTracker"));
        }
        String str = eVar.getPageId() + (fragmentActivity != null ? Integer.valueOf(fragmentActivity.hashCode()) : null);
        HashMap<String, b> map = f67889a;
        if (map.containsKey(str)) {
            return false;
        }
        map.put(str, new b(eVar, view, gVar));
        return true;
    }

    @JvmStatic
    public static final boolean c(@NotNull String str, @NotNull View view, @NotNull View view2, @Nullable IExposureReporter iExposureReporter, @Nullable Oj0.d dVar, @Nullable Oj0.d dVar2, int i7) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view2.getContext());
        boolean z6 = false;
        if (activityFindActivityOrNull != null) {
            String strB = R0.k.b(activityFindActivityOrNull.hashCode(), str);
            HashMap<String, b> map = f67889a;
            if (!map.containsKey(strB)) {
                return false;
            }
            b bVar = map.get(strB);
            if (iExposureReporter != null) {
                bVar.f67898j.put(Integer.valueOf(view2.hashCode()), iExposureReporter);
                bVar.f67899k.put(Integer.valueOf(view2.hashCode()), Integer.valueOf(i7));
                if (dVar != null) {
                    bVar.f67901m.put(Integer.valueOf(view2.hashCode()), dVar);
                }
                if (dVar2 != null) {
                    bVar.f67902n.put(Integer.valueOf(view2.hashCode()), dVar2);
                }
            }
            if (bVar.d(view2)) {
                z6 = false;
            } else {
                bVar.a(view, view2);
                z6 = true;
            }
        }
        return z6;
    }

    @NotNull
    public static Pair e(@NotNull Rect rect) {
        return new Pair(Integer.valueOf(rect.width()), Integer.valueOf(rect.height()));
    }

    public static void f(@NotNull String str, @NotNull View view, @Nullable Oj0.d dVar, @NotNull IExposureReporter iExposureReporter, int i7) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view.getContext());
        if (activityFindActivityOrNull != null) {
            b bVar = f67889a.get(R0.k.b(activityFindActivityOrNull.hashCode(), str));
            if (bVar == null || !bVar.f67904p) {
                return;
            }
            bVar.c(view, dVar, null, iExposureReporter, i7);
        }
    }

    @JvmStatic
    public static final void g(@NotNull Oj0.e eVar, @Nullable FragmentActivity fragmentActivity) {
        if (fragmentActivity == null) {
            com.bilibili.ogv.infra.util.e.b(new IllegalArgumentException("null activity when detach fragmentTracker"));
        }
        String str = eVar.getPageId() + (fragmentActivity != null ? Integer.valueOf(fragmentActivity.hashCode()) : null);
        b bVar = f67889a.get(str);
        if (bVar != null) {
            bVar.f67903o.clear();
            Iterator it = ((List) bVar.f67893d.clone()).iterator();
            while (it.hasNext()) {
                bVar.f((View) it.next());
            }
            Iterator it2 = ((List) bVar.f67892c.clone()).iterator();
            while (it2.hasNext()) {
                bVar.f((View) it2.next());
            }
            Iterator it3 = ((List) bVar.f67894e.clone()).iterator();
            while (it3.hasNext()) {
                bVar.f((View) it3.next());
            }
        }
        f67889a.remove(str);
    }

    @JvmStatic
    public static final void h(@NotNull View view, @NotNull String str) {
        Activity activityFindActivityOrNull = ContextUtilKt.findActivityOrNull(view.getContext());
        if (activityFindActivityOrNull != null) {
            b bVar = f67889a.get(R0.k.b(activityFindActivityOrNull.hashCode(), str));
            if (bVar != null) {
                bVar.f(view);
            }
        }
    }
}

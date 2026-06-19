package com.bilibili.ship.theseus.cheese.biz.catalog;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import bu0.C5165a;
import com.airbnb.lottie.LottieAnimationView;
import com.bilibili.biligame.ui.pointmall.task.O;
import com.bilibili.droid.ToastHelper;
import com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment;
import com.bilibili.lib.theme.R$color;
import com.bilibili.lib.ui.util.MultipleThemeUtils;
import com.bilibili.ship.theseus.cheese.biz.catalog.a;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.intro.module.season.UnitedSeasonDetailRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.u;
import eu0.C6979B;
import eu0.C6982a;
import eu0.C6985d;
import eu0.C6987f;
import eu0.C7006y;
import fu0.C7200w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment.class */
@StabilityInferred(parameters = 0)
public final class CheeseCatalogTabFragment extends androidx_fragment_app_Fragment implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CheeseCatalogService f89131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f89132c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final u f89133d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f89134e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final PageReportService f89135f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final UnitedSeasonDetailRepository f89136g;

    @NotNull
    public final IntroContentSizeRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final C6982a f89137i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public C7200w f89138j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f89139k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f89140l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final bu0.c f89141m = new bu0.c(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Lazy f89142n = LazyKt.lazy(new O(this, 2));

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/catalog/CheeseCatalogTabFragment$a.class */
    public static final class a extends LinearSmoothScroller {
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public final int getVerticalSnapPreference() {
            return -1;
        }
    }

    @Inject
    public CheeseCatalogTabFragment(@NotNull CheeseCatalogService cheeseCatalogService, boolean z6, @NotNull u uVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull PageReportService pageReportService, @NotNull UnitedSeasonDetailRepository unitedSeasonDetailRepository, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull C6982a c6982a) {
        this.f89131b = cheeseCatalogService;
        this.f89132c = z6;
        this.f89133d = uVar;
        this.f89134e = cheesePlayRepository;
        this.f89135f = pageReportService;
        this.f89136g = unitedSeasonDetailRepository;
        this.h = introContentSizeRepository;
        this.f89137i = c6982a;
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    @Nullable
    public final C6985d H1() {
        RecyclerView recyclerView;
        C7200w c7200w = this.f89138j;
        RecyclerView.LayoutManager layoutManager = (c7200w == null || (recyclerView = c7200w.f119623c) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        C6985d c6985d = null;
        if (linearLayoutManager != null) {
            Integer numValueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            c6985d = null;
            if (numValueOf != null) {
                int iIntValue = numValueOf.intValue();
                Iterator it = ((ArrayList) this.f89141m.f57024e).iterator();
                int i7 = 0;
                while (true) {
                    c6985d = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (i7 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    C5165a c5165a = (C5165a) next;
                    if (i7 >= iIntValue) {
                        Object obj = c5165a.f57015b;
                        if (obj instanceof C6985d) {
                            c6985d = (C6985d) obj;
                            break;
                        }
                    }
                    i7++;
                }
            }
        }
        return c6985d;
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void L5(@NotNull C6979B c6979b) {
        C7200w c7200w;
        Iterator it = ((ArrayList) this.f89141m.f57024e).iterator();
        int i7 = 0;
        while (true) {
            if (!it.hasNext()) {
                i7 = -1;
                break;
            }
            Object next = it.next();
            if (i7 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (Intrinsics.areEqual(((C5165a) next).f57015b, c6979b)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0 && (c7200w = this.f89138j) != null) {
            final RecyclerView recyclerView = c7200w.f119623c;
            recyclerView.scrollToPosition(i7);
            final int i8 = i7;
            recyclerView.post(new Runnable(this, i8, recyclerView) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.h

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseCatalogTabFragment f89169a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89170b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final RecyclerView f89171c;

                {
                    this.f89169a = this;
                    this.f89170b = i8;
                    this.f89171c = recyclerView;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    CheeseCatalogTabFragment cheeseCatalogTabFragment = this.f89169a;
                    int i9 = this.f89170b;
                    RecyclerView recyclerView2 = this.f89171c;
                    ((LinearSmoothScroller) cheeseCatalogTabFragment.f89142n.getValue()).setTargetPosition(i9);
                    RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                    if (layoutManager != null) {
                        layoutManager.startSmoothScroll((LinearSmoothScroller) cheeseCatalogTabFragment.f89142n.getValue());
                    }
                }
            });
        }
        CheeseCatalogService cheeseCatalogService = this.f89131b;
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("chapter_id", String.valueOf(c6979b.f117492a));
        mapCreateMapBuilder.put("tab_name", c6979b.f117493b);
        Unit unit = Unit.INSTANCE;
        cheeseCatalogService.d("pugv.detail.playlist.tab.click", MapsKt.build(mapCreateMapBuilder));
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void Ld() {
        this.f89131b.f89128x.tryEmit(new a.C0600a(null));
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void M5() {
        this.f89131b.f89128x.tryEmit(a.b.f89145a);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0048  */
    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void N1(@org.jetbrains.annotations.NotNull eu0.C6991j r6) {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.f89131b
            kotlinx.coroutines.flow.MutableSharedFlow<com.bilibili.ship.theseus.cheese.biz.catalog.a> r0 = r0.f89128x
            com.bilibili.ship.theseus.cheese.biz.catalog.a$e r1 = new com.bilibili.ship.theseus.cheese.biz.catalog.a$e
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            boolean r0 = r0.tryEmit(r1)
            r0 = r5
            bu0.c r0 = r0.f89141m
            r1 = r6
            eu0.B r0 = r0.N(r1)
            r7 = r0
            r0 = r5
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.f89131b
            r8 = r0
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "courseware_id"
            r2 = r6
            long r2 = r2.f117541a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            if (r0 == 0) goto L48
            r0 = r7
            java.lang.String r0 = r0.f117493b
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L4c
        L48:
            java.lang.String r0 = ""
            r6 = r0
        L4c:
            r0 = r9
            java.lang.String r1 = "tab_name"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6 = r0
            r0 = r8
            java.lang.String r1 = "pugv.detail.material.courseware-preview.click"
            r2 = r9
            java.util.Map r2 = kotlin.collections.MapsKt.build(r2)
            r0.d(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment.N1(eu0.j):void");
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void Q4(boolean z6) {
        RecyclerView recyclerView;
        this.f89140l = z6;
        c cVar = (c) this.f89131b.f89127w.getValue();
        if (cVar != null) {
            this.f89141m.Q(cVar, !z6);
            C7200w c7200w = this.f89138j;
            if (c7200w == null || (recyclerView = c7200w.f119623c) == null) {
                return;
            }
            recyclerView.scrollToPosition(0);
        }
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void fd() {
        this.f89131b.f89128x.tryEmit(a.d.f89147a);
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void ga(@NotNull C7006y c7006y) {
        C7200w c7200w;
        List<C6979B> list;
        Object next;
        long j7 = c7006y.f117598c;
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        c cVar = (c) this.f89131b.f89127w.getValue();
        if (cVar != null && (list = cVar.f89158a) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = ((C6979B) it.next()).f117496e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                        if (((C6985d) next).f117508c == j7) {
                            break;
                        }
                    }
                }
                objectRef.element = next;
            }
        }
        C6985d c6985d = (C6985d) objectRef.element;
        int iO = c6985d != null ? this.f89141m.O(c6985d) : -1;
        if (iO < 0 || (c7200w = this.f89138j) == null) {
            return;
        }
        final RecyclerView recyclerView = c7200w.f119623c;
        recyclerView.scrollToPosition(iO);
        final int i7 = iO;
        recyclerView.post(new Runnable(this, i7, recyclerView) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final CheeseCatalogTabFragment f89172a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f89173b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final RecyclerView f89174c;

            {
                this.f89172a = this;
                this.f89173b = i7;
                this.f89174c = recyclerView;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CheeseCatalogTabFragment cheeseCatalogTabFragment = this.f89172a;
                int i8 = this.f89173b;
                RecyclerView recyclerView2 = this.f89174c;
                ((LinearSmoothScroller) cheeseCatalogTabFragment.f89142n.getValue()).setTargetPosition(i8);
                RecyclerView.LayoutManager layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    layoutManager.startSmoothScroll((LinearSmoothScroller) cheeseCatalogTabFragment.f89142n.getValue());
                }
            }
        });
    }

    public final void hf(@NotNull C6985d c6985d) {
        C6987f c6987f;
        if (c6985d.f117530z) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$onEpItemClick$1(this, c6985d, null), 3, (Object) null);
            return;
        }
        if (c6985d.f117518n) {
            c cVar = (c) this.f89131b.f89127w.getValue();
            if (cVar == null || (c6987f = cVar.f89159b) == null || !c6987f.a()) {
                ToastHelper.showToastShort(requireContext(), 2131848848);
            } else {
                ToastHelper.showToastShort(requireContext(), 2131848879);
            }
        }
        if (c6985d.f117506a == 2) {
            this.f89131b.f89128x.tryEmit(new a.C0600a(c6985d));
        } else {
            this.f89131b.f89128x.tryEmit(new a.g(c6985d));
        }
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    @Nullable
    public final C6979B mb() {
        RecyclerView recyclerView;
        C7200w c7200w = this.f89138j;
        RecyclerView.LayoutManager layoutManager = (c7200w == null || (recyclerView = c7200w.f119623c) == null) ? null : recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(linearLayoutManager.findFirstCompletelyVisibleItemPosition());
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return this.f89141m.P(numValueOf.intValue());
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        C7200w c7200wInflate = C7200w.inflate(layoutInflater);
        this.f89138j = c7200wInflate;
        return c7200wInflate.f119621a;
    }

    @Override // com.bilibili.lib.spy.generated.androidx_fragment_app_Fragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f89138j = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        FrameLayout frameLayout;
        Integer num;
        super.onViewCreated(view, bundle);
        C7200w c7200w = this.f89138j;
        RecyclerView recyclerView = c7200w != null ? c7200w.f119623c : null;
        LinearLayout linearLayout = c7200w != null ? c7200w.f119627g : null;
        LottieAnimationView lottieAnimationView = c7200w != null ? c7200w.f119622b : null;
        int i7 = 1;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            recyclerView.setAdapter(this.f89141m);
            Paint paint = new Paint();
            paint.setColor(ContextCompat.getColor(recyclerView.getContext(), R$color.f64616Wh0));
            TextPaint textPaint = new TextPaint();
            textPaint.setColor(ContextCompat.getColor(recyclerView.getContext(), R$color.Text1));
            textPaint.setTextSize(Lh1.b.b(14.0f));
            textPaint.setFakeBoldText(true);
            recyclerView.addItemDecoration(new l(this, Lh1.b.b(0.0f), textPaint.measureText("..."), textPaint, new Rect(), Lh1.b.b(40.0f), paint));
            recyclerView.addOnScrollListener(new m(this, linearLayout, lottieAnimationView));
        }
        C7200w c7200w2 = this.f89138j;
        LinearLayout linearLayout2 = c7200w2 != null ? c7200w2.f119627g : null;
        if (c7200w2 != null) {
            c7200w2.f119622b.setAnimation(MultipleThemeUtils.isNightTheme(requireContext()) ? "theseus_detail_playing_night.json" : "theseus_detail_playing.json");
        }
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener(new Or.d(this, linearLayout2));
        }
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$flowDataState$1(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$flowDataState$2(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$flowDataState$3(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$flowDataState$4(this, null), 3, (Object) null);
        BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(getViewLifecycleOwner()), (CoroutineContext) null, (CoroutineStart) null, new CheeseCatalogTabFragment$flowDataState$5(this, null), 3, (Object) null);
        if (this.f89132c) {
            if (this.f89136g.d() || ((num = this.f89137i.f117502a.get("pugv_view_tab")) != null && num.intValue() == 2)) {
                i7 = 0;
            }
            C7200w c7200w3 = this.f89138j;
            if (c7200w3 == null || (frameLayout = c7200w3.f119621a) == null) {
                return;
            }
            final int i8 = i7;
            frameLayout.post(new Runnable(this, i8) { // from class: com.bilibili.ship.theseus.cheese.biz.catalog.j

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final CheeseCatalogTabFragment f89175a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final int f89176b;

                {
                    this.f89175a = this;
                    this.f89176b = i8;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f89175a.f89133d.f103215e.setValue(Integer.valueOf(this.f89176b));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0048  */
    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p4(@org.jetbrains.annotations.NotNull eu0.C6991j r6) {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.f89131b
            kotlinx.coroutines.flow.MutableSharedFlow<com.bilibili.ship.theseus.cheese.biz.catalog.a> r0 = r0.f89128x
            com.bilibili.ship.theseus.cheese.biz.catalog.a$c r1 = new com.bilibili.ship.theseus.cheese.biz.catalog.a$c
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            boolean r0 = r0.tryEmit(r1)
            r0 = r5
            bu0.c r0 = r0.f89141m
            r1 = r6
            eu0.B r0 = r0.N(r1)
            r7 = r0
            r0 = r5
            com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogService r0 = r0.f89131b
            r8 = r0
            java.util.Map r0 = kotlin.collections.MapsKt.createMapBuilder()
            r9 = r0
            r0 = r9
            java.lang.String r1 = "courseware_id"
            r2 = r6
            long r2 = r2.f117541a
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r7
            if (r0 == 0) goto L48
            r0 = r7
            java.lang.String r0 = r0.f117493b
            r7 = r0
            r0 = r7
            r6 = r0
            r0 = r7
            if (r0 != 0) goto L4c
        L48:
            java.lang.String r0 = ""
            r6 = r0
        L4c:
            r0 = r9
            java.lang.String r1 = "tab_name"
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r6 = r0
            r0 = r8
            java.lang.String r1 = "pugv.detail.material.courseware-download.click"
            r2 = r9
            java.util.Map r2 = kotlin.collections.MapsKt.build(r2)
            r0.d(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogTabFragment.p4(eu0.j):void");
    }

    @Override // com.bilibili.ship.theseus.cheese.biz.catalog.d
    public final void ta() {
        this.f89131b.f89128x.tryEmit(a.f.f89149a);
    }
}

package com.bilibili.ship.theseus.ugc.recommend;

import Vu0.C2968g;
import Vw.m;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bilibili.app.gemini.ugc.feature.o;
import com.bilibili.exposer.ExposeListener;
import com.bilibili.lib.neuron.api.Neurons;
import com.bilibili.ship.theseus.united.page.intro.module.relate.DetailRelateRepository;
import ev0.InterfaceC7008a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt;
import mv0.C8043a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.FunctionWidgetConfig;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.utils.DpUtils;
import tv.danmaku.biliplayerv2.widget.AbsFunctionWidget;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/b.class */
@StabilityInferred(parameters = 0)
public final class b extends AbsFunctionWidget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final rW0.a<InterfaceC7008a> f98399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C8043a f98400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IReporterService f98401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final AbsFunctionWidgetService f98402d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IControlContainerService f98403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.view.a f98404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final DetailRelateRepository f98405g;

    @NotNull
    public final g h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public bY.c<RecyclerView> f98406i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final float f98407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f98408k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f98409l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public C2968g f98410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f98411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f98412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final c f98413p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    public final C0921b f98414q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ugc.recommend.a f98415r;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/b$a.class */
    @StabilityInferred(parameters = 1)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f98416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f98417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f98418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f98419d;

        public a(float f7, float f8, float f9, boolean z6) {
            this.f98416a = z6;
            this.f98417b = f7;
            this.f98418c = f8;
            this.f98419d = f9;
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ugc.recommend.b$b, reason: collision with other inner class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/b$b.class */
    public static final class C0921b implements dY.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f98420a;

        public C0921b(b bVar) {
            this.f98420a = bVar;
        }

        public final boolean a(int i7) {
            return !(((o) CollectionsKt.getOrNull(this.f98420a.h.f98433e, i7)) != null ? r0.q : false);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/recommend/b$c.class */
    public static final class c implements ExposeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f98421a;

        public c(b bVar) {
            this.f98421a = bVar;
        }

        public final void onExpose(int i7, View view) {
            b bVar = this.f98421a;
            o oVar = (o) CollectionsKt.getOrNull(bVar.h.f98433e, i7);
            if (oVar == null || oVar.q) {
                return;
            }
            oVar.q = true;
            HashMap map = new HashMap();
            map.put("from_av", bVar.f98404f.b());
            map.put("track_id", bVar.f98400b.a().f123882d);
            String str = oVar.i;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            map.put("goto", str2);
            map.put("item_avid", String.valueOf(oVar.m));
            String str3 = oVar.k;
            if (str3 == null) {
                str3 = "";
            }
            map.put("topic_track_id", str3);
            map.put("relatedvideo_position", String.valueOf(i7 + 1));
            Neurons.reportExposure$default(true, "player.player.relatedvideo.0.show", map, (List) null, 8, (Object) null);
        }
    }

    @Inject
    public b(@NotNull Context context, @NotNull rW0.a<InterfaceC7008a> aVar, @NotNull C8043a c8043a, @NotNull IReporterService iReporterService, @NotNull AbsFunctionWidgetService absFunctionWidgetService, @NotNull IControlContainerService iControlContainerService, @NotNull com.bilibili.ship.theseus.united.page.view.a aVar2, @NotNull DetailRelateRepository detailRelateRepository, @NotNull g gVar) {
        super(context);
        this.f98399a = aVar;
        this.f98400b = c8043a;
        this.f98401c = iReporterService;
        this.f98402d = absFunctionWidgetService;
        this.f98403e = iControlContainerService;
        this.f98404f = aVar2;
        this.f98405g = detailRelateRepository;
        this.h = gVar;
        this.f98407j = DpUtils.dp2px(context, 114.0f);
        this.f98408k = DpUtils.dp2px(context, 108.0f);
        this.f98409l = DpUtils.dp2px(context, 52.0f);
        this.f98413p = new c(this);
        this.f98414q = new C0921b(this);
        this.f98415r = new com.bilibili.ship.theseus.ugc.recommend.a(new Pm.d(this, 4));
    }

    @NotNull
    public final View createContentView(@NotNull Context context) {
        C2968g c2968gInflate = C2968g.inflate(LayoutInflater.from(context));
        this.f98410m = c2968gInflate;
        c2968gInflate.f25905a.setOnClickListener(new m(this, 3));
        c2968gInflate.f25906b.setOnClickListener(new com.bilibili.bililive.room.ui.topic.slide.g(this, 1));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 0, false);
        RecyclerView recyclerView = c2968gInflate.f25907c;
        recyclerView.setAdapter(this.f98415r);
        recyclerView.setLayoutManager(linearLayoutManager);
        bY.d dVar = new bY.d(new eY.c(recyclerView));
        c cVar = this.f98413p;
        bY.a aVar = dVar.b;
        aVar.f = cVar;
        ((ArrayList) aVar.d).add(this.f98414q);
        bY.c<RecyclerView> cVarA = dVar.a();
        this.f98406i = cVarA;
        cVarA.f(this.f98405g.f100861l);
        return c2968gInflate.f25905a;
    }

    public final void g() {
        this.f98402d.hideWidget(getToken());
    }

    @NotNull
    public final FunctionWidgetConfig getFunctionWidgetConfig() {
        FunctionWidgetConfig.Builder builderA = ue.b.a(true, true, true, true, true);
        builderA.changeOrientationDisableWhenShow(true);
        return builderA.build();
    }

    public final FrameLayout h() {
        C2968g c2968g = this.f98410m;
        return c2968g != null ? c2968g.f25906b : null;
    }

    public final RecyclerView i() {
        C2968g c2968g = this.f98410m;
        return c2968g != null ? c2968g.f25907c : null;
    }

    public final void onRelease() {
    }
}

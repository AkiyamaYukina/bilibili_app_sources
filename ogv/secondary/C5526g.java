package com.bilibili.ogv.secondary;

import bl0.C5115a;
import cl0.C5268b;
import com.bilibili.ogv.secondary.part.InterfaceC5532b;
import com.bilibili.ogv.secondary.part.PartReadyLoadMoreService;
import com.bilibili.ogv.secondary.part.PartReadyUiService;
import fl0.C7125b;
import gl0.C7349b;
import gl0.C7358k;
import io.ktor.client.HttpClient;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Provider;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;
import rj0.C8527b;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/g.class */
public final class C5526g implements InterfaceC5532b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f72675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.secondary.api.c f72676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f72677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f72678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C5524e f72679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final C5528i f72680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f72681g;
    public final yW0.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yW0.b f72682i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yW0.b f72683j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yW0.b f72684k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yW0.b f72685l;

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.g$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/g$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5528i f72686a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final C5526g f72687b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72688c;

        public a(@NotNull C5528i c5528i, @NotNull C5526g c5526g, int i7) {
            this.f72686a = c5528i;
            this.f72687b = c5526g;
            this.f72688c = i7;
        }

        public final T get() {
            Object partReadyUiService;
            yW0.b bVar = null;
            C5526g c5526g = this.f72687b;
            int i7 = this.f72688c;
            if (i7 == 0) {
                KomponentScope<Unit> komponentScope = c5526g.f72675a;
                yW0.b bVar2 = c5526g.h;
                if (bVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provideAggregatedModuleSupportProvider");
                    bVar2 = null;
                }
                C5115a c5115a = (C5115a) bVar2.get();
                com.bilibili.ogv.secondary.part.q qVar = new com.bilibili.ogv.secondary.part.q(c5526g.b());
                yW0.b bVar3 = c5526g.f72684k;
                if (bVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("partReadyLoadMoreServiceProvider");
                    bVar3 = null;
                }
                partReadyUiService = new PartReadyUiService(komponentScope, c5526g.f72676b, c5115a, qVar, (PartReadyLoadMoreService) bVar3.get(), new Fl0.c(c5526g.b()));
            } else if (i7 == 1) {
                com.bilibili.ogv.operation3.module.filmlistbanner.d dVar = new com.bilibili.ogv.operation3.module.filmlistbanner.d(c5526g.b());
                C8011b c8011bB = c5526g.b();
                yW0.b bVar4 = c5526g.f72681g;
                if (bVar4 != null) {
                    bVar = bVar4;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("selectedTabIndexProvider");
                }
                Set of = SetsKt.setOf(new bl0.f[]{dVar, new C7349b(c8011bB, (C7358k) bVar.get()), new com.bilibili.ogv.operation3.module.banner.c(c5526g.b()), new hl0.b(c5526g.b()), new com.bilibili.ogv.operation3.module.vcards3x2.b(c5526g.b(), c5526g.c(), c5526g.a()), new com.bilibili.ogv.operation3.module.hcards2x2.b(c5526g.b(), c5526g.c(), c5526g.a()), new C5268b(c5526g.b()), new pl0.c(c5526g.b()), new C7125b()});
                C5115a.C0305a c0305a = new C5115a.C0305a();
                Iterator<T> it = of.iterator();
                while (it.hasNext()) {
                    c0305a.a((bl0.f) it.next());
                }
                partReadyUiService = new C5115a(c0305a.f56743a);
            } else if (i7 == 2) {
                partReadyUiService = new C7358k();
            } else if (i7 != 3) {
                C5528i c5528i = this.f72686a;
                if (i7 == 4) {
                    com.bilibili.ogv.secondary.api.e eVarC = c5528i.c();
                    yW0.b bVar5 = c5526g.h;
                    if (bVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("provideAggregatedModuleSupportProvider");
                        bVar5 = null;
                    }
                    partReadyUiService = new com.bilibili.ogv.secondary.part.C(eVarC, (C5115a) bVar5.get(), c5526g.f72678d, c5526g.f72677c, c5526g.f72679e, new com.bilibili.ogv.secondary.part.q(c5526g.b()), new Fl0.c(c5526g.b()));
                } else {
                    if (i7 != 5) {
                        throw new AssertionError(i7);
                    }
                    partReadyUiService = new com.bilibili.ogv.secondary.part.B((HttpClient) c5528i.b().get(), c5526g.f72676b, new com.bilibili.ogv.secondary.part.u(c5526g.b()));
                }
            } else {
                KomponentScope<Unit> komponentScope2 = c5526g.f72675a;
                yW0.b bVar6 = c5526g.f72682i;
                if (bVar6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadMorePgcModuleServiceProvider");
                    bVar6 = null;
                }
                com.bilibili.ogv.secondary.part.C c7 = (com.bilibili.ogv.secondary.part.C) bVar6.get();
                yW0.b bVar7 = c5526g.f72683j;
                if (bVar7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loadMoreFallRegionServiceProvider");
                    bVar7 = null;
                }
                partReadyUiService = new PartReadyLoadMoreService(komponentScope2, c5526g.f72676b, c7, (com.bilibili.ogv.secondary.part.B) bVar7.get());
            }
            return (T) partReadyUiService;
        }
    }

    public C5526g(@NotNull C5528i c5528i, @NotNull String str, @NotNull String str2, @NotNull com.bilibili.ogv.secondary.api.c cVar, @NotNull KomponentScope<? super Unit> komponentScope, @NotNull C5524e c5524e) {
        this.f72680f = c5528i;
        this.f72675a = komponentScope;
        this.f72676b = cVar;
        this.f72677c = str2;
        this.f72678d = str;
        this.f72679e = c5524e;
        this.f72681g = yW0.b.c(new a(c5528i, this, 2));
        this.h = yW0.b.c(new a(c5528i, this, 1));
        this.f72682i = yW0.b.c(new a(c5528i, this, 4));
        this.f72683j = yW0.b.c(new a(c5528i, this, 5));
        this.f72684k = yW0.b.c(new a(c5528i, this, 3));
        this.f72685l = yW0.b.c(new a(c5528i, this, 0));
    }

    @NotNull
    public final com.bilibili.ogv.operation3.module.followable.h a() {
        C5528i c5528i = this.f72680f;
        HttpClient httpClient = (HttpClient) c5528i.b().get();
        yW0.b bVar = c5528i.f72692d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider");
            bVar = null;
        }
        Json json = (Json) bVar.get();
        kntr.common.pv.d dVar = kntr.common.pv.f.a;
        String strA = null;
        if (dVar != null) {
            strA = dVar.a();
        }
        return new com.bilibili.ogv.operation3.module.followable.h(new com.bilibili.ogv.operation3.module.community.h(new com.bilibili.ogv.operation3.module.community.c(httpClient, json, strA)));
    }

    @NotNull
    public final C8011b b() {
        return new C8011b(this.f72677c, C8527b.f126679a);
    }

    @NotNull
    public final com.bilibili.ogv.operation3.module.switchit.b c() {
        C5528i c5528i = this.f72680f;
        yW0.b bVar = c5528i.f72692d;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider");
            bVar = null;
        }
        return new com.bilibili.ogv.operation3.module.switchit.b(new com.bilibili.ogv.operation3.module.switchit.f((Json) bVar.get(), (HttpClient) c5528i.b().get()));
    }
}

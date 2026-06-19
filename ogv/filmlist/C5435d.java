package com.bilibili.ogv.filmlist;

import com.bilibili.ogv.filmlist.part.PartReadyUiService;
import io.ktor.client.HttpClient;
import javax.inject.Provider;
import kntr.base.router.Router;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;
import rj0.C8526a;
import rj0.C8527b;
import wj0.C8891c;
import xj0.C8983d;

/* JADX INFO: renamed from: com.bilibili.ogv.filmlist.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/d.class */
public final class C5435d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f67690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.filmlist.api.c f67691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Router f67692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C5433b f67693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f67694e = yW0.b.c(new a(this));

    /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.d$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/d$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5435d f67695a;

        public a(@NotNull C5435d c5435d) {
            this.f67695a = c5435d;
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [com.bilibili.ogv.filmlist.share.d, java.lang.Object] */
        public final T get() {
            C5435d c5435d = this.f67695a;
            KomponentScope<Unit> komponentScope = c5435d.f67690a;
            C5433b c5433b = c5435d.f67693d;
            yW0.b bVar = c5433b.f67686e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
                bVar = null;
            }
            HttpClient httpClient = (HttpClient) bVar.get();
            kntr.common.pv.d dVar = kntr.common.pv.f.a;
            String strA = null;
            if (dVar != null) {
                strA = dVar.a();
            }
            com.bilibili.ogv.filmlist.favorite.a aVar = new com.bilibili.ogv.filmlist.favorite.a(new com.bilibili.ogv.filmlist.api.b(httpClient, strA, c5433b.f67683b));
            com.bilibili.ogv.operation3.module.followable.d dVar2 = new com.bilibili.ogv.operation3.module.followable.d(new com.bilibili.ogv.operation3.module.community.k(c5435d.a()));
            ?? obj = new Object();
            com.bilibili.ogv.filmlist.guide.d dVar3 = new com.bilibili.ogv.filmlist.guide.d();
            C8526a c8526a = C8527b.f126679a;
            return (T) new PartReadyUiService(komponentScope, c5435d.f67691b, new com.bilibili.ogv.filmlist.part.d(aVar, dVar2, obj, dVar3, new C8983d(c8526a), c5435d.f67692c), new com.bilibili.ogv.filmlist.part.c(new C8891c(new C8011b("operation-playlist", c8526a), new com.bilibili.ogv.operation3.module.followable.h(new com.bilibili.ogv.operation3.module.community.h(c5435d.a())), new com.bilibili.ogv.operation3.module.followable.f(new com.bilibili.ogv.operation3.module.community.f(c5435d.a())), new C8983d(c8526a))));
        }
    }

    public C5435d(@NotNull C5433b c5433b, @NotNull com.bilibili.ogv.filmlist.api.c cVar, @NotNull KomponentScope<? super Unit> komponentScope, @NotNull Router router) {
        this.f67693d = c5433b;
        this.f67690a = komponentScope;
        this.f67691b = cVar;
        this.f67692c = router;
    }

    @NotNull
    public final com.bilibili.ogv.operation3.module.community.c a() {
        C5433b c5433b = this.f67693d;
        yW0.b bVar = c5433b.f67686e;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
            bVar = null;
        }
        HttpClient httpClient = (HttpClient) bVar.get();
        yW0.b bVar2 = c5433b.f67685d;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider");
            bVar2 = null;
        }
        Json json = (Json) bVar2.get();
        kntr.common.pv.d dVar = kntr.common.pv.f.a;
        String strA = null;
        if (dVar != null) {
            strA = dVar.a();
        }
        return new com.bilibili.ogv.operation3.module.community.c(httpClient, json, strA);
    }
}

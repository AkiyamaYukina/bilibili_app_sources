package com.bilibili.ogv.rank;

import com.bilibili.ogv.rank.part.PartReadyUiService;
import io.ktor.client.HttpClient;
import javax.inject.Provider;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import ml0.C8011b;
import org.jetbrains.annotations.NotNull;
import rj0.C8527b;

/* JADX INFO: renamed from: com.bilibili.ogv.rank.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/h.class */
public final class C5503h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final KomponentScope<Unit> f71975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ogv.rank.api.a f71976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5504i f71977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f71978d = yW0.b.c(new a(this));

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.h$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/h$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5503h f71979a;

        public a(@NotNull C5503h c5503h) {
            this.f71979a = c5503h;
        }

        public final T get() {
            C5503h c5503h = this.f71979a;
            return (T) new PartReadyUiService(c5503h.f71975a, c5503h.f71976b, new com.bilibili.ogv.rank.part.o(new C8011b(c5503h.f71977c.b(), C8527b.f126679a), new com.bilibili.ogv.operation3.module.followable.h(new com.bilibili.ogv.operation3.module.community.h(c5503h.a())), new com.bilibili.ogv.operation3.module.followable.b(new com.bilibili.ogv.operation3.module.community.d(c5503h.a()))));
        }
    }

    public C5503h(@NotNull C5504i c5504i, @NotNull com.bilibili.ogv.rank.api.a aVar, @NotNull KomponentScope<? super Unit> komponentScope) {
        this.f71977c = c5504i;
        this.f71975a = komponentScope;
        this.f71976b = aVar;
    }

    @NotNull
    public final com.bilibili.ogv.operation3.module.community.c a() {
        C5504i c5504i = this.f71977c;
        yW0.b bVar = c5504i.f71985f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
            bVar = null;
        }
        HttpClient httpClient = (HttpClient) bVar.get();
        yW0.b bVar2 = c5504i.f71984e;
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

package com.bilibili.ogv.filmlist;

import com.bilibili.ktor.KtorClientKt;
import com.google.common.base.Optional;
import io.ktor.client.HttpClient;
import javax.inject.Provider;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.filmlist.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/b.class */
public final class C5433b implements InterfaceC5436e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f67682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f67683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5433b f67684c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f67685d = yW0.b.c(new a(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f67686e = yW0.b.c(new a(this, 0));

    /* JADX INFO: renamed from: com.bilibili.ogv.filmlist.b$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/b$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5433b f67687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f67688b;

        public a(@NotNull C5433b c5433b, int i7) {
            this.f67687a = c5433b;
            this.f67688b = i7;
        }

        public final T get() {
            Json jsonCreate;
            int i7 = this.f67688b;
            if (i7 == 0) {
                yW0.b bVar = this.f67687a.f67685d;
                if (bVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("provideProvider");
                    bVar = null;
                }
                jsonCreate = KtorClientKt.getHttpClientFactory().create(new Yk0.a((Json) bVar.get(), 0));
            } else {
                if (i7 != 1) {
                    throw new AssertionError(i7);
                }
                jsonCreate = JsonKt.Json$default((Json) null, new Yk0.d(0, Optional.absent(), SetsKt.emptySet()), 1, (Object) null);
            }
            return (T) jsonCreate;
        }
    }

    public C5433b(@NotNull String str, @Nullable String str2) {
        this.f67682a = str;
        this.f67683b = str2;
    }

    @Override // com.bilibili.ogv.filmlist.InterfaceC5436e
    @NotNull
    public final B a() {
        yW0.b bVar = this.f67686e;
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
        return new B(this.f67682a, new com.bilibili.ogv.filmlist.api.b(httpClient, strA, this.f67683b), new f(new C5434c(this.f67684c)));
    }
}

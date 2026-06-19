package com.bilibili.ogv.rank;

import com.bilibili.ktor.KtorClientKt;
import com.google.common.base.Optional;
import io.ktor.client.HttpClient;
import javax.inject.Provider;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ogv.rank.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/i.class */
public final class C5504i implements M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f71982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C5504i f71983d = this;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f71984e = yW0.b.c(new a(this, 1));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f71985f = yW0.b.c(new a(this, 0));

    /* JADX INFO: renamed from: com.bilibili.ogv.rank.i$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/rank/i$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5504i f71986a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f71987b;

        public a(@NotNull C5504i c5504i, int i7) {
            this.f71986a = c5504i;
            this.f71987b = i7;
        }

        public final T get() {
            Json jsonCreate;
            int i7 = this.f71987b;
            if (i7 == 0) {
                yW0.b bVar = this.f71986a.f71984e;
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

    public C5504i(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this.f71980a = str;
        this.f71981b = str2;
        this.f71982c = str3;
    }

    @Override // com.bilibili.ogv.rank.M
    @NotNull
    public final PageUiService a() {
        yW0.b bVar = this.f71985f;
        if (bVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
            bVar = null;
        }
        com.bilibili.ogv.rank.api.e eVar = new com.bilibili.ogv.rank.api.e((HttpClient) bVar.get());
        String strB = b();
        yW0.b bVar2 = this.f71985f;
        if (bVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
            bVar2 = null;
        }
        HttpClient httpClient = (HttpClient) bVar2.get();
        kntr.common.pv.d dVar = kntr.common.pv.f.a;
        String strA = null;
        if (dVar != null) {
            strA = dVar.a();
        }
        com.bilibili.ogv.rank.part.l lVar = new com.bilibili.ogv.rank.part.l(new com.bilibili.ogv.rank.api.d(httpClient, strA), new O(new C5502g(this.f71983d)), this.f71982c);
        String str = this.f71981b;
        String str2 = this.f71980a;
        return new PageUiService(str2, eVar, new C5500e(str, str2, strB, lVar));
    }

    @NotNull
    public final String b() {
        String str;
        String str2 = this.f71982c;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "bangumi";
            if (!StringsKt.n(str2, "bangumi")) {
                str = "cinema";
                if (!StringsKt.n(str2, "cinema")) {
                    str = "vip";
                }
            }
        }
        return str;
    }
}

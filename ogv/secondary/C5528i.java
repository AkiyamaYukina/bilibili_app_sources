package com.bilibili.ogv.secondary;

import al0.C3231a;
import bl0.InterfaceC5118d;
import cl0.C5267a;
import com.bilibili.ktor.KtorClientKt;
import com.bilibili.ogv.secondary.part.CreateCategoryKomponentImpl;
import com.google.common.base.Optional;
import fl0.C7124a;
import gl0.C7348a;
import hl0.C7470a;
import io.ktor.client.HttpClient;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.modules.SerializersModuleBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pl0.C8332a;

/* JADX INFO: renamed from: com.bilibili.ogv.secondary.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/i.class */
public final class C5528i implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f72689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f72690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C5528i f72691c = this;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f72692d = yW0.b.c(new a(this, 1));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f72693e = yW0.b.c(new a(this, 0));

    /* JADX INFO: renamed from: com.bilibili.ogv.secondary.i$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/i$a.class */
    public static final class a<T> implements Provider<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final C5528i f72694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72695b;

        public a(@NotNull C5528i c5528i, int i7) {
            this.f72694a = c5528i;
            this.f72695b = i7;
        }

        public final T get() {
            Json jsonCreate;
            C5528i c5528i = this.f72694a;
            int i7 = this.f72695b;
            if (i7 == 0) {
                yW0.b bVar = null;
                yW0.b bVar2 = c5528i.f72692d;
                if (bVar2 != null) {
                    bVar = bVar2;
                } else {
                    Intrinsics.throwUninitializedPropertyAccessException("provideProvider");
                }
                jsonCreate = KtorClientKt.getHttpClientFactory().create(new Yk0.a((Json) bVar.get(), 0));
            } else {
                if (i7 != 1) {
                    throw new AssertionError(i7);
                }
                Set setEmptySet = SetsKt.emptySet();
                c5528i.getClass();
                HashSet hashSetHashSetOf = SetsKt.hashSetOf(new KClass[]{Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.filmlistbanner.c.class), Reflection.getOrCreateKotlinClass(C7348a.class), Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.banner.b.class), Reflection.getOrCreateKotlinClass(C7470a.class), Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.vcards3x2.a.class), Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.hcards2x2.a.class), Reflection.getOrCreateKotlinClass(C5267a.class), Reflection.getOrCreateKotlinClass(C8332a.class), Reflection.getOrCreateKotlinClass(C7124a.class), Reflection.getOrCreateKotlinClass(C3231a.class), Reflection.getOrCreateKotlinClass(rl0.f.class)});
                SerializersModuleBuilder serializersModuleBuilder = new SerializersModuleBuilder();
                serializersModuleBuilder.contextual(Reflection.getOrCreateKotlinClass(InterfaceC5118d.class), new bl0.e("style", hashSetHashSetOf));
                jsonCreate = JsonKt.Json$default((Json) null, new Yk0.d(0, Optional.of(serializersModuleBuilder.build()), setEmptySet), 1, (Object) null);
            }
            return (T) jsonCreate;
        }
    }

    public C5528i(@NotNull String str, @Nullable String str2) {
        this.f72689a = str;
        this.f72690b = str2;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.bilibili.ogv.secondary.part.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.bilibili.ogv.secondary.e, java.lang.Object] */
    @Override // com.bilibili.ogv.secondary.x
    @NotNull
    public final PageUiService a() {
        Long longOrNull;
        com.bilibili.ogv.secondary.api.g gVar = new com.bilibili.ogv.secondary.api.g((HttpClient) b().get());
        String str = this.f72690b;
        return new PageUiService(this.f72689a, gVar, new C5523d((str == null || (longOrNull = StringsKt.toLongOrNull(str)) == null) ? 0L : longOrNull.longValue(), new CreateCategoryKomponentImpl(c(), new z(new C5525f(this.f72691c)), new Object()), new Object()));
    }

    @NotNull
    public final Provider<HttpClient> b() {
        yW0.b bVar = this.f72693e;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("provideProvider2");
        return null;
    }

    @NotNull
    public final com.bilibili.ogv.secondary.api.e c() {
        HttpClient httpClient = (HttpClient) b().get();
        yW0.b bVar = this.f72692d;
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
        return new com.bilibili.ogv.secondary.api.e(httpClient, json, strA);
    }
}

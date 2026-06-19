package com.bilibili.ogv.operation3.module.banner;

import androidx.compose.foundation.pager.PagerStateKt;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.module.banner.b;
import java.util.ArrayList;
import java.util.List;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/c.class */
public final class c implements bl0.f<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<b> f71131a = Reflection.getOrCreateKotlinClass(b.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f71132b;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/banner/c$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f71133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f71134b;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b) {
            this.f71133a = interfaceC5118d;
            this.f71134b = c8011b;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            List<b.C0442b> list = ((b) this.f71133a).f71120a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (b.C0442b c0442b : list) {
                arrayList.add(new com.bilibili.ogv.operation3.module.banner.a(c0442b, this.f71134b.a(komponentScope, c0442b, null)));
            }
            int size = arrayList.size() * 20;
            return komponentScope.__setContent(new g(Unit.INSTANCE, komponentScope.getContext(), komponentScope, PagerStateKt.PagerState$default(size, 0.0f, f.f71140a, 2, null), arrayList, size));
        }
    }

    public c(C8011b c8011b) {
        this.f71132b = c8011b;
    }

    @Override // bl0.f
    public final Komponent<Object> a(b bVar) {
        return KomponentKt.Komponent(new a(bVar, this.f71132b));
    }

    @Override // bl0.f
    public final KClass<b> getModuleType() {
        return this.f71131a;
    }
}

package com.bilibili.ogv.kmm.operation.inlinefeed;

import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.inlinefeed.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineStart;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/r.class */
public final class r implements bl0.f<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<w> f68411a = Reflection.getOrCreateKotlinClass(w.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f68412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.followable.h f68413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f68415e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/r$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f68417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.followable.h f68418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f68420e;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar, String str) {
            this.f68416a = interfaceC5118d;
            this.f68417b = c8011b;
            this.f68418c = hVar;
            this.f68419d = cVar;
            this.f68420e = str;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            w wVar = (w) this.f68416a;
            List<w.c> list = wVar.f68443c.f68459a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new s((w.c) it.next(), this.f68417b, komponentScope, this.f68418c, this.f68419d, wVar));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new InlineFeedModuleSupport$provide$1$1$1((s) it2.next(), null), 3, (Object) null);
            }
            return komponentScope.__setContent(new t(Unit.INSTANCE, komponentScope.getContext(), komponentScope, arrayList, wVar, this.f68420e));
        }
    }

    public r(C8011b c8011b, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar, String str) {
        this.f68412b = c8011b;
        this.f68413c = hVar;
        this.f68414d = cVar;
        this.f68415e = str;
    }

    @Override // bl0.f
    public final Komponent<Object> a(w wVar) {
        return KomponentKt.Komponent(new a(wVar, this.f68412b, this.f68413c, this.f68414d, this.f68415e));
    }

    @Override // bl0.f
    public final KClass<w> getModuleType() {
        return this.f68411a;
    }
}

package com.bilibili.ogv.kmm.operation.inlinefeed;

import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.inlinefeed.a;
import it0.C7615a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/d.class */
public final class d implements bl0.f<com.bilibili.ogv.kmm.operation.inlinefeed.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<com.bilibili.ogv.kmm.operation.inlinefeed.a> f68367a = Reflection.getOrCreateKotlinClass(com.bilibili.ogv.kmm.operation.inlinefeed.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f68368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.followable.h f68369c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.feedback.h f68370d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68371e;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/inlinefeed/d$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f68373b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.followable.h f68374c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.feedback.h f68375d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68376e;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.operation3.module.feedback.h hVar2, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar) {
            this.f68372a = interfaceC5118d;
            this.f68373b = c8011b;
            this.f68374c = hVar;
            this.f68375d = hVar2;
            this.f68376e = cVar;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            com.bilibili.ogv.kmm.operation.inlinefeed.a aVar = (com.bilibili.ogv.kmm.operation.inlinefeed.a) this.f68372a;
            C8011b c8011b = this.f68373b;
            C7615a c7615aA = c8011b.a(komponentScope, aVar, null);
            List<a.c> list = aVar.f68341c.f68362a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new e((a.c) it.next(), c8011b, komponentScope, this.f68374c, this.f68375d, this.f68376e, aVar));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CinemaInlineFeedModuleSupportModule$provide$1$1$1((e) it2.next(), null), 3, (Object) null);
            }
            return komponentScope.__setContent(new f(Unit.INSTANCE, komponentScope.getContext(), komponentScope, arrayList, c7615aA, aVar));
        }
    }

    public d(C8011b c8011b, com.bilibili.ogv.operation3.module.followable.h hVar, com.bilibili.ogv.operation3.module.feedback.h hVar2, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar) {
        this.f68368b = c8011b;
        this.f68369c = hVar;
        this.f68370d = hVar2;
        this.f68371e = cVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(com.bilibili.ogv.kmm.operation.inlinefeed.a aVar) {
        return KomponentKt.Komponent(new a(aVar, this.f68368b, this.f68369c, this.f68370d, this.f68371e));
    }

    @Override // bl0.f
    public final KClass<com.bilibili.ogv.kmm.operation.inlinefeed.a> getModuleType() {
        return this.f68367a;
    }
}

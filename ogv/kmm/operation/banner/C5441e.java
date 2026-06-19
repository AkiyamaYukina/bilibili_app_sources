package com.bilibili.ogv.kmm.operation.banner;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.kmm.operation.banner.C5437a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kntr.base.log.KLog_androidKt;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import ml0.C8011b;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/e.class */
public final class C5441e implements bl0.f<C5437a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<C5437a> f68103a = Reflection.getOrCreateKotlinClass(C5437a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f68104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U f68105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f68106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC5439c f68107e;

    /* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.banner.e$a */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/banner/e$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f68109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final U f68110c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final J f68111d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC5439c f68112e;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, U u7, J j7, InterfaceC5439c interfaceC5439c) {
            this.f68108a = interfaceC5118d;
            this.f68109b = c8011b;
            this.f68110c = u7;
            this.f68111d = j7;
            this.f68112e = interfaceC5439c;
        }

        public final Object invoke(Object obj) {
            InterfaceC5439c interfaceC5439c;
            SetContentResult setContentResult__setContent;
            KomponentScope komponentScope = (KomponentScope) obj;
            C5437a c5437a = (C5437a) this.f68108a;
            List<C5437a.d> list = c5437a.f68068a.f28921a;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C5449m((C5437a.d) it.next(), this.f68109b, komponentScope, this.f68110c, this.f68111d));
            }
            if (arrayList.size() == 0) {
                KLog_androidKt.getKLog().e("BannerModuleSupport", "Data size is 0?");
                setContentResult__setContent = komponentScope.__setContent(new C5451o(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
            } else {
                Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                Iterator<C5437a.d> it2 = c5437a.f68068a.f28921a.iterator();
                int i7 = 0;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    interfaceC5439c = this.f68112e;
                    if (!zHasNext) {
                        i7 = -1;
                        break;
                    }
                    C5437a.d next = it2.next();
                    if (interfaceC5439c != null) {
                        long j7 = next.f68079a;
                        Long lC = interfaceC5439c.c();
                        if (lC != null && j7 == lC.longValue()) {
                            break;
                        }
                    }
                    i7++;
                }
                PagerState PagerState = PagerStateKt.PagerState((arrayList.size() * 50) + RangesKt.coerceAtLeast(i7, 0), 0.0f, new C5450n(arrayList));
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default((Job) null, 1, (Object) null);
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new BannerModuleSupportModule$provide$1$2(interfaceC5439c, completableDeferredCompletableDeferred$default, null), 3, (Object) null);
                setContentResult__setContent = komponentScope.__setContent(new C5452p(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f68112e, booleanRef, completableDeferredCompletableDeferred$default, PagerState, arrayList));
            }
            return setContentResult__setContent;
        }
    }

    public C5441e(C8011b c8011b, U u7, J j7, InterfaceC5439c interfaceC5439c) {
        this.f68104b = c8011b;
        this.f68105c = u7;
        this.f68106d = j7;
        this.f68107e = interfaceC5439c;
    }

    @Override // bl0.f
    public final Komponent<Object> a(C5437a c5437a) {
        return KomponentKt.Komponent(new a(c5437a, this.f68104b, this.f68105c, this.f68106d, this.f68107e));
    }

    @Override // bl0.f
    public final KClass<C5437a> getModuleType() {
        return this.f68103a;
    }
}

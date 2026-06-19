package com.bilibili.ogv.kmm.operation.cinematicket;

import bl0.InterfaceC5118d;
import com.bilibili.ogv.bpf.countdown.CountdownModelKt$createCountdownModel$1;
import com.bilibili.ogv.kmm.operation.cinematicket.a;
import com.bilibili.studio.editor.moudle.editormain.ui.fragments.caption.v4.C6542t;
import fk0.C7119c;
import it0.C7615a;
import j$.time.Clock;
import java.util.Map;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/b.class */
public final class b implements bl0.f<com.bilibili.ogv.kmm.operation.cinematicket.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<com.bilibili.ogv.kmm.operation.cinematicket.a> f68218a = Reflection.getOrCreateKotlinClass(com.bilibili.ogv.kmm.operation.cinematicket.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C7119c f68219b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C8011b f68220c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68221d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/cinematicket/b$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f68222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C7119c f68223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C8011b f68224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.kmm.operation.inlinevideo.c f68225d;

        public a(InterfaceC5118d interfaceC5118d, C7119c c7119c, C8011b c8011b, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar) {
            this.f68222a = interfaceC5118d;
            this.f68223b = c7119c;
            this.f68224c = c8011b;
            this.f68225d = cVar;
        }

        public final Object invoke(Object obj) {
            com.bilibili.ogv.kmm.operation.inlinevideo.b bVar;
            SetContentResult setContentResult__setContent;
            KomponentScope komponentScope = (KomponentScope) obj;
            com.bilibili.ogv.kmm.operation.cinematicket.a aVar = (com.bilibili.ogv.kmm.operation.cinematicket.a) this.f68222a;
            a.c cVar = (a.c) CollectionsKt.getOrNull(aVar.f68181b.f68209a, 0);
            if (cVar == null) {
                setContentResult__setContent = komponentScope.__setContent(new d(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
            } else {
                q91.i.Companion.getClass();
                q91.i iVar = new q91.i(Clock.systemUTC().instant());
                a.d dVar = aVar.f68181b;
                CountdownModelKt$createCountdownModel$1 countdownModelKt$createCountdownModel$1 = new CountdownModelKt$createCountdownModel$1(iVar.c(dVar.f68215g));
                com.bilibili.ogv.kmm.operation.inlinevideo.g gVar = cVar.f68206v;
                if (gVar != null) {
                    bVar = new com.bilibili.ogv.kmm.operation.inlinevideo.b(aVar.f68180a, gVar, this.f68225d);
                } else {
                    bVar = null;
                }
                C8011b c8011b = this.f68224c;
                C7615a c7615aA = c8011b.a(komponentScope, cVar, null);
                Map<String, String> map = dVar.f68214f;
                C7119c c7119c = this.f68223b;
                C6542t c6542t = new C6542t(c7119c, c7615aA, map, komponentScope, true);
                C6542t c6542t2 = new C6542t(c7119c, c8011b.a(komponentScope, cVar, c.f68226a), dVar.f68214f, komponentScope, true);
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new CinemaTicketInlineModuleSupportModule$provide$1$1(bVar, null), 3, (Object) null);
                setContentResult__setContent = komponentScope.__setContent(new e(Unit.INSTANCE, komponentScope.getContext(), komponentScope, cVar, countdownModelKt$createCountdownModel$1, aVar, c6542t2, bVar, c6542t));
            }
            return setContentResult__setContent;
        }
    }

    public b(C7119c c7119c, C8011b c8011b, com.bilibili.ogv.kmm.operation.inlinevideo.c cVar) {
        this.f68219b = c7119c;
        this.f68220c = c8011b;
        this.f68221d = cVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(com.bilibili.ogv.kmm.operation.cinematicket.a aVar) {
        return KomponentKt.Komponent(new a(aVar, this.f68219b, this.f68220c, this.f68221d));
    }

    @Override // bl0.f
    public final KClass<com.bilibili.ogv.kmm.operation.cinematicket.a> getModuleType() {
        return this.f68218a;
    }
}

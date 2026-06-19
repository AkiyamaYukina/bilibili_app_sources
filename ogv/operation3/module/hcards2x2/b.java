package com.bilibili.ogv.operation3.module.hcards2x2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1;
import it0.C7615a;
import kntr.base.router.Router;
import kntr.common.komponent.Komponent;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.router.RouterKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineStart;
import ml0.C8011b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/b.class */
public final class b implements bl0.f<com.bilibili.ogv.operation3.module.hcards2x2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<com.bilibili.ogv.operation3.module.hcards2x2.a> f71362a = Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.hcards2x2.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f71363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.switchit.b f71364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.followable.h f71365d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/hcards2x2/b$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f71366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f71367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.switchit.b f71368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.followable.h f71369d;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, com.bilibili.ogv.operation3.module.switchit.b bVar, com.bilibili.ogv.operation3.module.followable.h hVar) {
            this.f71366a = interfaceC5118d;
            this.f71367b = c8011b;
            this.f71368c = bVar;
            this.f71369d = hVar;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            com.bilibili.ogv.operation3.module.hcards2x2.a aVar = (com.bilibili.ogv.operation3.module.hcards2x2.a) this.f71366a;
            C8011b c8011b = this.f71367b;
            C7615a c7615aA = c8011b.a(komponentScope, aVar, null);
            CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1A = this.f71368c.a(aVar, aVar.f71353a, komponentScope);
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
            Router router = (Router) komponentScope.getContext().getCompositionLocal(RouterKt.getLocalRouter());
            KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new HCards2x2SupportModule$provide$1$1(createSwitchableModel$invoke$1A, aVar, this.f71369d, komponentScope, c8011b, mutableStateMutableStateOf$default, null), 3, (Object) null);
            return komponentScope.__setContent(new h(Unit.INSTANCE, komponentScope.getContext(), komponentScope, c7615aA, mutableStateMutableStateOf$default, aVar, router, createSwitchableModel$invoke$1A));
        }
    }

    public b(C8011b c8011b, com.bilibili.ogv.operation3.module.switchit.b bVar, com.bilibili.ogv.operation3.module.followable.h hVar) {
        this.f71363b = c8011b;
        this.f71364c = bVar;
        this.f71365d = hVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(com.bilibili.ogv.operation3.module.hcards2x2.a aVar) {
        return KomponentKt.Komponent(new a(aVar, this.f71363b, this.f71364c, this.f71365d));
    }

    @Override // bl0.f
    public final KClass<com.bilibili.ogv.operation3.module.hcards2x2.a> getModuleType() {
        return this.f71362a;
    }
}

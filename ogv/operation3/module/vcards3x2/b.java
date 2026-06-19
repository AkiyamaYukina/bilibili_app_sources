package com.bilibili.ogv.operation3.module.vcards3x2;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import bl0.InterfaceC5118d;
import com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1;
import it0.C7615a;
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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/b.class */
public final class b implements bl0.f<com.bilibili.ogv.operation3.module.vcards3x2.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass<com.bilibili.ogv.operation3.module.vcards3x2.a> f71451a = Reflection.getOrCreateKotlinClass(com.bilibili.ogv.operation3.module.vcards3x2.a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C8011b f71452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.switchit.b f71453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.ogv.operation3.module.followable.h f71454d;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/b$a.class */
    public static final class a implements Function1<KomponentScope<? super Object>, SetContentResult> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC5118d f71455a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C8011b f71456b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.switchit.b f71457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.bilibili.ogv.operation3.module.followable.h f71458d;

        public a(InterfaceC5118d interfaceC5118d, C8011b c8011b, com.bilibili.ogv.operation3.module.switchit.b bVar, com.bilibili.ogv.operation3.module.followable.h hVar) {
            this.f71455a = interfaceC5118d;
            this.f71456b = c8011b;
            this.f71457c = bVar;
            this.f71458d = hVar;
        }

        public final Object invoke(Object obj) {
            KomponentScope komponentScope = (KomponentScope) obj;
            com.bilibili.ogv.operation3.module.vcards3x2.a aVar = (com.bilibili.ogv.operation3.module.vcards3x2.a) this.f71455a;
            C8011b c8011b = this.f71456b;
            C7615a c7615aA = c8011b.a(komponentScope, aVar, null);
            CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1A = this.f71457c.a(aVar, aVar.f71442a, komponentScope);
            MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
            KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new VCards3x2SupportModule$provide$1$1(createSwitchableModel$invoke$1A, aVar, this.f71458d, komponentScope, c8011b, mutableStateMutableStateOf$default, null), 3, (Object) null);
            return komponentScope.__setContent(new h(Unit.INSTANCE, komponentScope.getContext(), komponentScope, c7615aA, mutableStateMutableStateOf$default, aVar, createSwitchableModel$invoke$1A, komponentScope));
        }
    }

    public b(C8011b c8011b, com.bilibili.ogv.operation3.module.switchit.b bVar, com.bilibili.ogv.operation3.module.followable.h hVar) {
        this.f71452b = c8011b;
        this.f71453c = bVar;
        this.f71454d = hVar;
    }

    @Override // bl0.f
    public final Komponent<Object> a(com.bilibili.ogv.operation3.module.vcards3x2.a aVar) {
        return KomponentKt.Komponent(new a(aVar, this.f71452b, this.f71453c, this.f71454d));
    }

    @Override // bl0.f
    public final KClass<com.bilibili.ogv.operation3.module.vcards3x2.a> getModuleType() {
        return this.f71451a;
    }
}

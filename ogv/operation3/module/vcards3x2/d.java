package com.bilibili.ogv.operation3.module.vcards3x2;

import com.bilibili.ogv.operation3.module.switchit.CreateSwitchableModel$invoke$1;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/module/vcards3x2/d.class */
public final class d implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KomponentScope<Object> f71460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreateSwitchableModel$invoke$1 f71461b;

    public d(KomponentScope komponentScope, CreateSwitchableModel$invoke$1 createSwitchableModel$invoke$1) {
        this.f71460a = komponentScope;
        this.f71461b = createSwitchableModel$invoke$1;
    }

    public final Object invoke() {
        BuildersKt.launch$default(this.f71460a.getCoroutineScope(), (CoroutineContext) null, (CoroutineStart) null, new VCards3x2SupportModule$provide$1$2$1$1$1$2$1$1(this.f71461b, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}

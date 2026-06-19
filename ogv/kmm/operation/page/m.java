package com.bilibili.ogv.kmm.operation.page;

import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/m.class */
public final class m implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f68620a;

    public m(p pVar) {
        this.f68620a = pVar;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new l(Unit.INSTANCE, komponentScope.getContext(), komponentScope, this.f68620a));
    }
}

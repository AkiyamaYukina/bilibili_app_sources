package com.bilibili.ogv.kmm.operation.page;

import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/k.class */
public final class k implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f68613a = new Object();

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new j(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
    }
}

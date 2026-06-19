package com.bilibili.ogv.operation3.filmlisthub;

import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation3/filmlisthub/d.class */
public final class d implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f71099a = new Object();

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new c(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
    }
}

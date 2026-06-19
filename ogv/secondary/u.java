package com.bilibili.ogv.secondary;

import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/secondary/u.class */
public final class u implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f72942a = new Object();

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        return komponentScope.__setContent(new t(Unit.INSTANCE, komponentScope.getContext(), komponentScope));
    }
}

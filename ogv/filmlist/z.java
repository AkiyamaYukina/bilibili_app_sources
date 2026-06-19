package com.bilibili.ogv.filmlist;

import com.bilibili.ogv.filmlist.s;
import kntr.common.komponent.KomponentKt;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/z.class */
public final class z implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B f67846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f67847b;

    public z(B b7, s sVar) {
        this.f67846a = b7;
        this.f67847b = sVar;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        f fVar = this.f67846a.f67612c;
        return komponentScope.__setContent(new y(Unit.INSTANCE, komponentScope.getContext(), komponentScope, komponentScope.embed(KomponentKt.Komponent(new g(0, (C5434c) fVar.f67696a, ((s.c) this.f67847b).f67795a)))));
    }
}

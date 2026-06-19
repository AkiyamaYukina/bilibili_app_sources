package com.bilibili.ogv.filmlist;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.trio.toast.Toaster;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/filmlist/v.class */
public final class v implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f67830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<Unit> f67831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState<s> f67832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final B f67833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Toaster f67834e;

    public v(s sVar, KomponentScope<? super Unit> komponentScope, MutableState<s> mutableState, B b7, Toaster toaster) {
        this.f67830a = sVar;
        this.f67831b = komponentScope;
        this.f67832c = mutableState;
        this.f67833d = b7;
        this.f67834e = toaster;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        Unit unit = Unit.INSTANCE;
        VertexContext context = komponentScope.getContext();
        B b7 = this.f67833d;
        return komponentScope.__setContent(new u(unit, context, komponentScope, this.f67830a, this.f67831b, this.f67832c, b7, this.f67834e));
    }
}

package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kntr.common.komponent.SetContentResult;
import kntr.common.trio.vertex.VertexContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/i.class */
public final class i implements Function1<KomponentScope<? super Unit>, SetContentResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f68603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KomponentScope<a> f68604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<q91.i> f68605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f68606d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ref.ObjectRef<Boolean> f68607e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState<p> f68608f;

    /* JADX WARN: Multi-variable type inference failed */
    public i(p pVar, KomponentScope<? super a> komponentScope, Ref.ObjectRef<q91.i> objectRef, o oVar, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState) {
        this.f68603a = pVar;
        this.f68604b = komponentScope;
        this.f68605c = objectRef;
        this.f68606d = oVar;
        this.f68607e = objectRef2;
        this.f68608f = mutableState;
    }

    public final Object invoke(Object obj) {
        KomponentScope komponentScope = (KomponentScope) obj;
        Unit unit = Unit.INSTANCE;
        VertexContext context = komponentScope.getContext();
        Ref.ObjectRef<Boolean> objectRef = this.f68607e;
        return komponentScope.__setContent(new h(unit, context, komponentScope, this.f68603a, this.f68604b, this.f68605c, this.f68606d, objectRef, this.f68608f));
    }
}

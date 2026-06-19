package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/e.class */
public final class e implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KomponentScope<a> f68580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<q91.i> f68581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f68582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.ObjectRef<Boolean> f68583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableState<p> f68584e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(KomponentScope<? super a> komponentScope, Ref.ObjectRef<q91.i> objectRef, o oVar, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState) {
        this.f68580a = komponentScope;
        this.f68581b = objectRef;
        this.f68582c = oVar;
        this.f68583d = objectRef2;
        this.f68584e = mutableState;
    }

    public final Object invoke() {
        o.a(this.f68580a, this.f68581b, this.f68582c, this.f68583d, this.f68584e);
        return Unit.INSTANCE;
    }
}

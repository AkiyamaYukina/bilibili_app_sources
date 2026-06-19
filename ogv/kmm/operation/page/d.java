package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/d.class */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KomponentScope<a> f68575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ref.ObjectRef<q91.i> f68576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f68577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.ObjectRef<Boolean> f68578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableState<p> f68579e;

    /* JADX WARN: Multi-variable type inference failed */
    public d(KomponentScope<? super a> komponentScope, Ref.ObjectRef<q91.i> objectRef, o oVar, Ref.ObjectRef<Boolean> objectRef2, MutableState<p> mutableState) {
        this.f68575a = komponentScope;
        this.f68576b = objectRef;
        this.f68577c = oVar;
        this.f68578d = objectRef2;
        this.f68579e = mutableState;
    }

    @Override // com.bilibili.ogv.kmm.operation.page.a
    public final void a(String str) {
        KomponentHostScope.launch$default(this.f68575a, (CoroutineContext) null, (CoroutineStart) null, new PageModel$komponent$1$refreshData$1(this.f68576b, this.f68577c, str, this.f68578d, this.f68579e, null), 3, (Object) null);
    }
}

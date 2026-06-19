package com.bilibili.ogv.kmm.operation.page;

import androidx.compose.runtime.MutableState;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bilibili.ogv.kmm.operation.page.p;
import j$.time.Clock;
import kntr.common.komponent.KomponentHostScope;
import kntr.common.komponent.KomponentScope;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref;
import kotlin.time.Duration;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/page/c.class */
public final class c implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ref.ObjectRef<q91.i> f68568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef<Boolean> f68570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Ref.BooleanRef f68571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final KomponentScope<a> f68572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableState<p> f68573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f68574g;

    /* JADX WARN: Multi-variable type inference failed */
    public c(Ref.ObjectRef<q91.i> objectRef, long j7, Ref.ObjectRef<Boolean> objectRef2, Ref.BooleanRef booleanRef, KomponentScope<? super a> komponentScope, MutableState<p> mutableState, o oVar) {
        this.f68568a = objectRef;
        this.f68569b = j7;
        this.f68570c = objectRef2;
        this.f68571d = booleanRef;
        this.f68572e = komponentScope;
        this.f68573f = mutableState;
        this.f68574g = oVar;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        MutableState<p> mutableState = this.f68573f;
        boolean z6 = mutableState.getValue() instanceof p.d;
        Ref.ObjectRef<q91.i> objectRef = this.f68568a;
        o oVar = this.f68574g;
        KomponentScope<a> komponentScope = this.f68572e;
        if (z6) {
            q91.i.Companion.getClass();
            if (Duration.compareTo-LRDsOJo(new q91.i(Clock.systemUTC().instant()).b((q91.i) objectRef.element), this.f68569b) < 0) {
                KomponentHostScope.launch$default(komponentScope, (CoroutineContext) null, (CoroutineStart) null, new PageModel$komponent$1$refreshIfEmpty$1(oVar, null), 3, (Object) null);
                return;
            }
        }
        Ref.ObjectRef<Boolean> objectRef2 = this.f68570c;
        if (objectRef2.element != null) {
            o.a(komponentScope, objectRef, oVar, objectRef2, mutableState);
        } else {
            this.f68571d.element = true;
            mutableState.setValue(p.c.f68644a);
        }
    }
}

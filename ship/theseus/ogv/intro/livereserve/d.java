package com.bilibili.ship.theseus.ogv.intro.livereserve;

import com.bilibili.ship.theseus.ogv.intro.livereserve.b;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/livereserve/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f93318a;

    public /* synthetic */ d(e eVar) {
        this.f93318a = eVar;
    }

    public final Object invoke(Object obj) {
        e eVar = this.f93318a;
        BuildersKt.launch$default(eVar.h, (CoroutineContext) null, (CoroutineStart) null, new OgvLiveReserveUIComponentService$create$vm$2$1(eVar, (b.a) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}

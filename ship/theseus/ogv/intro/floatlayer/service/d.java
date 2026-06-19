package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/d.class */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f92997a;

    public /* synthetic */ d(i iVar) {
        this.f92997a = iVar;
    }

    public final Object invoke(Object obj) {
        i iVar = this.f92997a;
        iVar.getClass();
        BuildersKt.launch$default(iVar.f93003a, (CoroutineContext) null, (CoroutineStart) null, new ShowOgvInfoAndReviewLayer$jumpToShortReviewPublishPage$1(iVar, (wl0.c) obj, null), 3, (Object) null);
        return Unit.INSTANCE;
    }
}

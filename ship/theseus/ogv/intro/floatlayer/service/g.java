package com.bilibili.ship.theseus.ogv.intro.floatlayer.service;

import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/service/g.class */
public final /* synthetic */ class g implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f93001a;

    public /* synthetic */ g(CoroutineScope coroutineScope) {
        this.f93001a = coroutineScope;
    }

    public final Object invoke() {
        return ShowOgvInfoAndReviewLayer$invoke$1.invokeSuspend$lambda$0(this.f93001a);
    }
}

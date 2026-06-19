package com.bilibili.ship.theseus.ugc.playlimited;

import com.bilibili.ship.theseus.ugc.playlimited.UgcMediaRestrictionLayerService;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/playlimited/d.class */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableStateFlow f98386a;

    public /* synthetic */ d(MutableStateFlow mutableStateFlow) {
        this.f98386a = mutableStateFlow;
    }

    public final Object invoke() {
        return UgcMediaRestrictionLayerService.AnonymousClass1.AnonymousClass3.invokeSuspend$lambda$1(this.f98386a);
    }
}

package com.bilibili.playerbizcommonv2.web;

import com.bilibili.playerbizcommonv2.web.PlayerV3WebGeneralUIComponent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/web/l.class */
public final class l<T> implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent f82232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlayerV3WebGeneralUIComponent.c f82233b;

    public l(PlayerV3WebGeneralUIComponent.c cVar, PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent) {
        this.f82232a = playerV3WebGeneralUIComponent;
        this.f82233b = cVar;
    }

    public final Object emit(Object obj, Continuation continuation) {
        ((Number) obj).intValue();
        PlayerV3WebGeneralUIComponent playerV3WebGeneralUIComponent = this.f82232a;
        PlayerV3WebGeneralUIComponent.c cVar = this.f82233b;
        playerV3WebGeneralUIComponent.g(cVar);
        cVar.f82151a.requestLayout();
        return Unit.INSTANCE;
    }
}

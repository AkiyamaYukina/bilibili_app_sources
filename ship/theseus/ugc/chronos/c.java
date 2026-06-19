package com.bilibili.ship.theseus.ugc.chronos;

import kotlin.jvm.internal.Reflection;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.GetOnlineInfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/c.class */
public final class c implements ChronosRequestHandler<GetOnlineInfo.Request, GetOnlineInfo.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96460a = Reflection.typeOf(GetOnlineInfo.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UGCChronosBusinessService f96461b;

    public c(UGCChronosBusinessService uGCChronosBusinessService) {
        this.f96461b = uGCChronosBusinessService;
    }

    public final Class<GetOnlineInfo.Request> getRequestClass() {
        return GetOnlineInfo.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f96460a;
    }

    public final ChronosResponseWrapper<GetOnlineInfo.Response> handle(GetOnlineInfo.Request request) {
        RpcInvokeObserver rpcInvokeObserver;
        ILocalHandler localHandler = this.f96461b.f96441c.getLocalHandler();
        return new ChronosResponseWrapper.Success((localHandler == null || (rpcInvokeObserver = localHandler.getRpcInvokeObserver()) == null) ? null : rpcInvokeObserver.getOnlineInfo());
    }
}

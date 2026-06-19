package com.bilibili.ship.theseus.ugc.chronos;

import kotlin.jvm.internal.Reflection;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.ILocalHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.local.RpcInvokeObserver;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.FetchBusinessData;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/chronos/b.class */
public final class b implements ChronosRequestHandler<FetchBusinessData.Request, FetchBusinessData.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f96458a = Reflection.typeOf(FetchBusinessData.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UGCChronosBusinessService f96459b;

    public b(UGCChronosBusinessService uGCChronosBusinessService) {
        this.f96459b = uGCChronosBusinessService;
    }

    public final Class<FetchBusinessData.Request> getRequestClass() {
        return FetchBusinessData.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f96458a;
    }

    public final ChronosResponseWrapper<FetchBusinessData.Response> handle(FetchBusinessData.Request request) {
        RpcInvokeObserver rpcInvokeObserver;
        FetchBusinessData.Request request2 = request;
        ILocalHandler localHandler = this.f96459b.f96441c.getLocalHandler();
        return new ChronosResponseWrapper.Success((localHandler == null || (rpcInvokeObserver = localHandler.getRpcInvokeObserver()) == null) ? null : rpcInvokeObserver.fetchBusinessData(request2.getBusiness(), request2.getData()));
    }
}

package com.bilibili.ship.theseus.cheese.player.module;

import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateVideoDetailState;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/c.class */
public final class c implements ChronosRequestHandler<UpdateVideoDetailState.Request, Void> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f90666a = Reflection.typeOf(UpdateVideoDetailState.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheeseChronosBusinessService f90667b;

    public c(CheeseChronosBusinessService cheeseChronosBusinessService) {
        this.f90667b = cheeseChronosBusinessService;
    }

    public final Class<UpdateVideoDetailState.Request> getRequestClass() {
        return UpdateVideoDetailState.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f90666a;
    }

    public final ChronosResponseWrapper<Void> handle(UpdateVideoDetailState.Request request) {
        UpdateVideoDetailState.CheckInState clockInState = request.getClockInState();
        if (clockInState != null) {
            CheeseChronosBusinessService cheeseChronosBusinessService = this.f90667b;
            cheeseChronosBusinessService.getClass();
            String activity = clockInState.getActivity();
            if (activity != null && !StringsKt.isBlank(activity)) {
                cheeseChronosBusinessService.f90650k.f101463m.tryEmit(clockInState);
            }
        }
        return new ChronosResponseWrapper.Success((Object) null);
    }
}

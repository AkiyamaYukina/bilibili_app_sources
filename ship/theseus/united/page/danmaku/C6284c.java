package com.bilibili.ship.theseus.united.page.danmaku;

import kotlin.jvm.internal.Reflection;
import tv.danmaku.android.log.BLog;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosRequestHandler;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.ChronosResponseWrapper;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.UpdateDetailPageVideoPlayerSizeLockState;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.danmaku.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/c.class */
public final class C6284c implements ChronosRequestHandler<UpdateDetailPageVideoPlayerSizeLockState.Request, UpdateDetailPageVideoPlayerSizeLockState.Response> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f99523a = Reflection.typeOf(UpdateDetailPageVideoPlayerSizeLockState.Request.class).isMarkedNullable();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChronosBusinessService f99524b;

    public C6284c(ChronosBusinessService chronosBusinessService) {
        this.f99524b = chronosBusinessService;
    }

    public final Class<UpdateDetailPageVideoPlayerSizeLockState.Request> getRequestClass() {
        return UpdateDetailPageVideoPlayerSizeLockState.Request.class;
    }

    public final boolean getRequestNullable() {
        return this.f99523a;
    }

    public final ChronosResponseWrapper<UpdateDetailPageVideoPlayerSizeLockState.Response> handle(UpdateDetailPageVideoPlayerSizeLockState.Request request) {
        UpdateDetailPageVideoPlayerSizeLockState.Request request2 = request;
        Boolean lock = request2.getLock();
        String tag = request2.getTag();
        UpdateDetailPageVideoPlayerSizeLockState.Response response = null;
        if (lock == null || tag == null) {
            BLog.i("ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle", "[theseus-united-ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle] UpdateDetailPageVideoPlayerSizeLockState request is invalid, return");
        } else {
            defpackage.a.b("[theseus-united-ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle] ", "UpdateDetailPageVideoPlayerSizeLockState request: lock=" + lock + ", tag=" + tag, "ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle");
            if (((Boolean) i.f99532a.getValue()).booleanValue()) {
                BLog.i("ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle", "[theseus-united-ChronosBusinessService$addUpdatePlayerLockStateHandler$$inlined$chronosRequestHandler$1-handle] forbiddenLockPlayerRatioFromChronos is true, ignore request");
            } else {
                boolean zBooleanValue = lock.booleanValue();
                ChronosBusinessService chronosBusinessService = this.f99524b;
                if (zBooleanValue) {
                    chronosBusinessService.f99326C.f(tag);
                } else {
                    chronosBusinessService.f99326C.j(tag);
                }
                response = new UpdateDetailPageVideoPlayerSizeLockState.Response();
            }
        }
        return new ChronosResponseWrapper.Success(response);
    }
}

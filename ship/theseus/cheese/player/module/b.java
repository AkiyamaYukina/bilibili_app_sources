package com.bilibili.ship.theseus.cheese.player.module;

import bolts.Continuation;
import bolts.Task;
import kotlin.Unit;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.methods.receive.CheckAndGrantPermission;
import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/player/module/b.class */
public final class b<TTaskResult, TContinuationResult> implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckAndGrantPermission.Request f90664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheeseChronosBusinessService f90665b;

    public b(CheckAndGrantPermission.Request request, CheeseChronosBusinessService cheeseChronosBusinessService) {
        this.f90664a = request;
        this.f90665b = cheeseChronosBusinessService;
    }

    @Override // bolts.Continuation
    public final Object then(Task task) {
        Unit unit;
        boolean z6 = (task.isCancelled() || task.isFaulted()) ? false : true;
        CheckAndGrantPermission.Request request = this.f90664a;
        defpackage.a.b("[theseus-cheese-CheeseChronosBusinessService$addPermissionGrantHandler$handler$1$1-then] ", "CheckAndGrantPermission grant result: " + z6 + " permission: " + request.getType(), "CheeseChronosBusinessService$addPermissionGrantHandler$handler$1$1-then");
        IRemoteHandler remoteHandler = this.f90665b.f90643c.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.onPermissionChanged(z6, request.getType());
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }
}

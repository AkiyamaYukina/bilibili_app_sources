package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CompletableDeferredKt;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/t.class */
public final class t {
    public static PCSFacadeImpl a(IPlayerCoreService iPlayerCoreService, com.bilibili.player.tangram.basic.c cVar, com.bilibili.player.tangram.basic.f fVar, E e7, u uVar, com.bilibili.player.tangram.basic.d dVar, Function1 function1) {
        Unit unit = Unit.INSTANCE;
        return new PCSFacadeImpl(iPlayerCoreService, cVar, fVar, e7, uVar, dVar, function1, CompletableDeferredKt.CompletableDeferred(unit), CompletableDeferredKt.CompletableDeferred(unit), null);
    }
}

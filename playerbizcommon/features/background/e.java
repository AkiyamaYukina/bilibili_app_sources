package com.bilibili.playerbizcommon.features.background;

import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.PlayerStateObserver;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/e.class */
public final class e implements PlayerStateObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackgroundPlayService f79620a;

    public e(BackgroundPlayService backgroundPlayService) {
        this.f79620a = backgroundPlayService;
    }

    public final void onPlayerStateChanged(int i7) {
        BackgroundPlayService backgroundPlayService = this.f79620a;
        IPlayerCoreService iPlayerCoreService = backgroundPlayService.f79583c;
        IPlayerCoreService iPlayerCoreService2 = iPlayerCoreService;
        if (iPlayerCoreService == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService2 = null;
        }
        iPlayerCoreService2.registerState(backgroundPlayService.f79580H, new int[]{5, 4, 6, 8});
        IPlayerCoreService iPlayerCoreService3 = backgroundPlayService.f79583c;
        if (iPlayerCoreService3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlayerCoreService");
            iPlayerCoreService3 = null;
        }
        iPlayerCoreService3.unregisterState(this);
    }
}

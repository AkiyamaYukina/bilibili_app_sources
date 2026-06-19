package com.bilibili.player.tangram.playercore;

import G3.C1942p0;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;

/* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/e.class */
public final class C5777e {
    @NotNull
    public static final C5776d a(@Nullable Function0 function0, @NotNull IPlayerCoreService iPlayerCoreService) {
        Function0 c1942p0 = function0;
        if (function0 == null) {
            c1942p0 = new C1942p0(11);
        }
        return new C5776d(c1942p0, iPlayerCoreService);
    }
}

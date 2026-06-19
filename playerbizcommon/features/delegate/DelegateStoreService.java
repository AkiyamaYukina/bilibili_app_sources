package com.bilibili.playerbizcommon.features.delegate;

import java.util.HashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.PlayerSharingBundle;
import tv.danmaku.biliplayerv2.service.IPlayerService;
import tv.danmaku.biliplayerv2.service.PlayerServiceManager;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/delegate/DelegateStoreService.class */
public final class DelegateStoreService implements IPlayerService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, AbsDelegate> f79765a = new HashMap(8);

    public void bindPlayerContainer(@NotNull PlayerContainer playerContainer) {
    }

    @Nullable
    public <T extends AbsDelegate> T get(@NotNull String str) {
        return (T) ((HashMap) this.f79765a).get(str);
    }

    public void onStart(@Nullable PlayerSharingBundle playerSharingBundle) {
    }

    public void onStop() {
        ((HashMap) this.f79765a).clear();
    }

    public void put(@NotNull String str, @NotNull AbsDelegate absDelegate) {
        ((HashMap) this.f79765a).put(str, absDelegate);
    }

    public void remove(@NotNull String str) {
        ((HashMap) this.f79765a).remove(str);
    }

    @NotNull
    public PlayerServiceManager.ServiceConfig serviceConfig() {
        return PlayerServiceManager.ServiceConfig.Companion.obtain(true);
    }
}

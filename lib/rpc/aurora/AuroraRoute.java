package com.bilibili.lib.rpc.aurora;

import com.bilibili.lib.rpc.track.model.NetworkEvent;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/rpc/aurora/AuroraRoute.class */
public interface AuroraRoute {
    @NotNull
    String onAuroraReq(@NotNull String str, @NotNull String str2);

    void onAuroraResp(@NotNull NetworkEvent networkEvent);
}

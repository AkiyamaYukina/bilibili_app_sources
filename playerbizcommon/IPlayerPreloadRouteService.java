package com.bilibili.playerbizcommon;

import com.bapis.bilibili.app.archive.middleware.v1.PlayerArgs;
import com.bapis.bilibili.app.archive.middleware.v1.QnPolicy;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/IPlayerPreloadRouteService.class */
public interface IPlayerPreloadRouteService {
    long clientAttr();

    @NotNull
    QnPolicy getAutoPolicy();

    int getFnVal();

    int getFnVer();

    int getForceHost();

    int getFourK();

    @NotNull
    PlayerArgs getPlayerArgsParams();

    int getPlayerNet();

    @NotNull
    HashMap<String, String> getPlayerPreloadParamsMap();

    int getQn();

    @NotNull
    HashMap<String, String> getRpcPlayerPreloadParamsMap();

    long getSoftFnVal();

    boolean getVoiceBalance();

    boolean isHevcEnable();
}

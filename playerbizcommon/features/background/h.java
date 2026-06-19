package com.bilibili.playerbizcommon.features.background;

import tv.danmaku.biliplayerv2.service.IPlayerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/background/h.class */
public interface h extends IPlayerService {
    boolean isBackgroundRunning();

    boolean isEnable();

    boolean isSettingAvailable();

    void setEnable(boolean z6);

    void setSettingAvailable(boolean z6);
}

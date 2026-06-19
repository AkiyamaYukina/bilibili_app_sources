package com.bilibili.bililive.listplayer.videonew.player;

import com.bilibili.playerbizcommon.utils.PlayerSettingHelper;
import tv.danmaku.biliplayerv2.service.Video;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bililive/listplayer/videonew/player/BaseInlinePlayableParams.class */
public abstract class BaseInlinePlayableParams extends Video.PlayableParams {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f62943v;

    public BaseInlinePlayableParams() {
        setEnableSafeConnection(PlayerSettingHelper.enablePlayUrlHTTPS());
    }

    public final boolean isShowDanmaku() {
        return this.f62943v;
    }

    public final void setShowDanmaku(boolean z6) {
        this.f62943v = z6;
    }
}

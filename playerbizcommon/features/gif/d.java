package com.bilibili.playerbizcommon.features.gif;

import tv.danmaku.videoplayer.core.media.mediacenter.record.PlayerType;
import tv.danmaku.videoplayer.coreV2.IMediaPlayParams;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/gif/d.class */
public final class d implements IMediaPlayParams {
    public final boolean externalRender() {
        return false;
    }

    public final boolean forbidReusePlayerCore() {
        return true;
    }

    public final PlayerType playerType() {
        return PlayerType.Exclusive;
    }
}

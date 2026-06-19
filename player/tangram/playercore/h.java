package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/h.class */
public final class h implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IjkMediaPlayerItem f79446a;

    public h(IjkMediaPlayerItem ijkMediaPlayerItem) {
        this.f79446a = ijkMediaPlayerItem;
    }

    public final Object invoke(Object obj) {
        this.f79446a.setAssetUpdateListener((IjkMediaPlayerItem.IjkMediaPlayerItemAssetUpdateListener) null);
        return Unit.INSTANCE;
    }
}

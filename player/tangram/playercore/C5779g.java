package com.bilibili.player.tangram.playercore;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuationImpl;
import tv.danmaku.ijk.media.player.IjkAssetUpdateReason;
import tv.danmaku.ijk.media.player.IjkMediaAsset;
import tv.danmaku.ijk.media.player.IjkMediaPlayerItem;

/* JADX INFO: renamed from: com.bilibili.player.tangram.playercore.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/g.class */
public final class C5779g implements IjkMediaPlayerItem.IjkMediaPlayerItemAssetUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CancellableContinuationImpl f79445a;

    public C5779g(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f79445a = cancellableContinuationImpl;
    }

    public final IjkMediaAsset onAssetUpdate(IjkAssetUpdateReason ijkAssetUpdateReason) {
        CancellableContinuationImpl cancellableContinuationImpl = this.f79445a;
        if (!cancellableContinuationImpl.isActive()) {
            return null;
        }
        Result.Companion companion = Result.Companion;
        cancellableContinuationImpl.resumeWith(Result.constructor-impl(Unit.INSTANCE));
        return null;
    }
}

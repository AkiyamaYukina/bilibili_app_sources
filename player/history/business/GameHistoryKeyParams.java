package com.bilibili.player.history.business;

import com.bilibili.player.history.IMediaHistoryKeyParams;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/business/GameHistoryKeyParams.class */
public final class GameHistoryKeyParams implements IMediaHistoryKeyParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f79282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f79283b;

    public GameHistoryKeyParams(long j7, int i7) {
        this.f79282a = j7;
        this.f79283b = i7;
    }

    public final long getCid() {
        return this.f79282a;
    }

    public final int getPlayStartPosition() {
        return this.f79283b;
    }

    @Override // com.bilibili.player.history.IMediaHistoryKeyParams
    @NotNull
    public String getType() {
        return "media_history_type_game";
    }
}

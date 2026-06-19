package com.bilibili.player.history.business;

import com.bilibili.player.history.IMediaHistoryKeyParams;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/history/business/AdHistoryKeyParams.class */
public final class AdHistoryKeyParams implements IMediaHistoryKeyParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f79279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f79280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79281c;

    public AdHistoryKeyParams(@Nullable String str, @Nullable String str2, long j7) {
        this.f79279a = str;
        this.f79280b = str2;
        this.f79281c = j7;
    }

    @Nullable
    public final String getBizId() {
        return this.f79279a;
    }

    public final long getCid() {
        return this.f79281c;
    }

    @Override // com.bilibili.player.history.IMediaHistoryKeyParams
    @NotNull
    public String getType() {
        return "media_history_type_ad";
    }

    @Nullable
    public final String getUrl() {
        return this.f79280b;
    }
}

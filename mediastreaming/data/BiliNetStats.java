package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliNetStats.class */
@Keep
public class BiliNetStats {

    @Nullable
    private BiliBmtNetStats bmt;

    @Nullable
    private String protocol;

    @Nullable
    private BiliSrtNetStats srt;

    @Nullable
    private BiliTCPNetStats tcp;

    @Nullable
    private String uri;

    @Nullable
    public final BiliBmtNetStats getBmt() {
        return this.bmt;
    }

    @Nullable
    public final String getProtocol() {
        return this.protocol;
    }

    @Nullable
    public final BiliSrtNetStats getSrt() {
        return this.srt;
    }

    @Nullable
    public final BiliTCPNetStats getTcp() {
        return this.tcp;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public final void setBmt(@Nullable BiliBmtNetStats biliBmtNetStats) {
        this.bmt = biliBmtNetStats;
    }

    public final void setProtocol(@Nullable String str) {
        this.protocol = str;
    }

    public final void setSrt(@Nullable BiliSrtNetStats biliSrtNetStats) {
        this.srt = biliSrtNetStats;
    }

    public final void setTcp(@Nullable BiliTCPNetStats biliTCPNetStats) {
        this.tcp = biliTCPNetStats;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }
}

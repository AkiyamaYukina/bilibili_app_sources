package com.bilibili.mediastreaming.data;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliProtocol.class */
public class BiliProtocol {

    @NotNull
    private final String protocol;

    @NotNull
    private final String uri;

    public BiliProtocol(@NotNull String str, @NotNull String str2) {
        this.uri = str;
        this.protocol = str2;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }
}

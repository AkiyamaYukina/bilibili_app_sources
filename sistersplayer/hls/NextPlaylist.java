package com.bilibili.sistersplayer.hls;

import com.bilibili.sistersplayer.hls.model.HLSStreamInf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/hls/NextPlaylist.class */
public final class NextPlaylist {

    @NotNull
    private final BasicM3u8Parser parser;
    private final boolean pickSeq;
    private final boolean seek;

    @NotNull
    private final HLSStreamInf streamInf;

    public NextPlaylist(@NotNull BasicM3u8Parser basicM3u8Parser, @NotNull HLSStreamInf hLSStreamInf, boolean z6, boolean z7) {
        this.parser = basicM3u8Parser;
        this.streamInf = hLSStreamInf;
        this.seek = z6;
        this.pickSeq = z7;
    }

    @NotNull
    public final BasicM3u8Parser getParser() {
        return this.parser;
    }

    public final boolean getPickSeq() {
        return this.pickSeq;
    }

    public final boolean getSeek() {
        return this.seek;
    }

    @NotNull
    public final HLSStreamInf getStreamInf() {
        return this.streamInf;
    }
}

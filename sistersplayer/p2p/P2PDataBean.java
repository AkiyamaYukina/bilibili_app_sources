package com.bilibili.sistersplayer.p2p;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sistersplayer/p2p/P2PDataBean.class */
public final class P2PDataBean {
    private final long cdnDownloadInvalidSize;
    private final long cdnDownloadValidSize;
    private final long fetchErrorNum;

    @NotNull
    private final String fetcherEngine;
    private final int fragNum;

    @NotNull
    private final String httpProtocol;
    private final long lackSize;
    private final int largestQPF;

    @NotNull
    private final String natV4Type;

    @NotNull
    private final String natV6Type;
    private final long p2pDownloadErrorSize;
    private final long p2pDownloadInvalidSize;
    private final long p2pDownloadValidSize;
    private final long p2pUploadSize;
    private final int queryNum;
    private final long seedSize;
    private final int timeShift;
    private final long xchgSize;

    public P2PDataBean(long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i7, int i8, int i9, long j14, long j15, long j16, int i10, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.p2pDownloadValidSize = j7;
        this.p2pDownloadInvalidSize = j8;
        this.p2pDownloadErrorSize = j9;
        this.p2pUploadSize = j10;
        this.cdnDownloadValidSize = j11;
        this.cdnDownloadInvalidSize = j12;
        this.fetchErrorNum = j13;
        this.fragNum = i7;
        this.queryNum = i8;
        this.largestQPF = i9;
        this.seedSize = j14;
        this.xchgSize = j15;
        this.lackSize = j16;
        this.timeShift = i10;
        this.fetcherEngine = str;
        this.httpProtocol = str2;
        this.natV4Type = str3;
        this.natV6Type = str4;
    }

    public final long getCdnDownloadInvalidSize() {
        return this.cdnDownloadInvalidSize;
    }

    public final long getCdnDownloadValidSize() {
        return this.cdnDownloadValidSize;
    }

    public final long getFetchErrorNum() {
        return this.fetchErrorNum;
    }

    @NotNull
    public final String getFetcherEngine() {
        return this.fetcherEngine;
    }

    public final int getFragNum() {
        return this.fragNum;
    }

    @NotNull
    public final String getHttpProtocol() {
        return this.httpProtocol;
    }

    public final long getLackSize() {
        return this.lackSize;
    }

    public final int getLargestQPF() {
        return this.largestQPF;
    }

    @NotNull
    public final String getNatV4Type() {
        return this.natV4Type;
    }

    @NotNull
    public final String getNatV6Type() {
        return this.natV6Type;
    }

    public final long getP2pDownloadErrorSize() {
        return this.p2pDownloadErrorSize;
    }

    public final long getP2pDownloadInvalidSize() {
        return this.p2pDownloadInvalidSize;
    }

    public final long getP2pDownloadValidSize() {
        return this.p2pDownloadValidSize;
    }

    public final long getP2pUploadSize() {
        return this.p2pUploadSize;
    }

    public final int getQueryNum() {
        return this.queryNum;
    }

    public final long getSeedSize() {
        return this.seedSize;
    }

    public final int getTimeShift() {
        return this.timeShift;
    }

    public final long getXchgSize() {
        return this.xchgSize;
    }
}

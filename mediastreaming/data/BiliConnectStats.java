package com.bilibili.mediastreaming.data;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/data/BiliConnectStats.class */
@Keep
public class BiliConnectStats {
    private long audioPacketDropCount;
    private long audioPacketInCount;
    private long audioPacketOutCount;
    private float averageFps;
    private long bytesDropCount;
    private long bytesInCount;
    private long bytesOutCount;
    private float packetLossRate;
    private long sendQueueDurationMs;
    private double upBitrate;
    private long videoPacketDropCount;
    private long videoPacketInCount;
    private long videoPacketOutCount;

    @NotNull
    private String uri = "";

    @NotNull
    private String protocol = "";
    private boolean terribleNetwork = true;

    public final long getAudioPacketDropCount() {
        return this.audioPacketDropCount;
    }

    public final long getAudioPacketInCount() {
        return this.audioPacketInCount;
    }

    public final long getAudioPacketOutCount() {
        return this.audioPacketOutCount;
    }

    public final float getAverageFps() {
        return this.averageFps;
    }

    public final long getBytesDropCount() {
        return this.bytesDropCount;
    }

    public final long getBytesInCount() {
        return this.bytesInCount;
    }

    public final long getBytesOutCount() {
        return this.bytesOutCount;
    }

    public final float getPacketLossRate() {
        return this.packetLossRate;
    }

    @NotNull
    public final String getProtocol() {
        return this.protocol;
    }

    public final long getSendQueueDurationMs() {
        return this.sendQueueDurationMs;
    }

    public final boolean getTerribleNetwork() {
        return this.terribleNetwork;
    }

    public final double getUpBitrate() {
        return this.upBitrate;
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public final long getVideoPacketDropCount() {
        return this.videoPacketDropCount;
    }

    public final long getVideoPacketInCount() {
        return this.videoPacketInCount;
    }

    public final long getVideoPacketOutCount() {
        return this.videoPacketOutCount;
    }

    public final void setAudioPacketDropCount(long j7) {
        this.audioPacketDropCount = j7;
    }

    public final void setAudioPacketInCount(long j7) {
        this.audioPacketInCount = j7;
    }

    public final void setAudioPacketOutCount(long j7) {
        this.audioPacketOutCount = j7;
    }

    public final void setAverageFps(float f7) {
        this.averageFps = f7;
    }

    public final void setBytesDropCount(long j7) {
        this.bytesDropCount = j7;
    }

    public final void setBytesInCount(long j7) {
        this.bytesInCount = j7;
    }

    public final void setBytesOutCount(long j7) {
        this.bytesOutCount = j7;
    }

    public final void setPacketLossRate(float f7) {
        this.packetLossRate = f7;
    }

    public final void setProtocol(@NotNull String str) {
        this.protocol = str;
    }

    public final void setSendQueueDurationMs(long j7) {
        this.sendQueueDurationMs = j7;
    }

    public final void setTerribleNetwork(boolean z6) {
        this.terribleNetwork = z6;
    }

    public final void setUpBitrate(double d7) {
        this.upBitrate = d7;
    }

    public final void setUri(@NotNull String str) {
        this.uri = str;
    }

    public final void setVideoPacketDropCount(long j7) {
        this.videoPacketDropCount = j7;
    }

    public final void setVideoPacketInCount(long j7) {
        this.videoPacketInCount = j7;
    }

    public final void setVideoPacketOutCount(long j7) {
        this.videoPacketOutCount = j7;
    }
}

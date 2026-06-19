package com.bilibili.lib.videoupload.speeddetect;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/speeddetect/Line.class */
@Keep
public final class Line {

    @Nullable
    private String os;

    @SerializedName("probe_url")
    @Nullable
    private String probeUrl;

    @Nullable
    private String query;
    private long uploadSize;

    @SerializedName("upload_success")
    private int uploadSuccess;
    private long latency = -1;
    private long detectTime = Long.MAX_VALUE;

    public final long getDetectTime() {
        return this.detectTime;
    }

    public final long getLatency() {
        return this.latency;
    }

    @Nullable
    public final String getOs() {
        return this.os;
    }

    @Nullable
    public final String getProbeUrl() {
        return this.probeUrl;
    }

    @Nullable
    public final String getQuery() {
        return this.query;
    }

    public final long getUploadSize() {
        return this.uploadSize;
    }

    public final int getUploadSuccess() {
        return this.uploadSuccess;
    }

    public final void setDetectTime(long j7) {
        this.detectTime = j7;
    }

    public final void setLatency(long j7) {
        this.latency = j7;
    }

    public final void setOs(@Nullable String str) {
        this.os = str;
    }

    public final void setProbeUrl(@Nullable String str) {
        this.probeUrl = str;
    }

    public final void setQuery(@Nullable String str) {
        this.query = str;
    }

    public final void setUploadSize(long j7) {
        this.uploadSize = j7;
    }

    public final void setUploadSuccess(int i7) {
        this.uploadSuccess = i7;
    }
}

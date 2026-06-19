package com.bilibili.lib.videoupload.bean;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/bean/UploadDynamicConcurrencyConfig.class */
@Keep
public final class UploadDynamicConcurrencyConfig {

    @SerializedName("enable_dynamic_concurrency")
    private int enableDynamicConcurrency;

    @SerializedName("start_concurrency")
    private int startConcurrency = 3;

    @SerializedName("chunk_size")
    private int chunkSize = 2;

    @SerializedName("max_concurrency")
    private int maxConcurrency = 5;

    @SerializedName("min_concurrency")
    private int minConcurrency = 1;

    @SerializedName("upload_timeout")
    private int uploadTimeout = 200;

    @SerializedName("inc_threshold")
    private float incThreshold = 0.2f;

    @SerializedName("dec_threshold")
    private float decThreshold = 0.2f;

    public final int getChunkSize() {
        return this.chunkSize;
    }

    public final float getDecThreshold() {
        return this.decThreshold;
    }

    public final int getEnableDynamicConcurrency() {
        return this.enableDynamicConcurrency;
    }

    public final float getIncThreshold() {
        return this.incThreshold;
    }

    public final int getMaxConcurrency() {
        return this.maxConcurrency;
    }

    public final int getMinConcurrency() {
        return this.minConcurrency;
    }

    public final int getStartConcurrency() {
        return this.startConcurrency;
    }

    public final int getUploadTimeout() {
        return this.uploadTimeout;
    }

    public final void setChunkSize(int i7) {
        this.chunkSize = i7;
    }

    public final void setDecThreshold(float f7) {
        this.decThreshold = f7;
    }

    public final void setEnableDynamicConcurrency(int i7) {
        this.enableDynamicConcurrency = i7;
    }

    public final void setIncThreshold(float f7) {
        this.incThreshold = f7;
    }

    public final void setMaxConcurrency(int i7) {
        this.maxConcurrency = i7;
    }

    public final void setMinConcurrency(int i7) {
        this.minConcurrency = i7;
    }

    public final void setStartConcurrency(int i7) {
        this.startConcurrency = i7;
    }

    public final void setUploadTimeout(int i7) {
        this.uploadTimeout = i7;
    }
}

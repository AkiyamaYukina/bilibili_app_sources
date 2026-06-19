package com.bilibili.studio.media.check;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/media/check/LimitConfig.class */
@Keep
public final class LimitConfig {

    @SerializedName("max_duration")
    @JSONField(name = "max_duration")
    private long maxDuration;

    @SerializedName("max_size")
    @JSONField(name = "max_size")
    private int maxSize;

    @SerializedName("min_duration")
    @JSONField(name = "min_duration")
    private long minDuration;

    public final long getMaxDuration() {
        return this.maxDuration;
    }

    public final int getMaxSize() {
        return this.maxSize;
    }

    public final long getMinDuration() {
        return this.minDuration;
    }

    public final void setMaxDuration(long j7) {
        this.maxDuration = j7;
    }

    public final void setMaxSize(int i7) {
        this.maxSize = i7;
    }

    public final void setMinDuration(long j7) {
        this.minDuration = j7;
    }
}

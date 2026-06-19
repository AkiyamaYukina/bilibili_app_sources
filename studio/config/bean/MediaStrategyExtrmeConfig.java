package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyExtrmeConfig.class */
@Keep
public class MediaStrategyExtrmeConfig {
    private long duration;
    private int maxNum;
    private int minNum;

    public long getDuration() {
        return this.duration;
    }

    public int getMaxNum() {
        return this.maxNum;
    }

    public int getMinNum() {
        return this.minNum;
    }

    public void setDuration(long j7) {
        this.duration = j7;
    }

    public void setMaxNum(int i7) {
        this.maxNum = i7;
    }

    public void setMinNum(int i7) {
        this.minNum = i7;
    }
}

package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyFestivalConfig.class */
@Keep
public class MediaStrategyFestivalConfig {

    @JSONField(name = "end_date")
    private long endTime;
    private String label;

    @JSONField(name = "start_date")
    private long startTime;

    public long getEndTime() {
        return this.endTime;
    }

    public String getLabel() {
        return this.label;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public void setEndTime(long j7) {
        this.endTime = j7;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setStartTime(long j7) {
        this.startTime = j7;
    }
}

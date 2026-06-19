package com.bilibili.biligame.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/PublishTime.class */
@StabilityInferred(parameters = 0)
@Keep
public final class PublishTime {
    public static final int $stable = 8;

    @JSONField(name = "publish_time")
    private int publishTime;

    @JSONField(name = "publish_time_name")
    @Nullable
    private String publishTimeName;

    public final int getPublishTime() {
        return this.publishTime;
    }

    @Nullable
    public final String getPublishTimeName() {
        return this.publishTimeName;
    }

    public final void setPublishTime(int i7) {
        this.publishTime = i7;
    }

    public final void setPublishTimeName(@Nullable String str) {
        this.publishTimeName = str;
    }
}

package com.bilibili.biligame.api.cloudgame.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGQueueState.class */
@Keep
public class BCGQueueState {
    public Long position;

    @JSONField(name = "queue_size")
    public Long queueSize;

    @JSONField(name = "wait_estimate_seconds")
    public Long waitSeconds;
}

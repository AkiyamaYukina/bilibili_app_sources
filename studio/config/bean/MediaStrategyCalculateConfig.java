package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyCalculateConfig.class */
@Keep
public class MediaStrategyCalculateConfig {

    @JSONField(name = "max_valid_num")
    public int maxValidNum;

    @JSONField(name = "random_num")
    public int randomNum;
}

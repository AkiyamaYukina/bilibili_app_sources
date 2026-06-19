package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyFilterConfig.class */
@Keep
public class MediaStrategyFilterConfig {

    @JSONField(name = "distinct_num")
    public int distinctNum;

    @JSONField(name = "image_min_num")
    public int imageMinNum;

    @JSONField(name = "recall_num")
    public int recallNum;

    @JSONField(name = "video_min_duration")
    public long videoMinDuration;
}

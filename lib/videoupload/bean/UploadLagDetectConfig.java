package com.bilibili.lib.videoupload.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/bean/UploadLagDetectConfig.class */
@Keep
public class UploadLagDetectConfig {

    @JSONField(name = "lag_check_time")
    public int lagCheckTime = 5;

    @JSONField(name = "lag_check_size")
    public long lagCheckSize = 300;
}

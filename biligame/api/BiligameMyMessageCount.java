package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameMyMessageCount.class */
@Keep
public class BiligameMyMessageCount {
    public static final int TYPE_COUNT = 1;
    public static final int TYPE_NONE = 0;
    public static final int TYPE_POINT = 2;

    @JSONField(name = "count")
    public int count;

    @JSONField(name = "red_point_count_info")
    public MyMessageCountInfo countInfo;

    @JSONField(name = "red_point_info")
    public MyMessageRedPointInfo redPointInfo;

    @JSONField(name = "type")
    public int type;
}

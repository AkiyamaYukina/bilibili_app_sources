package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/MyMessageRedPointInfo.class */
@Keep
public class MyMessageRedPointInfo {

    @JSONField(name = "is_bulletin_red_point")
    public boolean bulletinRedPoint;

    @JSONField(name = "message_sub_type")
    public int messageSubType;

    @JSONField(name = "message_type")
    public int messageType;

    @JSONField(name = "show_red_point")
    public boolean showRedPoint;
}

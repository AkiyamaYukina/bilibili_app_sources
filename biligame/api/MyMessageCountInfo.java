package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/MyMessageCountInfo.class */
@Keep
public class MyMessageCountInfo {

    @JSONField(name = "count")
    public int count;

    @JSONField(name = "message_type")
    public int messageType;
}

package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/NoticeInfo.class */
@Keep
public class NoticeInfo {

    @JSONField(name = "title")
    public String title;
    public int type;

    @JSONField(name = "url")
    public String url;
}

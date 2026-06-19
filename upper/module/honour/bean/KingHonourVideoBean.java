package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourVideoBean.class */
@Keep
public class KingHonourVideoBean implements Serializable {
    public String cover;
    public int duration;
    public String name;
    public String type;

    @JSONField(name = "video_url")
    public String videoUrl;
}

package com.bilibili.upper.module.manuscript.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/manuscript/bean/MusicReason.class */
@Keep
public class MusicReason {
    public long cid;

    @JSONField(name = "problem_description")
    public String description;

    @JSONField(name = "problem_description_title")
    public String descriptionTitle;
    public int index;

    @JSONField(name = "reject_reason")
    public String rejectReason;
    public String title;
}

package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiFontBean.class */
@Keep
public class MultiFontBean implements Serializable {
    public String cover;
    public int id;
    public String name;
    public int rank;

    @JSONField(name = "download_url")
    public String url;
}

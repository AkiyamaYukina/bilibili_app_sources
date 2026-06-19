package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiFlowerBean.class */
@Keep
public class MultiFlowerBean extends MultiEngineMaterialBean {

    @JSONField(name = "animation_cover")
    public String animationCover;
    public String cover;
    public int id;
    public String name;
    public int rank;
}

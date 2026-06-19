package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/BiliCategoryInfoBean.class */
@Keep
public class BiliCategoryInfoBean {

    @JSONField(name = "cat_cover")
    public String catCover;

    @JSONField(name = "cat_id")
    public long catId;

    @JSONField(name = "cat_name")
    public String catName;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliCategoryInfoBean{catCover='");
        sb.append(this.catCover);
        sb.append("', catId=");
        sb.append(this.catId);
        sb.append(", catName='");
        return C8770a.a(sb, this.catName, "'}");
    }
}

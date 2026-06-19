package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/BiliAuthorBean.class */
@Keep
public class BiliAuthorBean {
    public String face;
    public long mid;
    public String name;
    public String notice;

    @JSONField(name = "up_from")
    public int upFrom;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliAuthorBean{face='");
        sb.append(this.face);
        sb.append("', mid=");
        sb.append(this.mid);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', notice='");
        sb.append(this.notice);
        sb.append("', upFrom=");
        return C3269h.a(sb, this.upFrom, '}');
    }
}

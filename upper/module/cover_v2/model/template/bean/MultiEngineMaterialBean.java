package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiEngineMaterialBean.class */
@Keep
public class MultiEngineMaterialBean implements Serializable {

    @JSONField(name = "download_url")
    @Deprecated
    public String download_url;

    @JSONField(name = "download_url_aurora")
    @Deprecated
    public String download_url_aurora;

    public String getMaterialUrl() {
        String str = this.download_url_aurora;
        if (str == null) {
            str = "";
        }
        return str;
    }
}

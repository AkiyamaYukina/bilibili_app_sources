package com.bilibili.studio.centerplus.network.entity;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/network/entity/UploadInfo.class */
@Keep
public class UploadInfo implements Serializable {
    public long info;

    @JSONField(name = "passport_url")
    public String passportUrl;
    public String reason;
    public String url;
}

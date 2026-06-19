package com.bilibili.opd.app.bizcommon.hybridruntime.network.other;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/network/other/GetLoginUrlResponse.class */
@Keep
public class GetLoginUrlResponse {

    @JSONField(name = "url")
    private String url;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}

package com.bilibili.biligame.api.cloudgame.bean;

import Tm0.a;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/cloudgame/bean/BCGCredentials.class */
@Keep
public class BCGCredentials {

    @JSONField(name = a.f24206c)
    public String accessKey;

    @JSONField(name = "access_key_id")
    public String accessKeyId;

    @JSONField(name = "access_key_secret")
    public String accessKeySecret;

    @JSONField(name = "access_sec_key")
    public String accessSecKey;

    @JSONField(name = "access_key_sec_secret")
    public String accessSecKeySecret;

    @JSONField(name = "app_sec_secret")
    public String accessSecSecret;

    @JSONField(name = "app_id")
    public String appId;

    @JSONField(name = "app_key")
    public String appKey;

    @JSONField(name = "app_secret")
    public String appSecret;

    @JSONField(name = "biz_id")
    public String bizId;

    @JSONField(name = "userid")
    public String userId;
}

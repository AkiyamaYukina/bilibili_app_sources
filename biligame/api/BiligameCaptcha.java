package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameCaptcha.class */
@Keep
public class BiligameCaptcha {
    public static final int CAPTCHA_GEE = 1;
    public static final int CAPTCHA_IMAGE = 2;

    @JSONField(name = "captcha_type")
    public int captchaType;
    public String challenge;
    public int code;
    public String gs;
    public String gt;
    public String token;
    public String url;
    public String userid;
}

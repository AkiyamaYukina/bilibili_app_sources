package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligameSearchV2OpRes.class */
@Keep
public class BiligameSearchV2OpRes {
    public static final String TYPE_AT = "1";
    public static final String TYPE_GM = "0";

    @JSONField(name = "game_base_id")
    public int gameBaseId;

    @JSONField(name = "resource_title")
    public String resTitle = "";

    @JSONField(name = ThirdPartyExtraBuilder.SHARE_PARAMS_IMAGE_URL)
    public String resUrl = "";

    @JSONField(name = "active_url")
    public String goToUrl = "";

    @JSONField(name = "resource_type")
    public String type = "";
}

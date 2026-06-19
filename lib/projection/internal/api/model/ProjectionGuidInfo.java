package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionGuidInfo.class */
@Keep
public class ProjectionGuidInfo {

    @JSONField(name = "banner_ratio")
    public float bannerImageRatio;

    @JSONField(name = "banner")
    public String bannerImageUrl;

    @JSONField(name = "banner_url")
    public String bannerJumpUrl;

    @JSONField(name = "yst_login_tips")
    public String loginTips;

    @JSONField(name = "yst_tag")
    public String recommendLogo;

    @JSONField(name = "yst_sub_title")
    public String subTitle;
}

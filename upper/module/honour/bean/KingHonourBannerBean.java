package com.bilibili.upper.module.honour.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.upper.module.honour.bean.KingHonourAccountBean;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/honour/bean/KingHonourBannerBean.class */
@Keep
public class KingHonourBannerBean {

    @JSONField(name = "is_bind")
    public boolean isBind;

    @JSONField(name = "is_gen_report")
    public int isGenerate;

    @JSONField(name = "is_scence_grant")
    public boolean isGrant;

    @JSONField(name = "bind_info")
    public KingHonourAccountBean.MinProgramBean minProgramBean;

    @JSONField(name = "valor")
    public KingHonourGameBean valor;

    @JSONField(name = "video_url")
    public String videoUrl;
}

package com.bilibili.upper.module.tempalte.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.videoeditor.template.bean.BiliTemplateEntrance;
import com.bilibili.upper.module.honour.bean.KingHonourBannerBean;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/tempalte/bean/TemplateEntrance.class */
@Keep
public class TemplateEntrance {

    @JSONField(name = "entrances")
    public List<BiliTemplateEntrance> entrances;

    @JSONField(name = "ext_valor")
    public KingHonourBannerBean extValor;
}

package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateDetailResponseBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateDetailResponseBean {
    public static final int $stable = 8;

    @JSONField(name = "template_materials")
    @Nullable
    private Map<String, String> templateMaterials;

    @Nullable
    public final Map<String, String> getTemplateMaterials() {
        return this.templateMaterials;
    }

    public final void setTemplateMaterials(@Nullable Map<String, String> map) {
        this.templateMaterials = map;
    }
}

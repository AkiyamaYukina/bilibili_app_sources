package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateResponseBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateResponseBean implements Serializable {
    public static final int $stable = 8;

    @JSONField(name = "list")
    @Nullable
    private List<MultiCoverTemplateGroupBean> groups;

    @Nullable
    public final List<MultiCoverTemplateGroupBean> getGroups() {
        return this.groups;
    }

    public final void setGroups(@Nullable List<MultiCoverTemplateGroupBean> list) {
        this.groups = list;
    }
}

package com.bilibili.upper.module.cover_v2.model.template.bean;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/bean/MultiCoverTemplateGroupBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCoverTemplateGroupBean implements Serializable {
    public static final int $stable = 8;

    @Nullable
    private Integer id;

    @Nullable
    private String name;

    @Nullable
    private Integer rank;

    @JSONField(name = "children")
    @Nullable
    private List<MultiCoverTemplateBean> templates;

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getRank() {
        return this.rank;
    }

    @Nullable
    public final List<MultiCoverTemplateBean> getTemplates() {
        return this.templates;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRank(@Nullable Integer num) {
        this.rank = num;
    }

    public final void setTemplates(@Nullable List<MultiCoverTemplateBean> list) {
        this.templates = list;
    }
}

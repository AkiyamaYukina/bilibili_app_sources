package com.bilibili.studio.videoeditor.generalrender.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/generalrender/bean/GRPreprocessBean.class */
@Keep
public final class GRPreprocessBean {

    @JSONField(name = "templateId")
    private long templateId;

    @JSONField(name = "name")
    @Nullable
    private String name = "";

    @JSONField(name = "flowId")
    @Nullable
    private String flowId = "";

    @Nullable
    public final String getFlowId() {
        return this.flowId;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final void setFlowId(@Nullable String str) {
        this.flowId = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setTemplateId(long j7) {
        this.templateId = j7;
    }
}

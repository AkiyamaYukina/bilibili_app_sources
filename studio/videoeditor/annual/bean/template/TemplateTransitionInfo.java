package com.bilibili.studio.videoeditor.annual.bean.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.I0;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/template/TemplateTransitionInfo.class */
@Keep
public class TemplateTransitionInfo {
    public String name;

    @JSONField(name = "pre_part_id")
    public long prePageId;

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateTransitionInfo{pre_part_id=");
        sb.append(this.prePageId);
        sb.append(", name=");
        return I0.b(sb, this.name, '}');
    }
}

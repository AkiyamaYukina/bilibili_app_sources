package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.I0;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateListBean;
import com.bilibili.studio.editor.moudle.templatev2.bean.EditorTemplateTabItemBean;
import com.bilibili.studio.videoeditor.bgm.Bgm;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceTemplateInfo.class */
@Keep
public class IntelligenceTemplateInfo {

    @Nullable
    public EditorTemplateTabItemBean itemBean;
    public long originTemplateId;

    @Nullable
    public Bgm pbBgm;

    @Nullable
    public String picLabel;

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public String ratio;

    @Nullable
    @JSONField(deserialize = false, serialize = false)
    public EditorTemplateListBean responseByTag;
    public long templateId;

    @Nullable
    public String templateName;

    public IntelligenceTemplateInfo() {
    }

    public IntelligenceTemplateInfo(long j7, long j8, @Nullable String str, @Nullable String str2, @Nullable EditorTemplateTabItemBean editorTemplateTabItemBean) {
        this.templateId = j7;
        this.originTemplateId = j8;
        this.picLabel = str;
        this.templateName = str2;
        this.itemBean = editorTemplateTabItemBean;
    }

    public long getOriginTemplateId() {
        long j7 = this.originTemplateId;
        if (j7 <= 0) {
            j7 = this.templateId;
        }
        return j7;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IntelligenceTemplateInfo{templateId=");
        sb.append(this.templateId);
        sb.append("originTemplateId=");
        sb.append(this.originTemplateId);
        sb.append("templateName=");
        return I0.b(sb, this.templateName, '}');
    }
}

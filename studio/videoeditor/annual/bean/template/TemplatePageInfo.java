package com.bilibili.studio.videoeditor.annual.bean.template;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.ArrayList;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/template/TemplatePageInfo.class */
@Keep
public class TemplatePageInfo {
    public ArrayList<TemplateFxInfo> data;

    @JSONField(name = "part_id")
    public long pageId;

    public String toString() {
        return "TemplatePageInfo{part_id=" + this.pageId + ", data=" + this.data + '}';
    }
}

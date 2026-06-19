package com.bilibili.studio.videoeditor.annual.bean.template;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/template/TemplateFxInfo.class */
@Keep
public class TemplateFxInfo {
    public int attach;

    @JSONField(name = "backup_name")
    public String backupName;
    public boolean compound;
    public String content;
    public long duration;
    public String font;
    public String lic;
    public boolean mute = true;
    public String name;
    public long offset;
    public boolean pip;
    public int rank;
    public String ratio;

    @JSONField(name = "trim_in")
    public long trimIn;

    @JSONField(name = "trim_out")
    public long trimOut;
    public int type;

    @JSONField(name = "z_order")
    public float zOrder;

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateFxInfo{duration=");
        sb.append(this.duration);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", rank=");
        sb.append(this.rank);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", content='");
        sb.append(this.content);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', backupName='");
        sb.append(this.backupName);
        sb.append("', lic='");
        sb.append(this.lic);
        sb.append("', font='");
        sb.append(this.font);
        sb.append("', pip=");
        sb.append(this.pip);
        sb.append(", attach=");
        sb.append(this.attach);
        sb.append(", compound=");
        sb.append(this.compound);
        sb.append(", ratio='");
        sb.append(this.ratio);
        sb.append("', trimIn='");
        sb.append(this.trimIn);
        sb.append("', trimOut='");
        sb.append(this.trimOut);
        sb.append("', zOrder='");
        sb.append(this.zOrder);
        sb.append("', mute='");
        return i.a(sb, this.mute, "'}");
    }
}

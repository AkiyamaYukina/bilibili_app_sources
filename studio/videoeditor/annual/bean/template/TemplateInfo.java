package com.bilibili.studio.videoeditor.annual.bean.template;

import androidx.annotation.Keep;
import java.util.ArrayList;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/template/TemplateInfo.class */
@Keep
public class TemplateInfo {
    public String dir;
    public ArrayList<String> font;
    public String id;
    public TemplateMusicInfo music;
    public String name;
    public ArrayList<TemplatePageInfo> parts;
    public String resolution;
    public String storyboard;
    public ArrayList<TemplateTransitionInfo> transitions;

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateInfo{id='");
        sb.append(this.id);
        sb.append("', name='");
        sb.append(this.name);
        sb.append("', resolution='");
        sb.append(this.resolution);
        sb.append("', music=");
        sb.append(this.music);
        sb.append(", font=");
        sb.append(this.font);
        sb.append(", parts=");
        sb.append(this.parts);
        sb.append(", transitions=");
        sb.append(this.transitions);
        sb.append(", storyboard='");
        sb.append(this.storyboard);
        sb.append("', dir='");
        return C8770a.a(sb, this.dir, "'}");
    }
}

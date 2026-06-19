package com.bilibili.studio.videoeditor.template.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/template/bean/BiliTemplateEntrance.class */
@Keep
public class BiliTemplateEntrance {

    @JSONField(name = "android_redirect")
    public String androidRedirect;
    public String desc;

    @JSONField(name = "gradient_end")
    public String gradientEnd;

    @JSONField(name = "gradient_start")
    public String gradientStart;

    @JSONField(name = "ios_redirect")
    public String iOSRedirect;
    public String icon;
    public String name;
    public int type;

    public String toString() {
        StringBuilder sb = new StringBuilder("BiliTemplateEntrance{name='");
        sb.append(this.name);
        sb.append("', desc='");
        sb.append(this.desc);
        sb.append("', icon='");
        sb.append(this.icon);
        sb.append("', androidRedirect='");
        sb.append(this.androidRedirect);
        sb.append("', iOSRedirect='");
        sb.append(this.iOSRedirect);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", gradientStart='");
        sb.append(this.gradientStart);
        sb.append("', gradientEnd='");
        return C8770a.a(sb, this.gradientEnd, "'}");
    }
}

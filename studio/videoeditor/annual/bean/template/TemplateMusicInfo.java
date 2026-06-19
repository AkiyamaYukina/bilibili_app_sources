package com.bilibili.studio.videoeditor.annual.bean.template;

import androidx.annotation.Keep;
import g.C7207a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/template/TemplateMusicInfo.class */
@Keep
public class TemplateMusicInfo {
    public long end;
    public String name;
    public long start;

    public String toString() {
        StringBuilder sb = new StringBuilder("TemplateMusicInfo{name='");
        sb.append(this.name);
        sb.append("', start=");
        sb.append(this.start);
        sb.append(", end=");
        return C7207a.a(sb, this.end, '}');
    }
}

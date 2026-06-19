package com.bilibili.studio.editor.moudle.editormain.bean;

import Di0.C1600d;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/editormain/bean/AdapteTextConfig.class */
@Keep
public class AdapteTextConfig {

    /* JADX INFO: renamed from: base, reason: collision with root package name */
    public float f106128base;
    public float offset;
    public float step;

    public String toString() {
        StringBuilder sb = new StringBuilder("AdapteTextConfig{base=");
        sb.append(this.f106128base);
        sb.append(", offset=");
        sb.append(this.offset);
        sb.append(", step=");
        return C1600d.a(sb, this.step, '}');
    }
}

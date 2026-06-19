package com.bilibili.studio.editor.moudle.templatev2.bean;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;
import g.C7207a;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/templatev2/bean/EditorTemplateBindMusicInfo.class */
@Keep
public class EditorTemplateBindMusicInfo implements Serializable, Cloneable {

    @JSONField(name = "in_point")
    public long inPoint;

    @JSONField(name = "out_point")
    public long outPoint;
    public String sid;

    @JSONField(name = "trim_in")
    public long trimIn;

    @JSONField(name = "trim_out")
    public long trimOut;

    @NonNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public EditorTemplateBindMusicInfo m10145clone() {
        try {
            return (EditorTemplateBindMusicInfo) super.clone();
        } catch (CloneNotSupportedException e7) {
            throw new AssertionError();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BindMusic{sid='");
        sb.append(this.sid);
        sb.append("', inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        return C7207a.a(sb, this.trimOut, '}');
    }
}

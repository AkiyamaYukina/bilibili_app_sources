package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/CaptionFontEntity.class */
@Keep
public class CaptionFontEntity implements Cloneable {
    public String cover;
    public long ctime;
    public String download_url;
    public int id;

    @JSONField(name = "new")
    public int isNew;
    public long mtime;
    public String name;
    public int rank;

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public CaptionFontEntity m10402clone() {
        CaptionFontEntity captionFontEntity;
        try {
            captionFontEntity = (CaptionFontEntity) super.clone();
        } catch (CloneNotSupportedException e7) {
            e7.printStackTrace();
            captionFontEntity = null;
        }
        return captionFontEntity;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CaptionFontEntity{id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', download_url='");
        return C8770a.a(sb, this.download_url, "'}");
    }
}

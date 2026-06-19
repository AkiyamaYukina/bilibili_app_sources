package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.DrawableRes;
import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureMakeupEntity.class */
@Keep
public class CaptureMakeupEntity implements Serializable {
    public String cover;

    @DrawableRes
    public int coverId;
    public long ctime;
    public int downloadState;
    public String download_url;
    public int id;

    @JSONField(name = "new")
    public int isNew;
    public boolean isSelect;
    public String makeupPath;
    public long mtime;
    public String name;
    public int rank;

    public String toString() {
        StringBuilder sb = new StringBuilder("CaptureMakeupEntity{id=");
        sb.append(this.id);
        sb.append(", name='");
        sb.append(this.name);
        sb.append("', cover='");
        sb.append(this.cover);
        sb.append("', download_url='");
        sb.append(this.download_url);
        sb.append("', rank=");
        sb.append(this.rank);
        sb.append(", ctime=");
        sb.append(this.ctime);
        sb.append(", mtime=");
        sb.append(this.mtime);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", downloadState=");
        sb.append(this.downloadState);
        sb.append(", isSelect=");
        sb.append(this.isSelect);
        sb.append(", coverId=");
        sb.append(this.coverId);
        sb.append(", makeupPath='");
        return C8770a.a(sb, this.makeupPath, "'}");
    }
}

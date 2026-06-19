package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/VideoFxInfo.class */
@Keep
public class VideoFxInfo {
    public int attach;
    public long duration;
    public long inPoint;
    public String licPath;
    public String packageId;
    public String packagePath;
    public float zValue;

    public String toString() {
        StringBuilder sb = new StringBuilder("VideoFxInfo{inPoint=");
        sb.append(this.inPoint);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", packagePath='");
        sb.append(this.packagePath);
        sb.append("', licPath='");
        sb.append(this.licPath);
        sb.append("', zValue=");
        sb.append(this.zValue);
        sb.append(", packageId='");
        sb.append(this.packageId);
        sb.append("', attach=");
        return C3269h.a(sb, this.attach, '}');
    }
}

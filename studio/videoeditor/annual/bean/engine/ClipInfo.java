package com.bilibili.studio.videoeditor.annual.bean.engine;

import O4.a;
import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/ClipInfo.class */
@Keep
public class ClipInfo {
    public String backupFilePath;
    public String filePath;
    public long inPoint;
    public boolean isVideo;
    public long pageId;
    public int rank;
    public long trimIn;
    public long trimOut;
    public VideoFxInfo videoFx;
    public int needWidth = 16;
    public int needHeight = 9;
    public boolean needMute = true;

    public String toString() {
        StringBuilder sb = new StringBuilder("ClipInfo{trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", inPoint=");
        sb.append(this.inPoint);
        sb.append(", filePath='");
        sb.append(this.filePath);
        sb.append("', backupFilePath='");
        sb.append(this.backupFilePath);
        sb.append("', needWidth=");
        sb.append(this.needWidth);
        sb.append(", needHeight=");
        sb.append(this.needHeight);
        sb.append(", video=");
        sb.append(this.isVideo);
        sb.append(", pageId=");
        sb.append(this.pageId);
        sb.append(", rank=");
        sb.append(this.rank);
        sb.append(", videoFx=");
        sb.append(this.videoFx);
        sb.append(", needMute=");
        return a.b(sb, this.needMute, '}');
    }
}

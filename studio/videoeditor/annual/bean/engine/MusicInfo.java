package com.bilibili.studio.videoeditor.annual.bean.engine;

import Di0.C1600d;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/MusicInfo.class */
public class MusicInfo implements Serializable {
    public String filePath = null;
    public long duration = 0;
    public long inPoint = 0;
    public long outPoint = 0;
    public long trimIn = 0;
    public long trimOut = 0;
    public float volume = 1.0f;

    public String toString() {
        StringBuilder sb = new StringBuilder("MusicInfo{filePath='");
        sb.append(this.filePath);
        sb.append("', duration=");
        sb.append(this.duration);
        sb.append(", inPoint=");
        sb.append(this.inPoint);
        sb.append(", outPoint=");
        sb.append(this.outPoint);
        sb.append(", trimIn=");
        sb.append(this.trimIn);
        sb.append(", trimOut=");
        sb.append(this.trimOut);
        sb.append(", volume=");
        return C1600d.a(sb, this.volume, '}');
    }
}

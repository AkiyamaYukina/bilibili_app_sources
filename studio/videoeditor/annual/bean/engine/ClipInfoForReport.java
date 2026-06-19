package com.bilibili.studio.videoeditor.annual.bean.engine;

import androidx.annotation.Keep;
import g.C7207a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/engine/ClipInfoForReport.class */
@Keep
public class ClipInfoForReport {
    private String mFilePath = null;
    private long mId;
    private long mInPoint;

    public String getFilePath() {
        return this.mFilePath;
    }

    public long getId() {
        return this.mId;
    }

    public long getInPoint() {
        return this.mInPoint;
    }

    public void setFilePath(String str) {
        this.mFilePath = str;
    }

    public void setId(long j7) {
        this.mId = j7;
    }

    public void setInPoint(long j7) {
        this.mInPoint = j7;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ClipInfo{mId=");
        sb.append(this.mId);
        sb.append(", mFilePath='");
        sb.append(this.mFilePath);
        sb.append("', mInPoint=");
        return C7207a.a(sb, this.mInPoint, '}');
    }
}

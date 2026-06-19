package com.bilibili.studio.videoeditor.nvsstreaming;

import P50.e;
import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/nvsstreaming/EditClip.class */
@Keep
public class EditClip implements Serializable {
    private long mInPoint;
    private long mOutPoint;
    private long mTrimIn;
    private long mTrimOut;

    public EditClip() {
    }

    public EditClip(e eVar) {
        this.mTrimIn = eVar.getTrimIn();
        this.mTrimOut = eVar.getTrimOut();
        this.mInPoint = eVar.getInPoint();
        this.mOutPoint = eVar.getOutPoint();
    }

    public long getInPoint() {
        return this.mInPoint;
    }

    public long getOutPoint() {
        return this.mOutPoint;
    }

    public long getTrimIn() {
        return this.mTrimIn;
    }

    public long getTrimOut() {
        return this.mTrimOut;
    }

    public void setInPoint(long j7) {
        this.mInPoint = j7;
    }

    public void setOutPoint(long j7) {
        this.mOutPoint = j7;
    }

    public void setTrimIn(long j7) {
        this.mTrimIn = j7;
    }

    public void setTrimOut(long j7) {
        this.mTrimOut = j7;
    }
}

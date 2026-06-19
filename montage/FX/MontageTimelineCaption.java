package com.bilibili.montage.FX;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageTimelineCaption.class */
public class MontageTimelineCaption extends MontageCaption {
    private native long nativeChangeInPoint(long j7, long j8);

    private native long nativeChangeOutPoint(long j7, long j8);

    private native boolean nativeGetClipAffinityEnabled(long j7);

    private native long nativeGetInPoint(long j7);

    private native long nativeGetOutPoint(long j7);

    private native void nativeMovePosition(long j7, long j8);

    private native void nativeSetClipAffinityEnabled(long j7, boolean z6);

    public long changeInPoint(long j7) {
        return nativeChangeInPoint(this.mInternalObject, j7);
    }

    public long changeOutPoint(long j7) {
        return nativeChangeOutPoint(this.mInternalObject, j7);
    }

    public boolean getClipAffinityEnabled() {
        return nativeGetClipAffinityEnabled(this.mInternalObject);
    }

    public long getInPoint() {
        return nativeGetInPoint(this.mInternalObject);
    }

    public long getOutPoint() {
        return nativeGetOutPoint(this.mInternalObject);
    }

    public void movePosition(long j7) {
        nativeMovePosition(this.mInternalObject, j7);
    }

    public void setClipAffinityEnabled(boolean z6) {
        nativeSetClipAffinityEnabled(this.mInternalObject, z6);
    }
}

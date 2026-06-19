package com.bilibili.montage.FX;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageTimelineVideoFx.class */
public class MontageTimelineVideoFx extends MontageFx {
    public static final int TIMELINE_VIDEOFX_TYPE_BUILTIN = 0;
    public static final int TIMELINE_VIDEOFX_TYPE_CUSTOM = 2;
    public static final int TIMELINE_VIDEOFX_TYPE_PACKAGE = 1;

    private native long nativeChangeInPoint(long j7, long j8);

    private native long nativeChangeOutPoint(long j7, long j8);

    private native String nativeGetBuiltinTimelineVideoFxName(long j7);

    private native long nativeGetInPoint(long j7);

    private native long nativeGetOutPoint(long j7);

    private native int nativeGetTimelineVideoFxType(long j7);

    private native float nativeGetZValue(long j7);

    private native void nativeMovePosition(long j7, long j8);

    private native void nativeSetZValue(long j7, float f7);

    public long changeInPoint(long j7) {
        return nativeChangeInPoint(this.mInternalObject, j7);
    }

    public long changeOutPoint(long j7) {
        return nativeChangeOutPoint(this.mInternalObject, j7);
    }

    public String getBuiltinTimelineVideoFxName() {
        return nativeGetBuiltinTimelineVideoFxName(this.mInternalObject);
    }

    public long getInPoint() {
        return nativeGetInPoint(this.mInternalObject);
    }

    public long getOutPoint() {
        return nativeGetOutPoint(this.mInternalObject);
    }

    public String getTimelineVideoFxPackageId() {
        return getFxName();
    }

    public int getTimelineVideoFxType() {
        return nativeGetTimelineVideoFxType(this.mInternalObject);
    }

    public float getZValue() {
        return nativeGetZValue(this.mInternalObject);
    }

    public void movePosition(long j7) {
        nativeMovePosition(this.mInternalObject, j7);
    }

    public void setZValue(float f7) {
        nativeSetZValue(this.mInternalObject, f7);
    }
}

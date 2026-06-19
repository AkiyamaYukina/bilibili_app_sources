package com.bilibili.montage.FX;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageVideoTransition.class */
public class MontageVideoTransition extends MontageFx {
    public static final int VIDEO_TRANSITION_DURATION_MATCH_MODE_NONE = 0;
    public static final int VIDEO_TRANSITION_DURATION_MATCH_MODE_STRETCH = 1;
    public static final int VIDEO_TRANSITION_TYPE_BUILTIN = 0;
    public static final int VIDEO_TRANSITION_TYPE_CUSTOM = 2;
    public static final int VIDEO_TRANSITION_TYPE_PACKAGE = 1;

    private native String nativeGetBuiltinVideoTransitionName(long j7);

    private native long nativeGetVideoTransitionDuration(long j7);

    private native int nativeGetVideoTransitionType(long j7);

    private native void nativeSetVideoTransitionDuration(long j7, long j8, int i7);

    public String getBuiltinVideoTransitionName() {
        return nativeGetBuiltinVideoTransitionName(this.mInternalObject);
    }

    public long getVideoTransitionDuration() {
        return nativeGetVideoTransitionDuration(this.mInternalObject);
    }

    public int getVideoTransitionType() {
        return nativeGetVideoTransitionType(this.mInternalObject);
    }

    public void setVideoTransitionDuration(long j7, int i7) {
        nativeSetVideoTransitionDuration(this.mInternalObject, j7, i7);
    }
}

package com.bilibili.montage.timeline;

import com.bilibili.montage.avinfo.MontageVolume;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageTrack.class */
public class MontageTrack extends MontageObject {
    public static final int TRACK_TYPE_AUDIO = 1;
    public static final int TRACK_TYPE_VIDEO = 0;

    private native void nativeAddStatsExtraInfo(long j7, Map<String, String> map);

    private native long nativeChangeInPoint(long j7, int i7, long j8);

    private native long nativeChangeOutPoint(long j7, int i7, long j8, boolean z6);

    private native void nativeDisableAudio(long j7);

    private native boolean nativeDuplicateClip(long j7, int i7);

    private native void nativeEnableAudio(long j7);

    private native int nativeGetClipCount(long j7);

    private native long nativeGetDuration(long j7);

    private native long nativeGetId(long j7);

    private native int nativeGetIndex(long j7);

    private native int nativeGetType(long j7);

    private native MontageVolume nativeGetVolumeGain(long j7);

    private native boolean nativeIsEnableAudio(long j7);

    private native boolean nativeMoveClip(long j7, int i7, int i8);

    private native boolean nativeMoveSingleClip(long j7, int i7, long j8, boolean z6);

    private native boolean nativeRemoveAllClips(long j7);

    private native boolean nativeRemoveClip(long j7, int i7, boolean z6);

    private native boolean nativeRemoveClipInRange(long j7, long j8, long j9, boolean z6);

    private native boolean nativeReplaceClip(long j7, int i7, String str);

    private native void nativeSetVolumeGain(long j7, float f7, float f8);

    private native boolean nativeSplitClip(long j7, int i7, long j8);

    public void addStatsExtraInfo(Map<String, String> map) {
        nativeAddStatsExtraInfo(this.mInternalObject, map);
    }

    public long changeInPoint(int i7, long j7) {
        return nativeChangeInPoint(getBaseObject(), i7, j7);
    }

    public long changeOutPoint(int i7, long j7, boolean z6) {
        return nativeChangeOutPoint(getBaseObject(), i7, j7, z6);
    }

    public boolean duplicateClip(int i7) {
        return nativeDuplicateClip(getBaseObject(), i7);
    }

    public int getClipCount() {
        return nativeGetClipCount(getBaseObject());
    }

    public long getDuration() {
        return nativeGetDuration(getBaseObject());
    }

    public long getId() {
        return nativeGetId(getBaseObject());
    }

    public int getIndex() {
        return nativeGetIndex(getBaseObject());
    }

    public int getType() {
        return nativeGetType(getBaseObject());
    }

    public MontageVolume getVolumeGain() {
        return nativeGetVolumeGain(this.mInternalObject);
    }

    public boolean moveClip(int i7, int i8) {
        return nativeMoveClip(getBaseObject(), i7, i8);
    }

    public boolean moveSingleClip(int i7, long j7, boolean z6) {
        return nativeMoveSingleClip(getBaseObject(), i7, j7, z6);
    }

    public boolean removeAllClips() {
        return nativeRemoveAllClips(getBaseObject());
    }

    public boolean removeClip(int i7, boolean z6) {
        return nativeRemoveClip(getBaseObject(), i7, z6);
    }

    public boolean removeRange(long j7, long j8, boolean z6) {
        return nativeRemoveClipInRange(getBaseObject(), j7, j8, z6);
    }

    public boolean replaceClip(int i7, String str) {
        return nativeReplaceClip(getBaseObject(), i7, str);
    }

    public void setVolumeGain(float f7, float f8) {
        nativeSetVolumeGain(this.mInternalObject, f7, f8);
    }

    public boolean splitClip(int i7, long j7) {
        return nativeSplitClip(getBaseObject(), i7, j7);
    }
}

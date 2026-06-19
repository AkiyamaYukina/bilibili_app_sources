package com.bilibili.montage.timeline;

import com.bilibili.montage.avinfo.MontageVolume;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageClip.class */
public class MontageClip extends MontageObject {
    public static final int CLIP_TYPE_AUDIO = 1;
    public static final int CLIP_TYPE_VIDEO = 0;

    private native void nativeAddStatsExtraInfo(long j7, Map<String, String> map);

    private native boolean nativeChangeCurvesVariableSpeed(long j7, String str, boolean z6);

    private native boolean nativeChangeFilePath(long j7, String str);

    private native void nativeChangeSpeed(long j7, double d7, boolean z6);

    private native long nativeChangeTrimIn(long j7, long j8, boolean z6);

    private native long nativeChangeTrimOut(long j7, long j8, boolean z6);

    private native void nativeDeNoiseByLevel(long j7, int i7);

    private native long nativeGetClipPosByTimelinePosCurvesVariableSpeed(long j7, long j8);

    private native String nativeGetClipVariableSpeedCurvesString(long j7);

    private native int nativeGetDeNoiseLevel(long j7);

    private native String nativeGetFilePath(long j7);

    private native int nativeGetFxCount(long j7);

    private native long nativeGetId(long j7);

    private native long nativeGetInPoint(long j7);

    private native int nativeGetIndex(long j7);

    private native long nativeGetOutPoint(long j7);

    private native double nativeGetSpeed(long j7);

    private native long nativeGetTimelinePosByClipPosCurvesVariableSpeed(long j7, long j8);

    private native long nativeGetTrimIn(long j7);

    private native long nativeGetTrimOut(long j7);

    private native int nativeGetType(long j7);

    private native MontageVolume nativeGetVolumeGain(long j7);

    private native boolean nativeMoveTrimPoint(long j7, long j8);

    private native void nativeSetVolumeGain(long j7, float f7, float f8);

    public long GetClipPosByTimelinePosCurvesVariableSpeed(long j7) {
        return nativeGetClipPosByTimelinePosCurvesVariableSpeed(this.mInternalObject, j7);
    }

    public long GetTimelinePosByClipPosCurvesVariableSpeed(long j7) {
        return nativeGetTimelinePosByClipPosCurvesVariableSpeed(this.mInternalObject, j7);
    }

    public void addStatsExtraInfo(Map<String, String> map) {
        nativeAddStatsExtraInfo(this.mInternalObject, map);
    }

    public boolean changeCurvesVariableSpeed(String str, boolean z6) {
        return nativeChangeCurvesVariableSpeed(getBaseObject(), str, z6);
    }

    public boolean changeFilePath(String str) {
        return nativeChangeFilePath(getBaseObject(), str);
    }

    public void changeSpeed(double d7) {
        nativeChangeSpeed(getBaseObject(), d7, false);
    }

    public void changeSpeed(double d7, boolean z6) {
        nativeChangeSpeed(getBaseObject(), d7, z6);
    }

    public long changeTrimInPoint(long j7, boolean z6) {
        return nativeChangeTrimIn(getBaseObject(), j7, z6);
    }

    public long changeTrimOutPoint(long j7, boolean z6) {
        return nativeChangeTrimOut(getBaseObject(), j7, z6);
    }

    public void deNoiseByLevel(int i7) {
        nativeDeNoiseByLevel(this.mInternalObject, i7);
    }

    public String getClipVariableSpeedCurvesString() {
        return nativeGetClipVariableSpeedCurvesString(getBaseObject());
    }

    public int getDeNoiseLevel() {
        return nativeGetDeNoiseLevel(this.mInternalObject);
    }

    public String getFilePath() {
        return nativeGetFilePath(getBaseObject());
    }

    public int getFxCount() {
        return nativeGetFxCount(getBaseObject());
    }

    public long getInPoint() {
        return nativeGetInPoint(getBaseObject());
    }

    public int getIndex() {
        return nativeGetIndex(getBaseObject());
    }

    public long getOutPoint() {
        return nativeGetOutPoint(getBaseObject());
    }

    public double getSpeed() {
        return nativeGetSpeed(getBaseObject());
    }

    public long getTrimIn() {
        return nativeGetTrimIn(getBaseObject());
    }

    public long getTrimOut() {
        return nativeGetTrimOut(getBaseObject());
    }

    public int getType() {
        return nativeGetType(getBaseObject());
    }

    public MontageVolume getVolumeGain() {
        return nativeGetVolumeGain(getBaseObject());
    }

    public boolean moveTrimPoint(long j7) {
        return nativeMoveTrimPoint(getBaseObject(), j7);
    }

    public void setVolumeGain(float f7, float f8) {
        nativeSetVolumeGain(getBaseObject(), f7, f8);
    }
}

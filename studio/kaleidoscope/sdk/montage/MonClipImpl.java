package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.montage.timeline.MontageClip;
import com.bilibili.studio.kaleidoscope.sdk.Clip;
import com.bilibili.studio.kaleidoscope.sdk.ClipEx;
import com.bilibili.studio.kaleidoscope.sdk.Volume;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonClipImpl.class */
public class MonClipImpl implements Clip {
    private static final String TAG = "Mon.C.Impl";
    private MontageClip mMontageClip;

    public MonClipImpl(@NonNull MontageClip montageClip) {
        this.mMontageClip = montageClip;
    }

    @NonNull
    public static Clip box(@NonNull MontageClip montageClip) {
        return new MonClipImpl(montageClip);
    }

    @NonNull
    public static MontageClip unbox(@NonNull Clip clip) {
        return (MontageClip) clip.getClip();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long GetClipPosByTimelinePosCurvesVariableSpeed(long j7) {
        return this.mMontageClip.GetClipPosByTimelinePosCurvesVariableSpeed(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long GetTimelinePosByClipPosCurvesVariableSpeed(long j7) {
        return this.mMontageClip.GetTimelinePosByClipPosCurvesVariableSpeed(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public boolean changeCurvesVariableSpeed(String str, boolean z6, int i7) {
        return this.mMontageClip.changeCurvesVariableSpeed(str, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public boolean changeFilePath(String str) {
        return this.mMontageClip.changeFilePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void changeSpeed(double d7) {
        this.mMontageClip.changeSpeed(d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void changeSpeed(double d7, int i7) {
        this.mMontageClip.changeSpeed(d7, false);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void changeSpeed(double d7, boolean z6) {
        this.mMontageClip.changeSpeed(d7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void changeSpeed(double d7, boolean z6, int i7) {
        this.mMontageClip.changeSpeed(d7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long changeTrimInPoint(long j7, boolean z6) {
        return this.mMontageClip.changeTrimInPoint(j7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long changeTrimOutPoint(long j7, boolean z6) {
        return this.mMontageClip.changeTrimOutPoint(j7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public Object getClip() {
        return this.mMontageClip;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public String getClipVariableSpeedCurvesString() {
        return this.mMontageClip.getClipVariableSpeedCurvesString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bilibili.studio.kaleidoscope.sdk.ClipEx, java.lang.Object] */
    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public ClipEx getExtension() {
        return new Object();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public String getFilePath() {
        return this.mMontageClip.getFilePath();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public int getFxCount() {
        return this.mMontageClip.getFxCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getInPoint() {
        return this.mMontageClip.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getInPoint(boolean z6) {
        return this.mMontageClip.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public int getIndex() {
        return this.mMontageClip.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getObjHashCode() {
        return this.mMontageClip.identity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getOutPoint() {
        return this.mMontageClip.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public double getSpeed() {
        return this.mMontageClip.getSpeed();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getTrimIn() {
        return this.mMontageClip.getTrimIn();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getTrimIn(boolean z6) {
        return this.mMontageClip.getTrimIn();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getTrimOut() {
        return this.mMontageClip.getTrimOut();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public int getType() {
        return this.mMontageClip.getType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public Volume getVolumeGain() {
        MontageVolume volumeGain = this.mMontageClip.getVolumeGain();
        return volumeGain != null ? MonVolumeImpl.box(volumeGain) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void setClip(Object obj) {
        this.mMontageClip = (MontageClip) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    public void setVolumeGain(float f7, float f8) {
        this.mMontageClip.setVolumeGain(f7, f8);
    }
}

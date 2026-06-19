package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageVideoFx;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.montage.timeline.MontageVideoClip;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx;
import com.bilibili.studio.kaleidoscope.sdk.VideoClip;
import com.bilibili.studio.kaleidoscope.sdk.VideoFx;
import com.bilibili.studio.kaleidoscope.sdk.Volume;
import com.bilibili.studio.kaleidoscope.sdk.montage.MonCustomVideoFxImpl;
import java.util.ArrayList;
import java.util.Objects;
import q4.r;
import ze.c;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVideoClipImpl.class */
public final class MonVideoClipImpl extends MonClipImpl implements VideoClip {
    private static final String TAG = "Mon.VC.Impl";
    private MontageVideoClip mMonVideoClip;

    private MonVideoClipImpl(@NonNull MontageVideoClip montageVideoClip) {
        super(montageVideoClip);
        this.mMonVideoClip = montageVideoClip;
    }

    @NonNull
    public static VideoClip box(@NonNull MontageVideoClip montageVideoClip) {
        return new MonVideoClipImpl(montageVideoClip);
    }

    @NonNull
    public static MontageVideoClip unbox(@NonNull VideoClip videoClip) {
        return (MontageVideoClip) videoClip.getVideoClip();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendBuiltinFx(String str) {
        r.a("appendBuiltinFx:\targ0=", str, "", TAG);
        MontageVideoFx montageVideoFxAppendBuiltinFx = this.mMonVideoClip.appendBuiltinFx(str);
        return montageVideoFxAppendBuiltinFx != null ? MonVideoFxImpl.box(montageVideoFxAppendBuiltinFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendCustomFx(CustomVideoFx.Renderer renderer) {
        String innerName = renderer.getInnerName();
        MontageVideoFx montageVideoFxAppendBuiltinFx = innerName != null ? this.mMonVideoClip.appendBuiltinFx(innerName) : this.mMonVideoClip.appendCustomFx(new MonCustomVideoFxImpl.a(renderer));
        return montageVideoFxAppendBuiltinFx != null ? MonVideoFxImpl.box(montageVideoFxAppendBuiltinFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendCvBuiltinFx(String str, int i7) {
        c.a(i7, "appendCvBuiltinFx:\targ0= ", str, ", arg1= ", TAG);
        MontageVideoFx montageVideoFxAppendCvBuiltinFx = this.mMonVideoClip.appendCvBuiltinFx(str);
        montageVideoFxAppendCvBuiltinFx.setIntVal(MontageVideoFx.BUILTIN_VIDEO_FX_PARAM_CV_MATTING_MODE, i7);
        return MonVideoFxImpl.box(montageVideoFxAppendCvBuiltinFx);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendCvPackageBuiltinFx(String str) {
        MontageVideoFx montageVideoFxAppendCvPackagedFx = this.mMonVideoClip.appendCvPackagedFx(str);
        return montageVideoFxAppendCvPackagedFx != null ? MonVideoFxImpl.box(montageVideoFxAppendCvPackagedFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendPackagedFx(String str) {
        MontageVideoFx montageVideoFxAppendPackagedFx = this.mMonVideoClip.appendPackagedFx(str);
        return montageVideoFxAppendPackagedFx != null ? MonVideoFxImpl.box(montageVideoFxAppendPackagedFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendRawBuiltinFx(String str) {
        MontageVideoFx montageVideoFxAppendRawBuiltinFx = this.mMonVideoClip.appendRawBuiltinFx(str);
        return montageVideoFxAppendRawBuiltinFx != null ? MonVideoFxImpl.box(montageVideoFxAppendRawBuiltinFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx appendRawCustomFx(CustomVideoFx.Renderer renderer) {
        MontageVideoFx montageVideoFxAppendRawCustomFx = this.mMonVideoClip.appendRawCustomFx(new MonCustomVideoFxImpl.a(renderer));
        return montageVideoFxAppendRawCustomFx != null ? MonVideoFxImpl.box(montageVideoFxAppendRawCustomFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public boolean changeFilePath(String str) {
        return this.mMonVideoClip.changeFilePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public void changeSpeed(double d7) {
        this.mMonVideoClip.changeSpeed(d7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long changeTrimOutPoint(long j7, boolean z6) {
        return this.mMonVideoClip.changeTrimOutPoint(j7, z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void disableAmbiguousCrop(boolean z6) {
        this.mMonVideoClip.disableAmbiguousCrop(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void enablePropertyVideoFx(boolean z6) {
        this.mMonVideoClip.enablePropertyVideoFx(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public long getAudioFadeInDuration() {
        return this.mMonVideoClip.getAudioFadeInDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public long getAudioFadeOutDuration() {
        return this.mMonVideoClip.getAudioFadeOutDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getBlendingMode() {
        return this.mMonVideoClip.getBlendingMode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getClipWrapMode() {
        return this.mMonVideoClip.getClipWrapMode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public double getEndSpeed() {
        return this.mMonVideoClip.getEndSpeed();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getExtraVideoRotation() {
        return this.mMonVideoClip.getExtraVideoRotation();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public String getFilePath() {
        return this.mMonVideoClip.getFilePath();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx getFxByIndex(int i7) {
        MontageVideoFx fxByIndex = this.mMonVideoClip.getFxByIndex(i7);
        return fxByIndex != null ? MonVideoFxImpl.box(fxByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public int getFxCount() {
        return this.mMonVideoClip.getFxCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean getImageMotionAnimationEnabled() {
        return this.mMonVideoClip.getImageMotionAnimationEnabled();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getImageMotionMode() {
        return this.mMonVideoClip.getImageMotionMode();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getInPoint() {
        return this.mMonVideoClip.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getOutPoint() {
        return this.mMonVideoClip.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx getPropertyVideoFx() {
        MontageVideoFx propertyVideoFx = this.mMonVideoClip.getPropertyVideoFx();
        return propertyVideoFx != null ? MonVideoFxImpl.box(propertyVideoFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx getRawFxByIndex(int i7) {
        MontageVideoFx rawFxByIndex = this.mMonVideoClip.getRawFxByIndex(i7);
        return rawFxByIndex != null ? MonVideoFxImpl.box(rawFxByIndex) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getRawFxCount() {
        return this.mMonVideoClip.getRawFxCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public Color getSourceBackgroundColor() {
        MontageColor sourceBackgroundColor = this.mMonVideoClip.getSourceBackgroundColor();
        return sourceBackgroundColor != null ? MonColorImpl.box(sourceBackgroundColor) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public double getSpeed() {
        return this.mMonVideoClip.getSpeed();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public double getStartSpeed() {
        return this.mMonVideoClip.getStartSpeed();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getTrimIn() {
        return this.mMonVideoClip.getTrimIn();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getTrimOut() {
        return this.mMonVideoClip.getTrimOut();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public Object getVideoClip() {
        return this.mMonVideoClip;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public int getVideoType() {
        return this.mMonVideoClip.getVideoType();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public Volume getVolumeGain() {
        MontageVolume volumeGain = this.mMonVideoClip.getVolumeGain();
        return volumeGain != null ? MonVolumeImpl.box(volumeGain) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx insertBuiltinFx(String str, int i7) {
        MontageVideoFx montageVideoFxInsertBuiltinFx = this.mMonVideoClip.insertBuiltinFx(str, i7);
        return montageVideoFxInsertBuiltinFx != null ? MonVideoFxImpl.box(montageVideoFxInsertBuiltinFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx insertCustomFx(CustomVideoFx.Renderer renderer, int i7) {
        MontageVideoFx montageVideoFxInsertCustomFx = this.mMonVideoClip.insertCustomFx(new MonCustomVideoFxImpl.a(renderer), i7);
        return montageVideoFxInsertCustomFx != null ? MonVideoFxImpl.box(montageVideoFxInsertCustomFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx insertPackagedFx(String str, int i7) {
        MontageVideoFx montageVideoFxInsertPackagedFx = this.mMonVideoClip.insertPackagedFx(str, i7);
        return montageVideoFxInsertPackagedFx != null ? MonVideoFxImpl.box(montageVideoFxInsertPackagedFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx insertRawBuiltinFx(String str, int i7) {
        MontageVideoFx montageVideoFxInsertRawBuiltinFx = this.mMonVideoClip.insertRawBuiltinFx(str, i7);
        return montageVideoFxInsertRawBuiltinFx != null ? MonVideoFxImpl.box(montageVideoFxInsertRawBuiltinFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public VideoFx insertRawCustomFx(CustomVideoFx.Renderer renderer, int i7) {
        MontageVideoFx montageVideoFxInsertRawCustomFx = this.mMonVideoClip.insertRawCustomFx(new MonCustomVideoFxImpl.a(renderer), i7);
        return montageVideoFxInsertRawCustomFx != null ? MonVideoFxImpl.box(montageVideoFxInsertRawCustomFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean isPropertyVideoFxEnabled() {
        return this.mMonVideoClip.isPropertyVideoFxEnabled();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean moveTrimPoint(long j7) {
        return this.mMonVideoClip.moveTrimPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean removeCvFx(int i7) {
        return this.mMonVideoClip.removeCvFx(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean removeFx(int i7) {
        return this.mMonVideoClip.removeFx(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean removeRawFx(int i7) {
        return this.mMonVideoClip.removeRawFx(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setAudioFadeInDuration(long j7) {
        this.mMonVideoClip.setAudioFadeInDuration(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setAudioFadeOutDuration(long j7) {
        this.mMonVideoClip.setAudioFadeOutDuration(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setBlendingMode(int i7) {
        this.mMonVideoClip.setBlendingMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setClipWrapMode(int i7) {
        this.mMonVideoClip.setClipWrapMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setEnableOriginalRender(boolean z6) {
        this.mMonVideoClip.setEnableOriginalRender(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setExtraVideoRotation(int i7) {
        this.mMonVideoClip.setExtraVideoRotation(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setImageMotionAnimationEnabled(boolean z6) {
        this.mMonVideoClip.setImageMotionAnimationEnabled(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setImageMotionMode(int i7) {
        this.mMonVideoClip.setImageMotionMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setPanAndScan(float f7, float f8) {
        this.mMonVideoClip.setPanAndScan(f7, f8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setSoftWareDecoding(boolean z6) {
        this.mMonVideoClip.setSoftWareDecoding(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setSourceBackgroundColor(Color color) {
        Objects.toString(color);
        this.mMonVideoClip.setSourceBackgroundColor(color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setSourceBackgroundMode(int i7) {
        this.mMonVideoClip.setSourceBackgroundMode(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public void setVideoClip(Object obj) {
        this.mMonVideoClip = (MontageVideoClip) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public void setVolumeGain(float f7, float f8) {
        this.mMonVideoClip.setVolumeGain(f7, f8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.VideoClip
    public boolean supportBuildInFx(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(MontageVideoFx.BUILTIN_VIDEO_FX_NAME_CHROMA_MATTING);
        return arrayList.contains(str);
    }
}

package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageTimelineAnimatedSticker;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTimelineAnimatedStickerImpl.class */
public final class MonTimelineAnimatedStickerImpl extends MonFxImpl implements TimelineAnimatedSticker {
    private static final String TAG = "Mon.TAS.Impl";
    private MontageTimelineAnimatedSticker mMontageTimelineAnimatedSticker;

    private MonTimelineAnimatedStickerImpl(@NonNull MontageTimelineAnimatedSticker montageTimelineAnimatedSticker) {
        super(montageTimelineAnimatedSticker);
        this.mMontageTimelineAnimatedSticker = montageTimelineAnimatedSticker;
    }

    @NonNull
    public static TimelineAnimatedSticker box(@NonNull MontageTimelineAnimatedSticker montageTimelineAnimatedSticker) {
        return new MonTimelineAnimatedStickerImpl(montageTimelineAnimatedSticker);
    }

    @NonNull
    public static MontageTimelineAnimatedSticker unbox(@NonNull TimelineAnimatedSticker timelineAnimatedSticker) {
        return (MontageTimelineAnimatedSticker) timelineAnimatedSticker.getTimelineAnimatedSticker();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public long changeInPoint(long j7) {
        return this.mMontageTimelineAnimatedSticker.changeInPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public long changeOutPoint(long j7) {
        return this.mMontageTimelineAnimatedSticker.changeOutPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public String getAnimatedStickerPackageId() {
        return this.mMontageTimelineAnimatedSticker.getAnimatedStickerPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public List<PointF> getBoundingRectangleVertices() {
        return this.mMontageTimelineAnimatedSticker.getBoundingRectangleVertices();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public ControlPointPair getControlPoint(String str) {
        MontageControlPointPair controlPoint = this.mMontageTimelineAnimatedSticker.getControlPoint(str);
        return controlPoint != null ? MonControlPointPairImpl.box(controlPoint) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public long getInPoint() {
        return this.mMontageTimelineAnimatedSticker.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public float getOpacity() {
        return this.mMontageTimelineAnimatedSticker.getOpacity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public long getOutPoint() {
        return this.mMontageTimelineAnimatedSticker.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public float getRotationZ() {
        return this.mMontageTimelineAnimatedSticker.getRotationZ();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public float getScale() {
        return this.mMontageTimelineAnimatedSticker.getScale();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public Object getTimelineAnimatedSticker() {
        return this.mMontageTimelineAnimatedSticker;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public PointF getTranslation() {
        return this.mMontageTimelineAnimatedSticker.getTranslation();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public float getZValue() {
        return this.mMontageTimelineAnimatedSticker.getZValue();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void movePosition(long j7) {
        this.mMontageTimelineAnimatedSticker.movePosition(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeAllKeyframe(String str) {
        return this.mMontageTimelineAnimatedSticker.removeAllKeyframe(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return this.mMontageTimelineAnimatedSticker.removeKeyframeAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void rotateAnimatedSticker(float f7) {
        this.mMontageTimelineAnimatedSticker.rotateAnimatedSticker(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void rotateAnimatedSticker(float f7, PointF pointF) {
        this.mMontageTimelineAnimatedSticker.rotateAnimatedSticker(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void scaleAnimatedSticker(float f7, PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineAnimatedSticker.scaleAnimatedSticker(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setClipAffinityEnabled(boolean z6) {
        this.mMontageTimelineAnimatedSticker.setClipAffinityEnabled(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public boolean setControlPoint(String str, ControlPointPair controlPointPair) {
        Objects.toString(controlPointPair);
        return this.mMontageTimelineAnimatedSticker.setControlPoint(str, controlPointPair != null ? MonControlPointPairImpl.unbox(controlPointPair) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setCurrentKeyFrameTime(long j7) {
        this.mMontageTimelineAnimatedSticker.setCurrentKeyFrameTime(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setOpacity(float f7) {
        this.mMontageTimelineAnimatedSticker.setOpacity(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setRotationZ(float f7) {
        this.mMontageTimelineAnimatedSticker.setRotationZ(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setScale(float f7) {
        this.mMontageTimelineAnimatedSticker.setScale(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setTimelineAnimatedSticker(Object obj) {
        this.mMontageTimelineAnimatedSticker = (MontageTimelineAnimatedSticker) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setTranslation(PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineAnimatedSticker.setTranslation(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void setZValue(float f7) {
        this.mMontageTimelineAnimatedSticker.setZValue(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineAnimatedSticker
    public void translateAnimatedSticker(PointF pointF) {
        this.mMontageTimelineAnimatedSticker.translateAnimatedSticker(pointF);
    }
}

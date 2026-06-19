package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageTimelineCompoundCaption;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTimelineCompoundCaptionImpl.class */
public final class MonTimelineCompoundCaptionImpl extends MonFxImpl implements TimelineCompoundCaption {
    private static final String TAG = "Mon.TCC.Impl";
    private MontageTimelineCompoundCaption mMonTimelineCompoundCaption;

    private MonTimelineCompoundCaptionImpl(@NonNull MontageTimelineCompoundCaption montageTimelineCompoundCaption) {
        super(montageTimelineCompoundCaption);
        this.mMonTimelineCompoundCaption = montageTimelineCompoundCaption;
    }

    @NonNull
    public static TimelineCompoundCaption box(@NonNull MontageTimelineCompoundCaption montageTimelineCompoundCaption) {
        return new MonTimelineCompoundCaptionImpl(montageTimelineCompoundCaption);
    }

    @NonNull
    public static MontageTimelineCompoundCaption unbox(@NonNull TimelineCompoundCaption timelineCompoundCaption) {
        return (MontageTimelineCompoundCaption) timelineCompoundCaption.getTimelineCompoundCaption();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public long changeInPoint(long j7) {
        return this.mMonTimelineCompoundCaption.changeInPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public long changeOutPoint(long j7) {
        return this.mMonTimelineCompoundCaption.changeOutPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public PointF getAnchorPoint() {
        return this.mMonTimelineCompoundCaption.getAnchorPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public List getCaptionBoundingVertices(int i7, int i8) {
        return this.mMonTimelineCompoundCaption.getCaptionBoundingVertices(i7, i8);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public int getCaptionCount() {
        return this.mMonTimelineCompoundCaption.getCaptionCount();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public String getCaptionStylePackageId() {
        return this.mMonTimelineCompoundCaption.getCaptionStylePackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public PointF getCaptionTranslation() {
        return this.mMonTimelineCompoundCaption.getCaptionTranslation();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public List getCompoundBoundingVertices(int i7) {
        return this.mMonTimelineCompoundCaption.getCompoundBoundingVertices(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public ControlPointPair getControlPoint(String str) {
        MontageControlPointPair controlPoint = this.mMonTimelineCompoundCaption.getControlPoint(str);
        return controlPoint != null ? MonControlPointPairImpl.box(controlPoint) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public long getInPoint() {
        return this.mMonTimelineCompoundCaption.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public long getOutPoint() {
        return this.mMonTimelineCompoundCaption.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public float getRotationZ() {
        return this.mMonTimelineCompoundCaption.getRotationZ();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public float getScaleX() {
        return this.mMonTimelineCompoundCaption.getScaleX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public float getScaleY() {
        return this.mMonTimelineCompoundCaption.getScaleY();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public String getText(int i7) {
        return this.mMonTimelineCompoundCaption.getText(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public Color getTextColor(int i7) {
        MontageColor textColor = this.mMonTimelineCompoundCaption.getTextColor(i7);
        return textColor != null ? MonColorImpl.box(textColor) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public Object getTimelineCompoundCaption() {
        return this.mMonTimelineCompoundCaption;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public float getZValue() {
        return this.mMonTimelineCompoundCaption.getZValue();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void movePosition(long j7) {
        this.mMonTimelineCompoundCaption.movePosition(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeAllKeyframe(String str) {
        return this.mMonTimelineCompoundCaption.removeAllKeyframe(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return this.mMonTimelineCompoundCaption.removeKeyframeAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void rotateCaption(float f7, PointF pointF) {
        Objects.toString(pointF);
        this.mMonTimelineCompoundCaption.rotateCaption(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void rotateCaptionAroundCenter(float f7, int i7) {
        this.mMonTimelineCompoundCaption.rotateCaptionAroundCenter(f7, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void scaleCaption(float f7, PointF pointF) {
        Objects.toString(pointF);
        this.mMonTimelineCompoundCaption.scaleCaption(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setAnchorPoint(PointF pointF) {
        Objects.toString(pointF);
        this.mMonTimelineCompoundCaption.setAnchorPoint(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setCaptionTranslation(PointF pointF) {
        Objects.toString(pointF);
        this.mMonTimelineCompoundCaption.setCaptionTranslation(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setClipAffinityEnabled(boolean z6) {
        this.mMonTimelineCompoundCaption.setClipAffinityEnabled(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public boolean setControlPoint(String str, ControlPointPair controlPointPair) {
        Objects.toString(controlPointPair);
        return this.mMonTimelineCompoundCaption.setControlPoint(str, controlPointPair != null ? MonControlPointPairImpl.unbox(controlPointPair) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setCurrentKeyFrameTime(long j7) {
        this.mMonTimelineCompoundCaption.setCurrentKeyFrameTime(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setFontFamily(int i7, String str) {
        this.mMonTimelineCompoundCaption.setFontFamily(i7, str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setRotationZ(float f7) {
        this.mMonTimelineCompoundCaption.setRotationZ(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setScaleX(float f7) {
        this.mMonTimelineCompoundCaption.setScaleX(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setScaleY(float f7) {
        this.mMonTimelineCompoundCaption.setScaleY(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setText(int i7, String str) {
        this.mMonTimelineCompoundCaption.setText(i7, str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setTextColor(int i7, Color color) {
        Objects.toString(color);
        this.mMonTimelineCompoundCaption.setTextColor(i7, color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setTimelineCompoundCaption(Object obj) {
        this.mMonTimelineCompoundCaption = (MontageTimelineCompoundCaption) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void setZValue(float f7) {
        this.mMonTimelineCompoundCaption.setZValue(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCompoundCaption
    public void translateCaption(PointF pointF) {
        Objects.toString(pointF);
        this.mMonTimelineCompoundCaption.translateCaption(pointF);
    }
}

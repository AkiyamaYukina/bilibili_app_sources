package com.bilibili.studio.kaleidoscope.sdk.montage;

import android.graphics.PointF;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageTimelineCaption;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.TimelineCaption;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonTimelineCaptionImpl.class */
public final class MonTimelineCaptionImpl extends MonFxImpl implements TimelineCaption {
    private static final String TAG = "Mon.TC.Impl";
    private MontageTimelineCaption mMontageTimelineCaption;

    private MonTimelineCaptionImpl(@NonNull MontageTimelineCaption montageTimelineCaption) {
        super(montageTimelineCaption);
        this.mMontageTimelineCaption = montageTimelineCaption;
    }

    @NonNull
    public static TimelineCaption box(@NonNull MontageTimelineCaption montageTimelineCaption) {
        return new MonTimelineCaptionImpl(montageTimelineCaption);
    }

    @NonNull
    public static MontageTimelineCaption unbox(@NonNull TimelineCaption timelineCaption) {
        return (MontageTimelineCaption) timelineCaption.getTimelineCaption();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyCaptionStyle(String str) {
        return this.mMontageTimelineCaption.applyCaptionStyle(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyModularCaptionAnimation(String str) {
        return this.mMontageTimelineCaption.applyModularCaptionAnimation(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyModularCaptionContext(String str) {
        return this.mMontageTimelineCaption.applyModularCaptionContext(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyModularCaptionInAnimation(String str) {
        return this.mMontageTimelineCaption.applyModularCaptionInAnimation(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyModularCaptionOutAnimation(String str) {
        return this.mMontageTimelineCaption.applyModularCaptionOutAnimation(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean applyModularCaptionRenderer(String str) {
        return this.mMontageTimelineCaption.applyModularCaptionRenderer(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public long changeInPoint(long j7) {
        return this.mMontageTimelineCaption.changeInPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public long changeOutPoint(long j7) {
        return this.mMontageTimelineCaption.changeOutPoint(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public PointF getAnchorPoint() {
        return this.mMontageTimelineCaption.getAnchorPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getBold() {
        return this.mMontageTimelineCaption.getBold();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public List getBoundingRectangleVertices() {
        return this.mMontageTimelineCaption.getBoundingRectangleVertices();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public List getCaptionBoundingVertices(int i7) {
        return this.mMontageTimelineCaption.getCaptionBoundingVertices(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getCaptionStylePackageId() {
        return this.mMontageTimelineCaption.getCaptionStylePackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public PointF getCaptionTranslation() {
        return this.mMontageTimelineCaption.getCaptionTranslation();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public int getCategory() {
        return this.mMontageTimelineCaption.getCategory();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public ControlPointPair getControlPoint(String str) {
        MontageControlPointPair controlPoint = this.mMontageTimelineCaption.getControlPoint(str);
        return controlPoint != null ? MonControlPointPairImpl.box(controlPoint) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getDrawOutline() {
        return this.mMontageTimelineCaption.getDrawOutline();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getDrawShadow() {
        return this.mMontageTimelineCaption.getDrawShadow();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getFontFilePath() {
        return this.mMontageTimelineCaption.getFontFilePath();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getFontSize() {
        return this.mMontageTimelineCaption.getFontSize();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public long getInPoint() {
        return this.mMontageTimelineCaption.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getItalic() {
        return this.mMontageTimelineCaption.getItalic();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getLetterSpacing() {
        return this.mMontageTimelineCaption.getLetterSpacing();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getLineSpacing() {
        return this.mMontageTimelineCaption.getLineSpacing();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getModularCaptionAnimationPackageId() {
        return this.mMontageTimelineCaption.getModularCaptionAnimationPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getModularCaptionContextPackageId() {
        return this.mMontageTimelineCaption.getModularCaptionContextPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getModularCaptionInAnimationPackageId() {
        return this.mMontageTimelineCaption.getModularCaptionInAnimationPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getModularCaptionOutAnimationPackageId() {
        return this.mMontageTimelineCaption.getModularCaptionOutAnimationPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getModularCaptionRendererPackageId() {
        return this.mMontageTimelineCaption.getModularCaptionRendererPackageId();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getOpacity() {
        return this.mMontageTimelineCaption.getOpacity();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public long getOutPoint() {
        return this.mMontageTimelineCaption.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public Color getOutlineColor() {
        MontageColor outlineColor = this.mMontageTimelineCaption.getOutlineColor();
        return outlineColor != null ? MonColorImpl.box(outlineColor) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getOutlineWidth() {
        return this.mMontageTimelineCaption.getOutlineWidth();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public int getRoleInTheme() {
        return this.mMontageTimelineCaption.getRoleInTheme();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getRotationZ() {
        return this.mMontageTimelineCaption.getRotationZ();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getScaleX() {
        return this.mMontageTimelineCaption.getScaleX();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getScaleY() {
        return this.mMontageTimelineCaption.getScaleY();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public Color getShadowColor() {
        MontageColor shadowColor = this.mMontageTimelineCaption.getShadowColor();
        return shadowColor != null ? MonColorImpl.box(shadowColor) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getShadowFeather() {
        return this.mMontageTimelineCaption.getShadowFeather();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public PointF getShadowOffset() {
        return this.mMontageTimelineCaption.getShadowOffset();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public String getTemplateAttachment(String str) {
        return this.mMontageTimelineCaption.getTemplateAttachment(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public String getText() {
        return this.mMontageTimelineCaption.getText();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public int getTextAlignment() {
        return this.mMontageTimelineCaption.getTextAlignment();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public RectF getTextBoundingRect() {
        return this.mMontageTimelineCaption.getTextBoundingRect();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public Color getTextColor() {
        MontageColor textColor = this.mMontageTimelineCaption.getTextColor();
        return textColor != null ? MonColorImpl.box(textColor) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public int getTextVerticalAlignment() {
        return this.mMontageTimelineCaption.getTextVerticalAlignment();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public Object getTimelineCaption() {
        return this.mMontageTimelineCaption;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getUnderline() {
        return this.mMontageTimelineCaption.getUnderline();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean getVerticalLayout() {
        return this.mMontageTimelineCaption.getVerticalLayout();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public float getZValue() {
        return this.mMontageTimelineCaption.getZValue();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean isFrameCaption() {
        return this.mMontageTimelineCaption.isFrameCaption();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public void movePosition(long j7) {
        this.mMontageTimelineCaption.movePosition(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeAllKeyframe(String str) {
        return this.mMontageTimelineCaption.removeAllKeyframe(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonFxImpl, com.bilibili.studio.kaleidoscope.sdk.Fx
    public boolean removeKeyframeAtTime(String str, long j7) {
        return this.mMontageTimelineCaption.removeKeyframeAtTime(str, j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void rotateCaption(float f7) {
        this.mMontageTimelineCaption.rotateCaption(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void rotateCaption(float f7, PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.rotateCaption(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void scaleCaption(float f7, PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.scaleCaption(f7, pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setAnchorPoint(PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.setAnchorPoint(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setBackgroundColor(Color color) {
        Objects.toString(color);
        this.mMontageTimelineCaption.setBackgroundColor(color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setBold(boolean z6) {
        this.mMontageTimelineCaption.setBold(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setCaptionTranslation(PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.setCaptionTranslation(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.TimelineCaption
    public void setClipAffinityEnabled(boolean z6) {
        this.mMontageTimelineCaption.setClipAffinityEnabled(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public boolean setControlPoint(String str, ControlPointPair controlPointPair) {
        Objects.toString(controlPointPair);
        return this.mMontageTimelineCaption.setControlPoint(str, controlPointPair != null ? MonControlPointPairImpl.unbox(controlPointPair) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setCurrentKeyFrameTime(long j7) {
        this.mMontageTimelineCaption.setCurrentKeyFrameTime(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setDrawOutline(boolean z6) {
        this.mMontageTimelineCaption.setDrawOutline(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setDrawShadow(boolean z6) {
        this.mMontageTimelineCaption.setDrawShadow(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setFontByFilePath(String str) {
        this.mMontageTimelineCaption.setFontByFilePath(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setFontSize(float f7) {
        this.mMontageTimelineCaption.setFontSize(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setItalic(boolean z6) {
        this.mMontageTimelineCaption.setItalic(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setLetterSpacing(float f7) {
        this.mMontageTimelineCaption.setLetterSpacing(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setLineSpacing(float f7) {
        this.mMontageTimelineCaption.setLineSpacing(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setModularCaptionAnimationPeroid(int i7) {
        this.mMontageTimelineCaption.setModularCaptionAnimationPeroid(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setModularCaptionInAnimationDuration(int i7) {
        this.mMontageTimelineCaption.setModularCaptionInAnimationDuration(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setModularCaptionOutAnimationDuration(int i7) {
        this.mMontageTimelineCaption.setModularCaptionOutAnimationDuration(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setOpacity(float f7) {
        this.mMontageTimelineCaption.setOpacity(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setOutlineColor(Color color) {
        Objects.toString(color);
        this.mMontageTimelineCaption.setOutlineColor(color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setOutlineWidth(float f7) {
        this.mMontageTimelineCaption.setOutlineWidth(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setRecordingUserOperation(boolean z6) {
        this.mMontageTimelineCaption.setRecordingUserOperation(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setRotationZ(float f7) {
        this.mMontageTimelineCaption.setRotationZ(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setScaleX(float f7) {
        this.mMontageTimelineCaption.setScaleX(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setScaleY(float f7) {
        this.mMontageTimelineCaption.setScaleY(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setShadowColor(Color color) {
        Objects.toString(color);
        this.mMontageTimelineCaption.setShadowColor(color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setShadowFeather(float f7) {
        this.mMontageTimelineCaption.setShadowFeather(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setShadowOffset(PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.setShadowOffset(pointF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setText(String str) {
        this.mMontageTimelineCaption.setText(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setTextAlignment(int i7) {
        this.mMontageTimelineCaption.setTextAlignment(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setTextColor(Color color) {
        Objects.toString(color);
        this.mMontageTimelineCaption.setTextColor(color != null ? MonColorImpl.unbox(color) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setTextFrameOriginRect(RectF rectF) {
        Objects.toString(rectF);
        this.mMontageTimelineCaption.setTextFrameOriginRect(rectF);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setTextVerticalAlignment(int i7) {
        this.mMontageTimelineCaption.setTextVerticalAlignment(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setTimelineCaption(Object obj) {
        this.mMontageTimelineCaption = (MontageTimelineCaption) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setUnderline(boolean z6) {
        this.mMontageTimelineCaption.setUnderline(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setVerticalLayout(boolean z6) {
        this.mMontageTimelineCaption.setVerticalLayout(z6);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void setZValue(float f7) {
        this.mMontageTimelineCaption.setZValue(f7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Caption
    public void translateCaption(PointF pointF) {
        Objects.toString(pointF);
        this.mMontageTimelineCaption.translateCaption(pointF);
    }
}

package com.bilibili.studio.kaleidoscope.sdk;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/TimelineCompoundCaption.class */
public interface TimelineCompoundCaption extends Fx {
    long changeInPoint(long j7);

    long changeOutPoint(long j7);

    PointF getAnchorPoint();

    List<PointF> getCaptionBoundingVertices(int i7, int i8);

    int getCaptionCount();

    String getCaptionStylePackageId();

    PointF getCaptionTranslation();

    List<PointF> getCompoundBoundingVertices(int i7);

    @Nullable
    ControlPointPair getControlPoint(String str);

    long getInPoint();

    long getOutPoint();

    float getRotationZ();

    float getScaleX();

    float getScaleY();

    String getText(int i7);

    Color getTextColor(int i7);

    Object getTimelineCompoundCaption();

    float getZValue();

    void movePosition(long j7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeAllKeyframe(String str);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeKeyframeAtTime(String str, long j7);

    void rotateCaption(float f7, PointF pointF);

    void rotateCaptionAroundCenter(float f7, int i7);

    void scaleCaption(float f7, PointF pointF);

    void setAnchorPoint(PointF pointF);

    void setCaptionTranslation(PointF pointF);

    void setClipAffinityEnabled(boolean z6);

    boolean setControlPoint(String str, @NonNull ControlPointPair controlPointPair);

    void setCurrentKeyFrameTime(long j7);

    void setFontFamily(int i7, String str);

    void setRotationZ(float f7);

    void setScaleX(float f7);

    void setScaleY(float f7);

    void setText(int i7, String str);

    void setTextColor(int i7, @NonNull Color color);

    void setTimelineCompoundCaption(Object obj);

    void setZValue(float f7);

    void translateCaption(PointF pointF);
}

package com.bilibili.studio.kaleidoscope.sdk;

import android.graphics.PointF;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/TimelineAnimatedSticker.class */
public interface TimelineAnimatedSticker extends Fx {
    long changeInPoint(long j7);

    long changeOutPoint(long j7);

    String getAnimatedStickerPackageId();

    List<PointF> getBoundingRectangleVertices();

    @Nullable
    ControlPointPair getControlPoint(String str);

    long getInPoint();

    /* synthetic */ float getOpacity();

    long getOutPoint();

    float getRotationZ();

    float getScale();

    Object getTimelineAnimatedSticker();

    PointF getTranslation();

    float getZValue();

    void movePosition(long j7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeAllKeyframe(String str);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Fx
    boolean removeKeyframeAtTime(String str, long j7);

    void rotateAnimatedSticker(float f7);

    void rotateAnimatedSticker(float f7, PointF pointF);

    void scaleAnimatedSticker(float f7, PointF pointF);

    void setClipAffinityEnabled(boolean z6);

    boolean setControlPoint(String str, ControlPointPair controlPointPair);

    void setCurrentKeyFrameTime(long j7);

    /* synthetic */ void setOpacity(float f7);

    void setRotationZ(float f7);

    void setScale(float f7);

    void setTimelineAnimatedSticker(Object obj);

    void setTranslation(PointF pointF);

    void setZValue(float f7);

    void translateAnimatedSticker(PointF pointF);
}

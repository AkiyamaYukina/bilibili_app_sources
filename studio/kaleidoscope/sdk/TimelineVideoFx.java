package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/TimelineVideoFx.class */
public interface TimelineVideoFx extends Fx {
    long changeInPoint(long j7);

    long changeOutPoint(long j7);

    String getBuiltinTimelineVideoFxName();

    Object getExprObjectVar(String str);

    double getExprVar(String str);

    long getInPoint();

    long getOutPoint();

    Object getTimelineVideoFx();

    String getTimelineVideoFxPackageId();

    int getTimelineVideoFxType();

    float getZValue();

    void movePosition(long j7);

    void setExprObjectVar(String str, Object obj);

    void setExprVar(String str, double d7);

    void setTimelineVideoFx(Object obj);

    void setZValue(float f7);
}

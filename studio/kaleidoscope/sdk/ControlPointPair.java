package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/ControlPointPair.class */
public interface ControlPointPair {
    @Nullable
    PointD getBackwardControlPoint();

    Object getControlPointPair();

    @Nullable
    PointD getForwardControlPoint();

    void setBackwardControlPoint(PointD pointD);

    void setControlPointPair(Object obj);

    void setForwardControlPoint(PointD pointD);
}

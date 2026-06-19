package com.bilibili.studio.kaleidoscope.sdk.extension;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bilibili.studio.kaleidoscope.sdk.Color;
import com.bilibili.studio.kaleidoscope.sdk.ControlPointPair;
import com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo;
import com.bilibili.studio.kaleidoscope.sdk.PointD;
import com.bilibili.studio.kaleidoscope.sdk.Position2D;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/extension/FxEx.class */
public interface FxEx {
    @NonNull
    Color createColor(float f7, float f8, float f9, float f10);

    @NonNull
    ControlPointPair createControlPointPair(@Nullable PointD pointD, @Nullable PointD pointD2);

    @NonNull
    MaskRegionInfo createMaskRegionInfo();

    @NonNull
    MaskRegionInfo.Ellipse2D createMaskRegionInfoEllipse2D(Position2D position2D, float f7, float f8, float f9);

    @NonNull
    MaskRegionInfo.RegionInfo createMaskRegionInfoRegionInfo(int i7);

    @NonNull
    MaskRegionInfo.Transform2D createMaskRegionInfoTransform2D(float f7, Position2D position2D, Position2D position2D2, Position2D position2D3);

    @NonNull
    PointD createPointD(double d7, double d8);

    @NonNull
    Position2D createPosition2D(float f7, float f8);
}

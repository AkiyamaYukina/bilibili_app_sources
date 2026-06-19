package com.bilibili.studio.kaleidoscope.sdk;

import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MaskRegionInfo.class */
public interface MaskRegionInfo extends ArbitraryData {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MaskRegionInfo$Ellipse2D.class */
    public interface Ellipse2D {
        float getA();

        float getB();

        Position2D getCenter();

        Object getEllipse2D();

        float getTheta();

        void setEllipse2D(Object obj);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MaskRegionInfo$RegionInfo.class */
    public interface RegionInfo {
        Ellipse2D getEllipse2D();

        List<Position2D> getPoints();

        Object getRegionInfo();

        Transform2D getTransform2D();

        int getType();

        void setEllipse2D(Ellipse2D ellipse2D);

        void setPoints(List<Position2D> list);

        void setRegionInfo(Object obj);

        void setTransform2D(Transform2D transform2D);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/MaskRegionInfo$Transform2D.class */
    public interface Transform2D {
        Position2D getAnchor();

        float getRotation();

        Position2D getScale();

        Object getTransform2D();

        Position2D getTranslation();

        void setAnchor(Position2D position2D);

        void setRotation(float f7);

        void setScale(Position2D position2D);

        void setTransform2D(Object obj);

        void setTranslation(Position2D position2D);
    }

    void addRegionInfo(RegionInfo regionInfo);

    Object getMaskRegionInfo();

    List<RegionInfo> getRegionInfoArray();

    void setMaskRegionInfo(Object obj);
}

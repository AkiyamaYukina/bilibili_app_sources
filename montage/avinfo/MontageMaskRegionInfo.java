package com.bilibili.montage.avinfo;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageMaskRegionInfo.class */
public class MontageMaskRegionInfo extends MontageArbitraryData {
    public static final int MASK_REGION_TYPE_CUBIC_CURVE = 1;
    public static final int MASK_REGION_TYPE_ELLIPSE2D = 2;
    public static final int MASK_REGION_TYPE_MIRROR = 3;
    public static final int MASK_REGION_TYPE_POLYGON = 0;
    private List<RegionInfo> regionInfoArray = new ArrayList();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageMaskRegionInfo$Ellipse2D.class */
    public static class Ellipse2D {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f66333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f66334b;
        private MontagePosition2D center;
        private float theta;

        public Ellipse2D() {
            this.center = new MontagePosition2D(0.0f, 0.0f);
            this.theta = 0.0f;
            this.f66334b = 0.0f;
            this.f66333a = 0.0f;
        }

        public Ellipse2D(MontagePosition2D montagePosition2D, float f7, float f8, float f9) {
            this.center = montagePosition2D;
            this.f66333a = f7;
            this.f66334b = f8;
            this.theta = f9;
        }

        public float getA() {
            return this.f66333a;
        }

        public float getB() {
            return this.f66334b;
        }

        public MontagePosition2D getCenter() {
            return this.center;
        }

        public float getTheta() {
            return this.theta;
        }

        public void setA(float f7) {
            this.f66333a = f7;
        }

        public void setB(float f7) {
            this.f66334b = f7;
        }

        public void setCenter(MontagePosition2D montagePosition2D) {
            this.center = montagePosition2D;
        }

        public void setTheta(float f7) {
            this.theta = f7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageMaskRegionInfo$Mirror.class */
    public static class Mirror {
        private MontagePosition2D center;
        private float distance;
        private float theta;

        public Mirror() {
            this.center = new MontagePosition2D(0.0f, 0.0f);
            this.theta = 0.0f;
            this.distance = 0.0f;
        }

        public Mirror(MontagePosition2D montagePosition2D, float f7, float f8) {
            this.center = montagePosition2D;
            this.distance = f7;
            this.theta = f8;
        }

        public MontagePosition2D getCenter() {
            return this.center;
        }

        public float getDistance() {
            return this.distance;
        }

        public float getTheta() {
            return this.theta;
        }

        public void setCenter(MontagePosition2D montagePosition2D) {
            this.center = montagePosition2D;
        }

        public void setDistance(float f7) {
            this.distance = f7;
        }

        public void setTheta(float f7) {
            this.theta = f7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageMaskRegionInfo$RegionInfo.class */
    public static class RegionInfo {
        private int type;
        private List<MontagePosition2D> points = new ArrayList();
        private Ellipse2D ellipse2d = new Ellipse2D();
        private Mirror mirror = new Mirror();
        private Transform2D transform2d = new Transform2D();

        public RegionInfo(int i7) {
            this.type = i7;
        }

        public Ellipse2D getEllipse2D() {
            return this.ellipse2d;
        }

        public Mirror getMirror() {
            return this.mirror;
        }

        public List<MontagePosition2D> getPoints() {
            return this.points;
        }

        public Transform2D getTransform2D() {
            return this.transform2d;
        }

        public int getType() {
            return this.type;
        }

        public void setEllipse2D(Ellipse2D ellipse2D) {
            this.ellipse2d = ellipse2D;
        }

        public void setMirror(Mirror mirror) {
            this.mirror = mirror;
        }

        public void setPoints(List<MontagePosition2D> list) {
            this.points = list;
        }

        public void setTransform2D(Transform2D transform2D) {
            this.transform2d = transform2D;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageMaskRegionInfo$Transform2D.class */
    public static class Transform2D {
        private MontagePosition2D anchor;
        private float rotation;
        private MontagePosition2D scale;
        private MontagePosition2D translation;

        public Transform2D() {
            this.anchor = new MontagePosition2D(0.0f, 0.0f);
            this.scale = new MontagePosition2D(1.0f, 1.0f);
            this.rotation = 0.0f;
            this.translation = new MontagePosition2D(0.0f, 0.0f);
        }

        public Transform2D(MontagePosition2D montagePosition2D, MontagePosition2D montagePosition2D2, float f7, MontagePosition2D montagePosition2D3) {
            this.anchor = montagePosition2D;
            this.scale = montagePosition2D2;
            this.rotation = f7;
            this.translation = montagePosition2D3;
        }

        public MontagePosition2D getAnchor() {
            return this.anchor;
        }

        public float getRotation() {
            return this.rotation;
        }

        public MontagePosition2D getScale() {
            return this.scale;
        }

        public MontagePosition2D getTranslation() {
            return this.translation;
        }

        public void setAnchor(MontagePosition2D montagePosition2D) {
            this.anchor = montagePosition2D;
        }

        public void setRotation(float f7) {
            this.rotation = f7;
        }

        public void setScale(MontagePosition2D montagePosition2D) {
            this.scale = montagePosition2D;
        }

        public void setTranslation(MontagePosition2D montagePosition2D) {
            this.translation = montagePosition2D;
        }
    }

    public void addRegionInfo(RegionInfo regionInfo) {
        this.regionInfoArray.add(regionInfo);
    }

    public List<RegionInfo> getRegionInfoArray() {
        return this.regionInfoArray;
    }

    public void removeRegionInfoByIndex(int i7) {
        if (i7 < 0 || i7 >= this.regionInfoArray.size()) {
            return;
        }
        this.regionInfoArray.remove(i7);
    }
}

package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageMaskRegionInfo;
import com.bilibili.montage.avinfo.MontagePosition2D;
import com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo;
import com.bilibili.studio.kaleidoscope.sdk.Position2D;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMaskRegionInfoImpl.class */
public final class MonMaskRegionInfoImpl implements MaskRegionInfo {
    private MontageMaskRegionInfo mMontageMaskRegionInfo;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMaskRegionInfoImpl$MonEllipse2DImpl.class */
    public static final class MonEllipse2DImpl implements MaskRegionInfo.Ellipse2D {
        private MontageMaskRegionInfo.Ellipse2D mEllipse2D;

        private MonEllipse2DImpl(@NonNull MontageMaskRegionInfo.Ellipse2D ellipse2D) {
            this.mEllipse2D = ellipse2D;
        }

        public MonEllipse2DImpl(Position2D position2D, float f7, float f8, float f9) {
            this.mEllipse2D = new MontageMaskRegionInfo.Ellipse2D(MonPosition2DImpl.unbox(position2D), f7, f8, f9);
        }

        @NonNull
        public static MaskRegionInfo.Ellipse2D box(@NonNull MontageMaskRegionInfo.Ellipse2D ellipse2D) {
            return new MonEllipse2DImpl(ellipse2D);
        }

        @NonNull
        public static MontageMaskRegionInfo.Ellipse2D unbox(@NonNull MaskRegionInfo.Ellipse2D ellipse2D) {
            return (MontageMaskRegionInfo.Ellipse2D) ellipse2D.getEllipse2D();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public float getA() {
            return this.mEllipse2D.getA();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public float getB() {
            return this.mEllipse2D.getB();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public Position2D getCenter() {
            MontagePosition2D center = this.mEllipse2D.getCenter();
            return center != null ? MonPosition2DImpl.box(new MontagePosition2D(center.f66337x, center.f66338y)) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public Object getEllipse2D() {
            return this.mEllipse2D;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public float getTheta() {
            return this.mEllipse2D.getTheta();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Ellipse2D
        public void setEllipse2D(Object obj) {
            this.mEllipse2D = (MontageMaskRegionInfo.Ellipse2D) obj;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMaskRegionInfoImpl$MonRegionInfoImpl.class */
    public static final class MonRegionInfoImpl implements MaskRegionInfo.RegionInfo {
        private MontageMaskRegionInfo.RegionInfo mRegionInfo;

        public MonRegionInfoImpl(int i7) {
            this.mRegionInfo = new MontageMaskRegionInfo.RegionInfo(i7);
        }

        private MonRegionInfoImpl(@NonNull MontageMaskRegionInfo.RegionInfo regionInfo) {
            this.mRegionInfo = regionInfo;
        }

        @NonNull
        public static MaskRegionInfo.RegionInfo box(@NonNull MontageMaskRegionInfo.RegionInfo regionInfo) {
            return new MonRegionInfoImpl(regionInfo);
        }

        @NonNull
        public static MontageMaskRegionInfo.RegionInfo unbox(@NonNull MaskRegionInfo.RegionInfo regionInfo) {
            return (MontageMaskRegionInfo.RegionInfo) regionInfo.getRegionInfo();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public MaskRegionInfo.Ellipse2D getEllipse2D() {
            MontageMaskRegionInfo.Ellipse2D ellipse2D = this.mRegionInfo.getEllipse2D();
            return ellipse2D != null ? MonEllipse2DImpl.box(ellipse2D) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public List<Position2D> getPoints() {
            List<MontagePosition2D> points = this.mRegionInfo.getPoints();
            ArrayList arrayList = new ArrayList(points.size());
            Iterator<MontagePosition2D> it = points.iterator();
            while (it.hasNext()) {
                arrayList.add(MonPosition2DImpl.box(it.next()));
            }
            return arrayList;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public Object getRegionInfo() {
            return this.mRegionInfo;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public MaskRegionInfo.Transform2D getTransform2D() {
            MontageMaskRegionInfo.Transform2D transform2D = this.mRegionInfo.getTransform2D();
            return transform2D != null ? MonTransform2DImpl.box(transform2D) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public int getType() {
            return this.mRegionInfo.getType();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public void setEllipse2D(MaskRegionInfo.Ellipse2D ellipse2D) {
            this.mRegionInfo.setEllipse2D(ellipse2D != null ? MonEllipse2DImpl.unbox(ellipse2D) : null);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public void setPoints(List<Position2D> list) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<Position2D> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(MonPosition2DImpl.unbox(it.next()));
            }
            this.mRegionInfo.setPoints(arrayList);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public void setRegionInfo(Object obj) {
            this.mRegionInfo = (MontageMaskRegionInfo.RegionInfo) obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.RegionInfo
        public void setTransform2D(MaskRegionInfo.Transform2D transform2D) {
            this.mRegionInfo.setTransform2D(transform2D != null ? MonTransform2DImpl.unbox(transform2D) : null);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonMaskRegionInfoImpl$MonTransform2DImpl.class */
    public static final class MonTransform2DImpl implements MaskRegionInfo.Transform2D {
        private MontageMaskRegionInfo.Transform2D mTransform2D;

        public MonTransform2DImpl() {
            this.mTransform2D = new MontageMaskRegionInfo.Transform2D();
        }

        private MonTransform2DImpl(@NonNull MontageMaskRegionInfo.Transform2D transform2D) {
            this.mTransform2D = transform2D;
        }

        @NonNull
        public static MaskRegionInfo.Transform2D box(@NonNull MontageMaskRegionInfo.Transform2D transform2D) {
            return new MonTransform2DImpl(transform2D);
        }

        @NonNull
        public static MontageMaskRegionInfo.Transform2D unbox(@NonNull MaskRegionInfo.Transform2D transform2D) {
            return (MontageMaskRegionInfo.Transform2D) transform2D.getTransform2D();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public Position2D getAnchor() {
            MontagePosition2D anchor = this.mTransform2D.getAnchor();
            return anchor != null ? MonPosition2DImpl.box(new MontagePosition2D(anchor.f66337x, anchor.f66338y)) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public float getRotation() {
            return this.mTransform2D.getRotation();
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public Position2D getScale() {
            MontagePosition2D scale = this.mTransform2D.getScale();
            return scale != null ? MonPosition2DImpl.box(new MontagePosition2D(scale.f66337x, scale.f66338y)) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public Object getTransform2D() {
            return this.mTransform2D;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public Position2D getTranslation() {
            MontagePosition2D translation = this.mTransform2D.getTranslation();
            return translation != null ? MonPosition2DImpl.box(new MontagePosition2D(translation.f66337x, translation.f66338y)) : null;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public void setAnchor(Position2D position2D) {
            this.mTransform2D.setAnchor(position2D != null ? new MontagePosition2D(position2D.getX(), position2D.getY()) : null);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public void setRotation(float f7) {
            this.mTransform2D.setRotation(f7);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public void setScale(Position2D position2D) {
            this.mTransform2D.setScale(position2D != null ? new MontagePosition2D(position2D.getX(), position2D.getY()) : null);
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public void setTransform2D(Object obj) {
            this.mTransform2D = (MontageMaskRegionInfo.Transform2D) obj;
        }

        @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo.Transform2D
        public void setTranslation(Position2D position2D) {
            this.mTransform2D.setTranslation(position2D != null ? new MontagePosition2D(position2D.getX(), position2D.getY()) : null);
        }
    }

    public MonMaskRegionInfoImpl() {
        this.mMontageMaskRegionInfo = new MontageMaskRegionInfo();
    }

    private MonMaskRegionInfoImpl(@NonNull MontageMaskRegionInfo montageMaskRegionInfo) {
        this.mMontageMaskRegionInfo = montageMaskRegionInfo;
    }

    @NonNull
    public static MaskRegionInfo box(@NonNull MontageMaskRegionInfo montageMaskRegionInfo) {
        return new MonMaskRegionInfoImpl(montageMaskRegionInfo);
    }

    @NonNull
    public static MontageMaskRegionInfo unbox(@NonNull MaskRegionInfo maskRegionInfo) {
        return (MontageMaskRegionInfo) maskRegionInfo.getMaskRegionInfo();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo
    public void addRegionInfo(MaskRegionInfo.RegionInfo regionInfo) {
        this.mMontageMaskRegionInfo.addRegionInfo(regionInfo != null ? MonRegionInfoImpl.unbox(regionInfo) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ArbitraryData
    public Object getArbitraryData() {
        return this.mMontageMaskRegionInfo;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo
    public Object getMaskRegionInfo() {
        return this.mMontageMaskRegionInfo;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo
    public List<MaskRegionInfo.RegionInfo> getRegionInfoArray() {
        List<MontageMaskRegionInfo.RegionInfo> regionInfoArray = this.mMontageMaskRegionInfo.getRegionInfoArray();
        ArrayList arrayList = new ArrayList(regionInfoArray.size());
        Iterator<MontageMaskRegionInfo.RegionInfo> it = regionInfoArray.iterator();
        while (it.hasNext()) {
            arrayList.add(MonRegionInfoImpl.box(it.next()));
        }
        return arrayList;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.ArbitraryData
    public void setArbitraryData(Object obj) {
        this.mMontageMaskRegionInfo = (MontageMaskRegionInfo) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.MaskRegionInfo
    public void setMaskRegionInfo(Object obj) {
        this.mMontageMaskRegionInfo = (MontageMaskRegionInfo) obj;
    }
}

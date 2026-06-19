package com.bilibili.studio.videoeditor.bean;

import androidx.annotation.Keep;
import c6.Q;
import com.bapis.bilibili.account.interfaces.v1.k;
import com.bilibili.studio.videoeditor.Point;
import com.bilibili.studio.videoeditor.VideoClipMaskRegionInfo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo.class */
@Keep
public final class BClipReginInfo implements Serializable {
    private boolean inverseRegion;
    private boolean keepRGB;

    @Nullable
    private MaskRegionInfo maskReginInfo;
    private float regionalFeatherWidth;

    @Nullable
    private Map<String, Float> transform2DMap;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$MaskRegionInfo.class */
    @Keep
    public static final class MaskRegionInfo implements Serializable {

        @Nullable
        private List<SubRegionInfo> regionInfoArray;

        @NotNull
        public final MaskRegionInfo copy() {
            ArrayList arrayList;
            MaskRegionInfo maskRegionInfo = new MaskRegionInfo();
            List<SubRegionInfo> list = this.regionInfoArray;
            if (list != null) {
                List<SubRegionInfo> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList2.add(((SubRegionInfo) it.next()).copy());
                }
            } else {
                arrayList = null;
            }
            maskRegionInfo.regionInfoArray = arrayList;
            return maskRegionInfo;
        }

        @Nullable
        public final List<SubRegionInfo> getRegionInfoArray() {
            return this.regionInfoArray;
        }

        public final void setRegionInfoArray(@Nullable List<SubRegionInfo> list) {
            this.regionInfoArray = list;
        }

        @NotNull
        public String toString() {
            return k.a("MaskRegionInfo(regionInfoArray=", ")", this.regionInfoArray);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo.class */
    @Keep
    public static final class SubRegionInfo implements Serializable {
        public static final int BUSINESS_TYPE_CYCLE = 4;
        public static final int BUSINESS_TYPE_LINE = 1;
        public static final int BUSINESS_TYPE_MIRROR = 2;
        public static final int BUSINESS_TYPE_NONE = 0;
        public static final int BUSINESS_TYPE_RECTANGLE = 3;

        @NotNull
        public static final a Companion = new Object();
        private int businessType;

        @Nullable
        private Ellipse2D ellipse2d;

        @Nullable
        private List<PointF> regionPointArray;

        @Nullable
        private Transform2D transform2D;

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo$Ellipse2D.class */
        @Keep
        public static final class Ellipse2D {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private float f108911a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f108912b;

            @NotNull
            private PointF center = new PointF(0.0f, 0.0f);
            private float theta;

            @NotNull
            public final Ellipse2D copy() {
                Ellipse2D ellipse2D = new Ellipse2D();
                ellipse2D.center = this.center.copy();
                ellipse2D.f108911a = this.f108911a;
                ellipse2D.f108912b = this.f108912b;
                ellipse2D.theta = this.theta;
                return ellipse2D;
            }

            public final float getA() {
                return this.f108911a;
            }

            public final float getB() {
                return this.f108912b;
            }

            @NotNull
            public final PointF getCenter() {
                return this.center;
            }

            public final float getTheta() {
                return this.theta;
            }

            public final void setA(float f7) {
                this.f108911a = f7;
            }

            public final void setB(float f7) {
                this.f108912b = f7;
            }

            public final void setCenter(@NotNull PointF pointF) {
                this.center = pointF;
            }

            public final void setTheta(float f7) {
                this.theta = f7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo$PointF.class */
        @Keep
        public static final class PointF {

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            private float f108913x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            private float f108914y;

            public PointF() {
                this(0.0f, 0.0f);
            }

            public PointF(float f7, float f8) {
                this.f108913x = f7;
                this.f108914y = f8;
            }

            @NotNull
            public final PointF copy() {
                return new PointF(this.f108913x, this.f108914y);
            }

            public final float getX() {
                return this.f108913x;
            }

            public final float getY() {
                return this.f108914y;
            }

            public final void setX(float f7) {
                this.f108913x = f7;
            }

            public final void setY(float f7) {
                this.f108914y = f7;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo$Transform2D.class */
        @Keep
        public static final class Transform2D implements Serializable, Cloneable {
            private float rotation;

            @NotNull
            private PointF anchor = new PointF(0.0f, 0.0f);

            @NotNull
            private PointF scale = new PointF(1.0f, 1.0f);

            @NotNull
            private PointF translation = new PointF(0.0f, 0.0f);

            @NotNull
            public /* bridge */ Object clone() {
                return super.clone();
            }

            @NotNull
            public final Transform2D copy() {
                Transform2D transform2D = new Transform2D();
                transform2D.anchor = this.anchor.copy();
                transform2D.rotation = this.rotation;
                transform2D.scale = this.scale.copy();
                transform2D.translation = this.translation.copy();
                return transform2D;
            }

            @NotNull
            public final PointF getAnchor() {
                return this.anchor;
            }

            public final float getRotation() {
                return this.rotation;
            }

            @NotNull
            public final PointF getScale() {
                return this.scale;
            }

            @NotNull
            public final PointF getTranslation() {
                return this.translation;
            }

            public final void setAnchor(@NotNull PointF pointF) {
                this.anchor = pointF;
            }

            public final void setRotation(float f7) {
                this.rotation = f7;
            }

            public final void setScale(@NotNull PointF pointF) {
                this.scale = pointF;
            }

            public final void setTranslation(@NotNull PointF pointF) {
                this.translation = pointF;
            }
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo$a.class */
        public static final class a {
        }

        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/bean/BClipReginInfo$SubRegionInfo$b.class */
        public static final /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final int[] f108915a;

            static {
                int[] iArr = new int[VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType.values().length];
                try {
                    iArr[VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType.Line.ordinal()] = 1;
                } catch (NoSuchFieldError e7) {
                }
                try {
                    iArr[VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType.Mirror.ordinal()] = 2;
                } catch (NoSuchFieldError e8) {
                }
                try {
                    iArr[VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType.Rectangle.ordinal()] = 3;
                } catch (NoSuchFieldError e9) {
                }
                try {
                    iArr[VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType.Cycle.ordinal()] = 4;
                } catch (NoSuchFieldError e10) {
                }
                f108915a = iArr;
            }
        }

        public SubRegionInfo() {
        }

        public SubRegionInfo(@NotNull VideoClipMaskRegionInfo.MaskSubRegionInfo maskSubRegionInfo) {
            ArrayList arrayList;
            this();
            VideoClipMaskRegionInfo.MaskSubRegionInfo.MaskType maskType = maskSubRegionInfo.getMaskType();
            int i7 = maskType == null ? -1 : b.f108915a[maskType.ordinal()];
            int i8 = 1;
            if (i7 != 1) {
                i8 = 2;
                if (i7 != 2) {
                    i8 = 3;
                    if (i7 != 3) {
                        i8 = 4;
                        if (i7 != 4) {
                            i8 = 0;
                        }
                    }
                }
            }
            this.businessType = i8;
            List<Point> regionPointArrayList = maskSubRegionInfo.getRegionPointArrayList();
            if (regionPointArrayList != null) {
                List<Point> list = regionPointArrayList;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    Point point = (Point) it.next();
                    arrayList2.add(new PointF(point.getX(), point.getY()));
                }
            } else {
                arrayList = null;
            }
            this.regionPointArray = arrayList;
        }

        public static /* synthetic */ void getBusinessType$annotations() {
        }

        @NotNull
        public final SubRegionInfo copy() {
            ArrayList arrayList;
            SubRegionInfo subRegionInfo = new SubRegionInfo();
            subRegionInfo.businessType = this.businessType;
            List<PointF> list = this.regionPointArray;
            if (list != null) {
                List<PointF> list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (true) {
                    arrayList = arrayList2;
                    if (!it.hasNext()) {
                        break;
                    }
                    arrayList2.add(((PointF) it.next()).copy());
                }
            } else {
                arrayList = null;
            }
            subRegionInfo.regionPointArray = arrayList;
            Transform2D transform2D = this.transform2D;
            subRegionInfo.transform2D = transform2D != null ? transform2D.copy() : null;
            Ellipse2D ellipse2D = this.ellipse2d;
            Ellipse2D ellipse2DCopy = null;
            if (ellipse2D != null) {
                ellipse2DCopy = ellipse2D.copy();
            }
            subRegionInfo.ellipse2d = ellipse2DCopy;
            return subRegionInfo;
        }

        public final int getBusinessType() {
            return this.businessType;
        }

        @Nullable
        public final Ellipse2D getEllipse2d() {
            return this.ellipse2d;
        }

        @Nullable
        public final List<PointF> getRegionPointArray() {
            return this.regionPointArray;
        }

        @Nullable
        public final Transform2D getTransform2D() {
            return this.transform2D;
        }

        public final void setBusinessType(int i7) {
            this.businessType = i7;
        }

        public final void setEllipse2d(@Nullable Ellipse2D ellipse2D) {
            this.ellipse2d = ellipse2D;
        }

        public final void setRegionPointArray(@Nullable List<PointF> list) {
            this.regionPointArray = list;
        }

        public final void setTransform2D(@Nullable Transform2D transform2D) {
            this.transform2D = transform2D;
        }

        @NotNull
        public String toString() {
            return "SubRegionInfo(businessType=" + this.businessType + ", regionPointArray=" + this.regionPointArray;
        }
    }

    @NotNull
    public final BClipReginInfo copy() {
        BClipReginInfo bClipReginInfo = new BClipReginInfo();
        bClipReginInfo.keepRGB = this.keepRGB;
        bClipReginInfo.inverseRegion = this.inverseRegion;
        bClipReginInfo.regionalFeatherWidth = this.regionalFeatherWidth;
        Map<String, Float> map = this.transform2DMap;
        bClipReginInfo.transform2DMap = map != null ? MapsKt.toMutableMap(map) : null;
        MaskRegionInfo maskRegionInfo = this.maskReginInfo;
        MaskRegionInfo maskRegionInfoCopy = null;
        if (maskRegionInfo != null) {
            maskRegionInfoCopy = maskRegionInfo.copy();
        }
        bClipReginInfo.maskReginInfo = maskRegionInfoCopy;
        return bClipReginInfo;
    }

    public final boolean getInverseRegion() {
        return this.inverseRegion;
    }

    public final boolean getKeepRGB() {
        return this.keepRGB;
    }

    @Nullable
    public final MaskRegionInfo getMaskReginInfo() {
        return this.maskReginInfo;
    }

    public final float getRegionalFeatherWidth() {
        return this.regionalFeatherWidth;
    }

    @Nullable
    public final Map<String, Float> getTransform2DMap() {
        return this.transform2DMap;
    }

    public final void setInverseRegion(boolean z6) {
        this.inverseRegion = z6;
    }

    public final void setKeepRGB(boolean z6) {
        this.keepRGB = z6;
    }

    public final void setMaskReginInfo(@Nullable MaskRegionInfo maskRegionInfo) {
        this.maskReginInfo = maskRegionInfo;
    }

    public final void setRegionalFeatherWidth(float f7) {
        this.regionalFeatherWidth = f7;
    }

    public final void setTransform2DMap(@Nullable Map<String, Float> map) {
        this.transform2DMap = map;
    }

    @NotNull
    public String toString() {
        boolean z6 = this.keepRGB;
        boolean z7 = this.inverseRegion;
        float f7 = this.regionalFeatherWidth;
        Map<String, Float> map = this.transform2DMap;
        MaskRegionInfo maskRegionInfo = this.maskReginInfo;
        StringBuilder sbA = Q.a("BClipReginInfo(keepRGB=", ", inverseRegion=", ", regionalFeatherWidth=", z6, z7);
        sbA.append(f7);
        sbA.append(", transform2DMap=");
        sbA.append(map);
        sbA.append(", maskReginInfo=");
        sbA.append(maskRegionInfo);
        sbA.append(")");
        return sbA.toString();
    }
}

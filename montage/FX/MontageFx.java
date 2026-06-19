package com.bilibili.montage.FX;

import com.bilibili.montage.avinfo.MontageArbitraryData;
import com.bilibili.montage.avinfo.MontageColor;
import com.bilibili.montage.avinfo.MontageControlPointPair;
import com.bilibili.montage.avinfo.MontageMaskRegionInfo;
import com.bilibili.montage.avinfo.MontagePosition2D;
import com.bilibili.montage.timeline.MontageObject;
import com.bilibili.studio.editor.timeline.UpperTimeline;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageFx.class */
public class MontageFx extends MontageObject {
    public static final String BUILTIN_FX_NAME_TRANSFORM_2D = "Transform 2D";
    public static final String BUILTIN_FX_PARAM_DATA_FILE_PATH = "Data File Path";
    public static final String BUILTIN_FX_PARAM_IS_NORMALIZED_COORD = "Is Normalized Coord";
    public static final String BUILTIN_FX_PARAM_OPACITY = "Opacity";
    public static final String BUILTIN_FX_PARAM_ROTATION = "Rotation";
    public static final String BUILTIN_FX_PARAM_SCALE_X = "Scale X";
    public static final String BUILTIN_FX_PARAM_SCALE_Y = "Scale Y";
    public static final String BUILTIN_FX_PARAM_TRANS_X = "Trans X";
    public static final String BUILTIN_FX_PARAM_TRANS_Y = "Trans Y";
    public static final int FACE_WARP_EFFECT_STRATEGY_CUSTOM = Integer.MAX_VALUE;
    public static final int KEY_FRAME_FIND_MODE_INPUT_TIME_AFTER = 2;
    public static final int KEY_FRAME_FIND_MODE_INPUT_TIME_BEFORE = 1;
    private static final int MONTAGE_MASK_TYPE_CRCL = 4;
    private static final int MONTAGE_MASK_TYPE_LINE = 1;
    private static final int MONTAGE_MASK_TYPE_MIRROR = 2;
    private static final int MONTAGE_MASK_TYPE_NONE = 0;
    private static final int MONTAGE_MASK_TYPE_RECT = 3;
    public static final int REGION_COORDINATE_SYSTEM_TYPE_NDC = 0;
    public static final int REGION_COORDINATE_SYSTEM_TYPE_TIMELINE = 1;
    private static final String TAG = "MontageFx";

    private native void nativeAddStatsExtraInfo(long j7, Map<String, String> map);

    private native void nativeClearExprVar(long j7, String str);

    private native void nativeClearExprVarCtx(long j7);

    private native void nativeEnableEffect(long j7, boolean z6);

    private native MontageArbitraryData nativeGetArbDataVal(long j7, String str);

    private native MontageArbitraryData nativeGetArbDataValAtTime(long j7, String str, MontageArbitraryData montageArbitraryData, long j8);

    private native boolean nativeGetBooleanVal(long j7, String str);

    private native boolean nativeGetBooleanValAtTime(long j7, String str, long j8);

    private native String nativeGetClipFilePath(long j7);

    private native Object nativeGetExprObjectVar(long j7, String str);

    private native double nativeGetExprVar(long j7, String str);

    private native float nativeGetFilterIntensity(long j7);

    private native double nativeGetFloatVal(long j7, String str);

    private native double nativeGetFloatValAtTime(long j7, String str, long j8);

    private native String nativeGetFxName(long j7);

    private native int nativeGetIntVal(long j7, String str);

    private native int nativeGetIntValAtTime(long j7, String str, long j8);

    private native MontageControlPointPair nativeGetKeyFrameControlPoint(long j7, String str, long j8);

    private native String nativeGetMenuVal(long j7, String str);

    private native int nativeGetRegionCoordinateSystemType(long j7);

    private native String nativeGetStringVal(long j7, String str);

    private native String nativeGetStringValAtTime(long j7, String str, long j8, int i7);

    private native long nativeGetUInt64Val(long j7, String str);

    private native boolean nativeRemoveAllKeyframe(long j7, String str);

    private native boolean nativeRemoveKeyframeAtTime(long j7, String str, long j8);

    private native void nativeSetArbDataVal(long j7, String str, MontageArbitraryData montageArbitraryData);

    private native void nativeSetArbDataValAtTime(long j7, String str, MontageArbitraryData montageArbitraryData, long j8);

    private native void nativeSetBooleanVal(long j7, String str, boolean z6);

    private native void nativeSetBooleanValAtTime(long j7, String str, boolean z6, long j8);

    private native void nativeSetExprObjectVar(long j7, String str, Object obj);

    private native void nativeSetExprVar(long j7, String str, double d7);

    private native void nativeSetFilterIntensity(long j7, float f7);

    private native void nativeSetFloatVal(long j7, String str, double d7);

    private native void nativeSetFloatValAtTime(long j7, String str, double d7, long j8);

    private native void nativeSetIntVal(long j7, String str, int i7);

    private native void nativeSetIntValAtTime(long j7, String str, int i7, long j8);

    private native boolean nativeSetKeyFrameControlPoint(long j7, String str, long j8, MontageControlPointPair montageControlPointPair);

    private native void nativeSetMenuVal(long j7, String str, String str2);

    private native void nativeSetRegionCoordinateSystemType(long j7, int i7);

    private native void nativeSetStringVal(long j7, String str, String str2);

    private native void nativeSetStringValAtTime(long j7, String str, String str2, long j8);

    public void addStatsExtraInfo(Map<String, String> map) {
        nativeAddStatsExtraInfo(this.mInternalObject, map);
    }

    public void clearExprVar(String str) {
        nativeClearExprVar(this.mInternalObject, str);
    }

    public void clearExprVarCtx() {
        nativeClearExprVarCtx(this.mInternalObject);
    }

    public void enableEffect(boolean z6) {
        nativeEnableEffect(this.mInternalObject, z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.montage.avinfo.MontageArbitraryData] */
    public MontageArbitraryData getArbDataVal(String str) {
        if (!"Mask Generator".equals(nativeGetFxName(this.mInternalObject))) {
            return null;
        }
        Object montageArbitraryData = new MontageArbitraryData();
        if (str == UpperTimeline.KEY_REGION_INFO) {
            if (getRegionCoordinateSystemType() == 0) {
                setBooleanVal("Is Normalized Coord", true);
            }
            MontageMaskRegionInfo montageMaskRegionInfo = new MontageMaskRegionInfo();
            MontageMaskRegionInfo.Transform2D transform2D = new MontageMaskRegionInfo.Transform2D();
            transform2D.setTranslation(new MontagePosition2D((float) nativeGetFloatVal(this.mInternalObject, "Trans X"), (float) nativeGetFloatVal(this.mInternalObject, "Trans Y")));
            transform2D.setScale(new MontagePosition2D((float) nativeGetFloatVal(this.mInternalObject, "Scale X"), (float) nativeGetFloatVal(this.mInternalObject, "Scale Y")));
            transform2D.setRotation((float) nativeGetFloatVal(this.mInternalObject, "Rotation"));
            int iNativeGetIntVal = nativeGetIntVal(this.mInternalObject, "MaskType");
            if (iNativeGetIntVal == 0) {
                return null;
            }
            if (iNativeGetIntVal == 1) {
                MontageMaskRegionInfo.RegionInfo regionInfo = new MontageMaskRegionInfo.RegionInfo(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MontagePosition2D(-3.5f, 0.0f));
                arrayList.add(new MontagePosition2D(-3.5f, 7.0f));
                arrayList.add(new MontagePosition2D(3.5f, 7.0f));
                arrayList.add(new MontagePosition2D(3.5f, 0.0f));
                regionInfo.setPoints(arrayList);
                regionInfo.setTransform2D(transform2D);
                montageMaskRegionInfo.addRegionInfo(regionInfo);
                montageArbitraryData = montageMaskRegionInfo;
            } else if (iNativeGetIntVal == 3) {
                MontageMaskRegionInfo.RegionInfo regionInfo2 = new MontageMaskRegionInfo.RegionInfo(0);
                ArrayList arrayList2 = new ArrayList();
                float fNativeGetFloatVal = (float) nativeGetFloatVal(this.mInternalObject, "rect width");
                float fNativeGetFloatVal2 = (float) nativeGetFloatVal(this.mInternalObject, "rect height");
                float f7 = (-fNativeGetFloatVal) / 2.0f;
                float f8 = (-fNativeGetFloatVal2) / 2.0f;
                arrayList2.add(new MontagePosition2D(f7, f8));
                float f9 = fNativeGetFloatVal2 / 2.0f;
                arrayList2.add(new MontagePosition2D(f7, f9));
                float f10 = fNativeGetFloatVal / 2.0f;
                arrayList2.add(new MontagePosition2D(f10, f9));
                arrayList2.add(new MontagePosition2D(f10, f8));
                regionInfo2.setPoints(arrayList2);
                regionInfo2.setTransform2D(transform2D);
                montageMaskRegionInfo.addRegionInfo(regionInfo2);
                montageArbitraryData = montageMaskRegionInfo;
            } else {
                montageArbitraryData = montageMaskRegionInfo;
                if (iNativeGetIntVal == 4) {
                    MontageMaskRegionInfo.RegionInfo regionInfo3 = new MontageMaskRegionInfo.RegionInfo(2);
                    MontageMaskRegionInfo.Ellipse2D ellipse2D = new MontageMaskRegionInfo.Ellipse2D();
                    float fNativeGetFloatVal3 = (float) nativeGetFloatVal(this.mInternalObject, "circle diameterX");
                    float fNativeGetFloatVal4 = (float) nativeGetFloatVal(this.mInternalObject, "circle diameterY");
                    ellipse2D.setA(fNativeGetFloatVal3 / 2.0f);
                    ellipse2D.setB(fNativeGetFloatVal4 / 2.0f);
                    regionInfo3.setEllipse2D(ellipse2D);
                    regionInfo3.setTransform2D(transform2D);
                    montageMaskRegionInfo.addRegionInfo(regionInfo3);
                    montageArbitraryData = montageMaskRegionInfo;
                }
            }
        }
        return montageArbitraryData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.bilibili.montage.avinfo.MontageArbitraryData] */
    public MontageArbitraryData getArbDataValAtTime(String str, MontageArbitraryData montageArbitraryData, long j7) {
        if (!"Mask Generator".equals(nativeGetFxName(this.mInternalObject))) {
            return null;
        }
        Object montageArbitraryData2 = new MontageArbitraryData();
        if (str == UpperTimeline.KEY_REGION_INFO) {
            if (getRegionCoordinateSystemType() == 0) {
                setBooleanVal("Is Normalized Coord", true);
            }
            MontageMaskRegionInfo montageMaskRegionInfo = new MontageMaskRegionInfo();
            MontageMaskRegionInfo.Transform2D transform2D = new MontageMaskRegionInfo.Transform2D();
            transform2D.setTranslation(new MontagePosition2D((float) nativeGetFloatValAtTime(this.mInternalObject, "Trans X", j7), (float) nativeGetFloatValAtTime(this.mInternalObject, "Trans Y", j7)));
            transform2D.setScale(new MontagePosition2D((float) nativeGetFloatValAtTime(this.mInternalObject, "Scale X", j7), (float) nativeGetFloatValAtTime(this.mInternalObject, "Scale Y", j7)));
            transform2D.setRotation((float) nativeGetFloatValAtTime(this.mInternalObject, "Rotation", j7));
            int iNativeGetIntValAtTime = nativeGetIntValAtTime(this.mInternalObject, "MaskType", j7);
            if (iNativeGetIntValAtTime == 0) {
                return null;
            }
            if (iNativeGetIntValAtTime == 1) {
                MontageMaskRegionInfo.RegionInfo regionInfo = new MontageMaskRegionInfo.RegionInfo(0);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MontagePosition2D(-3.5f, 0.0f));
                arrayList.add(new MontagePosition2D(-3.5f, 7.0f));
                arrayList.add(new MontagePosition2D(3.5f, 7.0f));
                arrayList.add(new MontagePosition2D(3.5f, 0.0f));
                regionInfo.setPoints(arrayList);
                regionInfo.setTransform2D(transform2D);
                montageMaskRegionInfo.addRegionInfo(regionInfo);
                montageArbitraryData2 = montageMaskRegionInfo;
            } else if (iNativeGetIntValAtTime == 3) {
                MontageMaskRegionInfo.RegionInfo regionInfo2 = new MontageMaskRegionInfo.RegionInfo(0);
                ArrayList arrayList2 = new ArrayList();
                float fNativeGetFloatValAtTime = (float) nativeGetFloatValAtTime(this.mInternalObject, "rect width", j7);
                float fNativeGetFloatValAtTime2 = (float) nativeGetFloatValAtTime(this.mInternalObject, "rect height", j7);
                float f7 = (-fNativeGetFloatValAtTime) / 2.0f;
                float f8 = (-fNativeGetFloatValAtTime2) / 2.0f;
                arrayList2.add(new MontagePosition2D(f7, f8));
                float f9 = fNativeGetFloatValAtTime2 / 2.0f;
                arrayList2.add(new MontagePosition2D(f7, f9));
                float f10 = fNativeGetFloatValAtTime / 2.0f;
                arrayList2.add(new MontagePosition2D(f10, f9));
                arrayList2.add(new MontagePosition2D(f10, f8));
                regionInfo2.setPoints(arrayList2);
                regionInfo2.setTransform2D(transform2D);
                montageMaskRegionInfo.addRegionInfo(regionInfo2);
                montageArbitraryData2 = montageMaskRegionInfo;
            } else {
                montageArbitraryData2 = montageMaskRegionInfo;
                if (iNativeGetIntValAtTime == 4) {
                    MontageMaskRegionInfo.RegionInfo regionInfo3 = new MontageMaskRegionInfo.RegionInfo(2);
                    MontageMaskRegionInfo.Ellipse2D ellipse2D = new MontageMaskRegionInfo.Ellipse2D();
                    float fNativeGetFloatValAtTime3 = (float) nativeGetFloatValAtTime(this.mInternalObject, "circle diameterX", j7);
                    float fNativeGetFloatValAtTime4 = (float) nativeGetFloatValAtTime(this.mInternalObject, "circle diameterY", j7);
                    ellipse2D.setA(fNativeGetFloatValAtTime3 / 2.0f);
                    ellipse2D.setB(fNativeGetFloatValAtTime4 / 2.0f);
                    regionInfo3.setEllipse2D(ellipse2D);
                    regionInfo3.setTransform2D(transform2D);
                    montageMaskRegionInfo.addRegionInfo(regionInfo3);
                    montageArbitraryData2 = montageMaskRegionInfo;
                }
            }
        }
        return montageArbitraryData2;
    }

    public boolean getBooleanVal(String str) {
        return nativeGetBooleanVal(this.mInternalObject, str);
    }

    public boolean getBooleanValAtTime(String str, long j7) {
        return nativeGetBooleanValAtTime(this.mInternalObject, str, j7);
    }

    public String getClipFilePath() {
        return nativeGetClipFilePath(this.mInternalObject);
    }

    public MontageColor getColorVal(String str) {
        return new MontageColor(0.0f, 0.0f, 0.0f, 1.0f);
    }

    public Object getExprObjectVar(String str) {
        return nativeGetExprObjectVar(this.mInternalObject, str);
    }

    public double getExprVar(String str) {
        return nativeGetExprVar(this.mInternalObject, str);
    }

    public float getFilterIntensity() {
        return nativeGetFilterIntensity(this.mInternalObject);
    }

    public double getFloatVal(String str) {
        return nativeGetFloatVal(this.mInternalObject, str);
    }

    public double getFloatValAtTime(String str, long j7) {
        return nativeGetFloatValAtTime(this.mInternalObject, str, j7);
    }

    public String getFxName() {
        return nativeGetFxName(this.mInternalObject);
    }

    public boolean getIgnoreBackground() {
        return false;
    }

    public int getIntVal(String str) {
        return nativeGetIntVal(this.mInternalObject, str);
    }

    public int getIntValAtTime(String str, long j7) {
        return nativeGetIntValAtTime(this.mInternalObject, str, j7);
    }

    public MontageControlPointPair getKeyFrameControlPoint(String str, long j7) {
        return nativeGetKeyFrameControlPoint(this.mInternalObject, str, j7);
    }

    public String getMenuVal(String str) {
        return nativeGetMenuVal(this.mInternalObject, str);
    }

    public float[] getRegion() {
        return null;
    }

    public int getRegionCoordinateSystemType() {
        return nativeGetRegionCoordinateSystemType(this.mInternalObject);
    }

    public boolean getRegional() {
        return false;
    }

    public String getStringVal(String str) {
        return nativeGetStringVal(this.mInternalObject, str);
    }

    public String getStringValAtTime(String str, long j7, int i7) {
        return nativeGetStringValAtTime(this.mInternalObject, str, j7, i7);
    }

    public long getUInt64Val(String str) {
        return nativeGetUInt64Val(this.mInternalObject, str);
    }

    public boolean removeAllKeyframe(String str) {
        return nativeRemoveAllKeyframe(this.mInternalObject, str);
    }

    public boolean removeKeyframeAtTime(String str, long j7) {
        return nativeRemoveKeyframeAtTime(this.mInternalObject, str, j7);
    }

    public void setArbDataVal(String str, MontageArbitraryData montageArbitraryData) {
        if (montageArbitraryData != null && "Mask Generator".equals(nativeGetFxName(this.mInternalObject)) && str == UpperTimeline.KEY_REGION_INFO) {
            MontageMaskRegionInfo.RegionInfo regionInfo = ((MontageMaskRegionInfo) montageArbitraryData).getRegionInfoArray().get(0);
            int type = regionInfo.getType();
            if (type == 0) {
                List<MontagePosition2D> points = regionInfo.getPoints();
                if (points.size() == 4) {
                    double dAbs = Math.abs(points.get(0).f66337x - points.get(2).f66337x);
                    double dAbs2 = Math.abs(points.get(0).f66338y - points.get(2).f66338y);
                    if (dAbs2 <= 1.0E-6d || (Math.abs(points.get(0).f66338y) >= 1.0E-6d && Math.abs(points.get(2).f66338y) >= 1.0E-6d)) {
                        nativeSetIntVal(this.mInternalObject, "MaskType", 3);
                        nativeSetFloatVal(this.mInternalObject, "rect width", dAbs);
                        nativeSetFloatVal(this.mInternalObject, "rect height", dAbs2);
                    } else {
                        nativeSetIntVal(this.mInternalObject, "MaskType", 1);
                    }
                }
            } else if (type == 2) {
                nativeSetIntVal(this.mInternalObject, "MaskType", 4);
                MontageMaskRegionInfo.Ellipse2D ellipse2D = regionInfo.getEllipse2D();
                nativeSetFloatVal(this.mInternalObject, "circle diameterX", ((double) ellipse2D.getA()) * 2.0d);
                nativeSetFloatVal(this.mInternalObject, "circle diameterY", ((double) ellipse2D.getB()) * 2.0d);
            }
            if (getRegionCoordinateSystemType() == 0) {
                setBooleanVal("Is Normalized Coord", true);
            }
            MontageMaskRegionInfo.Transform2D transform2D = regionInfo.getTransform2D();
            nativeSetFloatVal(this.mInternalObject, "Trans X", transform2D.getTranslation().f66337x);
            nativeSetFloatVal(this.mInternalObject, "Trans Y", transform2D.getTranslation().f66338y);
            nativeSetFloatVal(this.mInternalObject, "Scale X", transform2D.getScale().f66337x);
            nativeSetFloatVal(this.mInternalObject, "Scale Y", transform2D.getScale().f66338y);
            nativeSetFloatVal(this.mInternalObject, "Rotation", transform2D.getRotation());
        }
    }

    public void setArbDataValAtTime(String str, MontageArbitraryData montageArbitraryData, long j7) {
        if (montageArbitraryData != null && "Mask Generator".equals(nativeGetFxName(this.mInternalObject)) && str == UpperTimeline.KEY_REGION_INFO) {
            MontageMaskRegionInfo.RegionInfo regionInfo = ((MontageMaskRegionInfo) montageArbitraryData).getRegionInfoArray().get(0);
            int type = regionInfo.getType();
            if (type == 0) {
                List<MontagePosition2D> points = regionInfo.getPoints();
                if (points.size() == 4) {
                    double dAbs = Math.abs(points.get(0).f66337x - points.get(2).f66337x);
                    double dAbs2 = Math.abs(points.get(0).f66338y - points.get(2).f66338y);
                    if (dAbs2 <= 1.0E-6d || (Math.abs(points.get(0).f66338y) >= 1.0E-6d && Math.abs(points.get(2).f66338y) >= 1.0E-6d)) {
                        nativeSetIntValAtTime(this.mInternalObject, "MaskType", 3, j7);
                        nativeSetFloatValAtTime(this.mInternalObject, "rect width", dAbs, j7);
                        nativeSetFloatValAtTime(this.mInternalObject, "rect height", dAbs2, j7);
                    } else {
                        nativeSetIntValAtTime(this.mInternalObject, "MaskType", 1, j7);
                    }
                }
            } else if (type == 2) {
                nativeSetIntValAtTime(this.mInternalObject, "MaskType", 4, j7);
                MontageMaskRegionInfo.Ellipse2D ellipse2D = regionInfo.getEllipse2D();
                nativeSetFloatValAtTime(this.mInternalObject, "circle diameterX", ((double) ellipse2D.getA()) * 2.0d, j7);
                nativeSetFloatValAtTime(this.mInternalObject, "circle diameterY", ((double) ellipse2D.getB()) * 2.0d, j7);
            }
            if (getRegionCoordinateSystemType() == 0) {
                setBooleanVal("Is Normalized Coord", true);
            }
            MontageMaskRegionInfo.Transform2D transform2D = regionInfo.getTransform2D();
            nativeSetFloatValAtTime(this.mInternalObject, "Trans X", transform2D.getTranslation().f66337x, j7);
            nativeSetFloatValAtTime(this.mInternalObject, "Trans Y", transform2D.getTranslation().f66338y, j7);
            nativeSetFloatValAtTime(this.mInternalObject, "Scale X", transform2D.getScale().f66337x, j7);
            nativeSetFloatValAtTime(this.mInternalObject, "Scale Y", transform2D.getScale().f66338y, j7);
            nativeSetFloatValAtTime(this.mInternalObject, "Rotation", transform2D.getRotation(), j7);
        }
    }

    public void setBooleanVal(String str, boolean z6) {
        nativeSetBooleanVal(this.mInternalObject, str, z6);
    }

    public void setBooleanValAtTime(String str, boolean z6, long j7) {
        nativeSetBooleanValAtTime(this.mInternalObject, str, z6, j7);
    }

    public void setExprObjectVar(String str, Object obj) {
        nativeSetExprObjectVar(this.mInternalObject, str, obj);
    }

    public void setExprVar(String str, double d7) {
        nativeSetExprVar(this.mInternalObject, str, d7);
    }

    public void setFilterIntensity(float f7) {
        nativeSetFilterIntensity(this.mInternalObject, f7);
    }

    public void setFloatVal(String str, double d7) {
        nativeSetFloatVal(this.mInternalObject, str, d7);
    }

    public void setFloatValAtTime(String str, double d7, long j7) {
        nativeSetFloatValAtTime(this.mInternalObject, str, d7, j7);
    }

    public void setIgnoreBackground(boolean z6) {
    }

    public void setIntVal(String str, int i7) {
        nativeSetIntVal(this.mInternalObject, str, i7);
    }

    public void setIntValAtTime(String str, int i7, long j7) {
        nativeSetIntValAtTime(this.mInternalObject, str, i7, j7);
    }

    public boolean setKeyFrameControlPoint(String str, long j7, MontageControlPointPair montageControlPointPair) {
        if (montageControlPointPair == null) {
            return false;
        }
        return nativeSetKeyFrameControlPoint(this.mInternalObject, str, j7, montageControlPointPair);
    }

    public void setMenuVal(String str, String str2) {
        nativeSetMenuVal(this.mInternalObject, str, str2);
    }

    public void setRegion(float[] fArr) {
    }

    public void setRegionCoordinateSystemType(int i7) {
        nativeSetRegionCoordinateSystemType(this.mInternalObject, i7);
    }

    public void setRegional(boolean z6) {
    }

    public void setStringVal(String str, String str2) {
        nativeSetStringVal(this.mInternalObject, str, str2);
    }

    public void setStringValAtTime(String str, String str2, long j7) {
        nativeSetStringValAtTime(this.mInternalObject, str, str2, j7);
    }
}

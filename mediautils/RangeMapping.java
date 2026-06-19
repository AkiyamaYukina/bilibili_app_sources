package com.bilibili.mediautils;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediautils/RangeMapping.class */
public class RangeMapping {
    public static float linearRangeMapping(float f7, float f8, float f9, float f10, float f11) {
        return (((f8 - f7) / (f11 - f10)) * (stripValue(f9, f10, f11) - f10)) + f7;
    }

    public static float middleRangeMapping(float f7, float f8, float f9, float f10, float f11, float f12, float f13) {
        float fStripValue = stripValue(f10, f11, f12);
        return fStripValue > f13 ? (((f8 - f9) * (fStripValue - f13)) / (f12 - f13)) + f9 : f9 - (((f9 - f7) * (f13 - fStripValue)) / (f13 - f11));
    }

    private static float stripValue(float f7, float f8, float f9) {
        return f7 > f9 ? f9 : f7 < f8 ? f8 : f7;
    }
}

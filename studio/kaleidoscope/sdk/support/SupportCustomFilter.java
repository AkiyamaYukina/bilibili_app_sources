package com.bilibili.studio.kaleidoscope.sdk.support;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/support/SupportCustomFilter.class */
public final class SupportCustomFilter {
    public static final String CUSTOM_FILTER_BRIGHTNESS = "exposure";
    public static final String CUSTOM_FILTER_CONTRAST = "contrast";
    public static final String CUSTOM_FILTER_HIGHLIGHT = "highlight";
    public static final String CUSTOM_FILTER_NAME = "VT_COLOR";
    public static final String CUSTOM_FILTER_SATURATION = "saturation";
    public static final String CUSTOM_FILTER_SHARPNESS = "usmintensity";
    public static final String CUSTOM_FILTER_SIMPLE_CONTRAST = "simplecontrast";
    public static final String CUSTOM_FILTER_SIMPLE_SHADOW = "shadow";
    public static final String CUSTOM_FILTER_TEMPERATURE = "temperature";
    public static final String CUSTOM_FILTER_VIGNETTE_RADIUS = "vignetteradius";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, float[]> f108422a;

    static {
        HashMap map = new HashMap();
        f108422a = map;
        map.put(CUSTOM_FILTER_BRIGHTNESS, new float[]{0.9f, 0.9f});
        map.put(CUSTOM_FILTER_SATURATION, new float[]{1.0f, 1.0f});
        map.put(CUSTOM_FILTER_CONTRAST, new float[]{1.0f, 0.75f});
        map.put(CUSTOM_FILTER_SHARPNESS, new float[]{0.0f, 1.0f});
        map.put(CUSTOM_FILTER_VIGNETTE_RADIUS, new float[]{0.0f, 0.85f});
        map.put(CUSTOM_FILTER_TEMPERATURE, new float[]{0.2f, 0.2f});
        map.put(CUSTOM_FILTER_HIGHLIGHT, new float[]{1.0f, 1.0f});
        map.put(CUSTOM_FILTER_SIMPLE_SHADOW, new float[]{0.0f, 1.0f});
        map.put(CUSTOM_FILTER_SIMPLE_CONTRAST, new float[]{0.0f, 0.6f});
    }

    public static float normalized(String str, float f7) {
        float f8;
        if (Float.compare(f7, 0.0f) == 0) {
            return f7;
        }
        int i7 = 0;
        while (true) {
            f8 = f7;
            if (i7 >= 9) {
                break;
            }
            if (new String[]{CUSTOM_FILTER_BRIGHTNESS, CUSTOM_FILTER_SATURATION, CUSTOM_FILTER_CONTRAST, CUSTOM_FILTER_SHARPNESS, CUSTOM_FILTER_VIGNETTE_RADIUS, CUSTOM_FILTER_TEMPERATURE, CUSTOM_FILTER_HIGHLIGHT, CUSTOM_FILTER_SIMPLE_CONTRAST, CUSTOM_FILTER_SIMPLE_SHADOW}[i7].equals(str)) {
                str.getClass();
                float f9 = (str.equals(CUSTOM_FILTER_SHARPNESS) || str.equals(CUSTOM_FILTER_VIGNETTE_RADIUS)) ? 0.0f : -1.0f;
                Map<String, float[]> map = f108422a;
                float[] fArr = (float[]) ((HashMap) map).get(str);
                Objects.requireNonNull(fArr);
                float f10 = fArr[1];
                float[] fArr2 = (float[]) ((HashMap) map).get(str);
                Objects.requireNonNull(fArr2);
                float f11 = fArr2[0];
                float f12 = ((1.0f - f9) * f7) / (f9 < 0.0f ? 200.0f : 100.0f);
                f8 = f7 >= 0.0f ? f12 * f10 : f12 * f11;
            } else {
                i7++;
            }
        }
        return f8;
    }
}

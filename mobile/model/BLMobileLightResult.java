package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLMobileLightResult.class */
public class BLMobileLightResult {
    public float intensity = 0.0f;
    public float intensity_confidence = 0.0f;
    public float[] intensity_probs = null;
    public int intensity_probsCount = 0;
    public float[] color_probs = null;
    public int color_probsCount = 0;
    public float[] saturation_probs = null;
    public int saturation_probsCount = 0;
    public float sidelight = 0.0f;
    public float backlight = 0.0f;

    public float[] getcolor_probs() {
        return this.color_probs;
    }

    public int getcolor_probsCount() {
        return this.color_probsCount;
    }

    public float[] getintensity_probs() {
        return this.intensity_probs;
    }

    public int getintensity_probsCount() {
        return this.intensity_probsCount;
    }

    public float[] getsaturation_probs() {
        return this.saturation_probs;
    }

    public int getsaturation_probsCount() {
        return this.saturation_probsCount;
    }
}

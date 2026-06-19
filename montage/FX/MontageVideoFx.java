package com.bilibili.montage.FX;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageVideoFx.class */
public class MontageVideoFx extends MontageFx {
    public static final String BUILTIN_VIDEO_CV_FX_NAME_MATTING = "VT_CV_MATTING";
    public static final String BUILTIN_VIDEO_FX_NAME_CARTOON = "Cartoon";
    public static final String BUILTIN_VIDEO_FX_NAME_CHROMA_MATTING = "VT_CHROMA_MATTING";
    public static final String BUILTIN_VIDEO_FX_NAME_GAUSSIAN_BLUR = "Gaussian Blur";
    public static final String BUILTIN_VIDEO_FX_NAME_LUT = "Lut";
    public static final String BUILTIN_VIDEO_FX_NAME_MASK_GENERATOR = "Mask Generator";
    public static final String BUILTIN_VIDEO_FX_NAME_ZOOM_IN = "Zoom In";
    public static final String BUILTIN_VIDEO_FX_NAME_ZOOM_OUT = "Zoom Out";
    public static final String BUILTIN_VIDEO_FX_PARAM_CHROMA_MATTING_BLUR_RADIUS = "blurRadius";
    public static final String BUILTIN_VIDEO_FX_PARAM_CHROMA_MATTING_POSITON_X = "positonX";
    public static final String BUILTIN_VIDEO_FX_PARAM_CHROMA_MATTING_POSITON_Y = "positonY";
    public static final String BUILTIN_VIDEO_FX_PARAM_CHROMA_MATTING_SOFTNESS = "softness";
    public static final String BUILTIN_VIDEO_FX_PARAM_CHROMA_MATTING_TOLERANCE = "tolerance";
    public static final String BUILTIN_VIDEO_FX_PARAM_CV_CONFIG = "cv detect config";
    public static final String BUILTIN_VIDEO_FX_PARAM_CV_MATTING_MODE = "cv matting mode";
    public static final String BUILTIN_VIDEO_FX_PARAM_GAUSSIAN_BLUR_RADIUS = "Radius";
    public static final String BUILTIN_VIDEO_FX_PARAM_GRAYSCALE = "Grayscale";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE2_EFFECT_IN = "Package2 Effect In";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE2_EFFECT_OUT = "Package2 Effect Out";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE2_ID = "Package2 Id";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE_EFFECT_IN = "Package Effect In";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE_EFFECT_OUT = "Package Effect Out";
    public static final String BUILTIN_VIDEO_FX_PARAM_PACKAGE_ID = "Package Id";
    public static final String BUILTIN_VIDEO_FX_PARAM_STROKE_ONLY = "Stroke Only";
    public static final int VIDEOFX_TYPE_BUILTIN = 0;
    public static final int VIDEOFX_TYPE_CUSTOM = 2;
    public static final int VIDEOFX_TYPE_PACKAGE = 1;

    private native long nativeChangeInPoint(long j7, long j8);

    private native long nativeChangeOutPoint(long j7, long j8);

    private native String nativeGetBuiltinVideoFxName(long j7);

    private native long nativeGetInPoint(long j7);

    private native int nativeGetIndex(long j7);

    private native long nativeGetOutPoint(long j7);

    private native int nativeGetVideoFxType(long j7);

    private native boolean nativeIsCvFx(long j7);

    private native void nativeMovePosition(long j7, long j8);

    public long changeInPoint(long j7) {
        return nativeChangeInPoint(this.mInternalObject, j7);
    }

    public long changeOutPoint(long j7) {
        return nativeChangeOutPoint(this.mInternalObject, j7);
    }

    public String getBuiltinVideoFxName() {
        return nativeGetBuiltinVideoFxName(this.mInternalObject);
    }

    public long getInPoint() {
        return nativeGetInPoint(this.mInternalObject);
    }

    public int getIndex() {
        return nativeGetIndex(this.mInternalObject);
    }

    public long getOutPoint() {
        return nativeGetOutPoint(this.mInternalObject);
    }

    public String getVideoFxPackageId() {
        return getFxName();
    }

    public int getVideoFxType() {
        return nativeGetVideoFxType(this.mInternalObject);
    }

    public boolean isCv() {
        return nativeIsCvFx(this.mInternalObject);
    }

    public void movePosition(long j7) {
        nativeMovePosition(this.mInternalObject, j7);
    }
}

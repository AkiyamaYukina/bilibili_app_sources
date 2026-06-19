package com.bilibili.montage.timeline;

import android.util.Log;
import com.bilibili.montage.FX.MontageAudioFx;
import com.bilibili.montage.FX.MontageCustomAudioFx;
import com.bilibili.montage.FX.MontageCustomVideoFx;
import com.bilibili.montage.FX.MontageVideoFx;
import com.bilibili.montage.avinfo.MontageColor;
import java.lang.ref.WeakReference;
import java.util.Hashtable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageVideoClip.class */
public class MontageVideoClip extends MontageClip {
    public static final int CLIP_BLENDING_MODE_ADD = 4;
    public static final int CLIP_BLENDING_MODE_BURN = 7;
    public static final int CLIP_BLENDING_MODE_DARKEN = 6;
    public static final int CLIP_BLENDING_MODE_DIFFERENCE = 18;
    public static final int CLIP_BLENDING_MODE_DODGE = 10;
    public static final int CLIP_BLENDING_MODE_EXCLUSION = 5;
    public static final int CLIP_BLENDING_MODE_HARD_LIGHT = 13;
    public static final int CLIP_BLENDING_MODE_HARD_MIX = 17;
    public static final int CLIP_BLENDING_MODE_LIGHTEN = 9;
    public static final int CLIP_BLENDING_MODE_LINEAR_BURN = 8;
    public static final int CLIP_BLENDING_MODE_LINEAR_LIGHT = 16;
    public static final int CLIP_BLENDING_MODE_MULTIPLY = 1;
    public static final int CLIP_BLENDING_MODE_NORMAL = 0;
    public static final int CLIP_BLENDING_MODE_OVERLAY = 11;
    public static final int CLIP_BLENDING_MODE_PIN_LIGHT = 15;
    public static final int CLIP_BLENDING_MODE_SCREEN = 3;
    public static final int CLIP_BLENDING_MODE_SOFT_LIGHT = 12;
    public static final int CLIP_BLENDING_MODE_SUBTRACT = 2;
    public static final int CLIP_BLENDING_MODE_VIVID_LIGHT = 14;
    public static final int CLIP_MOTIONMODE_LETTERBOX_ZOOMIN = 0;
    public static final int CLIP_WRAPMODE_REPEAT_LASTFRAME = 0;
    public static final int ClIP_BACKGROUNDMODE_BLUR = 1;
    public static final int ClIP_BACKGROUNDMODE_COLOR_SOLID = 0;
    public static final int ClIP_EXTRAVIDEOROTATION_0 = 0;
    public static final int ClIP_EXTRAVIDEOROTATION_180 = 2;
    public static final int ClIP_EXTRAVIDEOROTATION_270 = 3;
    public static final int ClIP_EXTRAVIDEOROTATION_90 = 1;
    public static final int ClIP_MOTIONMODE_LETTERBOX_ZOOMOUT = 1;
    public static final int ClIP_WRAPMODE_REPEAT = 2;
    public static final int ClIP_WRAPMODE_REPEAT_FIRSTFRAME = 1;
    public static final int IMAGE_CLIP_MOTIONMMODE_ROI = 2;
    public static final int ROLE_IN_THEME_GENERAL = 0;
    public static final int ROLE_IN_THEME_TITLE = 1;
    public static final int ROLE_IN_THEME_TRAILER = 2;
    private static final String TAG = "MontageVideoClip";
    public static final int VARIANT_IMAGE_BACKGROUNDMODE_BLUR = 1;
    public static final int VARIANT_IMAGE_BACKGROUNDMODE_COLOR_SOLID = 0;
    public static final int VARIANT_IMAGE_BACKGROUNDMODE_CROP = 2;
    public static final int VIDEO_CLIP_DECODE_TEMPORAL_LAYER_1 = 1;
    public static final int VIDEO_CLIP_DECODE_TEMPORAL_LAYER_2 = 2;
    public static final int VIDEO_CLIP_DECODE_TEMPORAL_LAYER_3 = 3;
    public static final int VIDEO_CLIP_DECODE_TEMPORAL_LAYER_BASE = 0;
    public static final int VIDEO_CLIP_DECODE_TEMPORAL_LAYER_NONE = -1;
    public static final int VIDEO_CLIP_TYPE_AV = 0;
    public static final int VIDEO_CLIP_TYPE_IMAGE = 1;
    private static final int custom_render_cleanup = 1;
    private static final int custom_render_clearCache = 4;
    private static final int custom_render_init = 0;
    private static final int custom_render_loadResource = 2;
    private static final int custom_render_releaseUserdata = 5;
    private static final int custom_render_render = 3;
    private Hashtable<Long, MontageCustomVideoFx.Renderer> mCustomFxRenders = new Hashtable<>();

    private native MontageAudioFx nativeAppendAudioFx(long j7, String str);

    private native MontageVideoFx nativeAppendBuiltinFx(long j7, String str);

    private native MontageVideoFx nativeAppendCustomFx(Object obj, long j7, Object obj2);

    private native MontageVideoFx nativeAppendCvBuiltinFx(long j7, String str);

    private native MontageVideoFx nativeAppendCvPackagedFx(long j7, String str);

    private native MontageVideoFx nativeAppendPackagedFx(long j7, String str);

    private native MontageVideoFx nativeAppendRawBuiltinFx(long j7, String str);

    private native MontageVideoFx nativeAppendRawCustomFx(Object obj, long j7, Object obj2);

    private native void nativeEnablePropertyVideoFx(long j7, boolean z6);

    private native long nativeGetAudioFadeInDuration(long j7);

    private native long nativeGetAudioFadeOutDuration(long j7);

    private native MontageAudioFx nativeGetAudioFxByIndex(long j7, int i7);

    private native int nativeGetAudioFxCount(long j7);

    private native int nativeGetBlendingMode(long j7);

    private native MontageVideoFx nativeGetCvFxByIndex(long j7, int i7);

    private native int nativeGetCvFxCount(long j7);

    private native int nativeGetExtraVideoRotation(long j7);

    private native MontageVideoFx nativeGetFxByIndex(long j7, int i7);

    private native MontageVideoFx nativeGetPropertyVideoFx(long j7);

    private native MontageVideoFx nativeGetRawFxByIndex(long j7, int i7);

    private native int nativeGetRawFxCount(long j7);

    private native boolean nativeGetSourceBackgroundColor(long j7, MontageColor montageColor);

    private native int nativeGetVideoType(long j7);

    private native MontageVideoFx nativeInsertBuiltinFx(long j7, String str, int i7);

    private native MontageVideoFx nativeInsertCustomFx(Object obj, long j7, Object obj2, int i7);

    private native MontageVideoFx nativeInsertPackagedFx(long j7, String str, int i7);

    private native MontageVideoFx nativeInsertRawBuiltinFx(long j7, String str, int i7);

    private native MontageVideoFx nativeInsertRawCustomFx(Object obj, long j7, Object obj2, int i7);

    private native boolean nativeIsPropertyVideoFxEnabled(long j7);

    private native boolean nativeIsSoftwareUsed(long j7);

    private native boolean nativeRemoveAllAudioFx(long j7);

    private native boolean nativeRemoveAllFx(long j7);

    private native boolean nativeRemoveAudioFx(long j7, int i7);

    private native boolean nativeRemoveCvFx(long j7, int i7);

    private native boolean nativeRemoveFx(long j7, int i7);

    private native boolean nativeRemoveRawFx(long j7, int i7);

    private native void nativeSetAudioFadeInDuration(long j7, long j8);

    private native void nativeSetAudioFadeOutDuration(long j7, long j8);

    private native void nativeSetBlendingMode(long j7, int i7);

    private native void nativeSetExtraVideoRotation(long j7, int i7);

    private native void nativeSetSoftwareDecode(long j7, boolean z6);

    private native void nativeSetSourceBackgroundColor(long j7, MontageColor montageColor);

    private native void nativeSetSourceBackgroundMode(long j7, int i7);

    private static void postEventFromNative(Object obj, int i7, Object obj2, Object obj3) {
        boolean z6 = false;
        if (obj == null || obj2 == null) {
            boolean z7 = obj == null;
            if (obj2 == null) {
                z6 = true;
            }
            Log.e(TAG, "customfx postEventFromNative, weakThis:" + z7 + ", weakCustomFxRender:" + z6);
            return;
        }
        MontageVideoClip montageVideoClip = (MontageVideoClip) ((WeakReference) obj).get();
        MontageCustomVideoFx.Renderer renderer = (MontageCustomVideoFx.Renderer) ((WeakReference) obj2).get();
        if (montageVideoClip == null || renderer == null) {
            boolean z8 = montageVideoClip == null;
            boolean z9 = false;
            if (renderer == null) {
                z9 = true;
            }
            Log.e(TAG, "customfx postEventFromNative, videoClip:" + z8 + ", renderer:" + z9);
            return;
        }
        if (i7 == 0) {
            renderer.onInit();
            return;
        }
        if (i7 == 1) {
            renderer.onCleanup();
        } else if (i7 == 2) {
            renderer.onPreloadResources();
        } else {
            if (i7 != 3) {
                return;
            }
            renderer.onRender((MontageCustomVideoFx.RenderContext) obj3);
        }
    }

    public MontageAudioFx appendAudioFx(String str) {
        return nativeAppendAudioFx(this.mInternalObject, str);
    }

    public MontageVideoFx appendBuiltinFx(String str) {
        return nativeAppendBuiltinFx(this.mInternalObject, str);
    }

    public MontageAudioFx appendCustomAudioFx(MontageCustomAudioFx.Renderer renderer) {
        return null;
    }

    public MontageVideoFx appendCustomFx(MontageCustomVideoFx.Renderer renderer) {
        MontageVideoFx montageVideoFxNativeAppendCustomFx = nativeAppendCustomFx(new WeakReference(this), this.mInternalObject, new WeakReference(renderer));
        this.mCustomFxRenders.put(Long.valueOf(montageVideoFxNativeAppendCustomFx.getInternalObject()), renderer);
        return montageVideoFxNativeAppendCustomFx;
    }

    public MontageVideoFx appendCvBuiltinFx(String str) {
        return nativeAppendCvBuiltinFx(this.mInternalObject, str);
    }

    public MontageVideoFx appendCvPackagedFx(String str) {
        return nativeAppendCvPackagedFx(this.mInternalObject, str);
    }

    public MontageVideoFx appendPackagedFx(String str) {
        return nativeAppendPackagedFx(this.mInternalObject, str);
    }

    public MontageVideoFx appendRawBuiltinFx(String str) {
        return nativeAppendRawBuiltinFx(this.mInternalObject, str);
    }

    public MontageVideoFx appendRawCustomFx(MontageCustomVideoFx.Renderer renderer) {
        MontageVideoFx montageVideoFxNativeAppendRawCustomFx = nativeAppendRawCustomFx(new WeakReference(this), this.mInternalObject, new WeakReference(renderer));
        this.mCustomFxRenders.put(Long.valueOf(montageVideoFxNativeAppendRawCustomFx.getInternalObject()), renderer);
        return montageVideoFxNativeAppendRawCustomFx;
    }

    public void disableAmbiguousCrop(boolean z6) {
    }

    public void enablePropertyVideoFx(boolean z6) {
        nativeEnablePropertyVideoFx(this.mInternalObject, z6);
    }

    public long getAudioFadeInDuration() {
        return nativeGetAudioFadeInDuration(this.mInternalObject);
    }

    public long getAudioFadeOutDuration() {
        return nativeGetAudioFadeOutDuration(this.mInternalObject);
    }

    public MontageAudioFx getAudioFxByIndex(int i7) {
        return nativeGetAudioFxByIndex(this.mInternalObject, i7);
    }

    public int getAudioFxCount() {
        return nativeGetAudioFxCount(this.mInternalObject);
    }

    public int getBlendingMode() {
        return nativeGetBlendingMode(this.mInternalObject);
    }

    public int getClipWrapMode() {
        return 0;
    }

    public MontageVideoFx getCvFxByIndex(int i7) {
        return nativeGetCvFxByIndex(this.mInternalObject, i7);
    }

    public int getCvFxCount() {
        return nativeGetCvFxCount(this.mInternalObject);
    }

    public double getEndSpeed() {
        return 1.0d;
    }

    public int getExtraVideoRotation() {
        return nativeGetExtraVideoRotation(this.mInternalObject);
    }

    public MontageVideoFx getFxByIndex(int i7) {
        return nativeGetFxByIndex(this.mInternalObject, i7);
    }

    public boolean getImageMotionAnimationEnabled() {
        return false;
    }

    public int getImageMotionMode() {
        return 0;
    }

    public MontageVideoFx getPropertyVideoFx() {
        return nativeGetPropertyVideoFx(this.mInternalObject);
    }

    public MontageVideoFx getRawFxByIndex(int i7) {
        return nativeGetRawFxByIndex(this.mInternalObject, i7);
    }

    public int getRawFxCount() {
        return nativeGetRawFxCount(this.mInternalObject);
    }

    public int getRoleInTheme() {
        return 0;
    }

    public MontageColor getSourceBackgroundColor() {
        MontageColor montageColor = new MontageColor();
        if (nativeGetSourceBackgroundColor(this.mInternalObject, montageColor)) {
            return montageColor;
        }
        return null;
    }

    public double getStartSpeed() {
        return 1.0d;
    }

    public int getVideoType() {
        return nativeGetVideoType(this.mInternalObject);
    }

    public MontageVideoFx insertBuiltinFx(String str, int i7) {
        return nativeInsertBuiltinFx(this.mInternalObject, str, i7);
    }

    public MontageVideoFx insertCustomFx(MontageCustomVideoFx.Renderer renderer, int i7) {
        MontageVideoFx montageVideoFxNativeInsertCustomFx = nativeInsertCustomFx(new WeakReference(this), this.mInternalObject, new WeakReference(renderer), i7);
        this.mCustomFxRenders.put(Long.valueOf(montageVideoFxNativeInsertCustomFx.getInternalObject()), renderer);
        return montageVideoFxNativeInsertCustomFx;
    }

    public MontageVideoFx insertPackagedFx(String str, int i7) {
        return nativeInsertPackagedFx(this.mInternalObject, str, i7);
    }

    public MontageVideoFx insertRawBuiltinFx(String str, int i7) {
        return nativeInsertRawBuiltinFx(this.mInternalObject, str, i7);
    }

    public MontageVideoFx insertRawCustomFx(MontageCustomVideoFx.Renderer renderer, int i7) {
        MontageVideoFx montageVideoFxNativeInsertRawCustomFx = nativeInsertRawCustomFx(new WeakReference(this), this.mInternalObject, new WeakReference(renderer), i7);
        this.mCustomFxRenders.put(Long.valueOf(montageVideoFxNativeInsertRawCustomFx.getInternalObject()), renderer);
        return montageVideoFxNativeInsertRawCustomFx;
    }

    public boolean isPropertyVideoFxEnabled() {
        return nativeIsPropertyVideoFxEnabled(this.mInternalObject);
    }

    public boolean isSoftWareDeocedUsed() {
        return nativeIsSoftwareUsed(this.mInternalObject);
    }

    public boolean removeAllAudioFx() {
        return nativeRemoveAllAudioFx(this.mInternalObject);
    }

    public boolean removeAllFx() {
        this.mCustomFxRenders.clear();
        return nativeRemoveAllFx(this.mInternalObject);
    }

    public boolean removeAudioFx(int i7) {
        return nativeRemoveAudioFx(this.mInternalObject, i7);
    }

    public boolean removeCvFx(int i7) {
        return nativeRemoveCvFx(this.mInternalObject, i7);
    }

    public boolean removeFx(int i7) {
        MontageVideoFx fxByIndex = getFxByIndex(i7);
        if (fxByIndex != null) {
            this.mCustomFxRenders.remove(Long.valueOf(fxByIndex.getInternalObject()));
        }
        return nativeRemoveFx(this.mInternalObject, i7);
    }

    public boolean removeRawFx(int i7) {
        MontageVideoFx rawFxByIndex = getRawFxByIndex(i7);
        if (rawFxByIndex != null) {
            this.mCustomFxRenders.remove(Long.valueOf(rawFxByIndex.getInternalObject()));
        }
        return nativeRemoveRawFx(this.mInternalObject, i7);
    }

    public void setAudioFadeInDuration(long j7) {
        nativeSetAudioFadeInDuration(this.mInternalObject, j7);
    }

    public void setAudioFadeOutDuration(long j7) {
        nativeSetAudioFadeOutDuration(this.mInternalObject, j7);
    }

    public void setBlendingMode(int i7) {
        nativeSetBlendingMode(this.mInternalObject, i7);
    }

    public void setClipWrapMode(int i7) {
    }

    public void setEnableOriginalRender(boolean z6) {
    }

    public void setExtraVideoRotation(int i7) {
        nativeSetExtraVideoRotation(this.mInternalObject, i7);
    }

    public void setImageMotionAnimationEnabled(boolean z6) {
    }

    public void setImageMotionMode(int i7) {
    }

    public void setPanAndScan(float f7, float f8) {
    }

    public void setSoftWareDecoding(boolean z6) {
        nativeSetSoftwareDecode(this.mInternalObject, z6);
    }

    public void setSourceBackgroundColor(MontageColor montageColor) {
        nativeSetSourceBackgroundColor(this.mInternalObject, montageColor);
    }

    public void setSourceBackgroundMode(int i7) {
        nativeSetSourceBackgroundMode(this.mInternalObject, i7);
    }
}

package com.bilibili.montage.timeline;

import android.util.Log;
import c6.Q;
import com.bilibili.montage.FX.MontageCustomVideoFx;
import com.bilibili.montage.FX.MontageTimelineAnimatedSticker;
import com.bilibili.montage.FX.MontageTimelineCaption;
import com.bilibili.montage.FX.MontageTimelineCompoundCaption;
import com.bilibili.montage.FX.MontageTimelineVideoFx;
import com.bilibili.montage.avinfo.MontageAudioResolution;
import com.bilibili.montage.avinfo.MontageRational;
import com.bilibili.montage.avinfo.MontageVideoResolution;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.montage.avutil.LogSinker;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/timeline/MontageTimeline.class */
public class MontageTimeline extends MontageObject {
    private static final String TAG = "MontageTimeline";
    private static final int custom_render_cleanup = 1;
    private static final int custom_render_clearCache = 4;
    private static final int custom_render_init = 0;
    private static final int custom_render_loadResource = 2;
    private static final int custom_render_render = 3;

    public static MontageTimeline createTimeline(MontageVideoResolution montageVideoResolution, MontageRational montageRational, MontageAudioResolution montageAudioResolution, int i7) {
        LogSinker.i(TAG, "Mon.JAVA.createTimeline");
        if (montageVideoResolution != null && montageRational != null && montageAudioResolution != null) {
            return nativeCreateTimeline(montageVideoResolution, montageRational, montageAudioResolution, i7);
        }
        boolean z6 = false;
        boolean z7 = montageVideoResolution == null;
        boolean z8 = montageRational == null;
        if (montageAudioResolution == null) {
            z6 = true;
        }
        StringBuilder sbA = Q.a("Mon.Java. createTimeline, videoEditRes==null: ", ", videoFps==null: ", ", audioEditRes==null: ", z7, z8);
        sbA.append(z6);
        LogSinker.e(TAG, sbA.toString());
        return null;
    }

    private native MontageTimelineAnimatedSticker nativeAddAnimatedSticker(long j7, long j8, long j9, String str, String str2);

    private native MontageTimelineVideoFx nativeAddBuiltinVideoFx(long j7, long j8, long j9, String str);

    private native MontageTimelineCaption nativeAddCaption(long j7, String str, long j8, long j9, String str2);

    private native MontageTimelineCompoundCaption nativeAddCompoundCaption(long j7, long j8, long j9, String str);

    private native MontageTimelineVideoFx nativeAddCustomVideoFx(Object obj, long j7, long j8, long j9, Object obj2);

    private native MontageTimelineCaption nativeAddModularCaption(long j7, String str, long j8, long j9);

    private native MontageTimelineVideoFx nativeAddPackagedVideoFx(long j7, long j8, long j9, String str);

    private native void nativeAddStatsExtraInfo(long j7, Map<String, String> map);

    private native boolean nativeAddWaterMark(long j7, String str, int i7, int i8, float f7, int i9, int i10, int i11);

    private native MontageAudioTrack nativeAppendAudioTrack(long j7);

    private native MontageAudioTrack nativeAppendAudioTrack(long j7, boolean z6);

    private native MontageVideoTrack nativeAppendVideoTrack(long j7);

    private native MontageVideoTrack nativeAppendVideoTrack(long j7, boolean z6);

    private native void nativeChangeCanvasSize(long j7, int i7, int i8);

    private static native MontageTimeline nativeCreateTimeline(MontageVideoResolution montageVideoResolution, MontageRational montageRational, MontageAudioResolution montageAudioResolution, int i7);

    private native void nativeDeleteWaterMark(long j7);

    private native void nativeEnableRenderOrderByZValue(long j7, boolean z6);

    private native List<MontageTimelineAnimatedSticker> nativeGetAnimatedStickersByTimelinePosition(long j7, long j8);

    private native MontageAudioTrack nativeGetAudioTrackAtIndex(long j7, int i7);

    private native int nativeGetAudioTrackCount(long j7);

    private native List<MontageTimelineCaption> nativeGetCaptionsByTimelinePosition(long j7, long j8);

    private native List<MontageTimelineCompoundCaption> nativeGetCompoundCaptionsByTimelinePosition(long j7, long j8);

    private native long nativeGetDuration(long j7);

    private native MontageTimelineAnimatedSticker nativeGetFirstAnimatedSticker(long j7);

    private native MontageTimelineCaption nativeGetFirstCaption(long j7);

    private native MontageTimelineCompoundCaption nativeGetFirstCompoundCaption(long j7);

    private native MontageTimelineVideoFx nativeGetFirstVideoFx(long j7);

    private native MontageTimelineAnimatedSticker nativeGetLastAnimatedSticker(long j7);

    private native MontageTimelineAnimatedSticker nativeGetNextAnimatedSticker(long j7, MontageTimelineAnimatedSticker montageTimelineAnimatedSticker);

    private native MontageTimelineCaption nativeGetNextCaption(long j7, MontageTimelineCaption montageTimelineCaption);

    private native MontageTimelineCompoundCaption nativeGetNextCompoundCaption(long j7, MontageTimelineCompoundCaption montageTimelineCompoundCaption);

    private native MontageTimelineVideoFx nativeGetNextVideoFx(long j7, MontageTimelineVideoFx montageTimelineVideoFx);

    private native MontageTimelineAnimatedSticker nativeGetPrevAnimatedSticker(long j7, MontageTimelineAnimatedSticker montageTimelineAnimatedSticker);

    private native MontageRational nativeGetVideoFps(long j7);

    private native MontageVideoResolution nativeGetVideoRes(long j7);

    private native MontageVideoTrack nativeGetVideoTrackAtIndex(long j7, int i7);

    private native int nativeGetVideoTrackCount(long j7);

    private native MontageAudioTrack nativeInsertAudioTrack(long j7, int i7);

    private native MontageAudioTrack nativeInsertAudioTrack(long j7, int i7, boolean z6);

    private native MontageVideoTrack nativeInsertVideoTrack(long j7, int i7);

    private native MontageVideoTrack nativeInsertVideoTrack(long j7, int i7, boolean z6);

    private native boolean nativeIsRenderOrderByZValueEnabled(long j7);

    private native boolean nativeRemoveAllAudioTracks(long j7);

    private native boolean nativeRemoveAllTracks(long j7);

    private native boolean nativeRemoveAllVideoTracks(long j7);

    private native MontageTimelineAnimatedSticker nativeRemoveAnimatedSticker(long j7, MontageTimelineAnimatedSticker montageTimelineAnimatedSticker);

    private native boolean nativeRemoveAudioTrackAtIndex(long j7, int i7);

    private native MontageTimelineCaption nativeRemoveCaption(long j7, MontageTimelineCaption montageTimelineCaption);

    private native MontageTimelineCompoundCaption nativeRemoveCompoundCaption(long j7, MontageTimelineCompoundCaption montageTimelineCompoundCaption);

    private native MontageTimelineVideoFx nativeRemoveVideoFx(long j7, MontageTimelineVideoFx montageTimelineVideoFx);

    private native boolean nativeRemoveVideoTrackAtIndex(long j7, int i7);

    private static void postEventFromNative(Object obj, int i7, Object obj2, Object obj3) {
        boolean z6 = false;
        if (obj == null) {
            boolean z7 = obj == null;
            if (obj2 == null) {
                z6 = true;
            }
            Log.e(TAG, "customfx postEventFromNative, weakThis:" + z7 + ", weakCustomFxRender:" + z6);
            return;
        }
        MontageTimeline montageTimeline = (MontageTimeline) ((WeakReference) obj).get();
        MontageCustomVideoFx.Renderer renderer = (MontageCustomVideoFx.Renderer) ((WeakReference) obj2).get();
        if (montageTimeline == null || renderer == null) {
            boolean z8 = montageTimeline == null;
            boolean z9 = false;
            if (renderer == null) {
                z9 = true;
            }
            Log.e(TAG, "customfx postEventFromNative, timeline:" + z8 + ", renderer:" + z9);
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

    public MontageTimelineAnimatedSticker addAnimatedSticker(long j7, long j8, String str) {
        return nativeAddAnimatedSticker(this.mInternalObject, j7, j8, str, null);
    }

    public MontageTimelineVideoFx addBuiltinTimelineVideoFx(long j7, long j8, String str) {
        return nativeAddBuiltinVideoFx(this.mInternalObject, j7, j8, str);
    }

    public MontageTimelineCaption addCaption(String str, long j7, long j8, String str2) {
        return nativeAddCaption(this.mInternalObject, str, j7, j8, str2);
    }

    public MontageTimelineCompoundCaption addCompoundCaption(long j7, long j8, String str) {
        return nativeAddCompoundCaption(this.mInternalObject, j7, j8, str);
    }

    public MontageTimelineAnimatedSticker addCustomAnimatedSticker(long j7, long j8, String str, String str2) {
        return nativeAddAnimatedSticker(this.mInternalObject, j7, j8, str, str2);
    }

    public MontageTimelineVideoFx addCustomTimelineVideoFx(long j7, long j8, MontageCustomVideoFx.Renderer renderer) {
        return nativeAddCustomVideoFx(new WeakReference(this), this.mInternalObject, j7, j8, new WeakReference(renderer));
    }

    public MontageTimelineCaption addModularCaption(String str, long j7, long j8) {
        return nativeAddModularCaption(this.mInternalObject, str, j7, j8);
    }

    public MontageTimelineVideoFx addPackagedTimelineVideoFx(long j7, long j8, String str) {
        return nativeAddPackagedVideoFx(this.mInternalObject, j7, j8, str);
    }

    public void addStatsExtraInfo(Map<String, String> map) {
        nativeAddStatsExtraInfo(this.mInternalObject, map);
    }

    public boolean addWatermark(String str, int i7, int i8, float f7, int i9, int i10, int i11) {
        return nativeAddWaterMark(this.mInternalObject, str, i7, i8, f7, i9, i10, i11);
    }

    public MontageAudioTrack appendAudioTrack() {
        return nativeAppendAudioTrack(this.mInternalObject);
    }

    public MontageAudioTrack appendAudioTrack(boolean z6) {
        return nativeAppendAudioTrack(this.mInternalObject, z6);
    }

    public MontageVideoTrack appendVideoTrack() {
        return nativeAppendVideoTrack(this.mInternalObject);
    }

    public MontageVideoTrack appendVideoTrack(boolean z6) {
        return nativeAppendVideoTrack(this.mInternalObject, z6);
    }

    public boolean applyTheme(String str) {
        return false;
    }

    public int audioTrackCount() {
        return nativeGetAudioTrackCount(this.mInternalObject);
    }

    public boolean changeVideoBitDepth(int i7) {
        return false;
    }

    public boolean changeVideoSize(int i7, int i8) {
        nativeChangeCanvasSize(this.mInternalObject, i7, i8);
        return true;
    }

    public void deleteWatermark() {
        nativeDeleteWaterMark(this.mInternalObject);
    }

    public void enableRenderOrderByZValue(boolean z6) {
        nativeEnableRenderOrderByZValue(this.mInternalObject, z6);
    }

    public List<MontageTimelineAnimatedSticker> getAnimatedStickersByTimelinePosition(long j7) {
        return nativeGetAnimatedStickersByTimelinePosition(this.mInternalObject, j7);
    }

    public MontageAudioTrack getAudioTrackByIndex(int i7) {
        return nativeGetAudioTrackAtIndex(this.mInternalObject, i7);
    }

    public List<MontageTimelineCaption> getCaptionsByTimelinePosition(long j7) {
        return nativeGetCaptionsByTimelinePosition(this.mInternalObject, j7);
    }

    public List<MontageTimelineCompoundCaption> getCompoundCaptionsByTimelinePosition(long j7) {
        return nativeGetCompoundCaptionsByTimelinePosition(this.mInternalObject, j7);
    }

    public String getCurrentThemeId() {
        return "";
    }

    public long getDuration() {
        return nativeGetDuration(this.mInternalObject);
    }

    public MontageTimelineAnimatedSticker getFirstAnimatedSticker() {
        return nativeGetFirstAnimatedSticker(this.mInternalObject);
    }

    public MontageTimelineCaption getFirstCaption() {
        return nativeGetFirstCaption(this.mInternalObject);
    }

    public MontageTimelineCompoundCaption getFirstCompoundCaption() {
        return nativeGetFirstCompoundCaption(this.mInternalObject);
    }

    public MontageTimelineVideoFx getFirstTimelineVideoFx() {
        return nativeGetFirstVideoFx(this.mInternalObject);
    }

    public MontageTimelineAnimatedSticker getLastAnimatedSticker() {
        return nativeGetLastAnimatedSticker(this.mInternalObject);
    }

    public MontageTimelineAnimatedSticker getNextAnimatedSticker(MontageTimelineAnimatedSticker montageTimelineAnimatedSticker) {
        return nativeGetNextAnimatedSticker(this.mInternalObject, montageTimelineAnimatedSticker);
    }

    public MontageTimelineCaption getNextCaption(MontageTimelineCaption montageTimelineCaption) {
        return nativeGetNextCaption(this.mInternalObject, montageTimelineCaption);
    }

    public MontageTimelineCompoundCaption getNextCaption(MontageTimelineCompoundCaption montageTimelineCompoundCaption) {
        return nativeGetNextCompoundCaption(this.mInternalObject, montageTimelineCompoundCaption);
    }

    public MontageTimelineVideoFx getNextTimelineVideoFx(MontageTimelineVideoFx montageTimelineVideoFx) {
        return nativeGetNextVideoFx(this.mInternalObject, montageTimelineVideoFx);
    }

    public MontageTimelineAnimatedSticker getPrevAnimatedSticker(MontageTimelineAnimatedSticker montageTimelineAnimatedSticker) {
        return nativeGetPrevAnimatedSticker(this.mInternalObject, montageTimelineAnimatedSticker);
    }

    public MontageVolume getThemeMusicVolumeGain() {
        return new MontageVolume(0.0f, 0.0f);
    }

    public MontageRational getVideoFps() {
        return nativeGetVideoFps(this.mInternalObject);
    }

    public MontageVideoResolution getVideoRes() {
        return nativeGetVideoRes(this.mInternalObject);
    }

    public MontageVideoTrack getVideoTrackByIndex(int i7) {
        return nativeGetVideoTrackAtIndex(this.mInternalObject, i7);
    }

    public MontageAudioTrack insertAudioTrack(int i7) {
        return nativeInsertAudioTrack(this.mInternalObject, i7);
    }

    public MontageAudioTrack insertAudioTrack(int i7, boolean z6) {
        return nativeInsertAudioTrack(this.mInternalObject, i7, z6);
    }

    public MontageVideoTrack insertVideoTrack(int i7) {
        return nativeInsertVideoTrack(this.mInternalObject, i7);
    }

    public MontageVideoTrack insertVideoTrack(int i7, boolean z6) {
        return nativeInsertVideoTrack(this.mInternalObject, i7, z6);
    }

    public boolean isRenderOrderByZValueEnabled() {
        return nativeIsRenderOrderByZValueEnabled(this.mInternalObject);
    }

    public boolean removeAllAudioTracks() {
        return nativeRemoveAllAudioTracks(this.mInternalObject);
    }

    public boolean removeAllTracks() {
        return nativeRemoveAllTracks(this.mInternalObject);
    }

    public boolean removeAllVideoTracks() {
        return nativeRemoveAllVideoTracks(this.mInternalObject);
    }

    public MontageTimelineAnimatedSticker removeAnimatedSticker(MontageTimelineAnimatedSticker montageTimelineAnimatedSticker) {
        return nativeRemoveAnimatedSticker(this.mInternalObject, montageTimelineAnimatedSticker);
    }

    public boolean removeAudioTrack(int i7) {
        return nativeRemoveAudioTrackAtIndex(this.mInternalObject, i7);
    }

    public MontageTimelineCaption removeCaption(MontageTimelineCaption montageTimelineCaption) {
        return nativeRemoveCaption(this.mInternalObject, montageTimelineCaption);
    }

    public MontageTimelineCompoundCaption removeCompoundCaption(MontageTimelineCompoundCaption montageTimelineCompoundCaption) {
        return nativeRemoveCompoundCaption(this.mInternalObject, montageTimelineCompoundCaption);
    }

    public void removeCurrentTheme() {
    }

    public MontageTimelineVideoFx removeTimelineVideoFx(MontageTimelineVideoFx montageTimelineVideoFx) {
        return nativeRemoveVideoFx(this.mInternalObject, montageTimelineVideoFx);
    }

    public boolean removeVideoTrack(int i7) {
        return nativeRemoveVideoTrackAtIndex(this.mInternalObject, i7);
    }

    public void setThemeMusicVolumeGain(float f7, float f8) {
    }

    public int videoTrackCount() {
        return nativeGetVideoTrackCount(this.mInternalObject);
    }
}

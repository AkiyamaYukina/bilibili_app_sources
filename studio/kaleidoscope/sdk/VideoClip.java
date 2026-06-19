package com.bilibili.studio.kaleidoscope.sdk;

import com.bilibili.studio.kaleidoscope.sdk.CustomVideoFx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoClip.class */
public interface VideoClip extends Clip {
    public static final int CLIP_MOTIONMODE_LETTERBOX_ZOOMIN = 0;
    public static final int CLIP_WRAPMODE_REPEAT_LASTFRAME = 0;
    public static final int ClIP_MOTIONMODE_LETTERBOX_ZOOMOUT = 1;
    public static final int ClIP_WRAPMODE_REPEAT_FIRSTFRAME = 1;
    public static final int VIDEO_CLIP_TYPE_AV = 0;

    VideoFx appendBuiltinFx(String str);

    VideoFx appendCustomFx(CustomVideoFx.Renderer renderer);

    VideoFx appendCvBuiltinFx(String str, int i7);

    VideoFx appendCvPackageBuiltinFx(String str);

    VideoFx appendPackagedFx(String str);

    VideoFx appendRawBuiltinFx(String str);

    VideoFx appendRawCustomFx(CustomVideoFx.Renderer renderer);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    boolean changeFilePath(String str);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long changeTrimOutPoint(long j7, boolean z6);

    void disableAmbiguousCrop(boolean z6);

    void enablePropertyVideoFx(boolean z6);

    long getAudioFadeInDuration();

    long getAudioFadeOutDuration();

    int getBlendingMode();

    int getClipWrapMode();

    double getEndSpeed();

    int getExtraVideoRotation();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    String getFilePath();

    VideoFx getFxByIndex(int i7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    int getFxCount();

    boolean getImageMotionAnimationEnabled();

    int getImageMotionMode();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getInPoint();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getOutPoint();

    VideoFx getPropertyVideoFx();

    VideoFx getRawFxByIndex(int i7);

    int getRawFxCount();

    Color getSourceBackgroundColor();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    double getSpeed();

    double getStartSpeed();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getTrimIn();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getTrimOut();

    Object getVideoClip();

    int getVideoType();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    Volume getVolumeGain();

    VideoFx insertBuiltinFx(String str, int i7);

    VideoFx insertCustomFx(CustomVideoFx.Renderer renderer, int i7);

    VideoFx insertPackagedFx(String str, int i7);

    VideoFx insertRawBuiltinFx(String str, int i7);

    VideoFx insertRawCustomFx(CustomVideoFx.Renderer renderer, int i7);

    boolean isPropertyVideoFxEnabled();

    boolean moveTrimPoint(long j7);

    boolean removeCvFx(int i7);

    boolean removeFx(int i7);

    boolean removeRawFx(int i7);

    void setAudioFadeInDuration(long j7);

    void setAudioFadeOutDuration(long j7);

    void setBlendingMode(int i7);

    void setClipWrapMode(int i7);

    void setEnableOriginalRender(boolean z6);

    void setExtraVideoRotation(int i7);

    void setImageMotionAnimationEnabled(boolean z6);

    void setImageMotionMode(int i7);

    void setPanAndScan(float f7, float f8);

    void setSoftWareDecoding(boolean z6);

    void setSourceBackgroundColor(Color color);

    void setSourceBackgroundMode(int i7);

    void setVideoClip(Object obj);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    void setVolumeGain(float f7, float f8);

    boolean supportBuildInFx(String str);
}

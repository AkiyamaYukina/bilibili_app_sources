package com.bilibili.studio.kaleidoscope.sdk;

import com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AudioClip.class */
public interface AudioClip extends Clip {
    public static final int DENOISE_TYPE_LEVEL_CLOSE = -1;

    AudioFx appendCustomFx(CustomAudioFx.Renderer renderer);

    AudioFx appendFx(String str);

    void deNoiseByLevel(int i7);

    Object getAudioClip();

    int getDeNoiseLevel();

    long getFadeInDuration();

    long getFadeOutDuration();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    String getFilePath();

    AudioFx getFxByIndex(int i7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getInPoint();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    int getIndex();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    long getOutPoint();

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    Volume getVolumeGain();

    boolean removeFx(int i7);

    void setAudioClip(Object obj);

    void setFadeInDuration(long j7);

    void setFadeOutDuration(long j7);

    @Override // com.bilibili.studio.kaleidoscope.sdk.Clip
    void setVolumeGain(float f7, float f8);
}

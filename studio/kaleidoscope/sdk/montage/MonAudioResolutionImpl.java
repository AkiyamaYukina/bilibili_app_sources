package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageAudioResolution;
import com.bilibili.studio.kaleidoscope.sdk.AudioResolution;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAudioResolutionImpl.class */
public final class MonAudioResolutionImpl implements AudioResolution {
    private static final String TAG = "Mon.AR.Impl";
    private MontageAudioResolution mMonAudioResolution;

    public MonAudioResolutionImpl() {
        this.mMonAudioResolution = new MontageAudioResolution();
    }

    private MonAudioResolutionImpl(@NonNull MontageAudioResolution montageAudioResolution) {
        this.mMonAudioResolution = montageAudioResolution;
    }

    @NonNull
    public static AudioResolution box(@NonNull MontageAudioResolution montageAudioResolution) {
        return new MonAudioResolutionImpl(montageAudioResolution);
    }

    @NonNull
    public static MontageAudioResolution unbox(@NonNull AudioResolution audioResolution) {
        return (MontageAudioResolution) audioResolution.getAudioResolution();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public Object getAudioResolution() {
        return this.mMonAudioResolution;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public int getChannelCount() {
        return this.mMonAudioResolution.channelCount;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public int getSampleRate() {
        return this.mMonAudioResolution.sampleRate;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public void setAudioResolution(Object obj) {
        this.mMonAudioResolution = (MontageAudioResolution) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public void setChannelCount(int i7) {
        this.mMonAudioResolution.channelCount = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioResolution
    public void setSampleRate(int i7) {
        this.mMonAudioResolution.sampleRate = i7;
    }
}

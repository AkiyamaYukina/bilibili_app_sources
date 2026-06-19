package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageAudioFx;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.montage.timeline.MontageAudioClip;
import com.bilibili.studio.kaleidoscope.sdk.AudioClip;
import com.bilibili.studio.kaleidoscope.sdk.AudioFx;
import com.bilibili.studio.kaleidoscope.sdk.CustomAudioFx;
import com.bilibili.studio.kaleidoscope.sdk.Volume;
import com.bilibili.studio.kaleidoscope.sdk.montage.MonCustomAudioFxImpl;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAudioClipImpl.class */
public final class MonAudioClipImpl extends MonClipImpl implements AudioClip {
    private static final String TAG = "Mon.AC.Impl";
    private MontageAudioClip mMontageAudioClip;

    private MonAudioClipImpl(@NonNull MontageAudioClip montageAudioClip) {
        super(montageAudioClip);
        this.mMontageAudioClip = montageAudioClip;
    }

    @NonNull
    public static AudioClip box(@NonNull MontageAudioClip montageAudioClip) {
        return new MonAudioClipImpl(montageAudioClip);
    }

    @NonNull
    public static MontageAudioClip unbox(@NonNull AudioClip audioClip) {
        return (MontageAudioClip) audioClip.getAudioClip();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public AudioFx appendCustomFx(CustomAudioFx.Renderer renderer) {
        MontageAudioFx montageAudioFxAppendFx;
        AudioFx audioFxBox = null;
        if (renderer == null || renderer.getType() == 1) {
            montageAudioFxAppendFx = this.mMontageAudioClip.appendFx("Voice Change");
        } else {
            if (renderer.getType() == 2) {
                return null;
            }
            montageAudioFxAppendFx = this.mMontageAudioClip.appendCustomFx(new MonCustomAudioFxImpl.a(renderer));
        }
        if (montageAudioFxAppendFx != null) {
            audioFxBox = MonAudioFxImpl.box(montageAudioFxAppendFx);
        }
        return audioFxBox;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public AudioFx appendFx(String str) {
        MontageAudioFx montageAudioFxAppendFx = this.mMontageAudioClip.appendFx(str != null ? "Voice Change" : "");
        return montageAudioFxAppendFx != null ? MonAudioFxImpl.box(montageAudioFxAppendFx) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public void deNoiseByLevel(int i7) {
        this.mMontageAudioClip.deNoiseByLevel(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public Object getAudioClip() {
        return this.mMontageAudioClip;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public int getDeNoiseLevel() {
        return this.mMontageAudioClip.getDeNoiseLevel();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public long getFadeInDuration() {
        return this.mMontageAudioClip.getFadeInDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public long getFadeOutDuration() {
        return this.mMontageAudioClip.getFadeOutDuration();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public String getFilePath() {
        return this.mMontageAudioClip.getFilePath();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public AudioFx getFxByIndex(int i7) {
        return MonAudioFxImpl.box(this.mMontageAudioClip.getFxByIndex(i7));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getInPoint() {
        return this.mMontageAudioClip.getInPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public int getIndex() {
        return this.mMontageAudioClip.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public long getOutPoint() {
        return this.mMontageAudioClip.getOutPoint();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public Volume getVolumeGain() {
        MontageVolume volumeGain = this.mMontageAudioClip.getVolumeGain();
        return volumeGain != null ? MonVolumeImpl.box(volumeGain) : null;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public boolean removeFx(int i7) {
        return this.mMontageAudioClip.removeFx(i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public void setAudioClip(Object obj) {
        this.mMontageAudioClip = (MontageAudioClip) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public void setFadeInDuration(long j7) {
        this.mMontageAudioClip.setFadeInDuration(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioClip
    public void setFadeOutDuration(long j7) {
        this.mMontageAudioClip.setFadeOutDuration(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.montage.MonClipImpl, com.bilibili.studio.kaleidoscope.sdk.Clip
    public void setVolumeGain(float f7, float f8) {
        this.mMontageAudioClip.setVolumeGain(f7, f8);
    }
}

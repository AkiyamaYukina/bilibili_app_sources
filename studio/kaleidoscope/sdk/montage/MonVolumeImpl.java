package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageVolume;
import com.bilibili.studio.kaleidoscope.sdk.Volume;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonVolumeImpl.class */
public final class MonVolumeImpl implements Volume {
    private MontageVolume mMontageVolume;

    private MonVolumeImpl(@NonNull MontageVolume montageVolume) {
        this.mMontageVolume = montageVolume;
    }

    @NonNull
    public static Volume box(@NonNull MontageVolume montageVolume) {
        return new MonVolumeImpl(montageVolume);
    }

    @NonNull
    public static MontageVolume unbox(@NonNull Volume volume) {
        return (MontageVolume) volume.getVolume();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public float getLeftVolume() {
        return this.mMontageVolume.leftVolume;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public float getRightVolume() {
        return this.mMontageVolume.rightVolume;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public Object getVolume() {
        return this.mMontageVolume;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public void setLeftVolume(float f7) {
        this.mMontageVolume.leftVolume = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public void setRightVolume(float f7) {
        this.mMontageVolume.rightVolume = f7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.Volume
    public void setVolume(Object obj) {
        this.mMontageVolume = (MontageVolume) obj;
    }
}

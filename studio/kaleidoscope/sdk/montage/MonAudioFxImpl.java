package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.FX.MontageAudioFx;
import com.bilibili.studio.kaleidoscope.sdk.AudioFx;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAudioFxImpl.class */
public final class MonAudioFxImpl extends MonFxImpl implements AudioFx {
    private static final String TAG = "Mon.AF.Impl";
    private MontageAudioFx mMontageAudioFx;

    private MonAudioFxImpl(@NonNull MontageAudioFx montageAudioFx) {
        super(montageAudioFx);
        this.mMontageAudioFx = montageAudioFx;
    }

    @NonNull
    public static AudioFx box(@NonNull MontageAudioFx montageAudioFx) {
        return new MonAudioFxImpl(montageAudioFx);
    }

    @NonNull
    public static MontageAudioFx unbox(@NonNull AudioFx audioFx) {
        return (MontageAudioFx) audioFx.getAudioFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioFx
    public Object getAudioFx() {
        return this.mMontageAudioFx;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioFx
    public String getBuiltinAudioFxName() {
        return this.mMontageAudioFx.getBuiltinAudioFxName();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioFx
    public int getIndex() {
        return this.mMontageAudioFx.getIndex();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioFx
    public boolean isCustomAudioFx() {
        return this.mMontageAudioFx.isCustomAudioFx();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioFx
    public void setAudioFx(Object obj) {
        this.mMontageAudioFx = (MontageAudioFx) obj;
    }
}

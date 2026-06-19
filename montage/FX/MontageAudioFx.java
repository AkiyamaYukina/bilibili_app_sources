package com.bilibili.montage.FX;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/FX/MontageAudioFx.class */
public class MontageAudioFx extends MontageFx {
    public static final String BUILTIN_AUDIO_FX_NAME_TONE = "Tone";
    public static final String BUILTIN_AUDIO_FX_NAME_VOICE_CHANGE = "Voice Change";
    public static final String BUILTIN_AUDIO_FX_PARAM_AUDIO_EFFECT_TYPE = "Audio Effect Type";
    public static final String BUILTIN_AUDIO_FX_PARAM_SEMITONE_VALUE = "Semitone Value";

    private native String nativeGetBuiltinAudioFxName(long j7);

    private native int nativeGetIndex(long j7);

    private native boolean nativeIsCustomAudioFx();

    public String getBuiltinAudioFxName() {
        return nativeGetBuiltinAudioFxName(this.mInternalObject);
    }

    public int getIndex() {
        return nativeGetIndex(this.mInternalObject);
    }

    public boolean isCustomAudioFx() {
        return false;
    }
}

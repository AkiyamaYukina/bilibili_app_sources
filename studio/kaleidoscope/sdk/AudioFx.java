package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AudioFx.class */
public interface AudioFx extends Fx {
    Object getAudioFx();

    String getBuiltinAudioFxName();

    int getIndex();

    boolean isCustomAudioFx();

    void setAudioFx(Object obj);
}

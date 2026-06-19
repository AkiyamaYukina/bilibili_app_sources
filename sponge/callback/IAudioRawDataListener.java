package com.bilibili.sponge.callback;

import com.bilibili.sponge.audio.RawAudioFrame;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/IAudioRawDataListener.class */
public interface IAudioRawDataListener {
    void onCaptureAudio(RawAudioFrame rawAudioFrame);
}

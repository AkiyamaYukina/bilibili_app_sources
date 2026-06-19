package com.bilibili.sponge.callback;

import com.bilibili.sponge.audio.RawAudioFrame;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/callback/IFileDecodeCallback.class */
public interface IFileDecodeCallback {
    void onAudioRawDataCapture(RawAudioFrame rawAudioFrame);

    void onVideoTextureIdGenerate(int i7);
}

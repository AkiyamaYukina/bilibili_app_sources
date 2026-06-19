package com.bilibili.live.streaming.encoder;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/IEncoderStateCallback.class */
public interface IEncoderStateCallback {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/live/streaming/encoder/IEncoderStateCallback$DefaultImpls.class */
    public static final class DefaultImpls {
        @Deprecated
        public static int onAudioEncoderState(@NotNull IEncoderStateCallback iEncoderStateCallback, int i7, @NotNull String str) {
            return iEncoderStateCallback.onAudioEncoderState(i7, str);
        }
    }

    default int onAudioEncoderState(int i7, @NotNull String str) {
        return 0;
    }

    void onVideoEncoderState(@NotNull VideoEncodeState videoEncodeState, @NotNull String str);
}

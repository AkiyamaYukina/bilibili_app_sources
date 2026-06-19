package com.bilibili.mediastreaming.audio.common;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/common/IBiliAudioStreamObserver.class */
public interface IBiliAudioStreamObserver {
    @Keep
    void onAudioConsumptionPause();

    @Keep
    void onAudioResetDone();

    @Keep
    void onAudioResetStart();

    @Keep
    void onAudioStartSpending();

    @Keep
    void onAudioTotalConsumeFrames(long j7);

    @Keep
    void onAudioTotalDropFrames(long j7);

    @Keep
    void onAudioTotalProduceFrames(long j7);
}

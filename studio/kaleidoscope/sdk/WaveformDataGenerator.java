package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/WaveformDataGenerator.class */
public interface WaveformDataGenerator {

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/WaveformDataGenerator$WaveformAudioDurationCallback.class */
    public interface WaveformAudioDurationCallback {
        void onWaveformAudioDuration(String str, long j7);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/WaveformDataGenerator$WaveformDataCallback.class */
    public interface WaveformDataCallback {
        void onWaveformDataGenerationFailed(long j7, String str, long j8);

        void onWaveformDataReady(long j7, String str, long j8, long j9, float[] fArr, float[] fArr2);
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/WaveformDataGenerator$WaveformSampleCountCallback.class */
    public interface WaveformSampleCountCallback {
        void onWaveformSampleCount(String str, long j7);
    }

    void cancelTask(long j7);

    long generateWaveformData(String str, long j7, long j8, long j9, int i7);

    long getAudioFileDuration(String str);

    void getAudioFileDurationAsync(String str, WaveformAudioDurationCallback waveformAudioDurationCallback);

    long getAudioFileSampleCount(String str);

    void getAudioFileSampleCountAsync(String str, WaveformSampleCountCallback waveformSampleCountCallback);

    Object getWaveformDataGenerator();

    void release();

    void setWaveformDataCallback(WaveformDataCallback waveformDataCallback);

    void setWaveformDataGenerator(Object obj);
}

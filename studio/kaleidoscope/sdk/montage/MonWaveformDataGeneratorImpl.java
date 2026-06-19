package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avutil.MontageWaveformDataGenerator;
import com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonWaveformDataGeneratorImpl.class */
public final class MonWaveformDataGeneratorImpl implements WaveformDataGenerator {
    private static final String TAG = "Mon.WDG.Impl";
    private MontageWaveformDataGenerator mMonWaveformDataGenerator;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonWaveformDataGeneratorImpl$a.class */
    public static final class a implements MontageWaveformDataGenerator.WaveformAudioDurationCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WaveformDataGenerator.WaveformAudioDurationCallback f108411a;

        public a(WaveformDataGenerator.WaveformAudioDurationCallback waveformAudioDurationCallback) {
            this.f108411a = waveformAudioDurationCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageWaveformDataGenerator.WaveformAudioDurationCallback
        public final void onWaveformAudioDuration(String str, long j7) {
            this.f108411a.onWaveformAudioDuration(str, j7);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonWaveformDataGeneratorImpl$b.class */
    public static final class b implements MontageWaveformDataGenerator.WaveformDataCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WaveformDataGenerator.WaveformDataCallback f108412a;

        public b(WaveformDataGenerator.WaveformDataCallback waveformDataCallback) {
            this.f108412a = waveformDataCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageWaveformDataGenerator.WaveformDataCallback
        public final void onWaveformDataGenerationFailed(long j7, String str, long j8) {
            this.f108412a.onWaveformDataGenerationFailed(j7, str, j8);
        }

        @Override // com.bilibili.montage.avutil.MontageWaveformDataGenerator.WaveformDataCallback
        public final void onWaveformDataReady(long j7, String str, long j8, long j9, float[] fArr, float[] fArr2) {
            this.f108412a.onWaveformDataReady(j7, str, j8, j9, fArr, fArr2);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonWaveformDataGeneratorImpl$c.class */
    public static final class c implements MontageWaveformDataGenerator.WaveformSampleCountCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WaveformDataGenerator.WaveformSampleCountCallback f108413a;

        public c(WaveformDataGenerator.WaveformSampleCountCallback waveformSampleCountCallback) {
            this.f108413a = waveformSampleCountCallback;
        }

        @Override // com.bilibili.montage.avutil.MontageWaveformDataGenerator.WaveformSampleCountCallback
        public final void onWaveformSampleCount(String str, long j7) {
            this.f108413a.onWaveformSampleCount(str, j7);
        }
    }

    public MonWaveformDataGeneratorImpl() {
        this.mMonWaveformDataGenerator = new MontageWaveformDataGenerator();
    }

    private MonWaveformDataGeneratorImpl(@NonNull MontageWaveformDataGenerator montageWaveformDataGenerator) {
        this.mMonWaveformDataGenerator = montageWaveformDataGenerator;
    }

    @NonNull
    public static WaveformDataGenerator box(@NonNull MontageWaveformDataGenerator montageWaveformDataGenerator) {
        return new MonWaveformDataGeneratorImpl(montageWaveformDataGenerator);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void cancelTask(long j7) {
        this.mMonWaveformDataGenerator.cancelTask(j7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public long generateWaveformData(String str, long j7, long j8, long j9, int i7) {
        return this.mMonWaveformDataGenerator.generateWaveformData(str, j7, j8, j9, i7);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public long getAudioFileDuration(String str) {
        return this.mMonWaveformDataGenerator.getAudioFileDuration(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void getAudioFileDurationAsync(String str, WaveformDataGenerator.WaveformAudioDurationCallback waveformAudioDurationCallback) {
        MontageWaveformDataGenerator montageWaveformDataGenerator;
        if (waveformAudioDurationCallback == null || (montageWaveformDataGenerator = this.mMonWaveformDataGenerator) == null) {
            return;
        }
        montageWaveformDataGenerator.getAudioFileDurationAsync(str, new a(waveformAudioDurationCallback));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public long getAudioFileSampleCount(String str) {
        return this.mMonWaveformDataGenerator.getAudioFileSampleCount(str);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void getAudioFileSampleCountAsync(String str, WaveformDataGenerator.WaveformSampleCountCallback waveformSampleCountCallback) {
        MontageWaveformDataGenerator montageWaveformDataGenerator;
        if (waveformSampleCountCallback == null || (montageWaveformDataGenerator = this.mMonWaveformDataGenerator) == null) {
            return;
        }
        montageWaveformDataGenerator.getAudioFileSampleCountAsync(str, new c(waveformSampleCountCallback));
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public Object getWaveformDataGenerator() {
        return this.mMonWaveformDataGenerator;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void release() {
        this.mMonWaveformDataGenerator.release();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void setWaveformDataCallback(WaveformDataGenerator.WaveformDataCallback waveformDataCallback) {
        this.mMonWaveformDataGenerator.setWaveformDataCallback(waveformDataCallback != null ? new b(waveformDataCallback) : null);
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.WaveformDataGenerator
    public void setWaveformDataGenerator(Object obj) {
        this.mMonWaveformDataGenerator = (MontageWaveformDataGenerator) obj;
    }
}

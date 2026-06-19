package com.bilibili.studio.kaleidoscope.sdk.montage;

import androidx.annotation.NonNull;
import com.bilibili.montage.avinfo.MontageAudioSampleBuffers;
import com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers;
import java.nio.ByteBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/montage/MonAudioSampleBuffersImpl.class */
public final class MonAudioSampleBuffersImpl implements AudioSampleBuffers {
    private static final String TAG = "Mon.ASB.Impl";
    private MontageAudioSampleBuffers mMonAudioSampleBuffers;

    public MonAudioSampleBuffersImpl() {
        this.mMonAudioSampleBuffers = new MontageAudioSampleBuffers();
    }

    private MonAudioSampleBuffersImpl(@NonNull MontageAudioSampleBuffers montageAudioSampleBuffers) {
        this.mMonAudioSampleBuffers = montageAudioSampleBuffers;
    }

    @NonNull
    public static AudioSampleBuffers box(@NonNull MontageAudioSampleBuffers montageAudioSampleBuffers) {
        return new MonAudioSampleBuffersImpl(montageAudioSampleBuffers);
    }

    @NonNull
    public static MontageAudioSampleBuffers unbox(@NonNull AudioSampleBuffers audioSampleBuffers) {
        return (MontageAudioSampleBuffers) audioSampleBuffers.getAudioSampleBuffers();
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public int getActualSampleCount() {
        return this.mMonAudioSampleBuffers.actualSampleCount;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public ByteBuffer getAudioBuffer() {
        return this.mMonAudioSampleBuffers.audioBuffer;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public Object getAudioSampleBuffers() {
        return this.mMonAudioSampleBuffers;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public int getChannelCount() {
        return this.mMonAudioSampleBuffers.channelCount;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public int getSampleRate() {
        return this.mMonAudioSampleBuffers.sampleRate;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public int getSampleformat() {
        return this.mMonAudioSampleBuffers.sampleformat;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public long getTimeStamp() {
        return this.mMonAudioSampleBuffers.timeStamp;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setActualSampleCount(int i7) {
        this.mMonAudioSampleBuffers.actualSampleCount = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setAudioBuffer(ByteBuffer byteBuffer) {
        Objects.toString(byteBuffer);
        this.mMonAudioSampleBuffers.audioBuffer = byteBuffer;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setAudioSampleBuffers(Object obj) {
        this.mMonAudioSampleBuffers = (MontageAudioSampleBuffers) obj;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setChannelCount(int i7) {
        this.mMonAudioSampleBuffers.channelCount = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setSampleRate(int i7) {
        this.mMonAudioSampleBuffers.sampleRate = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setSampleformat(int i7) {
        this.mMonAudioSampleBuffers.sampleformat = i7;
    }

    @Override // com.bilibili.studio.kaleidoscope.sdk.AudioSampleBuffers
    public void setTimeStamp(long j7) {
        this.mMonAudioSampleBuffers.timeStamp = j7;
    }
}

package com.bilibili.sponge.audio;

import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/audio/AudioParameterConfig.class */
public class AudioParameterConfig {
    private int sampleRate = EditNvsTimelineInfoBase.DEFAULT_SAMPLE_RATE;
    private int audioChannel = 12;
    private int audioFormat = 2;
    private int bufferSize = -1;
    private int readBufferSize = -1;

    public int getAudioChannel() {
        return this.audioChannel;
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getBufferSize() {
        return this.bufferSize;
    }

    public int getReadBufferSize() {
        return this.readBufferSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public void setAudioChannel(int i7) {
        this.audioChannel = i7;
    }

    public void setAudioFormat(int i7) {
        this.audioFormat = i7;
    }

    public void setBufferSize(int i7) {
        this.bufferSize = i7;
    }

    public void setReadBufferSize(int i7) {
        this.readBufferSize = i7;
    }

    public void setSampleRate(int i7) {
        this.sampleRate = i7;
    }
}

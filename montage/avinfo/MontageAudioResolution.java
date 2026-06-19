package com.bilibili.montage.avinfo;

import com.bilibili.studio.videoeditor.nvsstreaming.EditNvsTimelineInfoBase;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageAudioResolution.class */
public class MontageAudioResolution {
    public int channelCount;
    public int sampleRate;

    public MontageAudioResolution() {
        this.sampleRate = EditNvsTimelineInfoBase.DEFAULT_SAMPLE_RATE;
        this.channelCount = 2;
    }

    public MontageAudioResolution(int i7, int i8) {
        this.sampleRate = i7;
        this.channelCount = i8;
    }
}

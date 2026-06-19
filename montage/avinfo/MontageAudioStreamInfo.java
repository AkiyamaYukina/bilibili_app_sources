package com.bilibili.montage.avinfo;

import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageAudioStreamInfo.class */
public class MontageAudioStreamInfo {
    public int channelCount;
    public String codec;
    public long duration;
    public int sampleRate;

    public String toString() {
        StringBuilder sb = new StringBuilder("BMMAudioStreamInfo{duration=");
        sb.append(this.duration);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channelCount=");
        return C3269h.a(sb, this.channelCount, '}');
    }
}

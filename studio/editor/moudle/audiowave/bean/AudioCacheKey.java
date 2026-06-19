package com.bilibili.studio.editor.moudle.audiowave.bean;

import androidx.annotation.Keep;
import java.util.Objects;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/audiowave/bean/AudioCacheKey.class */
@Keep
public class AudioCacheKey {
    public String filePath;
    public long samplesPerGroup;

    public AudioCacheKey(String str, long j7) {
        this.filePath = str;
        this.samplesPerGroup = j7;
    }

    public boolean equals(Object obj) {
        boolean z6 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AudioCacheKey audioCacheKey = (AudioCacheKey) obj;
        if (!Objects.equals(this.filePath, audioCacheKey.filePath) || this.samplesPerGroup != audioCacheKey.samplesPerGroup) {
            z6 = false;
        }
        return z6;
    }

    public int hashCode() {
        return Objects.hash(this.filePath);
    }
}

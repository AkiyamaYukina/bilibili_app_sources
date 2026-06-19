package com.bilibili.studio.editor.moudle.audiowave.bean;

import androidx.annotation.Keep;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/audiowave/bean/AudioCacheValue.class */
@Keep
public class AudioCacheValue {

    @Nullable
    public float[] leftSampleData;

    @Nullable
    public float[] rightSampleData;

    public AudioCacheValue(@Nullable float[] fArr, @Nullable float[] fArr2) {
        this.leftSampleData = fArr;
        this.rightSampleData = fArr2;
    }
}

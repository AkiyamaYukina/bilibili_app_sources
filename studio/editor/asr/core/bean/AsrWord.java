package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrWord.class */
@Keep
public final class AsrWord {

    @JSONField(name = "start_time")
    private long beginTime;

    @JSONField(name = "confidence")
    private int confidence;

    @JSONField(name = "end_time")
    private long endTime;

    @JSONField(name = "label")
    @Nullable
    private String label;

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    public final void setBeginTime(long j7) {
        this.beginTime = j7;
    }

    public final void setConfidence(int i7) {
        this.confidence = i7;
    }

    public final void setEndTime(long j7) {
        this.endTime = j7;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }
}

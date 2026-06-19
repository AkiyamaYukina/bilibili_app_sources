package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrSentence.class */
@Keep
public final class AsrSentence {

    @JSONField(name = "start_time")
    private long beginTime;

    @JSONField(name = "confidence")
    private int confidence;

    @JSONField(name = "end_time")
    private long endTime;

    @JSONField(name = "music")
    private int music;

    @JSONField(name = "punc")
    private float punc;

    @JSONField(name = "transcript")
    @Nullable
    private String text;

    @JSONField(name = "words")
    @Nullable
    private AsrWord[] words;

    public final long getBeginTime() {
        return this.beginTime;
    }

    public final int getConfidence() {
        return this.confidence;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final int getMusic() {
        return this.music;
    }

    public final float getPunc() {
        return this.punc;
    }

    @Nullable
    public final String getText() {
        return this.text;
    }

    @Nullable
    public final AsrWord[] getWords() {
        return this.words;
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

    public final void setMusic(int i7) {
        this.music = i7;
    }

    public final void setPunc(float f7) {
        this.punc = f7;
    }

    public final void setText(@Nullable String str) {
        this.text = str;
    }

    public final void setWords(@Nullable AsrWord[] asrWordArr) {
        this.words = asrWordArr;
    }
}

package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrAudioClass.class */
@Keep
public final class AsrAudioClass {

    @JSONField(name = "accompaniment")
    private double accompaniment;

    @JSONField(name = "music")
    private double music;

    @JSONField(name = "noise")
    private double noise;

    @JSONField(name = "speech")
    private double speech;

    public final double getAccompaniment() {
        return this.accompaniment;
    }

    public final double getMusic() {
        return this.music;
    }

    public final double getNoise() {
        return this.noise;
    }

    public final double getSpeech() {
        return this.speech;
    }

    public final void setAccompaniment(double d7) {
        this.accompaniment = d7;
    }

    public final void setMusic(double d7) {
        this.music = d7;
    }

    public final void setNoise(double d7) {
        this.noise = d7;
    }

    public final void setSpeech(double d7) {
        this.speech = d7;
    }
}

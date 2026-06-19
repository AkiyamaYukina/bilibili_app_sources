package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceAudioConfig.class */
@Keep
public class IntelligenceAudioConfig {
    public static final int COMPLETE_SUCCESS = 4;
    public static final int FAILED = 2;
    public static final int NO_NEED = 1;
    public static final int PORTION_SUCCESS = 3;

    @JSONField(name = "audio_type")
    public String audioType;

    @JSONField(name = "audio_use")
    public String audioUse;

    @JSONField(name = "auto_bgm")
    public boolean autoBgm;
    public Double musicRate;
    public Double singRate;
    public Double speechRate;

    @JSONField(name = "is_need_asr")
    public boolean autoASR = false;

    @JSONField(name = "volume")
    public Integer audioVolume = null;

    @JSONField(name = "audioSrcVolume")
    public Integer audioSrcVolume = null;
    public int fastAsrResult = 1;
    public int asrResult = 1;

    public IntelligenceAudioConfig() {
        Double dValueOf = Double.valueOf(0.0d);
        this.musicRate = dValueOf;
        this.singRate = dValueOf;
        this.speechRate = dValueOf;
    }

    @NonNull
    public String toString() {
        return "IntelligenceAudioConfig{audioUse='" + this.audioUse + "', audioType='" + this.audioType + "', autoBgm=" + this.autoBgm + ", autoASR=" + this.autoASR + ", audioVolume=" + this.audioVolume + ", audioSrcVolume=" + this.audioSrcVolume + ", fastAsrResult=" + this.fastAsrResult + ", asrResult=" + this.asrResult + ", musicRate=" + this.musicRate + ", singRate=" + this.singRate + ", speechRate=" + this.speechRate + '}';
    }
}

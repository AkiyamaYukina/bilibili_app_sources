package com.bilibili.studio.editor.moudle.intelligence.data;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.collection.C3269h;
import com.alibaba.fastjson.annotation.JSONField;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/intelligence/data/IntelligenceAudioConfigFawkes.class */
@Keep
public class IntelligenceAudioConfigFawkes {

    @JSONField(name = "audio_type")
    public String audioType;

    @JSONField(name = "audio_use")
    public String audioUse;

    @JSONField(name = "auto_bgm")
    public boolean autoBgm;

    @JSONField(name = "is_need_asr")
    public boolean autoASR = false;

    @JSONField(name = "volume")
    public Integer audioVolume = null;
    public int fastAsrResult = 1;
    public int asrResult = 1;

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("IntelligenceAudioConfig{audioUse='");
        sb.append(this.audioUse);
        sb.append("', audioType='");
        sb.append(this.audioType);
        sb.append("', autoBgm=");
        sb.append(this.autoBgm);
        sb.append(", autoASR=");
        sb.append(this.autoASR);
        sb.append(", audioVolume=");
        sb.append(this.audioVolume);
        sb.append(", fastAsrResult=");
        sb.append(this.fastAsrResult);
        sb.append(", asrResult=");
        return C3269h.a(sb, this.asrResult, '}');
    }
}

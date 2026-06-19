package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrUtterances.class */
@Keep
public final class AsrUtterances {

    @JSONField(name = "doc_audio_class")
    @Nullable
    private AsrAudioClass audioClass;

    @JSONField(name = "utterances")
    @Nullable
    private List<AsrSentence> sentence;

    @JSONField(name = "version")
    @Nullable
    private String version;

    @Nullable
    public final AsrAudioClass getAudioClass() {
        return this.audioClass;
    }

    @Nullable
    public final List<AsrSentence> getSentence() {
        return this.sentence;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public final void setAudioClass(@Nullable AsrAudioClass asrAudioClass) {
        this.audioClass = asrAudioClass;
    }

    public final void setSentence(@Nullable List<AsrSentence> list) {
        this.sentence = list;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }
}

package com.bilibili.studio.editor.tts.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/bean/LongTtsResultBean.class */
@Keep
public final class LongTtsResultBean {

    @JSONField(name = "audio_url")
    @Nullable
    private String audioUrl;

    @JSONField(name = "meta_url")
    @Nullable
    private String metaUrl;

    @Nullable
    public final String getAudioUrl() {
        return this.audioUrl;
    }

    @Nullable
    public final String getMetaUrl() {
        return this.metaUrl;
    }

    public final void setAudioUrl(@Nullable String str) {
        this.audioUrl = str;
    }

    public final void setMetaUrl(@Nullable String str) {
        this.metaUrl = str;
    }
}

package com.bilibili.studio.editor.asr.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/FastAsrResponse.class */
@Keep
public final class FastAsrResponse {

    @Nullable
    private Music music;

    @Nullable
    private Speech speech;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/FastAsrResponse$Music.class */
    @Keep
    public static final class Music {

        @JSONField(name = "music_rate")
        private double musicRate;

        public final double getMusicRate() {
            return this.musicRate;
        }

        public final void setMusicRate(double d7) {
            this.musicRate = d7;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/FastAsrResponse$Speech.class */
    @Keep
    public static final class Speech {

        @JSONField(name = "sing_rate")
        private double singRate;

        @JSONField(name = "speech_rate")
        private double speechRate;

        public final double getSingRate() {
            return this.singRate;
        }

        public final double getSpeechRate() {
            return this.speechRate;
        }

        public final void setSingRate(double d7) {
            this.singRate = d7;
        }

        public final void setSpeechRate(double d7) {
            this.speechRate = d7;
        }
    }

    @Nullable
    public final Music getMusic() {
        return this.music;
    }

    @Nullable
    public final Speech getSpeech() {
        return this.speech;
    }

    public final void setMusic(@Nullable Music music) {
        this.music = music;
    }

    public final void setSpeech(@Nullable Speech speech) {
        this.speech = speech;
    }
}

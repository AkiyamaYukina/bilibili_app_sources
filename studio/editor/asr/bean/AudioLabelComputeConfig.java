package com.bilibili.studio.editor.asr.bean;

import androidx.annotation.Keep;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AudioLabelComputeConfig.class */
@Keep
public final class AudioLabelComputeConfig {

    @Nullable
    private List<AudioLabel> audioType;

    @Nullable
    private List<AudioLabel> audioUse;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AudioLabelComputeConfig$AudioLabel.class */
    @Keep
    public static final class AudioLabel {

        @Nullable
        private String label;

        @Nullable
        private List<Rule> rules;

        @Nullable
        public final String getLabel() {
            return this.label;
        }

        @Nullable
        public final List<Rule> getRules() {
            return this.rules;
        }

        public final void setLabel(@Nullable String str) {
            this.label = str;
        }

        public final void setRules(@Nullable List<Rule> list) {
            this.rules = list;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/bean/AudioLabelComputeConfig$Rule.class */
    @Keep
    public static final class Rule {
        private double max = 1.0d;
        private double min;

        @Nullable
        private List<String> target;

        public final double getMax() {
            return this.max;
        }

        public final double getMin() {
            return this.min;
        }

        @Nullable
        public final List<String> getTarget() {
            return this.target;
        }

        public final void setMax(double d7) {
            this.max = d7;
        }

        public final void setMin(double d7) {
            this.min = d7;
        }

        public final void setTarget(@Nullable List<String> list) {
            this.target = list;
        }
    }

    @Nullable
    public final List<AudioLabel> getAudioType() {
        return this.audioType;
    }

    @Nullable
    public final List<AudioLabel> getAudioUse() {
        return this.audioUse;
    }

    public final void setAudioType(@Nullable List<AudioLabel> list) {
        this.audioType = list;
    }

    public final void setAudioUse(@Nullable List<AudioLabel> list) {
        this.audioUse = list;
    }
}

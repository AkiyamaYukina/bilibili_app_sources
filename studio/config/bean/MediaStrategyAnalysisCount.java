package com.bilibili.studio.config.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyAnalysisCount.class */
@Keep
public final class MediaStrategyAnalysisCount {

    @Nullable
    private Config all;

    @Nullable
    private Config photo;

    @Nullable
    private Config video;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/config/bean/MediaStrategyAnalysisCount$Config.class */
    @Keep
    public static final class Config {

        @JSONField(name = "max_analysis_count")
        private int maxAnalysisCount;

        @JSONField(name = "step_analysis_count")
        private int stepAnalysisCount;

        public final int getMaxAnalysisCount() {
            return this.maxAnalysisCount;
        }

        public final int getStepAnalysisCount() {
            return this.stepAnalysisCount;
        }

        public final void setMaxAnalysisCount(int i7) {
            this.maxAnalysisCount = i7;
        }

        public final void setStepAnalysisCount(int i7) {
            this.stepAnalysisCount = i7;
        }
    }

    @Nullable
    public final Config getAll() {
        return this.all;
    }

    @Nullable
    public final Config getPhoto() {
        return this.photo;
    }

    @Nullable
    public final Config getVideo() {
        return this.video;
    }

    public final void setAll(@Nullable Config config) {
        this.all = config;
    }

    public final void setPhoto(@Nullable Config config) {
        this.photo = config;
    }

    public final void setVideo(@Nullable Config config) {
        this.video = config;
    }
}

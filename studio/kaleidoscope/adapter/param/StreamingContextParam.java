package com.bilibili.studio.kaleidoscope.adapter.param;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/param/StreamingContextParam.class */
public final class StreamingContextParam {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f108362a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108363b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108364c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Float f108365d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f108366e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f108367f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f108368g = null;
    public boolean h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f108369i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f108370j = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/adapter/param/StreamingContextParam$Builder.class */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f108371a = 64;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f108372b = 10;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f108373c = 6;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Float f108374d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f108375e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f108376f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f108377g = null;
        public boolean h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f108378i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f108379j;

        public StreamingContextParam build() {
            StreamingContextParam streamingContextParam = new StreamingContextParam();
            streamingContextParam.f108362a = this.f108371a;
            streamingContextParam.f108363b = this.f108372b;
            streamingContextParam.f108364c = this.f108373c;
            streamingContextParam.f108365d = this.f108374d;
            streamingContextParam.f108366e = this.f108375e;
            streamingContextParam.f108367f = this.f108376f;
            streamingContextParam.f108368g = this.f108377g;
            streamingContextParam.h = this.h;
            streamingContextParam.f108369i = this.f108378i;
            streamingContextParam.f108370j = this.f108379j;
            return streamingContextParam;
        }

        public Builder setAuroraResourcePath(String str) {
            this.f108379j = str;
            return this;
        }

        public Builder setColorGainForSDRToHDR(Float f7) {
            this.f108374d = f7;
            return this;
        }

        public Builder setFlag(int i7) {
            this.f108378i = i7;
            return this;
        }

        public Builder setLicPath(@NonNull String str) {
            this.f108377g = str;
            return this;
        }

        public Builder setLogFilePath(@NonNull String str) {
            this.f108376f = str;
            return this;
        }

        public Builder setMaxAudioReaderCount(int i7) {
            this.f108371a = i7;
            return this;
        }

        public Builder setMaxImageReaderCount(int i7) {
            this.f108372b = i7;
            return this;
        }

        public Builder setMaxReaderCount(int i7) {
            this.f108373c = i7;
            return this;
        }

        public Builder setOpenDebugLog(boolean z6) {
            this.f108375e = z6;
            return this;
        }

        public Builder setSaveDebugMessagesToFile(boolean z6) {
            this.h = z6;
            return this;
        }
    }

    public String getAuroraResourcePath() {
        return this.f108370j;
    }

    public Float getColorGainForSDRToHDR() {
        return this.f108365d;
    }

    public int getFlag() {
        return this.f108369i;
    }

    public String getLicPath() {
        return this.f108368g;
    }

    public String getLogFilePath() {
        return this.f108367f;
    }

    public int getMaxAudioReaderCount() {
        return this.f108362a;
    }

    public int getMaxImageReaderCount() {
        return this.f108363b;
    }

    public int getMaxReaderCount() {
        return this.f108364c;
    }

    public boolean isOpenDebugLog() {
        return this.f108366e;
    }

    public boolean isSaveDebugMessagesToFile() {
        return this.h;
    }
}

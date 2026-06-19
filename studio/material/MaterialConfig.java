package com.bilibili.studio.material;

import com.bilibili.studio.material.internal.ProcessorItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialConfig.class */
public final class MaterialConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public String f108454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f108455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f108456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f108457d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f108458e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public g<ProcessorItem> f108459f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public String f108460g;

    @NotNull
    public String h;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/MaterialConfig$MaterialConfigBuilder.class */
    public static final class MaterialConfigBuilder {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public g<ProcessorItem> f108466f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public String f108461a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f108462b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f108463c = 1048576;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f108464d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f108465e = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NotNull
        public String f108467g = "";

        @NotNull
        public String h = "";

        @NotNull
        public final MaterialConfigBuilder auroraVersion(@NotNull String str) {
            this.h = str;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder autoClean(boolean z6) {
            this.f108464d = z6;
            return this;
        }

        @NotNull
        public final MaterialConfig build() {
            MaterialConfig materialConfig = new MaterialConfig(null);
            materialConfig.f108454a = this.f108461a;
            materialConfig.f108455b = this.f108462b;
            materialConfig.setCacheSize(this.f108463c);
            materialConfig.setAutoClean(this.f108464d);
            materialConfig.setGetFinalDir(this.f108465e);
            materialConfig.setCustomBatchPreStrategy(this.f108466f);
            materialConfig.setAuroraVersion(this.h);
            materialConfig.setMontageVersion(this.f108467g);
            return materialConfig;
        }

        @NotNull
        public final MaterialConfigBuilder cacheSize(long j7) {
            this.f108463c = j7;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder customBatchPreStrategy(@NotNull g<ProcessorItem> gVar) {
            this.f108466f = gVar;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder filePath(@NotNull String str) {
            this.f108461a = str;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder getFinalDir(boolean z6) {
            this.f108465e = z6;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder montageVersion(@NotNull String str) {
            this.f108467g = str;
            return this;
        }

        @NotNull
        public final MaterialConfigBuilder unZip(boolean z6) {
            this.f108462b = z6;
            return this;
        }
    }

    public MaterialConfig() {
        this.f108454a = "";
        this.f108455b = true;
        this.f108456c = 1048576L;
        this.f108457d = true;
        this.f108458e = true;
        this.f108460g = "";
        this.h = "";
    }

    public /* synthetic */ MaterialConfig(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    public final String getAuroraVersion() {
        return this.f108460g;
    }

    public final boolean getAutoClean() {
        return this.f108457d;
    }

    public final long getCacheSize() {
        return this.f108456c;
    }

    @Nullable
    public final g<ProcessorItem> getCustomBatchPreStrategy() {
        return this.f108459f;
    }

    @NotNull
    public final String getFilePath() {
        return this.f108454a;
    }

    public final boolean getGetFinalDir() {
        return this.f108458e;
    }

    @NotNull
    public final String getMontageVersion() {
        return this.h;
    }

    public final boolean getUnZip() {
        return this.f108455b;
    }

    public final void setAuroraVersion(@NotNull String str) {
        this.f108460g = str;
    }

    public final void setAutoClean(boolean z6) {
        this.f108457d = z6;
    }

    public final void setCacheSize(long j7) {
        this.f108456c = j7;
    }

    public final void setCustomBatchPreStrategy(@Nullable g<ProcessorItem> gVar) {
        this.f108459f = gVar;
    }

    public final void setGetFinalDir(boolean z6) {
        this.f108458e = z6;
    }

    public final void setMontageVersion(@NotNull String str) {
        this.h = str;
    }
}

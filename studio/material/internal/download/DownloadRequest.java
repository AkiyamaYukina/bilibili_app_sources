package com.bilibili.studio.material.internal.download;

import androidx.annotation.Keep;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/DownloadRequest.class */
@Keep
public final class DownloadRequest {

    @Nullable
    private String fileName;

    @Nullable
    private String filePath;

    @Nullable
    private String url;
    private boolean isBackground = false;

    @Nullable
    private Map<String, String> headers = null;

    @Nullable
    private String business = null;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/DownloadRequest$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public String f108545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f108546b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public String f108547c;
    }

    public DownloadRequest(@NotNull a aVar) {
        this.url = aVar.f108545a;
        this.filePath = aVar.f108546b;
        this.fileName = aVar.f108547c;
    }

    @Nullable
    public final String getBusiness() {
        return this.business;
    }

    @Nullable
    public final String getFileName() {
        return this.fileName;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isBackground() {
        return this.isBackground;
    }

    public final void setBackground(boolean z6) {
        this.isBackground = z6;
    }

    public final void setBusiness(@Nullable String str) {
        this.business = str;
    }

    public final void setFileName(@Nullable String str) {
        this.fileName = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setHeaders(@Nullable Map<String, String> map) {
        this.headers = map;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}

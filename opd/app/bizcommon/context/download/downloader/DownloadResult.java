package com.bilibili.opd.app.bizcommon.context.download.downloader;

import androidx.annotation.Keep;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/context/download/downloader/DownloadResult.class */
@Keep
public final class DownloadResult {

    @Nullable
    private InputStream inputStream;
    private int responseCode;

    @NotNull
    private String responseMsg = "";

    @NotNull
    private Map<String, String> responseHeaders = new LinkedHashMap();

    @NotNull
    private String contentType = "";

    @NotNull
    public final String getContentType() {
        return this.contentType;
    }

    @Nullable
    public final InputStream getInputStream() {
        return this.inputStream;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }

    @NotNull
    public final Map<String, String> getResponseHeaders() {
        return this.responseHeaders;
    }

    @NotNull
    public final String getResponseMsg() {
        return this.responseMsg;
    }

    public final void setContentType(@NotNull String str) {
        this.contentType = str;
    }

    public final void setInputStream(@Nullable InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public final void setResponseCode(int i7) {
        this.responseCode = i7;
    }

    public final void setResponseHeaders(@NotNull Map<String, String> map) {
        this.responseHeaders = map;
    }

    public final void setResponseMsg(@NotNull String str) {
        this.responseMsg = str;
    }
}

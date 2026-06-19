package com.bilibili.studio.videoeditor.downloader;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/downloader/DownloadRequestV1.class */
@Keep
public final class DownloadRequestV1 {

    @NotNull
    private String dir;

    @NotNull
    private String fileName;

    @NotNull
    private String tag;
    private long taskId;

    @NotNull
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/downloader/DownloadRequestV1$a.class */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f109449a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public String f109450b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public String f109451c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public String f109452d = "";
    }

    public DownloadRequestV1(@NotNull a aVar) {
        this.url = "";
        this.dir = "";
        this.fileName = "";
        this.tag = "";
        this.taskId = aVar.f109449a;
        this.url = aVar.f109450b;
        this.dir = aVar.f109451c;
        this.fileName = aVar.f109452d;
        this.tag = "";
    }

    @NotNull
    public final String getDir() {
        return this.dir;
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final long getTaskId() {
        return this.taskId;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setDir(@NotNull String str) {
        this.dir = str;
    }

    public final void setFileName(@NotNull String str) {
        this.fileName = str;
    }

    public final void setTag(@NotNull String str) {
        this.tag = str;
    }

    public final void setTaskId(long j7) {
        this.taskId = j7;
    }

    public final void setUrl(@NotNull String str) {
        this.url = str;
    }
}

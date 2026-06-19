package com.bilibili.studio.material.internal.download;

import androidx.annotation.Keep;
import androidx.constraintlayout.motion.widget.p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/DownloadResponse.class */
@Keep
public final class DownloadResponse {

    @NotNull
    private String fileName;

    @NotNull
    private String filePath;

    public DownloadResponse() {
        this(null, null, 3, null);
    }

    public DownloadResponse(@NotNull String str, @NotNull String str2) {
        this.filePath = str;
        this.fileName = str2;
    }

    public /* synthetic */ DownloadResponse(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ DownloadResponse copy$default(DownloadResponse downloadResponse, String str, String str2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = downloadResponse.filePath;
        }
        if ((i7 & 2) != 0) {
            str2 = downloadResponse.fileName;
        }
        return downloadResponse.copy(str, str2);
    }

    @NotNull
    public final String component1() {
        return this.filePath;
    }

    @NotNull
    public final String component2() {
        return this.fileName;
    }

    @NotNull
    public final DownloadResponse copy(@NotNull String str, @NotNull String str2) {
        return new DownloadResponse(str, str2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DownloadResponse)) {
            return false;
        }
        DownloadResponse downloadResponse = (DownloadResponse) obj;
        return Intrinsics.areEqual(this.filePath, downloadResponse.filePath) && Intrinsics.areEqual(this.fileName, downloadResponse.fileName);
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    public int hashCode() {
        return this.fileName.hashCode() + (this.filePath.hashCode() * 31);
    }

    public final void setFileName(@NotNull String str) {
        this.fileName = str;
    }

    public final void setFilePath(@NotNull String str) {
        this.filePath = str;
    }

    @NotNull
    public String toString() {
        return p.a("DownloadResponse(filePath=", this.filePath, ", fileName=", this.fileName, ")");
    }
}

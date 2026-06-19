package com.bilibili.lib.resmanager;

import androidx.core.os.EnvironmentCompat;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/resmanager/ResDownloadRequest.class */
public final class ResDownloadRequest extends ResRequest {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f64270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f64271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public Downloader f64273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public DownloadBizType f64274g;

    @NotNull
    public String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f64275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f64276j;

    @JvmOverloads
    public ResDownloadRequest(@Nullable String str) {
        this(str, null, 2, null);
    }

    @JvmOverloads
    public ResDownloadRequest(@Nullable String str, @Nullable String str2) {
        super(str, str2);
        this.f64270c = true;
        this.f64273f = Downloader.DEFAULT;
        this.f64274g = DownloadBizType.Default;
        this.h = EnvironmentCompat.MEDIA_UNKNOWN;
        this.f64276j = -1;
    }

    public /* synthetic */ ResDownloadRequest(String str, String str2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? "" : str2);
    }

    @Deprecated(message = "Useless")
    public static /* synthetic */ void getDownloader$resmanager_release$annotations() {
    }

    @Deprecated(message = "Useless")
    public static /* synthetic */ void getReportBizType$resmanager_release$annotations() {
    }

    public static /* synthetic */ ResDownloadRequest speedLimit$default(ResDownloadRequest resDownloadRequest, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = -1;
        }
        return resDownloadRequest.speedLimit(i7);
    }

    @NotNull
    public final ResDownloadRequest bizType(@NotNull DownloadBizType downloadBizType) {
        this.f64274g = downloadBizType;
        return this;
    }

    @NotNull
    public final ResDownloadRequest cleanable(boolean z6) {
        this.f64270c = z6;
        return this;
    }

    @NotNull
    public final ResDownloadRequest downloadTag(@NotNull String str) {
        this.f64275i = str;
        return this;
    }

    @Deprecated(message = "Useless")
    @NotNull
    public final ResDownloadRequest downloader(@NotNull Downloader downloader) {
        this.f64273f = downloader;
        return this;
    }

    @NotNull
    public final ResDownloadRequest encrypted(boolean z6) {
        this.f64272e = z6;
        return this;
    }

    @NotNull
    public final DownloadBizType getBizType$resmanager_release() {
        return this.f64274g;
    }

    public final boolean getCleanable$resmanager_release() {
        return this.f64270c;
    }

    @Nullable
    public final String getDownloadTag$resmanager_release() {
        return this.f64275i;
    }

    @NotNull
    public final Downloader getDownloader$resmanager_release() {
        return this.f64273f;
    }

    public final boolean getEncrypted$resmanager_release() {
        return this.f64272e;
    }

    @Nullable
    public final String getMd5$resmanager_release() {
        return this.f64271d;
    }

    @NotNull
    public final String getReportBizType$resmanager_release() {
        return this.h;
    }

    public final int getSpeedLimit$resmanager_release() {
        return this.f64276j;
    }

    @NotNull
    public final ResDownloadRequest md5(@Nullable String str) {
        this.f64271d = str;
        return this;
    }

    @Deprecated(message = "Useless")
    @NotNull
    public final ResDownloadRequest reportBizType(@NotNull String str) {
        this.h = str;
        return this;
    }

    public final void setBizType$resmanager_release(@NotNull DownloadBizType downloadBizType) {
        this.f64274g = downloadBizType;
    }

    public final void setCleanable$resmanager_release(boolean z6) {
        this.f64270c = z6;
    }

    public final void setDownloadTag$resmanager_release(@Nullable String str) {
        this.f64275i = str;
    }

    public final void setDownloader$resmanager_release(@NotNull Downloader downloader) {
        this.f64273f = downloader;
    }

    public final void setEncrypted$resmanager_release(boolean z6) {
        this.f64272e = z6;
    }

    public final void setMd5$resmanager_release(@Nullable String str) {
        this.f64271d = str;
    }

    public final void setReportBizType$resmanager_release(@NotNull String str) {
        this.h = str;
    }

    public final void setSpeedLimit$resmanager_release(int i7) {
        this.f64276j = i7;
    }

    @NotNull
    public final ResDownloadRequest speedLimit(int i7) {
        this.f64276j = i7;
        return this;
    }
}

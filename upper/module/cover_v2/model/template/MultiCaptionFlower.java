package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCaptionFlower.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCaptionFlower {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int ID_DEFAULT = -10086;

    @Nullable
    private String cover;
    private int id;
    private boolean isDownloaded;
    private boolean isDownloading;
    private boolean isFailed;

    @Nullable
    private String licencePath;

    @Nullable
    private String name;
    private int rank;

    @Nullable
    private String renderPath;

    @Nullable
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCaptionFlower$a.class */
    public static final class a {
    }

    @Deprecated(message = "请忽视该字段，当前版本的美摄SDK安装资源包不需要证书")
    public static /* synthetic */ void getLicencePath$annotations() {
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLicencePath() {
        return this.licencePath;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getRank() {
        return this.rank;
    }

    @Nullable
    public final String getRenderPath() {
        return this.renderPath;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isDefault() {
        return this.id == -10086;
    }

    public final boolean isDownloaded() {
        return this.isDownloaded;
    }

    public final boolean isDownloading() {
        return this.isDownloading;
    }

    public final boolean isFailed() {
        return this.isFailed;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDownloaded(boolean z6) {
        this.isDownloaded = z6;
    }

    public final void setDownloading(boolean z6) {
        this.isDownloading = z6;
    }

    public final void setFailed(boolean z6) {
        this.isFailed = z6;
    }

    public final void setId(int i7) {
        this.id = i7;
    }

    public final void setLicencePath(@Nullable String str) {
        this.licencePath = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setRank(int i7) {
        this.rank = i7;
    }

    public final void setRenderPath(@Nullable String str) {
        this.renderPath = str;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}

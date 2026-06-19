package com.bilibili.upper.module.cover_v2.model.template;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCaptionFont.class */
@StabilityInferred(parameters = 0)
@Keep
public final class MultiCaptionFont implements Serializable {
    public static final int $stable = 8;

    @NotNull
    public static final a Companion = new Object();
    public static final int ID_DEFAULT = -1;

    @Nullable
    private String cover;
    private int id;
    private boolean isDefault;
    private boolean isDownloaded;
    private boolean isDownloading;
    private boolean isFailed;

    @Nullable
    private String localPath;

    @Nullable
    private String name;
    private int pid;

    @Nullable
    private String url;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/upper/module/cover_v2/model/template/MultiCaptionFont$a.class */
    public static final class a {
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getLocalPath() {
        return this.localPath;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPid() {
        return this.pid;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final boolean isDefault() {
        return this.isDefault;
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

    public final void setDefault(boolean z6) {
        this.isDefault = z6;
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

    public final void setLocalPath(@Nullable String str) {
        this.localPath = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPid(int i7) {
        this.pid = i7;
    }

    public final void setUrl(@Nullable String str) {
        this.url = str;
    }
}

package com.bilibili.studio.material.internal.net;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/net/ResourceItem.class */
@Keep
public final class ResourceItem {

    @JSONField(name = "download_url_aurora")
    @Nullable
    private String auroraDownloadUrl;

    @Nullable
    private String cover;

    @JSONField(name = "download_url_level")
    @Nullable
    private List<DownloadUrlLevel> downloadUrlLevel;

    @Nullable
    private String download_url;

    @JSONField(name = "extra_")
    @Nullable
    private Extra extra;
    private long id;

    @Nullable
    private String name;
    private int type;

    @Nullable
    private String videopre_url;

    @Nullable
    public final String getAuroraDownloadUrl() {
        return this.auroraDownloadUrl;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final List<DownloadUrlLevel> getDownloadUrlLevel() {
        return this.downloadUrlLevel;
    }

    @Nullable
    public final String getDownload_url() {
        return this.download_url;
    }

    @Nullable
    public final Extra getExtra() {
        return this.extra;
    }

    public final long getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getVideopre_url() {
        return this.videopre_url;
    }

    public final void setAuroraDownloadUrl(@Nullable String str) {
        this.auroraDownloadUrl = str;
    }

    public final void setCover(@Nullable String str) {
        this.cover = str;
    }

    public final void setDownloadUrlLevel(@Nullable List<DownloadUrlLevel> list) {
        this.downloadUrlLevel = list;
    }

    public final void setDownload_url(@Nullable String str) {
        this.download_url = str;
    }

    public final void setExtra(@Nullable Extra extra) {
        this.extra = extra;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setVideopre_url(@Nullable String str) {
        this.videopre_url = str;
    }
}

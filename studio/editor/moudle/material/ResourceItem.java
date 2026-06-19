package com.bilibili.studio.editor.moudle.material;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/material/ResourceItem.class */
@Keep
public final class ResourceItem {

    @JSONField(name = "download_url_aurora")
    @Nullable
    private String auroraDownloadUrl;

    @JSONField(name = "download_url")
    @Nullable
    private String downloadUrl;

    @JSONField(name = "download_url_v2")
    @Nullable
    private String downloadUrlV2;
    private long id;
    private int type;

    @Nullable
    public final String getAuroraDownloadUrl() {
        return this.auroraDownloadUrl;
    }

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final String getDownloadUrlV2() {
        return this.downloadUrlV2;
    }

    public final long getId() {
        return this.id;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAuroraDownloadUrl(@Nullable String str) {
        this.auroraDownloadUrl = str;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setDownloadUrlV2(@Nullable String str) {
        this.downloadUrlV2 = str;
    }

    public final void setId(long j7) {
        this.id = j7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}

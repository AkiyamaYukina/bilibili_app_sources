package com.bilibili.studio.material.internal.net;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/net/Extra.class */
@Keep
public final class Extra {

    @JSONField(name = "download_url_aurora")
    @Nullable
    private String auroraDownloadUrl;

    @JSONField(name = "download_url_level")
    @Nullable
    private List<DownloadUrlLevel> downloadUrlLevel;

    @Nullable
    public final String getAuroraDownloadUrl() {
        return this.auroraDownloadUrl;
    }

    @Nullable
    public final List<DownloadUrlLevel> getDownloadUrlLevel() {
        return this.downloadUrlLevel;
    }

    public final void setAuroraDownloadUrl(@Nullable String str) {
        this.auroraDownloadUrl = str;
    }

    public final void setDownloadUrlLevel(@Nullable List<DownloadUrlLevel> list) {
        this.downloadUrlLevel = list;
    }
}

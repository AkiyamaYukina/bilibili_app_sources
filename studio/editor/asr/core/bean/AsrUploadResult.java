package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrUploadResult.class */
@Keep
public final class AsrUploadResult {

    @JSONField(name = "download_url")
    @Nullable
    private String downloadUrl;

    @JSONField(name = "resource_id")
    @Nullable
    private String resourceId;

    @Nullable
    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    public final void setDownloadUrl(@Nullable String str) {
        this.downloadUrl = str;
    }

    public final void setResourceId(@Nullable String str) {
        this.resourceId = str;
    }
}

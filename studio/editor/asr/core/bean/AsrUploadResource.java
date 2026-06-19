package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.live.streaming.source.TextSource;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrUploadResource.class */
@Keep
public final class AsrUploadResource {

    @JSONField(name = "in_boss_key")
    @Nullable
    private String inBossKey;

    @JSONField(name = "per_size")
    private long perSize;

    @JSONField(name = "resource_id")
    @Nullable
    private String resourceId;

    @JSONField(name = TextSource.CFG_SIZE)
    private long size;

    @JSONField(name = "title")
    @Nullable
    private String title;

    @JSONField(name = "type")
    private int type;

    @JSONField(name = "upload_id")
    @Nullable
    private String uploadId;

    @JSONField(name = "upload_urls")
    @Nullable
    private List<String> uploadUrls;

    @Nullable
    public final String getInBossKey() {
        return this.inBossKey;
    }

    public final long getPerSize() {
        return this.perSize;
    }

    @Nullable
    public final String getResourceId() {
        return this.resourceId;
    }

    public final long getSize() {
        return this.size;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getUploadId() {
        return this.uploadId;
    }

    @Nullable
    public final List<String> getUploadUrls() {
        return this.uploadUrls;
    }

    public final void setInBossKey(@Nullable String str) {
        this.inBossKey = str;
    }

    public final void setPerSize(long j7) {
        this.perSize = j7;
    }

    public final void setResourceId(@Nullable String str) {
        this.resourceId = str;
    }

    public final void setSize(long j7) {
        this.size = j7;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUploadId(@Nullable String str) {
        this.uploadId = str;
    }

    public final void setUploadUrls(@Nullable List<String> list) {
        this.uploadUrls = list;
    }
}

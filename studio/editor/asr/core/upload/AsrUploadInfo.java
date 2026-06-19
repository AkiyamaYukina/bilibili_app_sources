package com.bilibili.studio.editor.asr.core.upload;

import androidx.annotation.Keep;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.asr.core.bean.AsrUploadResource;
import com.bilibili.studio.editor.asr.core.bean.AsrUploadResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/upload/AsrUploadInfo.class */
@Keep
public final class AsrUploadInfo {

    @Nullable
    private AsrUploadResource asrUploadResource;

    @Nullable
    private AsrUploadResult asrUploadResult;

    @Nullable
    private String eTags;

    @Nullable
    private String filePath;
    private long fileSize;
    private int maxRetryCount = 3;
    private int maxRetryDelay = BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE;
    private int type = 2;

    @NotNull
    private String modelId = "asr_common";

    @Nullable
    public final AsrUploadResource getAsrUploadResource() {
        return this.asrUploadResource;
    }

    @Nullable
    public final AsrUploadResult getAsrUploadResult() {
        return this.asrUploadResult;
    }

    @Nullable
    public final String getETags() {
        return this.eTags;
    }

    @Nullable
    public final String getFilePath() {
        return this.filePath;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public final int getMaxRetryCount() {
        return this.maxRetryCount;
    }

    public final int getMaxRetryDelay() {
        return this.maxRetryDelay;
    }

    @NotNull
    public final String getModelId() {
        return this.modelId;
    }

    public final int getType() {
        return this.type;
    }

    public final void setAsrUploadResource(@Nullable AsrUploadResource asrUploadResource) {
        this.asrUploadResource = asrUploadResource;
    }

    public final void setAsrUploadResult(@Nullable AsrUploadResult asrUploadResult) {
        this.asrUploadResult = asrUploadResult;
    }

    public final void setETags(@Nullable String str) {
        this.eTags = str;
    }

    public final void setFilePath(@Nullable String str) {
        this.filePath = str;
    }

    public final void setFileSize(long j7) {
        this.fileSize = j7;
    }

    public final void setMaxRetryCount(int i7) {
        this.maxRetryCount = i7;
    }

    public final void setMaxRetryDelay(int i7) {
        this.maxRetryDelay = i7;
    }

    public final void setModelId(@NotNull String str) {
        this.modelId = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }
}

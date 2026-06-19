package com.bilibili.lib.videoupload.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/videoupload/bean/UploadErrorCantRetryConfig.class */
@Keep
public final class UploadErrorCantRetryConfig {

    @JSONField(name = "error_list_step2")
    @Nullable
    private List<Integer> initStepCodeList;

    @JSONField(name = "error_list_step4")
    @Nullable
    private List<Integer> mergeStepCodeList;

    @JSONField(name = "error_list_step1")
    @Nullable
    private List<Integer> preUploadStepCodeList;

    @JSONField(name = "error_list_step3")
    @Nullable
    private List<Integer> uploadChunkStepCodeList;

    @Nullable
    public final List<Integer> getInitStepCodeList() {
        return this.initStepCodeList;
    }

    @Nullable
    public final List<Integer> getMergeStepCodeList() {
        return this.mergeStepCodeList;
    }

    @Nullable
    public final List<Integer> getPreUploadStepCodeList() {
        return this.preUploadStepCodeList;
    }

    @Nullable
    public final List<Integer> getUploadChunkStepCodeList() {
        return this.uploadChunkStepCodeList;
    }

    public final void setInitStepCodeList(@Nullable List<Integer> list) {
        this.initStepCodeList = list;
    }

    public final void setMergeStepCodeList(@Nullable List<Integer> list) {
        this.mergeStepCodeList = list;
    }

    public final void setPreUploadStepCodeList(@Nullable List<Integer> list) {
        this.preUploadStepCodeList = list;
    }

    public final void setUploadChunkStepCodeList(@Nullable List<Integer> list) {
        this.uploadChunkStepCodeList = list;
    }
}

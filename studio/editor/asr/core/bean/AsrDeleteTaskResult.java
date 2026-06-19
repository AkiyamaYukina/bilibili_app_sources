package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrDeleteTaskResult.class */
@Keep
public final class AsrDeleteTaskResult {

    @JSONField(name = "state")
    @Nullable
    private String state;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @Nullable
    public final String getState() {
        return this.state;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setState(@Nullable String str) {
        this.state = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}

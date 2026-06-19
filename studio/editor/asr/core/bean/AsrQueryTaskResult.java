package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrQueryTaskResult.class */
@Keep
public final class AsrQueryTaskResult {

    @JSONField(name = "remark")
    @Nullable
    private String remark;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private String result;

    @JSONField(name = "state")
    private int state;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @Nullable
    public final String getRemark() {
        return this.remark;
    }

    @Nullable
    public final String getResult() {
        return this.result;
    }

    public final int getState() {
        return this.state;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setRemark(@Nullable String str) {
        this.remark = str;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    public final void setState(int i7) {
        this.state = i7;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}

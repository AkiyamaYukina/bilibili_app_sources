package com.bilibili.studio.editor.moudle.aistory.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/aistory/bean/AIStoryResponse.class */
@Keep
public final class AIStoryResponse {

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private String result;

    @JSONField(name = "state")
    @Nullable
    private Integer state;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @Nullable
    public final String getResult() {
        return this.result;
    }

    @Nullable
    public final Integer getState() {
        return this.state;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setResult(@Nullable String str) {
        this.result = str;
    }

    public final void setState(@Nullable Integer num) {
        this.state = num;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}

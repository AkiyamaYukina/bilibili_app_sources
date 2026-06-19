package com.bilibili.studio.editor.asr.core.bean;

import androidx.annotation.Keep;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/asr/core/bean/AsrCreateTaskResultNew.class */
@Keep
public final class AsrCreateTaskResultNew {

    @JSONField(name = "mark")
    private int mark;

    @JSONField(name = "poll_time")
    private int pollTime;

    @JSONField(name = ThirdPartyExtraBuilder.KEY_RESULT)
    @Nullable
    private String result;

    @JSONField(name = "state")
    private int state;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @JSONField(name = "timeout_time")
    private int timeOut;

    public final int getMark() {
        return this.mark;
    }

    public final int getPollTime() {
        return this.pollTime;
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

    public final int getTimeOut() {
        return this.timeOut;
    }

    public final void setMark(int i7) {
        this.mark = i7;
    }

    public final void setPollTime(int i7) {
        this.pollTime = i7;
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

    public final void setTimeOut(int i7) {
        this.timeOut = i7;
    }
}

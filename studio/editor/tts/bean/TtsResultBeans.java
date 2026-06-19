package com.bilibili.studio.editor.tts.bean;

import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/tts/bean/TtsResultBeans.class */
@Keep
public final class TtsResultBeans {

    @JSONField(name = "err_msg")
    @Nullable
    private String errMsg;

    @JSONField(name = "logid")
    @Nullable
    private String logid;

    @JSONField(name = "results")
    @Nullable
    private List<TtsResultBean> result;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @Nullable
    public final String getErrMsg() {
        return this.errMsg;
    }

    @Nullable
    public final String getLogid() {
        return this.logid;
    }

    @Nullable
    public final List<TtsResultBean> getResult() {
        return this.result;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setErrMsg(@Nullable String str) {
        this.errMsg = str;
    }

    public final void setLogid(@Nullable String str) {
        this.logid = str;
    }

    public final void setResult(@Nullable List<TtsResultBean> list) {
        this.result = list;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}

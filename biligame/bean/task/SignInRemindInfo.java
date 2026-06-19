package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/SignInRemindInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class SignInRemindInfo {
    public static final int $stable = 8;

    @JSONField(name = "intervention_list")
    @Nullable
    private List<Intervention> interventionList;

    @JSONField(name = "sign_in_info")
    @Nullable
    private SignInfoResp signInfo;

    @JSONField(name = "task_list")
    @Nullable
    private List<TaskItem> taskList;

    @Nullable
    public final List<Intervention> getInterventionList() {
        return this.interventionList;
    }

    @Nullable
    public final SignInfoResp getSignInfo() {
        return this.signInfo;
    }

    @Nullable
    public final List<TaskItem> getTaskList() {
        return this.taskList;
    }

    public final void setInterventionList(@Nullable List<Intervention> list) {
        this.interventionList = list;
    }

    public final void setSignInfo(@Nullable SignInfoResp signInfoResp) {
        this.signInfo = signInfoResp;
    }

    public final void setTaskList(@Nullable List<TaskItem> list) {
        this.taskList = list;
    }
}

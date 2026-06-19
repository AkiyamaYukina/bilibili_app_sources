package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskGroupListResp.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TaskGroupListResp {
    public static final int $stable = 8;

    @JSONField(name = "task_group_list")
    @Nullable
    private List<TaskList> taskGroupList;

    @Nullable
    public final List<TaskList> getTaskGroupList() {
        return this.taskGroupList;
    }

    public final void setTaskGroupList(@Nullable List<TaskList> list) {
        this.taskGroupList = list;
    }
}

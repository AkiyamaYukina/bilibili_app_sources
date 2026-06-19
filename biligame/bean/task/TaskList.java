package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskList.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TaskList {
    public static final int $stable = 8;

    @JSONField(name = "task_list")
    @Nullable
    private List<TaskItem> taskList;

    @JSONField(name = "task_type")
    private int taskType;

    @JSONField(name = "task_type_title")
    @Nullable
    private String taskTypeTitle;

    @Nullable
    public final List<TaskItem> getTaskList() {
        return this.taskList;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    @Nullable
    public final String getTaskTypeTitle() {
        return this.taskTypeTitle;
    }

    public final void setTaskList(@Nullable List<TaskItem> list) {
        this.taskList = list;
    }

    public final void setTaskType(int i7) {
        this.taskType = i7;
    }

    public final void setTaskTypeTitle(@Nullable String str) {
        this.taskTypeTitle = str;
    }
}

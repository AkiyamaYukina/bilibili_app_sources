package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligamePointsTaskDetail.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligamePointsTaskDetail {
    public static final int $stable = 8;
    private int goal;
    private int points;
    private int progress;

    @JSONField(name = "task_name")
    @NotNull
    private String taskName = "";

    @JSONField(name = "task_type")
    private int taskType;

    public final int getGoal() {
        return this.goal;
    }

    public final int getPoints() {
        return this.points;
    }

    public final int getProgress() {
        return this.progress;
    }

    @NotNull
    public final String getTaskName() {
        return this.taskName;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final void setGoal(int i7) {
        this.goal = i7;
    }

    public final void setPoints(int i7) {
        this.points = i7;
    }

    public final void setProgress(int i7) {
        this.progress = i7;
    }

    public final void setTaskName(@NotNull String str) {
        this.taskName = str;
    }

    public final void setTaskType(int i7) {
        this.taskType = i7;
    }
}

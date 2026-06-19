package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskItem.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TaskItem {
    public static final int $stable = 8;
    public static final int COMPLETED = 2;

    @NotNull
    public static final a Companion = new Object();
    public static final int PENDING = 1;
    public static final int UNCOMPLETED = 0;

    @JSONField(name = "android_build")
    private long androidBuild;

    @JSONField(name = "description")
    @Nullable
    private String description;

    @JSONField(name = "ios_build")
    private long iosBuild;

    @JSONField(name = "name")
    @Nullable
    private String name;

    @JSONField(name = "priority")
    private int priority;

    @JSONField(name = "related_game_ids")
    @Nullable
    private String relatedGameIds;

    @JSONField(name = "reward_rule_list")
    @Nullable
    private List<Reward> rewardRuleList;

    @JSONField(name = NotificationCompat.CATEGORY_STATUS)
    private int status;

    @JSONField(name = "task_condition")
    @Nullable
    private TaskCondition taskCondition;

    @JSONField(name = "task_end_time")
    private long taskEndTime;

    @JSONField(name = "task_id")
    @Nullable
    private String taskId;

    @JSONField(name = "task_start_time")
    private long taskStartTime;

    @JSONField(name = "task_template_id")
    @Nullable
    private String taskTemplateId;

    @JSONField(name = "task_type")
    private int taskType;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskItem$a.class */
    public static final class a {
    }

    public final long getAndroidBuild() {
        return this.androidBuild;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final long getIosBuild() {
        return this.iosBuild;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getRelatedGameIds() {
        return this.relatedGameIds;
    }

    @Nullable
    public final List<Reward> getRewardRuleList() {
        return this.rewardRuleList;
    }

    public final int getStatus() {
        return this.status;
    }

    @Nullable
    public final TaskCondition getTaskCondition() {
        return this.taskCondition;
    }

    public final long getTaskEndTime() {
        return this.taskEndTime;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final long getTaskStartTime() {
        return this.taskStartTime;
    }

    @Nullable
    public final String getTaskTemplateId() {
        return this.taskTemplateId;
    }

    public final int getTaskType() {
        return this.taskType;
    }

    public final void setAndroidBuild(long j7) {
        this.androidBuild = j7;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    public final void setIosBuild(long j7) {
        this.iosBuild = j7;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setPriority(int i7) {
        this.priority = i7;
    }

    public final void setRelatedGameIds(@Nullable String str) {
        this.relatedGameIds = str;
    }

    public final void setRewardRuleList(@Nullable List<Reward> list) {
        this.rewardRuleList = list;
    }

    public final void setStatus(int i7) {
        this.status = i7;
    }

    public final void setTaskCondition(@Nullable TaskCondition taskCondition) {
        this.taskCondition = taskCondition;
    }

    public final void setTaskEndTime(long j7) {
        this.taskEndTime = j7;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }

    public final void setTaskStartTime(long j7) {
        this.taskStartTime = j7;
    }

    public final void setTaskTemplateId(@Nullable String str) {
        this.taskTemplateId = str;
    }

    public final void setTaskType(int i7) {
        this.taskType = i7;
    }
}

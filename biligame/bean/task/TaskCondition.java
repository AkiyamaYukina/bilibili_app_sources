package com.bilibili.biligame.bean.task;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskCondition.class */
@StabilityInferred(parameters = 0)
@Keep
public final class TaskCondition {
    public static final int $stable = 8;

    @JSONField(name = "condition_list")
    @Nullable
    private List<ConditionItem> conditionList;

    @Nullable
    public final List<ConditionItem> getConditionList() {
        return this.conditionList;
    }

    public final void setConditionList(@Nullable List<ConditionItem> list) {
        this.conditionList = list;
    }
}

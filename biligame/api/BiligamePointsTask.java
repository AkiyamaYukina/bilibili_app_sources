package com.bilibili.biligame.api;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.annotation.JSONField;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/api/BiligamePointsTask.class */
@StabilityInferred(parameters = 0)
@Keep
public final class BiligamePointsTask {
    public static final int $stable = 8;

    @Nullable
    private List<BiligamePointsTaskDetail> list;

    @JSONField(name = "total_points")
    private long todayPoints;

    @Nullable
    public final List<BiligamePointsTaskDetail> getList() {
        return this.list;
    }

    public final long getTodayPoints() {
        return this.todayPoints;
    }

    public final void setList(@Nullable List<BiligamePointsTaskDetail> list) {
        this.list = list;
    }

    public final void setTodayPoints(long j7) {
        this.todayPoints = j7;
    }
}

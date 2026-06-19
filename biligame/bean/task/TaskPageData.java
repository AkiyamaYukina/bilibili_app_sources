package com.bilibili.biligame.bean.task;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/bean/task/TaskPageData.class */
@StabilityInferred(parameters = 0)
public final class TaskPageData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SignInfoResp f62240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public TaskGroupListResp f62241b;

    public TaskPageData() {
        this(null, null, 3, null);
    }

    public TaskPageData(@Nullable SignInfoResp signInfoResp, @Nullable TaskGroupListResp taskGroupListResp) {
        this.f62240a = signInfoResp;
        this.f62241b = taskGroupListResp;
    }

    public /* synthetic */ TaskPageData(SignInfoResp signInfoResp, TaskGroupListResp taskGroupListResp, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : signInfoResp, (i7 & 2) != 0 ? null : taskGroupListResp);
    }

    @Nullable
    public final SignInfoResp getSignInfoResp() {
        return this.f62240a;
    }

    @Nullable
    public final TaskGroupListResp getTaskGroupListResp() {
        return this.f62241b;
    }

    public final void setSignInfoResp(@Nullable SignInfoResp signInfoResp) {
        this.f62240a = signInfoResp;
    }

    public final void setTaskGroupListResp(@Nullable TaskGroupListResp taskGroupListResp) {
        this.f62241b = taskGroupListResp;
    }
}

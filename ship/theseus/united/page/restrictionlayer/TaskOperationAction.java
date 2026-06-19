package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TaskOperationAction.class */
@StabilityInferred(parameters = 0)
@Bson
public final class TaskOperationAction implements s, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ReportVo f102698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TaskParamVo f102699b;

    public TaskOperationAction(@Nullable ReportVo reportVo, @Nullable TaskParamVo taskParamVo) {
        this.f102698a = reportVo;
        this.f102699b = taskParamVo;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.q
    @Nullable
    public final TaskParamVo a() {
        return this.f102699b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskOperationAction)) {
            return false;
        }
        TaskOperationAction taskOperationAction = (TaskOperationAction) obj;
        return Intrinsics.areEqual(this.f102698a, taskOperationAction.f102698a) && Intrinsics.areEqual(this.f102699b, taskOperationAction.f102699b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ReportVo reportVo = this.f102698a;
        int iHashCode2 = reportVo == null ? 0 : reportVo.hashCode();
        TaskParamVo taskParamVo = this.f102699b;
        if (taskParamVo != null) {
            iHashCode = taskParamVo.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "TaskOperationAction(report=" + this.f102698a + ", task_param=" + this.f102699b + ")";
    }
}

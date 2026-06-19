package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/VipFreeOperationAction.class */
@StabilityInferred(parameters = 0)
@Bson
public final class VipFreeOperationAction implements s, q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final ReportVo f102723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TaskParamVo f102724b;

    public VipFreeOperationAction(@Nullable ReportVo reportVo, @Nullable TaskParamVo taskParamVo) {
        this.f102723a = reportVo;
        this.f102724b = taskParamVo;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.q
    @Nullable
    public final TaskParamVo a() {
        return this.f102724b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipFreeOperationAction)) {
            return false;
        }
        VipFreeOperationAction vipFreeOperationAction = (VipFreeOperationAction) obj;
        return Intrinsics.areEqual(this.f102723a, vipFreeOperationAction.f102723a) && Intrinsics.areEqual(this.f102724b, vipFreeOperationAction.f102724b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ReportVo reportVo = this.f102723a;
        int iHashCode2 = reportVo == null ? 0 : reportVo.hashCode();
        TaskParamVo taskParamVo = this.f102724b;
        if (taskParamVo != null) {
            iHashCode = taskParamVo.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        return "VipFreeOperationAction(report=" + this.f102723a + ", task_param=" + this.f102724b + ")";
    }
}

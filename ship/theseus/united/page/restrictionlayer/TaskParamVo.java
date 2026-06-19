package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TaskParamVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class TaskParamVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f102702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f102703c;

    public TaskParamVo(long j7, @NotNull String str, long j8) {
        this.f102701a = j7;
        this.f102702b = str;
        this.f102703c = j8;
    }

    @NotNull
    public final Map<String, String> a() {
        return MapsKt.mapOf(new Pair[]{TuplesKt.to("activity_id", String.valueOf(this.f102701a)), TuplesKt.to("task_type", this.f102702b), TuplesKt.to("tips_id", String.valueOf(this.f102703c))});
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskParamVo)) {
            return false;
        }
        TaskParamVo taskParamVo = (TaskParamVo) obj;
        return this.f102701a == taskParamVo.f102701a && Intrinsics.areEqual(this.f102702b, taskParamVo.f102702b) && this.f102703c == taskParamVo.f102703c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f102703c) + I.E.a(Long.hashCode(this.f102701a) * 31, 31, this.f102702b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("TaskParamVo(activityId=");
        sb.append(this.f102701a);
        sb.append(", taskType=");
        sb.append(this.f102702b);
        sb.append(", tipsId=");
        return android.support.v4.media.session.a.a(sb, this.f102703c, ")");
    }
}

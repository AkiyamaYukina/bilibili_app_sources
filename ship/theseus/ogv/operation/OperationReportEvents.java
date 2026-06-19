package com.bilibili.ship.theseus.ogv.operation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/operation/OperationReportEvents.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OperationReportEvents {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f94103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f94104b;

    public OperationReportEvents(@Nullable String str, @Nullable String str2) {
        this.f94103a = str;
        this.f94104b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OperationReportEvents)) {
            return false;
        }
        OperationReportEvents operationReportEvents = (OperationReportEvents) obj;
        return Intrinsics.areEqual(this.f94103a, operationReportEvents.f94103a) && Intrinsics.areEqual(this.f94104b, operationReportEvents.f94104b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f94103a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f94104b;
        if (str2 != null) {
            iHashCode = str2.hashCode();
        }
        return (iHashCode2 * 31) + iHashCode;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("OperationReportEvents(show=");
        sb.append(this.f94103a);
        sb.append(", click=");
        return C8770a.a(sb, this.f94104b, ")");
    }
}

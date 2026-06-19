package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/DeviceManagementAction.class */
@StabilityInferred(parameters = 1)
@Bson
public final class DeviceManagementAction implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102525a;

    public DeviceManagementAction(@NotNull String str) {
        this.f102525a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DeviceManagementAction) && Intrinsics.areEqual(this.f102525a, ((DeviceManagementAction) obj).f102525a);
    }

    public final int hashCode() {
        return this.f102525a.hashCode();
    }

    @NotNull
    public final String toString() {
        return C8770a.a(new StringBuilder("DeviceManagementAction(link="), this.f102525a, ")");
    }
}

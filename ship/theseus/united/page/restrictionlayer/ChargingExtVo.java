package com.bilibili.ship.theseus.united.page.restrictionlayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/ChargingExtVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ChargingExtVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f102514a;

    public ChargingExtVo(boolean z6) {
        this.f102514a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChargingExtVo) && this.f102514a == ((ChargingExtVo) obj).f102514a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f102514a);
    }

    @NotNull
    public final String toString() {
        return androidx.appcompat.app.i.a(new StringBuilder("ChargingExtVo(hideBgImg="), this.f102514a, ")");
    }
}

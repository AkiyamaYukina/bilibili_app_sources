package com.bilibili.ship.theseus.ogv.intro.followup;

import androidx.appcompat.app.i;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/followup/VipInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class VipInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f93067a;

    public VipInfo(boolean z6) {
        this.f93067a = z6;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof VipInfo) && this.f93067a == ((VipInfo) obj).f93067a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f93067a);
    }

    @NotNull
    public final String toString() {
        return i.a(new StringBuilder("VipInfo(isVip="), this.f93067a, ")");
    }
}

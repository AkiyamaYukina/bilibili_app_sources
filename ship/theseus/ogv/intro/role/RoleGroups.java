package com.bilibili.ship.theseus.ogv.intro.role;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RoleGroups.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RoleGroups {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<RoleGroup> f93439a;

    public RoleGroups(@NotNull List<RoleGroup> list) {
        this.f93439a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RoleGroups) && Intrinsics.areEqual(this.f93439a, ((RoleGroups) obj).f93439a);
    }

    public final int hashCode() {
        return this.f93439a.hashCode();
    }

    @NotNull
    public final String toString() {
        return com.bapis.bilibili.account.interfaces.v1.k.a("RoleGroups(groups=", ")", this.f93439a);
    }
}

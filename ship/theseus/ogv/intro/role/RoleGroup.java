package com.bilibili.ship.theseus.ogv.intro.role;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RoleGroup.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RoleGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("characters")
    @NotNull
    private final List<Role> f93437b;

    public RoleGroup(@NotNull String str, @NotNull List<Role> list) {
        this.f93436a = str;
        this.f93437b = list;
    }

    @NotNull
    public final List<Role> a() {
        return this.f93437b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RoleGroup)) {
            return false;
        }
        RoleGroup roleGroup = (RoleGroup) obj;
        return Intrinsics.areEqual(this.f93436a, roleGroup.f93436a) && Intrinsics.areEqual(this.f93437b, roleGroup.f93437b);
    }

    public final int hashCode() {
        return this.f93437b.hashCode() + (this.f93436a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<Role> list = this.f93437b;
        return N1.o.a(this.f93436a, ", roles=", ")", new StringBuilder("RoleGroup(title="), list);
    }
}

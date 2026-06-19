package com.bilibili.ship.theseus.ogv.intro.role;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/RolesData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RolesData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("characters")
    @NotNull
    private final RoleGroups f93442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93445d;

    public RolesData(@NotNull RoleGroups roleGroups, @NotNull String str, @NotNull String str2, @NotNull Map<String, String> map) {
        this.f93442a = roleGroups;
        this.f93443b = str;
        this.f93444c = str2;
        this.f93445d = map;
    }

    @NotNull
    public final RoleGroups a() {
        return this.f93442a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RolesData)) {
            return false;
        }
        RolesData rolesData = (RolesData) obj;
        return Intrinsics.areEqual(this.f93442a, rolesData.f93442a) && Intrinsics.areEqual(this.f93443b, rolesData.f93443b) && Intrinsics.areEqual(this.f93444c, rolesData.f93444c) && Intrinsics.areEqual(this.f93445d, rolesData.f93445d);
    }

    public final int hashCode() {
        return this.f93445d.hashCode() + E.a(E.a(this.f93442a.f93439a.hashCode() * 31, 31, this.f93443b), 31, this.f93444c);
    }

    @NotNull
    public final String toString() {
        RoleGroups roleGroups = this.f93442a;
        Map<String, String> map = this.f93445d;
        StringBuilder sb = new StringBuilder("RolesData(groups=");
        sb.append(roleGroups);
        sb.append(", title=");
        sb.append(this.f93443b);
        sb.append(", more=");
        return C4665g.a(sb, this.f93444c, ", report=", map, ")");
    }
}

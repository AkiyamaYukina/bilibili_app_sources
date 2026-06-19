package com.bilibili.ship.theseus.ogv.intro.role;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f93506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<Role> f93507c;

    public t(@NotNull String str, @NotNull String str2, @NotNull List<Role> list) {
        this.f93505a = str;
        this.f93506b = str2;
        this.f93507c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return Intrinsics.areEqual(this.f93505a, tVar.f93505a) && Intrinsics.areEqual(this.f93506b, tVar.f93506b) && Intrinsics.areEqual(this.f93507c, tVar.f93507c);
    }

    public final int hashCode() {
        return this.f93507c.hashCode() + E.a(this.f93505a.hashCode() * 31, 31, this.f93506b);
    }

    @NotNull
    public final String toString() {
        List<Role> list = this.f93507c;
        StringBuilder sb = new StringBuilder("RolesUiData(title=");
        sb.append(this.f93505a);
        sb.append(", more=");
        return N1.o.a(this.f93506b, ", roleList=", ")", sb, list);
    }
}

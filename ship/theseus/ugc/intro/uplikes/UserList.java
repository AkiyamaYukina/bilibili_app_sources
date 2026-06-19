package com.bilibili.ship.theseus.ugc.intro.uplikes;

import K7.M;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uplikes/UserList.class */
@StabilityInferred(parameters = 0)
@Bson
public final class UserList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<User> f97696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f97697b;

    public UserList() {
        throw null;
    }

    public UserList(List list, String str, int i7) {
        str = (i7 & 2) != 0 ? "" : str;
        this.f97696a = list;
        this.f97697b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserList)) {
            return false;
        }
        UserList userList = (UserList) obj;
        return Intrinsics.areEqual(this.f97696a, userList.f97696a) && Intrinsics.areEqual(this.f97697b, userList.f97697b);
    }

    public final int hashCode() {
        return this.f97697b.hashCode() + (this.f97696a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return C8770a.a(M.a("UserList(list=", ", title=", this.f97696a), this.f97697b, ")");
    }
}

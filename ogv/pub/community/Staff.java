package com.bilibili.ogv.pub.community;

import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/pub/community/Staff.class */
@Bson
public final class Staff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f71532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f71533b;

    public Staff(@NotNull String str, @NotNull String str2) {
        this.f71532a = str;
        this.f71533b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) obj;
        return Intrinsics.areEqual(this.f71532a, staff.f71532a) && Intrinsics.areEqual(this.f71533b, staff.f71533b);
    }

    public final int hashCode() {
        return this.f71533b.hashCode() + (this.f71532a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Staff(title=");
        sb.append(this.f71532a);
        sb.append(", info=");
        return C8770a.a(sb, this.f71533b, ")");
    }
}

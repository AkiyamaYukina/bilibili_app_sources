package com.bilibili.ship.theseus.ogv.intro.floatlayer.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/floatlayer/bean/Staff.class */
@StabilityInferred(parameters = 1)
@Bson
public final class Staff {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f92900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f92901b;

    public Staff(@NotNull String str, @NotNull String str2) {
        this.f92900a = str;
        this.f92901b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Staff)) {
            return false;
        }
        Staff staff = (Staff) obj;
        return Intrinsics.areEqual(this.f92900a, staff.f92900a) && Intrinsics.areEqual(this.f92901b, staff.f92901b);
    }

    public final int hashCode() {
        return this.f92901b.hashCode() + (this.f92900a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Staff(title=");
        sb.append(this.f92900a);
        sb.append(", info=");
        return C8770a.a(sb, this.f92901b, ")");
    }
}

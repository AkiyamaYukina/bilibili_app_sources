package com.bilibili.ship.theseus.united.page.intro.module.staffs;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.intro.module.staffs.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/staffs/f.class */
@StabilityInferred(parameters = 0)
public final class C6369f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f101866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final List<Staff> f101867b;

    public C6369f(@NotNull String str, @NotNull List<Staff> list) {
        this.f101866a = str;
        this.f101867b = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6369f)) {
            return false;
        }
        C6369f c6369f = (C6369f) obj;
        return Intrinsics.areEqual(this.f101866a, c6369f.f101866a) && Intrinsics.areEqual(this.f101867b, c6369f.f101867b);
    }

    public final int hashCode() {
        return this.f101867b.hashCode() + (this.f101866a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        List<Staff> list = this.f101867b;
        return N1.o.a(this.f101866a, ", staffs=", ")", new StringBuilder("StaffsData(title="), list);
    }
}

package com.bilibili.ship.theseus.united.page.intro.module.tags;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.account.interfaces.v1.k;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/tags/j.class */
@StabilityInferred(parameters = 0)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<a> f101978a;

    public j(@NotNull List<a> list) {
        this.f101978a = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && Intrinsics.areEqual(this.f101978a, ((j) obj).f101978a);
    }

    public final int hashCode() {
        return this.f101978a.hashCode();
    }

    @NotNull
    public final String toString() {
        return k.a("ViewTagInfo(list=", ")", this.f101978a);
    }
}

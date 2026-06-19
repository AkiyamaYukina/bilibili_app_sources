package com.bilibili.ship.theseus.united.page.view;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/view/o.class */
@StabilityInferred(parameters = 1)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final i f104104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final i f104105b;

    public o(@NotNull i iVar, @NotNull i iVar2) {
        this.f104104a = iVar;
        this.f104105b = iVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f104104a, oVar.f104104a) && Intrinsics.areEqual(this.f104105b, oVar.f104105b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f104105b.f104092a) + (Boolean.hashCode(this.f104104a.f104092a) * 31);
    }

    @NotNull
    public final String toString() {
        return "PageControl(toastControl=" + this.f104104a + ", upControl=" + this.f104105b + ")";
    }
}

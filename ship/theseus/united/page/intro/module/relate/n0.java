package com.bilibili.ship.theseus.united.page.intro.module.relate;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.view.StatInfoData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/relate/n0.class */
@StabilityInferred(parameters = 1)
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f101309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f101310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f101311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final StatInfoData f101312d;

    public n0(long j7, @NotNull String str, long j8, @NotNull StatInfoData statInfoData) {
        this.f101309a = j7;
        this.f101310b = str;
        this.f101311c = j8;
        this.f101312d = statInfoData;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f101309a == n0Var.f101309a && Intrinsics.areEqual(this.f101310b, n0Var.f101310b) && this.f101311c == n0Var.f101311c && Intrinsics.areEqual(this.f101312d, n0Var.f101312d);
    }

    public final int hashCode() {
        return this.f101312d.hashCode() + C3554n0.a(I.E.a(Long.hashCode(this.f101309a) * 31, 31, this.f101310b), 31, this.f101311c);
    }

    @NotNull
    public final String toString() {
        return "RelateCMLive(roomId=" + this.f101309a + ", areaName=" + this.f101310b + ", liveStatus=" + this.f101311c + ", statInfo=" + this.f101312d + ")";
    }
}
